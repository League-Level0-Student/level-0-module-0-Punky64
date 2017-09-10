import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) { 
	Robot r2d2=new Robot();
	// This recipe draws the first letter of your name using the Robot
	//
	// 1. Create a class called RobotGraffiti
	r2d2.setSpeed(10);
	r2d2.setAngle(-90);
	r2d2.move(200);
	r2d2.setAngle(180);
	r2d2.penDown();
	// 2. Use the Robot to draw the first letter of your name
	r2d2.move(200);
	r2d2.move(-175);
	r2d2.setAngle(70);
	r2d2.move(40);
	r2d2.setAngle(80);
	r2d2.move(30);
	r2d2.setAngle(90);
	r2d2.move(20);
	r2d2.setAngle(100);
	r2d2.move(10);
	r2d2.setAngle(110);
	r2d2.move(10);
	r2d2.setAngle(120);
	r2d2.move(10);
	r2d2.setAngle(130);
	r2d2.move(10);
	r2d2.penUp();
	r2d2.setAngle(90);
	r2d2.move(50);
	r2d2.setAngle(180);
	
	
	
	
	
	// HINT: Use the RobotSquare recipe to help remember how to draw using Robot
	// 3. BONUS: Write your entire first name using the Robot
}

}
