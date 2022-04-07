# Logic2 problems

# lone_sum
def lone_sum(a, b, c):
  if(a==b and b==c):
    return 0
  if(a==b):
    return c
  if(b==c):
    return a
  if(c==a):
    return b
  return a+b+c

# lucky_sum
def lucky_sum(a, b, c):
  if a == 13:
    return 0
  if b == 13:
    return a
  if c == 13:
    return a + b
  return a + b + c
