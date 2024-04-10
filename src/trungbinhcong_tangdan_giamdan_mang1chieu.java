import java.util.Scanner;
public class trungbinhcong_tangdan_giamdan_mang1chieu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Nguyễn Đức Hoàng Huy
    Scanner sc=new Scanner (System.in);
    int i,j,n,congviec;
     int ketthuc;
    double tong=0;
      do {
     
    System.out.println("Bang cong viec");
    System.out.println("Cong viec 1: Tong cac phan tu cua mang");
    System.out.println("Cong viec 2: Sap xep tang dan, giam dan");
    System.out.println("Cong viec 3: Tong cac so nguyen to trong mang");
    System.out.println("Cong viec 4: Tim max,min ");
    System.out.println("------------------------------------");
    System.out.println("Chon cong viec");
     congviec=sc.nextInt();
    System.out.print("nhap vao so luong phan tu: ");
     n=sc.nextInt();
     int []a=new int[n];
     
    for (i=0; i<n; i++) { 
    	System.out.print("a["+(i+1)+"]=");
    	a[i]=sc.nextInt();
    
    }
    System.out.println("cac phan tu cua mang");
    for (i=0;i<n;i++) {
    	System.out.print(a[i]+" ");
    }
    System.out.println();
     switch (congviec) {
    case 1:
     
      for (i=0; i< n;i++ ) {
   	tong=tong+a[i];}
      
      System.out.println("tong gia tri cua mang= "+tong);
       break;
      
      
    case 2:
       int temp1;
       for ( i=0; i<(n-1); i++) {
    	   for ( j=0; j<n-i-1;j++){
    	   if(a[j]>a[j+1]) {
    		  temp1=a[j];
    		  a[j]=a[j+1];
    		  a[j+1]=temp1;}
      }
       }
    	System.out.println("xep theo tang dan");
    for (  i=0; i<n;i++) {
    	System.out.print(a[i]+ " ");
    }
     
    
    System.out.println();
    
    int temp2;
    for (  i=0; i<(n-1); i++) {
 	   for ( j=0; j<n-i-1;j++){
 	   if(a[j]<a[j+1]) {
 		  temp2=a[j];
 		  a[j]=a[j+1];
 		  a[j+1]=temp2;}
   }
    }
 	System.out.println("xep theo giam dan");
 for ( i=0; i<n;i++) {
 	System.out.print(a[i]+ " ");
 }
     break;
    
    
      
    case 3:
    System.out.println("tong cac so nguyen to trong mang: ");
 int tongnguyento=0;
         for( i=0;i<n;i++) { int dem=0;
        	 for ( j=1;j<=a[i];j++) {
        	 if(a[i]%j==0) { dem++;}
        	 }
        	 if(dem==2) {System.out.print("+"+a[i]);
        	 tongnguyento+=a[i];}
        	 
        	 }
         System.out.println("= "+tongnguyento);
         break;
         
    case 4:
         int max=a[0];
         for( i=0; i<n;i++) { 
        	 if(max<a[i]) {
        		 max=a[i];}
        	 }
        	 System.out.println("so lon nhat la: "+max);
        	 
         
        	 int min=a[0];
             for( i=0; i<n;i++) { 
            	 if(min>a[i]) {
            		 min=a[i];}
            	 }
            	 System.out.println("so nho nhat la: "+min);
            	 break;
	}
      System.out.println("ket thuc nhap 0 quay lai nhap khac 0 ");
      ketthuc=sc.nextInt();
      } while (ketthuc!=0);
	 
}
}