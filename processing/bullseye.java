void setup() {
  size(500, 500);
}

void draw() {
  noStroke();
  for (int i = 10; i > 0; i--) {
    int ring = (i+1) * 40;
    if (i % 2 == 0) {
      fill(255, 0, 0);
      
    } else {
      fill(255, 255, 255);
    }
    ellipse(250, 250, ring, ring);
  }
  
  
}