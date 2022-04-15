# Warmup2 problems

# string_times
def string_times(str, n):
  ret = str
  if n == 0:
    return ""
  for i in range(n-1):
    ret += str
  
  return ret

# string_splosion
def string_splosion(str):
  st = ""
  for i in range(len(str)+1):
    st += str[0:i]
  return st

# array_front9
def array_front9(nums):
  for i in range(len(nums)):
    if nums[i] == 9:
      return True
    if nums[i] == 4:
      return False
  return False

# front_times
def front_times(str, n):
  if len(str) < 4:
    retStr = ""
    for i in range(n):
      retStr += str
    return retStr
  else:
    retStr = ""
    for i in range(n):
      retStr += str[0:3]
    return retStr

# array_count9
def array_count9(nums):
  counter = 0
  for i in nums:
    if i is 9:
      counter += 1
      
  return counter

# string_bits
def string_bits(str):
  res = ""
  for i in range(len(str)):
    if i % 2 == 0:
      res = res + str[i]
  return res

# array123
def array123(nums):
  for i in range(len(nums)-2):
    if nums[i] == 1 and nums[i + 1] == 2 and nums[i + 2] == 3:
      return True
  
  return False
