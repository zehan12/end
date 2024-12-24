type Fn = (accum: number, curr: number) => number

function reduce(array: number[], callback: Fn, initialValue: number): number {
    var accumulator = initialValue;
    for ( let index = 0 ; index < array.length ; index++ ) {
        accumulator = callback(accumulator,array[index]);
    }
    return accumulator;
};