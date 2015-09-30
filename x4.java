//// Exercise 4:  click button to change background.

int r,g,b;
float button1X=100, button1Y=100, button1W=80, button1H=40;

//// SETUP:  size only.  Also set colors.
void setup() {
  size( 640, 480 );
  reset();
}
void reset() {
  r=  100;
  g=  200;
  b=  250;
}


//// NEXT:  button only.
void draw() {
  background( 100,200,250 );
  showButton( button1X, button1Y, button1W, button1H );
}
// Draw the button.
void showButton( float x, float y, float w, float h ) {
  fill( 255,255,0 );
  rect ( x,y, w,h );
}

//// HANDLERS:  keys & click
void keyPressed() {
  if (key == 'q') exit();
}
void mousePressed() {
  if ( hit( mouseX,mouseY, 100,100, 50,50 ) ) {
    background(0);
  }
}

//// OTHER METHODS:  detect "hit"
// Return true if "near"
boolean hit( float x1, float y1, float x2, float y2, float w, float h ) {
  boolean result;
  // +++++ STUB ALWAYS RETURNS TRUE!
  result=  true;
  return result;
}
