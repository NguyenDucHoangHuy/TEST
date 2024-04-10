import java.util.Scanner;
public class tinhtongcacsonguyentonhohon100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Nhap n");
		int n=sc.nextInt();
		int s=0;
      for (int i=1; i<n; i++)
      {  int dem=0;
         for (int j=1; j<=i;j++)
         { if (i%j==0)  {dem++;}
          
      }
         if( dem==2) { System.out.print("+"+i);
                s=s+i;}
         
	}
       
      System.out.println("="+s);
	}
}
