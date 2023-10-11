lst=[]
n = int(input("Eneter Number of Elements: "))

print("Enter numbers : ")
for i in range(0,n):
    ele = int(input())
    lst.append(ele)
print(lst)

def partition(arr,low,high):
    i = (low - 1) #index of the smaller element
    pivot = arr[high] #pivot

    for j in range(low,high):
        #if current element is smaller than or eqeul to pivot
        if arr[j] <= pivot:
            #inncrement the index of smaller element
            i = i + 1
            arr[i],arr[j]=arr[j],arr[i]
        arr[i+1],arr[high]=arr[high],arr[i+1]
        return (i+1)

def quickSort(arr,low,high):
    if low<high:
        #partition index-pi        
        pi = partition(arr,low,high)
        #Seperately sort the element in before partion and
        #after partiton
        quickSort(arr,low,pi-1)
        quickSort(arr,pi+1,high)

#call quick sort to the array/lst
quickSort(lst,0,n-1)
print(lst)
