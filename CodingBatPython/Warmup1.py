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
 
# pos_neg
def pos_neg(a, b, negative):
  if negative:
    return a < 0 and b < 0
  else:
    return (a < 0 and b > -1) or (b < 0 and a > -1)

# makes10
def makes10(a, b):
  return (a == 10 or b == 10) or (a+b == 10)

# sum_double
def sum_double(a, b):
  if a == b:
    return (a+b)*2
  else:
    return a+b

# front3
def front3(str):
  if(len(str) < 3):
    return str[0:] + str[0:] + str[0:]
  else:
    return str[0:3] + str[0:3] + str[0:3]

# near_hundred
def near_hundred(n):
  return (n > 189 and n < 211) or (n > 89 and n < 111)
  
# front_back
def front_back(str):
  if(len(str) == 1):
    return str
  return str[len(str)-1:len(str)] + str[1:len(str)-1] + str[0:1]
