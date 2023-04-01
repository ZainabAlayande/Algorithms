def divideArray(nums):
    nums.sort()
    index = 0
    print(nums)

    while index < len(nums):

        if nums[index] == nums[index + 1]:
            return True

    return False


array = [3, 2, 3, 1, 4, 1]
print(divideArray(array))
