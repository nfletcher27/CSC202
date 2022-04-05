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
