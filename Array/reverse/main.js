const numberArray = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11];

const reverseArray1 = (arr) => {
    let temp;
    const n = arr.length - 1;
    for (let i = 0; i < arr.length / 2; i++) {
        temp = arr[i];
        arr[i] = arr[n - i];
        arr[n - i] = temp;
    }
    return arr;
};

const reverseArray2 = (arr) => {
    let temp;
    let start = 0;
    let end = arr.length - 1;
    while (start < end) {
        temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;
        start++;
        end--;
    }
    return arr;
};

console.log(reverseArray1(numberArray));
console.log(reverseArray2(numberArray));
