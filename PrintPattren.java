import java.util.Scanner;

public class PrintPattren {

	public static void main(String[] args) { 
       Scanner sc = new Scanner(System.in);
       System.out.println("Select a number of rows of pyramid you want");
       int n = sc.nextInt();
       // outer loop to handle number of rows 
       //  n in this case 
       for (int i=0; i<n; i++) 
       { 
 
           // inner loop to handle number spaces 
           // values changing acc. to requirement 
           for (int j=n-i; j>=1; j--) 
           { 
               // printing spaces 
               System.out.print(" "); 
           } 
  
           //  inner loop to handle number of columns 
           //  values changing acc. to outer loop 
           for (int j=0; j<=i; j++ ) 
           { 
               // printing stars 
               System.out.print(i+1+" "); 
           } 
  
           // ending line after each row 
           System.out.println(); 
       } 
   } 
     
  

   
}
