# String2 problems

# cat_dog
def cat_dog(str):
  cCount = 0
  dCount = 0
  for i in range(len(str)):
    if(str[i:i+3] == "cat"):
      cCount += 1
    if(str[i:i+3] == "dog"):
      dCount += 1
      
  if(cCount == dCount):
    return True
  return False

# counthi
def count_hi(str):
  counter = 0
  for i in range(len(str)):
    if str[i:i+2] == 'hi':
      counter += 1

  return counter
