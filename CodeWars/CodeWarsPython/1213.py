def bmi(weight, height):
    if weight/(height*height) <= 18.5:
        return 'Underweight'
    elif weight/(height*height) <= 25.0:
        return 'Normal'
    elif weight/(height*height) <= 30.0:
        return 'Overweight'
    else:
        return 'Obese'
      
def is_square(n):    
    if n == 0:
        return True
    for i in range(int(n/2), 0, -1):
        if int(i*i) == n:
            return True
    
    return False

def move(position, roll):
    return position + roll*2

def basic_op(operator, value1, value2):
    if operator == '+':
        return value1+value2
    elif operator == '-':
        return value1 - value2
    elif operator == '*':
        return value1*value2
    else:
        return value1/value2
