import math
# Statistics in Python
# Categorical --> types of data
# Numerical --> finite or infinite
# Continuous --> height weight or time
# Qualitative --> ordinal or nominal
# Quantitative --> intervals and ratios


def mean(*args):
    val_sum = sum(args)
    return val_sum / len(args)


def median_sort(nums):
    sorted(median(nums))


def median(*args):
    # Must be sorted
    # Create helper method for sorting if needed
    if len(args) % 2 == 0:
        i = round((len(args) + 1) / 2)
        j = i - 1
        return (args[i] + args[j]) / 2
    else:
        k = round(len(args) / 2)
        return args[k]


def mode(*args):
    dict_values = {i: args.count(i) for i in args}
    max_list = [k for k, v in dict_values.items() if v == max(dict_values.values())]
    return max_list


def variance(*args):
    mean_val = mean(*args)
    numerator = 0
    for i in args:
        numerator += (i - mean_val) ** 2
    denominator = len(args) - 1
    return numerator/denominator


def standard_deviation(*args):
    return math.sqrt(variance(args))


def coefficient_variation(*args):
    return standard_deviation(*args) / mean(*args)


def covariance(*args):
    list_1 = [i[0] for i in args]
    list_2 = [i[1] for i in args]
    list_1_mean = mean(*list_1[0])
    list_2_mean = mean(*list_2[0])
    numerator = 0
    if len(list_1[0] == len(list_2[0])):
        for i in range(len(list_1[0])):
            numerator += (list_1[0][i] - list_1_mean) * (list_2[0][i] - list_2_mean)
        denominator = len(list_1[0]) - 1
        return numerator / denominator
    else:
        print("N/A")


def correlation_coefficient(*args):
    list_1 = [i[0] for i in args]
    list_2 = [i[1] for i in args]
    list_1_sd = standard_deviation(*list_1[0])
    list_2_sd = standard_deviation(*list_2[0])
    denominator = list_1_sd * list_2_sd
    numerator = covariance(*args)
    return numerator / denominator


md_list = [[1532, 2322, 1222, 5343], [229, 232, 23323, 222]]

print(f"Variance: {variance(1, 2, 3, 4, 5)}")
print(f"Mode: {mode(1, 2, 3, 4, 5)}")
print(f"Median : {median(1, 2, 3, 4, 5)}")
print(f"Mean : {mean(1, 2, 3, 4, 5)}")
