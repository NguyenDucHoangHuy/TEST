import java.util.Scanner;
public class timsobenhattrongmang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
   System.out.println("nhap day so");
      int []a=new int[10];
      
    for ( int i=0; i<6 ; i++) {
	   a[i]=sc.nextInt();
	    }
    int min=a[0];
   for (int i=0; i<6; i++) {
	   if(min>a[i]) { min=a[i];
	
	   }
 
	   
   }
   System.out.println("so nho nhat trong day"+min);
	}

}
