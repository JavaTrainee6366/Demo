package Threadss;

public class ThredByThread extends Thread{

	String name;
	int time;
	
	
	public ThredByThread() {
		start();
	}

	
	  public ThredByThread(String name,int time) 
	  { 
		  super(name); 
		  this.name = name; 
		  this.time = time; 
		  start();
	  
	  }
	 
	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		
		
		for(int i=10;i<15; i++)
		{
			System.out.println(getName()+"........"+i);
			//System.out.println(name+"........"+getName());
			
			  try { sleep(time); }
			  catch (InterruptedException e) { // TODO Auto-generated
			  e.printStackTrace(); }
			 
		}
		
	}

}
