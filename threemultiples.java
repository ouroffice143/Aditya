import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class threemultiples {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Please enter 10 numbers to print multiples of 3");
		
		int a[]= new int[10];
		
		for(int i=0; i<10;i++)
		{
			a[i] = Integer.parseInt(br.readLine());
		}
		int m[]=new int[a.length];
		int j=0;
		System.out.println("multiples of 3 are");
		for(int i=0;i<10; i++)
		{
		if( a[i]%3==0)
		{
			m[j]=a[i];
			System.out.println(  m[j]);
			j++;
		}
		}
	}
}
		
	


