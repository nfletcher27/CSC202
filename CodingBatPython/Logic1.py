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

