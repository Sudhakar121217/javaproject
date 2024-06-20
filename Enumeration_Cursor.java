package COLLECTIONS;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration_Cursor 
{

	   public static void main(String args[]) {
	      Vector dayNames = new Vector();
	       
	      dayNames.add("vikash");
	      dayNames.add("vipin");
	      dayNames.add("manish");
	      dayNames.add("arun");
	      dayNames.add("rana");
	      Enumeration e = dayNames.elements();
	      
	      while (e.hasMoreElements())
			  {

	         System.out.println(e.nextElement());
	      }
 }
}
	