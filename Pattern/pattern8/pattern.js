const pattern = (n) => {
  for (let i = 0; i < n; i++) {
    let line = "";
    for (let j = 1; j <= i; j++) {
      line += " ";
    }
    for (let k = 1; k <= n - i; k++) {
      line += "* ";
    }
    console.log(line);
  }
};

pattern(5);
