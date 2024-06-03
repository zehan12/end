const paris = (arr, k) => {
    for (let i = 0; i < arr.length; i++) {
        for (let j = 0; j < arr.length; j++) {
            if ( arr[i] + arr[j] === k) return true;
        }
    }
    return false;
};

const arr = [3, 5, 2, 1, -3, 7, 8, 15, 6, 13];

console.log(paris(arr,10))