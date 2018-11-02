import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class triangle_circle_are {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please let us know which area you whant to check");
		
		System.out.println("press t for traingle & o for circle");
		char c = br.readLine().charAt(0);
		switch(c)
		{
		case 't':
		{
			System.out.println("Please enter height of triangle");
			int h = Integer.parseInt(br.readLine());
			System.out.println("please enter base of triangle");
			int b = Integer.parseInt(br.readLine());
			
			int areatraingle =(h*b*(1/2));
			System.out.println("Area Of Trianlge is "+ areatraingle);
			
			
		}
		break;
		
		case 'o' :
		{
			System.out.println("Please enter radius of circle");
			float r = Integer.parseInt(br.readLine());
			
			double areacirle = r * r * Math.PI;
			
			
			System.out.println("Area Of Trianlge is "+ areacirle);
		}
		break;
			
		}
	}

}
