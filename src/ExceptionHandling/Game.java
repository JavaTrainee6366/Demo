package ExceptionHandling;

import java.util.Random;
import java.util.Scanner;

public class Game {
	
	int value;
	public Game() {
		// TODO Auto-generated constructor stub
		Random random = new Random();
		value = random.nextInt(100);
	//	System.out.println(value);
	}
	
	void guess(int number) throws CustomException{
		
		if (number>value) {
			//throw new CustomException("GreaterNumberException");
			System.out.println("You Entered Greater Number");
			
		}else if(number<value) {
			//throw new CustomException("SmallerNumberException");
			System.out.println("You Entered Smaller Number");
			
		}else {
			System.out.println("Congratulations..!! You Won");
			System.exit(0);
		}
		
		
	}
	
	public static void main(String[] args) throws CustomException {
		
		Scanner sn = new Scanner(System.in);
		Game obj = new Game();
		
		do{
			System.out.println("Please Enter Your Guess :: ");
			int num = sn.nextInt();
			obj.guess(num);
		}while(true);
			
		
	}
	
	

}














