# List1 problems

# first_last6
def first_last6(nums):
  if nums[0] == 6 or nums[len(nums)-1] == 6:
    return True
  else:
    return False

# common_end
  def common_end(a, b):
  if a[0] == b[0] or a[len(a)-1] == b[len(b)-1]:
    return True
  else:
    return False

# reverse3
def reverse3(nums):
  swap = nums[0]
  nums[0] = nums[2]
  nums[2] = swap
  return nums

# middle_way
def middle_way(a, b):
  middle = []
  middle.append(a[1])
  middle.append(b[1])
  return middle

# same_first_last
def same_first_last(nums):
  if(len(nums) > 0):
    return (nums[0] == nums[len(nums)-1])
  return False

# make_pi
def make_pi():
  return [3, 1, 4]
