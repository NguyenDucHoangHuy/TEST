
import java.util.Scanner;
public class forjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long S=0;
		
		System.out.print("n=");
		int n=sc.nextInt();
		
		 for (int i=1; i<=n; i=i+2) {
			 S+=i;} 
			 System.out.println("S="+S);
		 
		

	}

}
