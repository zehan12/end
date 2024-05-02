const pattern = (line) => {
  for (let i = 0; i < line; i++) {
    let line = "";
    for (let j = 1; j < line; j++) {
      line += "*";
    }
    console.log(line);
  }
};

pattern(5);
