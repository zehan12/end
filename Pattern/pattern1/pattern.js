const patternOne = (line) => {
  let row = "*";
  for (let i = 0; i < line; i++) {
    for (let j = 1; j < line; j++) {
      row += "*";
    }
    console.log(row);
    row = "*";
  }
};

patternOne(5);
