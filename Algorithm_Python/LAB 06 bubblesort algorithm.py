lst = []

n = int(input("Enter Number of Elements: "))

print("Enter Numbers:")

for i in range(0, n):
    ele = int(input())
    lst.append(ele)

print("Original list:", lst)

# Implementation of bubble sort
def bubbleSort(arr):
    n = len(arr)
    for i in range(n - 1):
        for j in range(0, n - i - 1):
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]

# Call the bubbleSort function
bubbleSort(lst)
print("Sorted Array is:")
print(lst)

