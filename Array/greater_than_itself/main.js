const greaterThanItself = (arr) => {
    let count = 0;
    let max = arr[0];
    for (let i = 1; i <= arr.length; i++) {
        if (max > arr[i]) {
            count += 1;
        }
        if (arr[i] > max) {
            max = arr[i];
            count += 1;
        }
    }
    return count;
};

const item1 = [-3, 2, 6, 8, 4, 8, 5 ]
const item3 = [ 2, 5, 1, 4, 8, 0, 8, 1, 3, 8 ]
const item2 = [8,8,8,8,8,8]

console.log(greaterThanItself(item1),greaterThanItself(item2),greaterThanItself(item3));