package P1;

import java.io.File;
import java.util.Date;

public class p1 {

	public static void main(String args [])
	{
		
		
	Date d =new Date();
	String date = d.toString().replaceAll(":","_");
	System.out.println();
	Date d1 =new Date();
	System.out.println(d1.toString());
	File src = new File(".\\Demo\\"+date+"newfile.JPG");
	System.out.println(src.getAbsolutePath());
	System.out.println("Done");
	}
	
	
	
	
}
