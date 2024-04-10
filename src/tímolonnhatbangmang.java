import java.util.Scanner;
public class tímolonnhatbangmang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("nhap cac so");
  int [] a=new int [6];
  for (int i=0;i<6;i++) {
    	 a[i]=sc.nextInt();}
     int max=a[0];
     for (int i=0 ; i<6 ; i++) {
    	 if (max<a[i]) { max=a[i];}
    	 
    	 
     }
    	 System.out.println("so lon nhat la"+max);
       
	}

}
