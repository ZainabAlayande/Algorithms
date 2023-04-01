from typing import List


def remove_duplicated_values_in_array(array):
    new_array = []
    r = [3, 9, 0, 1]



    for each_number in array:
        if each_number not in new_array:
            new_array.append(each_number)

    return new_array


def removeDuplicates(nums: List[int]) -> int:
    if len(nums) == 0:
        return 0

    slow = 0
    for fast in range(1, len(nums)):
        if nums[fast] != nums[slow]:
            slow += 1
            nums[slow] = nums[fast]

    return slow + 1


def two_pointer_remove_duplicate(array):
    slow_pointer = 0

    for fast_pointer in range(1, len(array)):
        if array[slow_pointer] != array[fast_pointer]:
            slow_pointer += 1

    return slow_pointer


the_array = [1, 1, 2, 2, 2, 3]
print(remove_duplicated_values_in_array(the_array))
print(removeDuplicates(the_array))
print(two_pointer_remove_duplicate(the_array))

















