
public class MainComponent {
	public static void main(String[] args) {
		Robot rob = new Robot(100, 700);
		rob.penDown();
		rob.setSpeed(10);
		rob.setPenSize(10);
		rob.setPenColor(100, 100, 255);
	
		for(int i = 0; i < 360; i++)
		{
			rob.move(50);
			rob.turn(i);
		}
		
		
	}
}
