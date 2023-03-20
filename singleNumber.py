def singleNumber(nums: list):
    res = nums[0]
    print("res at the beginning: ", res)
    i = 1
    while i < len(nums):
        res = res ^ nums[i]
        print("res is: ", res)
        i += 1

    return res


number = [2, 4, 5, 2, 6, 1, 4, 6, 5]
print(singleNumber(number))
