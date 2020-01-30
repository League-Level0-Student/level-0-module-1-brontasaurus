PImage pepperoni;
PImage onion;
PImage meatball;
PImage bacon;
int press=0;
void setup() {
    size(500, 500);
    pepperoni = loadImage("pepperoni.png");
    pepperoni.resize(20,20);
    onion = loadImage("onion.png");
    onion.resize(35,35);
     meatball = loadImage("meatball.png");
    meatball.resize(42,34);
     bacon = loadImage("bacon.png");
    bacon.resize(40,40);
    fill(#D69111);
    ellipse(250,250,250,250);
    fill(200,0,5);
    ellipse(250,250,220,220);
    fill(#FFE998);
    ellipse(250,250,210,210);
}
void draw() {
   if (mousePressed && (mouseButton == LEFT) && (press == 0)){
int r= (int)random (4);
if (r == 0){
image(pepperoni, mouseX, mouseY);
   }
   else if (r == 1){
     image(onion, mouseX, mouseY);
}
else if (r == 2){
  image(meatball, mouseX, mouseY);
   }
   else if (r == 3){
     image(bacon, mouseX, mouseY);
   }
    press = 1;
   }
  else if (!mousePressed){
     press = 0;
  }
}
     
     
     
     
     
