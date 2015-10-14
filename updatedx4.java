///x4
int r, g, b;
String title= "Click Me!";
float button1X=200, button1Y=200, button1W=80, button1H=80;
int counter=0;

void setup() {
  background(200, 180, 150);
  size( 400, 400);
  reset();
}

void draw() {
  button( button1X, button1Y, button1W, button1H);
}

void reset () {
  r= 210;
  g= 240;
  b= 80;
}

void button( float x, float y, float w, float h ) {
  fill(255, 0, 0);
  ellipse( x, y, w, h);
  fill(255);
  text(title, button1X-25, button1Y+5);
}

void mousePressed() {
  if ( hit(mouseX, mouseY, button1X, button1Y, button1W, button1H) ) {
    background(160, 200, 80);
  }
}

boolean hit( float x, float y, float ax, float ay, float w, float h ) {
  boolean result = false;
  if ( abs (button1X) < w && abs (button1Y) < h ) {
    result=true;
  } 
  return result;
}
