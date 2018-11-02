import java.util.Scanner;

public class armstrongnumber {
	
	
	public static void main(String[] args) {
		
		int c=0,a,n = 0;  
	      
		Scanner sc = new Scanner(System.in);
		 System.out.println("please enter a numbeR TO CHECK IF TI IS ARMSTRONG numbeR OR not");
		  n =sc.nextInt();
		//keeping a copy to check
		  int t = n;
  
	      while(n>0)  
	      {  
	    	  //taking last number out
	      a=n%10;  
	      
	      n=n/10;  
	      //adding each number after cubing it
	      c=c+(a*a*a); 
	      System.out.println(c);
	      }  
	      if(t==c)  
	      System.out.println("given number is armstrong number");   
	      else  
	          System.out.println("given numbeR IS Not armstrong number");  
		
		
		
	
	}
}
	



