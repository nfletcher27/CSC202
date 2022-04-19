def reverse_seq(n):
    list = []
    for i in range(n, 0, -1):
        list.append(i)
        
    return list
  
def string_to_number(s):
    return int(s)
  
def minimum(arr):
    min = 100
    for i in range(len(arr)):
        if arr[i] < min:
            min = arr[i]
            
    return min

def maximum(arr):
    max = 0
    for i in range(len(arr)):
        if arr[i] > max:
            max = arr[i]
            
    return max
