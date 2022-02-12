# Logic1 problems
# cigar_party
def cigar_party(cigars, is_weekend):
  if is_weekend:
    return cigars > 39
  else:
    return cigars > 39 and cigars < 61
