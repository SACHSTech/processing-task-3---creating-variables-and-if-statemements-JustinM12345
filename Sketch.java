import processing.core.PApplet;
import java.util.Random;

/* 
 * draw an object from a previous task, this time drawing the object in random locations using your own variables
 * use if statements and logical operators (&&, ||) to change your drawing based on the location of the randomly drawn object(s) 
 * i.e change background, change colours based on the randomly generated position of a drawn object.
 * make the program show the current time. Hint: check the Processing reference for useful functions!
 * 
 * Can make it so...
 * Generate 3 random numbers 
 */

public class Sketch extends PApplet {
	
  Random myRandom = new Random();
 
	// Variables 
  int intRandomHouseX = myRandom.nextInt((100 - (-100)) + 1) + (-100);
  int intRandomSunX = myRandom.nextInt(300);
  int intRandomSunY = myRandom.nextInt(50);

  int intRandomColourRedShapes = myRandom.nextInt((100 - (-100)) + 1) + (-100);
  int intRandomColourGreenShapes = myRandom.nextInt((100 - (-100)) + 1) + (-100);
  int intRandomColourBlueShapes = myRandom.nextInt((100 - (-100)) + 1) + (-100);

  int intRandomColourRedBg = myRandom.nextInt((75 - (-75)) + 1) + (-75);
  int intRandomColourGreenBg = myRandom.nextInt((75 - (-75)) + 1) + (-75);
  int intRandomColourBlueBg = myRandom.nextInt((75 - (-75)) + 1) + (-75);

  int intRandomCloudLocation = myRandom.nextInt(3);
  int intRandomSecretCloudLocation = myRandom.nextInt(2);

  int intDay = day();   
  int intMonth = month();
  int intYear = year();  
  String strDay = String.valueOf(intDay);
  String strMonth = String.valueOf(intMonth);
  String strYear = String.valueOf(intYear);
  
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(150 + intRandomColourRedBg, 180 + intRandomColourGreenBg, 180 + intRandomColourBlueBg);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    // Rectangle House
    fill(255, 23 + intRandomColourGreenShapes, 77 + intRandomColourBlueShapes);
    rect((width / 2 + intRandomHouseX), 3 * height / 4, 100, 100);

    // Triangle Roof
    fill(125 + intRandomColourRedShapes ,125 + intRandomColourGreenShapes,125 + intRandomColourBlueShapes);
    triangle((width / 2 + intRandomHouseX), 3 * height / 4 , (width / 2 + intRandomHouseX) + 50, 3 * height / 4 - 50, (width / 2 + intRandomHouseX) + 100, 3 * height / 4);

    // Sun
    fill(255, 255, 50);
    ellipse(50 + intRandomSunX, 50 + intRandomSunY, 100, 100);

    if (intRandomCloudLocation == 2 && intRandomSecretCloudLocation == 1) {
      noStroke();
      fill(110, 109, 107);
      ellipse(150, 80, 80, 80);
      ellipse(200, 80, 80, 80);
      ellipse(250, 80, 80, 80);
      ellipse(175, 60, 80, 80);
      ellipse(225, 60, 80, 80);
    }

    // Cloud Location Left
    else if (intRandomCloudLocation == 0) {
      noStroke();
      fill(255,255,255);
      ellipse(40, 80, 40, 40);
      ellipse(70, 80, 40, 40);
      ellipse(100, 80, 40, 40);
      ellipse(55, 60, 40, 40);
      ellipse(85, 60, 40, 40);
    }

    // Clouds Location Middle
    else if (intRandomCloudLocation == 1) {
      noStroke();
      fill(255,255,255);
      ellipse(170, 80, 40, 40);
      ellipse(200, 80, 40, 40);
      ellipse(230, 80, 40, 40);
      ellipse(185, 60, 40, 40);
      ellipse(215, 60, 40, 40);
    }

    // Clouds Location Right
    else if (intRandomCloudLocation == 2) {
      noStroke();
      fill(255,255,255);
      ellipse(300, 80, 40, 40);
      ellipse(330, 80, 40, 40);
      ellipse(360, 80, 40, 40);
      ellipse(315, 60, 40, 40);
      ellipse(345, 60, 40, 40);
    }

    //Current Day/Month/Year
    text(strDay + "/", 10, 28);
    text(strMonth + "/", 25, 28);
    text(strYear , 40, 28);

  }
  
  // define other methods down here.
}