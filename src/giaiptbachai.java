import java.util.Scanner;

public class giaiptbachai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x,x1,x2,x3,denta,a,b,c;
 Scanner sc=new Scanner (System.in);
  System.out.println("nhap a");
     a=sc.nextDouble();
  System.out.println("nhap b");
     b=sc.nextDouble();
  System.out.println("nhap c");
     c=sc.nextDouble();
   denta=b*b-4*a*c;
      if(a!=0) {
	if (denta<0) { 
		System.out.println("phuong trinh vo nghiem");}
		if (denta==0) {  x=-b/(2*a);
			System.out.println("phuong trinh co nghiem khep x =" +x );}
		
  if (denta>0) {
      x1=(-b+Math.sqrt(denta))/(2*a) ;
      x2=(-b-Math.sqrt(denta))/(2*a);
            System.out.println("phuong trinh co hai nghiem");
            System.out.println("x1="+x1);
            System.out.println("x2="+x2);}
      }
   
      if(a==0) {
	  if(b==0) {
		  if(c==0) { System.out.println("phuong trinh co vo so nghiem");}
		  else {System.out.println("phuong trinh vo nghiem");}
		  
	  }
	   else { x3=-c/b;
		  System.out.println("phuong trinh co nghiem x" +x3);}
	  }
	 }
}


