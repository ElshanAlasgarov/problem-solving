def missingNumber(nums):
    n = len(nums)
    Tsum = (n*(n + 1)) // 2
    actual_sum = sum(nums)
    return Tsum - actual_sum

nums = [3,0,1]
print(missingNumber(nums))

nums = [0,1]
print(missingNumber(nums))

nums = [9,6,4,2,3,5,7,0,1]
print(missingNumber(nums))


