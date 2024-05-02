const pattern = (n) => {
  let line = "";
  for (let i = 1; i <= n; i++) {
    for (let j = i; j <= i; j++) {
      line += "*";
      console.log(line);
    }
  }
};

pattern(5);
