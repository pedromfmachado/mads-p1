import java.awt.Point;
import java.io.IOException;
import java.util.Scanner;


public class Mine {
	
	private static Tab tab;
	
	public Mine(){
		
		tab = new Tab();
	}

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		while(true){ // verify if there are still diamons left
			
			System.out.print("Direction to move:");
			// wait for input
			Scanner scan = new Scanner (System.in);
			char userInput = scan.next().charAt(0);
			
			// robot's movement
			
			// tab update
			
			
		}
	}
	

	public boolean robotMove(Point pos, char move){
		
		Point new_pos = (Point) pos.clone();
		switch(move){
		
			case 'l':
				new_pos.x--;
				break;
			case 'r':
				new_pos.x++;
				break;
			case 'u':
				new_pos.y++;
				break;
			case 'd':
				new_pos.y--;
				break;
			default:
				return false;
				
		}
		
		return false;
	}
	
	public boolean validateMove(Point pos, char move){
		
		switch(move){
		
			case 'l':
				break;
			case 'r':
				break;
			case 'u':
				break;
			case 'd':
				break;
			default:
				return false;
				
		}
		
		return false;
	}
	
	public boolean validPosition(Point pos){
		
		if(pos.x < 1 || pos.y < 1)
			return false;
		
		// verify max values
		
		return true;
	}
	

}
