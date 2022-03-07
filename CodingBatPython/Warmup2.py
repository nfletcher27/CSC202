# Warmup2 problems

# string_times
def string_times(str, n):
  ret = str
  if n == 0:
    return ""
  for i in range(n-1):
    ret += str
  
  return ret
