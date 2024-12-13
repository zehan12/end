/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(nums) {
    const sortedArray = nums.sort((a,b)=>a-b)
    let unit = sortedArray[0];
    for ( let i = 1 ; i <= sortedArray.length ; i++ ) {
        if ( unit === sortedArray[i] ) {
            return true;
        }
        unit = sortedArray[i];
    }
    return false;
};