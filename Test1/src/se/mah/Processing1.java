package se.mah;
import processing.core.*; 
public class Processing1 extends PApplet {
	public void setup() {  
	  background(255, 255, 0);
	  noStroke();
	}
	
	  public void settings() {  size(800, 300); }
	 
	  /**
	 * @param passedArgs
	 */
	 public static void main(String[] passedArgs) {
		  System.out.println("Now we try to run the Processing sketch");
		  //PApplet.main(new String[] { "se.mah.Processing1" });
		  PApplet.main(Processing1.class.getName());
	  }
}
