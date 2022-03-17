# String1 problems
# hello_name
def hello_name(name):
  return ("Hello " + name + "!")

# non_start
def non_start(a, b):
  return a[1:] + b[1:]

# first_half
def first_half(str):
  return str[0:(len(str))/2]

# extra_end
def extra_end(str):
  return str[len(str)-2:] + str[len(str)-2:] + str[len(str)-2:]

# abba
def make_abba(a, b):
  return a + b + b + a

# makeoutword
def make_out_word(out, word):
  return out[0:len(out)/2] + word + out[len(out)/2:]

# lefttwo
def left2(str):
  return str[2:len(str)] + str[0:2]

# withoutend
def without_end(str):
  return str[1:len(str)-1]
  
# make_tags
def make_tags(tag, word):
  return "<"+tag+">"+word+"</"+tag+">"

# first_two
def first_two(str):
  if len(str) < 2:
    return str
  else:
    return str[0:2]

# combo_string
def combo_string(a, b):
  if len(a) > len(b):
    return b+a+b
  else:
    return a+b+a
