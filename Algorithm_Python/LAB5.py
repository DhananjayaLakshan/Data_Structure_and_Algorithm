#create an emty list
lst = []

#Ask Number of element from user
n = int(input("Enter Number of Elements: "))

print("Entered numbers: ")
for i in range(0,n):
    ele = int(input())
    lst.append(ele)#Adding set of elements to the array/list

print(lst)

#Function to do insertion sort
def insertionSort(arr):
    #Traverse throught 1 to len(arr)
    for i in range(1,len(arr)):
        key = arr[i]
        #Move element of array[0..1-1], that are
        #greater than key, to one position ahead
        #of their current position
        j=i-1
        while j>=0 and key<arr[j]:
            arr[j+1] = arr[j]
            j=j-1
        arr[j+1] = key


#calling to the function
insertionSort(lst)
#print the sorted array
print("Sorted array is : ")
for i in range(len(lst)):
    print("%d" %lst[i])
    

