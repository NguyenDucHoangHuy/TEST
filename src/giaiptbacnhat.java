import java.util.Scanner;
public class giaiptbacnhat {

	public static void main(String[] args) {
		
   Scanner sc=new Scanner(System.in);
   System.out.println("nhap a");
   double a=sc.nextDouble();
   System.out.println("nhap b");
   double b=sc.nextDouble();
   System.out.println("nhap c");
   double c=sc.nextDouble();
    
   if (a==0) {
	   if(b==0) {
		   if(c==0) {
			   System.out.println("phuong trinh co vo so nghiem");}
		   else { System.out.println("phuong trinh vo nghiem");}
		   
		   
			   
		   }
	   }
   else { System.out.println("phuong trinh co nghiem x=" +(c-b)/a);}   
   }
   
	}


