void setup() {
  size(300, 5000);
}

void draw() {
  for (int i = 99; i > 0; i--) {
    String line1 = "" + i + " bottles of beer on the wall,";
    String line2 = "" + i + " bottles of beer,";
    String line3 = "Take one down, pass it around,";
    int j = i-1;
    String line4 = "" + j + " bottles of beer on the wall.";
    int y = (99 - i) * 50;
    text(line1, 10, y + 10);
    text(line2, 10, y + 20);
    text(line3, 10, y + 30);
    text(line4, 10, y + 40);
  }
  
}