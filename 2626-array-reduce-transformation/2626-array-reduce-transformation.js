/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, callback, initialValue) {
    var accumaltor = initialValue;
    for ( i = 0 ; i < nums.length ; i++ ) {
        accumaltor = callback(accumaltor,nums[i])
    }
    return accumaltor;
};