import java.util.Scanner;
public class mang2chiu {
// Nguyễn Đức Hoàng Huy
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int i,j,tongcheochinh=0,tongcheophu=0;
      int congviec ;
      int cot,hang;
      int ketthuc;
      do {
      System.out.println("Bang cong viec");
       System.out.println("Cong viec 1: Tim max min cua mang");
      System.out.println("Cong viec 2: Tong duong cheo chinh");
      System.out.println("Cong viec 3: Tong duong cheo phu");
      System.out.println("Chon cong viec");
      congviec=sc.nextInt();
      System.out.print("nhap vao so cot: ");  cot=sc.nextInt();
      System.out.print("nhap vao so hang: ");  hang=sc.nextInt();
      int [][]a=new int[cot][hang];
    System.out.println("nhap cac phan tu cua ma tran");
      for (i=0;i<cot;i++) {
    	 for (j=0;j<hang;j++) {
    		 System.out.print("a["+i+"]["+j+"]=");
    		 a[i][j]=sc.nextInt();
    	 }
      }
         
      System.out.println("ma tran vua nhap");
      for (i=0;i<cot;i++) {
     	 for (j=0;j<hang;j++) {
     		 System.out.print(a[i][j]+ "    ");}
     	      	 
      System.out.println("\n");
      }
       switch(congviec) {
       case 1:       
    	  int max=a[0][0];
    	  for (i=0;i<cot;i++) {
    		  for (j=0;j<hang;j++) {
    			 if(max<a[i][j]) {max=a[i][j];} 
    			 
    		  }
    	  }
      System.out.println("so lon nhat trong mang: "+max);
      int min=a[0][0];
	  for (i=0;i<cot;i++) {
		  for (j=0;j<hang;j++) {
			 if(min>a[i][j]) {min=a[i][j];} 
			 
		  }
	  }
     System.out.println("so nho nhat trong mang: "+min);
       break;
       case 2:
      for ( i = 0; i < cot; i++) {
    	  for (j=0;j<hang;j++) { if(i==j) {
                  		  tongcheochinh+=a[i][j];}
        	  }
      }
          
      System.out.println("tong phan tu tren duong cheo chinh= "+tongcheochinh);
      break;
       case 3:
      for ( i = 0; i < cot; i++) {
    	  for (j=0;j<hang;j++) {
    		  if(j==cot-i-1) {
    	 tongcheophu+=a[i][j];}
          }
      }
      System.out.println("tong phan tu tren duong cheo phu= "+tongcheophu);
       
	} 
       System.out.println("ket thuc nhap 0 quay lai nhap khac 0");
       ketthuc=sc.nextInt();
      } while(ketthuc!=0);
}
}