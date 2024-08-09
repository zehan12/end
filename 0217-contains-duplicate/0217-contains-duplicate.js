/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(nums) {
    const sortedArray = nums.sort();
    let duplicate = sortedArray[0];
    for ( let i = 1 ; i < sortedArray.length ; i++ ) {
        if ( nums[i] == duplicate ) {
            return true;
        } else {
            duplicate = nums[i]
        }
    }
    return false;
};