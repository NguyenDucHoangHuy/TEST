import java.util.Scanner;
public class chuyendoisothapphansanghenhip_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner (System.in);
      System.out.println("nhap so nguyen n>0");
      int n=sc.nextInt();
      String nhiPhan = "";
      while (n>0) {
    	  nhiPhan=(n%2) + nhiPhan;
          n=n/2;  	 
          }
      System.out.println("dang nhi phan"+nhiPhan);
	}

}
 