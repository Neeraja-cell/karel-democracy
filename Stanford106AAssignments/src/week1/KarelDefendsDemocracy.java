package week1;
import stanford.karel.*;

public class KarelDefendsDemocracy extends SuperKarel {

	/**
	 * 
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void run() {
		
		for(int i=0; i<5; i++){
			
			move();
			cleanExtraBeepers();
			move();
		}
		
				
	}

	private void cleanExtraBeepers() {
		// TODO Auto-generated method stub
		
		if(noBeepersPresent()) {
			cleanBeepersSouth();
			cleanBeepersNorth();
		}
		
	}

	private void cleanBeepersNorth() {
		// TODO Auto-generated method stub
			move();

		while(beepersPresent()) {
			pickBeeper();
			
		}
			turnAround();
			move();
			turnLeft();
	}

	private void cleanBeepersSouth() {
		// TODO Auto-generated method stub
			turnRight();
			move();
		while(beepersPresent()) {
			pickBeeper();
		}
			turnAround();
			move();
		
	}
	
		
}
