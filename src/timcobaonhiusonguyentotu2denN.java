import java.util.Scanner;

public class timcobaonhiusonguyentotu2denN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner (System.in);
   System.out.println("nhap vao so N ");
   Boolean check=true;
   int b;
   int N=sc.nextInt();
   int []a=new int[(int)N];
   a[0]=2;
    for ( int i=1; i<=N;i++) {   b=a[i];
    	for (int y=2; y<N-1;y++) {
    		if(a[i]%y==0){  check=false;}
    		}
    	
	 
	    	
	    }
    
    if(check=true) { System.out.println("so nguyen to trong day");}
    else { System.out.println("khong co so nguyen to trong day");}
    }
   }
   
	


