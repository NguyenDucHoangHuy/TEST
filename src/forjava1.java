import java.util.Scanner;
public class forjava1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long tich=1;
		System.out.println("n=");
		int n=sc.nextInt();
		System.out.println(+n);
		for (int i=1;i<=n;i++) {
			tich=tich*i;
		}
		System.out.println("Tich="+tich);
	}

}
