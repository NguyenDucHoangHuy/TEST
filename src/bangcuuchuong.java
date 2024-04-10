import java.util.Scanner;
public class bangcuuchuong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
     System.out.println("n=");
     int n=sc.nextInt();
    if (n<=0) { System.out.println("n khong hop le!");} else {
    	 System.out.println("bang cuu chuong"+n);
    for(int i=1;i<=10;i++) {
  	  System.out.println(n + "x" + i + "=" +(n*i));
    }  
    
    
     
      }
	}

}
