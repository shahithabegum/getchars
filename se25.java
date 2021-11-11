import java.util.*;
import java.lang.*;
class se25
{
  public static void main(String arg[])
   {
     try
         {
            String s="The char array equals";
            char[] ca = new char[] { ' ', ' ', ' ', ' ',
                                  ' ', ' ', ' ', ' ' };
	s.getChars(4,10,ca,2);
	  System.out.println("this sample excerise is equal to "+ca);
	}
	catch(Exception e)
	{
	  System.out.println(e);
	}
       }
}