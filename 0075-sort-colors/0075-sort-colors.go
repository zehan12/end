func sortColors(nums []int) []int {
    zeros, ones := 0, 0
    for i := 0 ; i < len(nums) ; i++ {
        if nums[i] == 0 {
            zeros += 1;
        }
        if nums[i] == 1 {
            ones += 1;
        }
    }
    
    for i := 0 ; i < zeros ; i++ {
        nums[i] = 0;
    }
    
    for i := zeros ; i < zeros + ones ; i++ {
        nums[i] = 1;
    }
    
    for i := zeros + ones ; i < len(nums) ; i++ {
        nums[i] = 2;
    }
    
    return nums
}