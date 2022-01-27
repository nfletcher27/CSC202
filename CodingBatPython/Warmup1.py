# CodingBat problems
# sleep_in
def sleep_in(weekday, vacation):
  
  if vacation:
    return True
  elif weekday:
    return False
  else: 
    return True

# monkey_trouble
def monkey_trouble(a_smile, b_smile):
  
  if a_smile == b_smile:
    return True
  else:
    return False

# diff21
def diff21(n):
  if n > 21:
    return abs(n-21)*2
  else:
    return abs(n-21)
  
# missing_char
def missing_char(str, n):
 return str[:n] + str[n+1:]
 
