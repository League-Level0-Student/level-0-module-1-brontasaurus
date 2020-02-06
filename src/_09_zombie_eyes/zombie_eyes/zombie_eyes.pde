PImage face;
void setup() {
size(720,463);
face = loadImage("cat.jpeg");
face.resize(width, height);

}
void draw() {
  image(face, 0, 0);
  fill(random(255), random(255), random(255));
  ellipse(403, 143, 25, 25);
  ellipse(470, 143, 25, 25);
  fill(#050000);
  ellipse(((float)(mouseX/720.0)*20)+392, mouseY/463.0*20+133, 15, 15);
  ellipse(((float)(mouseX/720.0)*20)+461, mouseY/463.0*20+133, 15, 15);
}
