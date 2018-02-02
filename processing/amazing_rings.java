int offset = 0;

void setup() {
  size(1000, 500);
}

void draw() {
  offset++;
  fill(200, 200, 200);
  rect(0, 0, 1000, 500);
  
  noFill();
  for (int i = 30; i > 0; i--) {
    int ring = (i+1) * 10;
    ellipse(250 + offset%500, 250, ring, ring);
    ellipse(750 + - offset%500, 250, ring, ring);
  }
  
  
}