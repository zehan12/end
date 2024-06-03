const main = (arr1, arr2) => {
    const arrayToInt = (arr) => {
        const length = arr.length;
        if (length === 0) return 0;
        return Number(arr.join(""));
    };

    const stringToArray = (digit) => {
        const isNegative = digit < 0;
        const absNum = Math.abs(digit);
        const digits = Array.from(String(absNum), Number);
        if (isNegative) digits[0] *= -1;
        return digits;
    };

    const first = arrayToInt(arr1);
    const second = arrayToInt(arr2);

    const total = String(first + second);
    return stringToArray(total);
};

console.log(main([3, 2, 9], [1, 2])); // [3,4,1]
console.log(main([4, 7, 3], [1, 2, 3])); // [5,9,6]
console.log(main([1], [5, 7, 6])); // [5,7,7]
console.log(main([-6, 7], [1, 0])); // [-5,7]
