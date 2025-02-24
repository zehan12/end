func majorityElement(nums []int) int {
    n := len(nums)
 
    hash := make(map[int]int)

    for i := 0 ; i < n ; i++ {
        value, ok := hash[nums[i]]
        if !ok {
            hash[nums[i]] = 1
        } else {
            hash[nums[i]] = value + 1
        }
    }

    for key, count := range hash {
        if count > n / 2 {
            return key
        }
    }

    return -1
}