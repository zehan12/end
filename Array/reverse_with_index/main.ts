const reverseWithIdx = (
    arr: number[],
    startIdx: number = 0,
    endIdx: number = arr.length - 1
) => {
    while (startIdx < endIdx) {
        [arr[startIdx], arr[endIdx]] = [arr[endIdx], arr[startIdx]];
        startIdx++;
        endIdx--;
    }
    return arr;
};


console.log(reverseWithIdx([1,2,4,5,67,88],2,5))