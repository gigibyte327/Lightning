import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {


int startX=(int)(Math.random()*300 + 30);
int startY=0;
int endX=(int)(Math.random()*300 +30);
int endY=0;

public void setup()
{
  size(300,300);
  strokeWeight(3);
  background(0);
}
public void draw()
{	
	//background(0);
	clouds();
	/*stroke((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
	while(endX<300){
		endX= startX + ((int)(Math.random()*20)-9);
		endY= startY + ((int)(Math.random()*10));
		line(startX,startY,endX,endY);
		startX=endX;
		startY=endY;
	}
	startX=(int)(Math.random()*300)+30;
	startY=0;
	endX=(int)(Math.random()*300)+30;
	endY=0;*/
}
public void clouds(){
	for (int i=20; i<300; i+=65){
		noStroke();
		fill((int)(Math.random()*10+125),(int)(Math.random()*5+125),(int)(Math.random()*10+127));
		ellipse(i,15,80,65);
	}

}
public void mousePressed()
{
	stroke((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
	while(endX<300){
		endX= startX + ((int)(Math.random()*20)-9);
		endY= startY + ((int)(Math.random()*10));
		line(startX,startY,endX,endY);
		startX=endX;
		startY=endY;
	}
	startX=(int)(Math.random()*300)+30;
	startY=0;
	endX=(int)(Math.random()*300)+30;
	endY=0;
	
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
