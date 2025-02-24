/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
    const n = nums.length;
    const hash = {};
    for ( let i = 0 ; i < n ; i++ ) {
        if ( hash[nums[i]] ) {
            hash[nums[i]] += 1;
        } else {
            hash[nums[i]] = 1;
        }
    }

    for ( let key in hash ) {
        let count = hash[key];
        if ( count > n / 2 ) {
            return +key;
        }
    }
    return -1;
};