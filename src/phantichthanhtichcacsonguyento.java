import java.util.Scanner;
public class phantichthanhtichcacsonguyento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner (System.in);
       System.out.println("Nhap vao so N: ");
       int n=sc.nextInt();
       System.out.println("tich cac thua so nguyen to");
       for (int i=2; i<=n;i++) {
    	   //int dem=0;
    	   while (n%i==0) {
    		   System.out.print(i+" ");
    		   //dem++;
    		   n/=i;} 
//    	   if(dem>1) { System.out.print(+i+"^"+dem);}
   		
//  		 if(n>i) { System.out.print(" * ");}
  		 
//  		   if(dem==1) {System.out.print(i);}
  	   
       }
      
	}
}

    		   
    	   
    	    
    	   
    	   
       
	
	
