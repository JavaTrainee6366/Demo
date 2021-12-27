package ExceptionHandling;

import java.io.IOException;
import java.rmi.RemoteException;


public class ThrowsExample {
	CustomException obj=null;

	
	void m(int no) throws IOException,RemoteException{
		
		
	System.out.println("My Exception");
		
	}
	
	
	  void n() throws RemoteException, IOException  {
		  m(10);
	  
	  }
	  
	  void g() throws RemoteException, IOException{ 
		n();
		  }
	 
	public static void main(String[] args) throws IOException,RemoteException
	{
		ThrowsExample obj = new ThrowsExample();
		
		
		obj.g();
	}
}












