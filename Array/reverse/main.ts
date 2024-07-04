const numArr = [1, 2, 3, 4, 5, 6, 7];

const reverseArrayOne = (arr: number[]): number[] => {
    let temp: number;
    const n: number = arr.length - 1;
    for (let i: number = 0; i < arr.length / 2; i++) {
        temp = arr[i];
        arr[i] = arr[n - i];
        arr[n - i] = temp;
    }
    return arr;
};

const reverseArrayTwo = (arr: number[]): number[] => {
    let temp: number;
    let start: number = 0;
    let end: number = arr.length-1;
    while (start < end) {
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
    return arr;
};

console.log(reverseArrayOne(numArr),"one");
console.log(reverseArrayTwo(numArr),"two");
