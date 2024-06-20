package COLLECTIONS;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration_Cursor 
{

	   public static void main(String args[]) {
	      Vector dayNames = new Vector();
	       
	      dayNames.add("monday");
	      dayNames.add("friday");
	      dayNames.add("thrusday");
	      dayNames.add("saturday");
	      dayNames.add("rana");
	      Enumeration e = dayNames.elements();
	      
	      while (e.hasMoreElements())
			  {

	         System.out.println(e.nextElement());
	      }
 }
}
	
