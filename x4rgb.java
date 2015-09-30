//// Exercise 4:  click button to change background.

int r,g,b;
float button1X=100, button1Y=100, button1W=80, button1H=40;
float button2X=300, button2Y=200, button2W=90, button2H=60;
float button3X=100, button3Y=300, button3W=100, button3H=70;
int counter=0;

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
  background( r,g,b );

  fill( 255,100,0 );
  showButton( "RED!", button1X, button1Y, button1W, button1H );

  fill( 100,255,0 );
  showButton( "green", button2X, button2Y, button2W, button2H );

  fill( 100,255,255);
  showButton( "bLUE", button3X, button3Y, button3W, button3H );

}
// Draw the button.
void showButton( String s, float x, float y, float w, float h ) {
  rect ( x,y, w,h );
  fill(100,0,0);
  text( s, x+w/4, y+h/3 );
}

//// HANDLERS:  keys & click
void keyPressed() {
  if (key == 'q') exit();
  if (key == 'r') reset();
}
void mousePressed() {
  if ( hit( mouseX,mouseY, button1X,button1Y, button1W,button1H ) ) {
    counter=  counter+1;
    if (counter % 2 > 0) {
      r=  255;
      g=  50;
      b=  0;
    } else {
      reset();
    }
  }
  if ( hit( mouseX,mouseY, button2X,button2Y, button2W,button2H ) ) {
      r=  55;
      g=  250;
      b=  50;
  }
  if ( hit( mouseX,mouseY, button3X,button3Y, button3W,button3H ) ) {
      r=  55;
      g=  50;
      b=  250;
  }
}

//// OTHER METHODS:  detect "hit"
// Return true if "near"
boolean hit( float x1, float y1, float x2, float y2, float w, float h ) {
  boolean result;

  // +++++ STUB ALWAYS RETURNS TRUE!
  if ( abs(x1-x2) < w && abs(y1-y2)<h ) {
    result=  true;
  } else {
    result=false;
  }
  return result;
}
