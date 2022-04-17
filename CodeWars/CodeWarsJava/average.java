def find_average(numbers):
    if len(numbers) == 0:
        return 0
    total = 0
    nums = 0
    for i in range(len(numbers)):
        nums += 1
        total += numbers[i]
        
    return total/nums
