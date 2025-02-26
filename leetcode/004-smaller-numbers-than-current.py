def smallerNumbersThanCurrent(nums):
    sorted_nums = sorted(nums)
    num_map = {}

    for i, num in enumerate(sorted_nums):
        if num not in num_map:
            num_map[num] = i

    return [num_map[num] for num in nums]

print(smallerNumbersThanCurrent([8,1,2,2,3]))
print(smallerNumbersThanCurrent([6, 5, 4, 8]))    
print(smallerNumbersThanCurrent([7, 7, 7, 7]))