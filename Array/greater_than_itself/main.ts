const greaterThanItselfTs = (arr: number[]): number => {
    let count = 0;
    let max = arr[0];
    for (let i: number = 1; i <= arr.length; i++) {
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

const i1: number[] = [-3, 2, 6, 8, 4, 8, 5];
const i3: number[] = [2, 5, 1, 4, 8, 0, 8, 1, 3, 8];
const i2: number[] = [8, 8, 8, 8, 8, 8];

console.log(
    greaterThanItselfTs(i1),
    greaterThanItselfTs(i2),
    greaterThanItselfTs(i3)
);
