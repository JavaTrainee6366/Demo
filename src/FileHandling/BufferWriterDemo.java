package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferWriterDemo {
	
	public static void main(String[] args) throws Exception {     
	    FileWriter writer = new FileWriter("D:\\testout.txt");  
	    BufferedWriter buffer = new BufferedWriter(writer);  
	    buffer.write("I live in Punjab");  
	    buffer.close();  
	    System.out.println("Success");  
	    }  

}
