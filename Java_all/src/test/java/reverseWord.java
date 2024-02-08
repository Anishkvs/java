
public class reverseWord {

public static void main(String[] args)
{
    //How to Reverse words in string java
	
	
   String s = "Reverse my word";
   System.out.println(s.length());


   String a[]=s.split(" ");
   
   for(int i=a.length-1; i>=0; i--)
   {
	   System.out.print(a[i]+" ");
   }
   
}



}



















/*
 * 
 * 

    
	
	public static void main(String[] args)
	{
      String s = "My reverse word code";
       
      System.out.println(s.length());
   
        String a[]= s.split(" ");
        
        for(int i=a.length-1; i>=0; i--)
        {
        System.out.print(a[i]+" ");	
        }
		
	}
	    
	
 * 
 * 
 * 
 * 
 * 
 * 
*/
