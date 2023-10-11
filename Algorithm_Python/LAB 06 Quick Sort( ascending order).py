lst = []
n = int(input("Enter Number of Elements: "))

print("Enter numbers:")
for i in range(0, n):
    ele = int(input())
    lst.append(ele)
print("Original list:", lst)

def partition(arr, low, high):
    i = (low - 1)  # Index of the smaller element
    pivot = arr[high]  # Pivot

    for j in range(low, high):
        # If current element is smaller than or equal to pivot
        if arr[j] <= pivot:
            # Increment the index of the smaller element
            i = i + 1
            arr[i], arr[j] = arr[j], arr[i]

    arr[i + 1], arr[high] = arr[high], arr[i + 1]
    return (i + 1)

def quickSort(arr, low, high):
    if low < high:
        # Partition index-pi
        pi = partition(arr, low, high)
        # Separately sort the elements before and after partition
        quickSort(arr, low, pi - 1)
        quickSort(arr, pi + 1, high)

# Call quick sort on the array/lst
quickSort(lst, 0, n - 1)
print("Sorted list in ascending order:", lst)
