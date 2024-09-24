const arr = [-3, 4, 6, 9, 7, 8, 7, 2, 10];
// [-3,4,7,8,7,9,6,2,10] from 2 to 6 index

const reverseWithIndex = (arr, startIdx = 0, endIdx = arr.length - 1) => {
    let temp;
    let start = startIdx;
    let end = endIdx;
    while (start < end) {
        temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;
        start++;
        end--;
    }
    return arr;
};

console.log(reverseWithIndex(arr, 2, 6));
