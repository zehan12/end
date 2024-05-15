const powerTs = (num: number, pow: number): number => {
    let result = 1;
    while (pow > 0) {
        if (pow % 2 == 1) {
            result = result * num;
        }
        num = num * num;
        pow = parseInt(String(pow / 2));
    }
    return result;
};

console.log("power", powerTs(2, 3));
