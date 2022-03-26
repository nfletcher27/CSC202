# Logic1 problems

# cigar_party
def cigar_party(cigars, is_weekend):
  if is_weekend:
    return cigars > 39
  else:
    return cigars > 39 and cigars < 61
  
# love6
  def love6(a, b):
  if a == 6 or b == 6:
    return True
  elif a+b == 6 or a-b == 6 or b-a == 6:
    return True
  else:
    return False

# caught_speeding
def caught_speeding(speed, is_birthday):
  if is_birthday:
    if speed <= 65:
      return 0
    elif speed > 65 and speed < 86:
      return 1
    else:
      return 2
  elif speed < 61:
    return 0
  elif speed > 60 and speed < 81:
    return 1
  else:
    return 2
  
# in1to10
def in1to10(n, outside_mode):
  if outside_mode:
    return n > 9 or n < 2
  else:
    return n < 11 and n > 0

# date_fashion
def date_fashion(you, date):
  if you <= 2 or date <= 2:
    return 0
  elif you >= 8 or date >= 8:
    return 2
  else:
    return 1

# sorta_sum
def sorta_sum(a, b):
  if a + b >= 10 and a + b <= 19:
    return 20
  else:
    return a + b
