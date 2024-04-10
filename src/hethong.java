import java.util.Scanner;
public class hethong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner (System.in);
      int quaylai=sc.nextInt();
      do {
      System.out.println("BANG CONG VIEC");
      System.out.println("Cong viec 1: Bang cuu chuong 2 den 9");
      System.out.println("Cong viec 2: Check so nguyen to");
      System.out.println("Cong viec 3: Chuyen doi he thap phan sang nhi phan");
      System.out.println("Cong viec 4: Tinh tong so nguyen to nho hon n ");
      System.out.println("Cong viec 5: Phan tich thua so nguyen to");
      System.out.println("chon cong viec thuc hien");
        
        int congviec=sc.nextInt();
       switch (congviec) {
       case 1: 
           System.out.println("cong viec 1 :");
      
     for (int i=2; i<=9;i++) {
  		for (int j=1;j<=10;j++) {
  			System.out.println(i + "x" + j + "=" +(i*j));
  		}
  		System.out.println("--------");}
  		break;
  		
       case 2:
    	   System.out.println("cong viec 2:");
    	   int a;
    	 do {
  	      System.out.println("nhap a");
	        a=sc.nextInt();
	 
	    switch  (a) {
	    case 0,1: System.out.println("so a khong phai so nguyen to");
	    break;
	    default:
	    	Boolean check=true;
	      for (int i=2; i<a-1;i++) {  
	    	  if (a%i==0)  {check=false;
	    	  
	    	  }
	    	  
	      }
	    
	      if (check==true) {System.out.println("so a la so nguyen to");}
	  	    else {System.out.println("so a khong la so nguyen to");}
	      
       }
    	 } while (a>0); 
	    break;
       
  
	     
	    
       case 3:
    	   System.out.println("cong viec 3:");
	    int n;
      do {
      System.out.println("nhap so nguyen n>0");
      n=sc.nextInt();
      String nhiPhan = "";
      while (n>0) {
    	  nhiPhan=(n%2) + nhiPhan;
          n=n/2;  	 
          }
      System.out.println("dang nhi phan"+nhiPhan);
      }
      while (n>0);
      break;
      
       
       
       case 4:
    	   System.out.println("cong viec 4:");
       int m;
      do {
      System.out.println("Nhap n");
		 m=sc.nextInt();
		int s=0;
    for (int i=1; i<m; i++)
    {  int dem=0;
       for (int j=1; j<=i;j++)
       { if (i%j==0)  {dem++;}
        
    }
       if( dem==2) { System.out.print("+"+i);
              s=s+i;}
       
	}
      
    System.out.println("="+s);
      } while (m>2) ; 
      break;
   
      
       case 5:
    	   System.out.println("cong viec 5:");
      int N;
      do {
       System.out.println("Nhap vao so N: ");
        N=sc.nextInt();
      System.out.println("tich cac thua so nguyen to");
      for (int i=2; i<=N;i++) {
   	   //int dem=0;
   	   while (N%i==0) {
   		   System.out.print(i+" ");
   		   //dem++;
   		   N/=i;} 
//   	   if(dem>1) { System.out.print(+i+"^"+dem);}
  		
// 		 if(N>i) { System.out.print(" * ");}
 		 
// 		   if(dem==1) {System.out.print(i);}
      
       }
      
     while (N>0);
       
      default : System.exit(0);
      
      
      
      	}
      
      

