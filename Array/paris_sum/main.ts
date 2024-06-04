const parisTs = (arr: number[], k: number): boolean => {
    for (let i = 0; i < arr.length; i++) {
        for (let j = i + 1; j < arr.length; j++) {
            if (arr[i] + arr[j] == k) {
                return true;
            }
        }
    }
    return false;
};

const arr1 = [3, 5, 2, 1, -3, 7, 8, 15, 6, 13];
console.log(parisTs(arr1, 10));
