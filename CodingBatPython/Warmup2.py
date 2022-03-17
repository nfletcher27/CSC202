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
