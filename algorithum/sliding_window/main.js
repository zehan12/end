const arr = [2,3,5,2,9,7,1];
const n = 4;

function findSubArray(arr,n) {
    const result = [];
    for ( let i = 0 ; i < arr.length ; i++ ) {
        const subArray = []; 
        for ( let j = i ;  j < i + n; j++ ) {
            console.log(i,j,arr[j])
            if ( arr[j] ) {
                subArray.push(arr[j]);
            }
        }
        if ( subArray.length === n ) {
            result.push(subArray);
        }
    }
    return result;
}

console.log(findSubArray(arr,n));