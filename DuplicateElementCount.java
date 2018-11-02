import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;

/**
 * @author PRABHAT
 *
 */
public class DuplicateElementCount {
	
	public static void main(String[] args)throws IOException {
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter a string");
		
		String s= br.readLine();
		int n = s.length();
		int count[] = new int[256];
		
		char ch[] = new char[n];
		//string to character
		for(int i =0;i<n;i++)
		{	ch[i]=s.charAt(i);
		
		}
		//sorting to make duplicate count easy
				Arrays.sort(ch);
		
		for(int i =0;i<n;i++) {
			
			//counting individual numbers
			 count[ch[i]]++;
			 
		
		}
	
		System.out.println();
		
		
		

		 n= ch.length;
		/*for( char c: ch){
		System.out.print(c);
		}
		System.out.println();
		System.out.println(n);*/
		
		for(int i=0;i<n;i++)
		{
				
		 	if(ch[i]!=ch[i++])
			{
			System.out.println("lettr.."+ch[i]+" is found.."+ count[ch[i]]+"..times");
			
			}
			
	}
		
			
			

	
	}
}



