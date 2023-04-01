def intersection(nums1, nums2):
    array_to_return = []
    new_array = []

    for i in range(len(nums1)):
        if nums1[i] in nums2:
            array_to_return.append(nums1[i])

        elif nums2[i] in nums1:
            array_to_return.append(nums2[i])
            break

    for each_value in array_to_return:
        if each_value not in new_array:
            new_array.append(each_value)

    list_set = set(array_to_return)
    unique_list = (list(list_set))
    return unique_list


def intersect(nums1, nums2):
    array_to_return = []
    set1 = set(nums1)
    set2 = set(nums2)

    for num in set1:
        if num in set2:
            array_to_return.append(num)

    return array_to_return


def findDifference(nums1, nums2):
    array_to_return = []
    second_array = []
    array = [[], []]

    set1 = set(nums1)
    set2 = set(nums2)

    for num in set1:
        if num not in set2:
            array_to_return.append(num)

    for num in set2:
        if num not in set1:
            second_array.append(num)

    array[0] = array_to_return
    array[1] = second_array

    return array


def inter(nums):
    array_to_return = []

    for num in nums[0]:
        if num in nums[1] and num in nums[2]:
            array_to_return.append(num)

    return array_to_return


def new_intersection(nums):
    array_to_return = []

    if len(nums) < 3:
        return []

    set1 = nums[0]
    set2 = nums[1]
    set3 = nums[2]

    array_to_return = list(nums[0].intersection(nums[1], nums[2]))
    return array_to_return


def common_elements(nums):
    common = set(nums[0])
    for arr in nums[1:]:
        common.intersection_update(arr)
    return sorted(common)


array1 = [1, 2, 3]
array2 = [2, 4, 6]
array_array = [[3, 1, 2, 4, 5], [1, 2, 3, 4], [3, 4, 5, 6]]

print(common_elements(array_array))
