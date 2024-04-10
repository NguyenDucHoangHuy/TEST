import java.util.Scanner;
public class tímongaytrongtungthang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc= new Scanner(System.in);
    
   System.out.println("nhap thang");
   int n=sc.nextInt();
    
    switch (n) {
   case 1,3,5,7,8,10,12 :
	   System.out.println("thang co 31 ngay");
   break;
   case 4,6,9,11:
	   System.out.println("thang co 30 ngay");
   break;
   case 2:
	   System.out.println("nhap nam");
	   int nam=sc.nextInt();
	   if ((nam%4==0)&&(nam%1000!=0)) {
		   System.out.println("thang 2 co 29 ngay");}
	   else { System.out.println("thang 2 co 28 ngay");}
	   break;
	default:
		System.out.println("thang nhap khong hop le");
	   }	
	   
	   
   }
   } 
	


