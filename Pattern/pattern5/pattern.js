const pattern = (n) => {
    for ( let i = n ; i >= 0 ; i-- ) {
        let line = "";
        for ( let j = 1 ; j <= i ; j++ ) {
            line += "*"
        }
        console.log(line);
    }
}

pattern(3)