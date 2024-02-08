
public class RemoveSpecialCharacter {

public static void main(String[] args)



{
	
		
	
	
  // How to Remove Special Character in a string java
	
    
       String s = "sara #@$%!";
  
	  s = s.replaceAll("[^a-zA-Z0-9]", "");
	  
	  System.out.println(s);
	  



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
