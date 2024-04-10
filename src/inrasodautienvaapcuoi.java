import java.util.Scanner;
public class inrasodautienvaapcuoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner (System.in);
   System.out.println("nhap so luong day");
   int b=sc.nextInt();
   System.out.println("nhap day " +b+  " so ");
   int []a=new int [(int)b];
    for (int i=0 ; i<b ; i++) {
    	a[i]=sc.nextInt();}
    System.out.println(" so dau tien" + a[0]);
    System.out.println("so gan cuoi" +a[b-1]);
    	
    
	}

}
