package ExceptionHandling;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		int a = 10;
		CustomException obj = null;
		
		try{
			System.out.println("Hello");
			//int res = a/0;
			//System.out.println(res);
			System.out.println("Hie");
			obj.show();
			
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e);
			System.out.println("You have Entered something wrong!! Try Again with any other number than zero");
			System.out.println("You have Entered something wrong!! Try Again with any other number than zero");
		}  finally {
			  System.out.println("Hieeeee"); 
			  System.exit(0);
			  }
			 
		System.out.println("java");
		
		
		
	}

}
