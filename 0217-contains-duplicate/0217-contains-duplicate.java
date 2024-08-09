import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        System.out.println(nums);
        int duplicate = nums[0];
        for ( int i = 1 ; i < nums.length ; i++ ) {
            if ( nums[i] == duplicate ) {
                return true;
            } else {
                duplicate = nums[i];
            }
        }
        return false;
    }
}