const pattern = (n) => {
  for (let i = 1; i < n; i++) {
    let line = "";
    for (let j = 1; j <= n - i; j++) {
      line += j;
    }
    console.log(line);
  }
};

pattern(8);
