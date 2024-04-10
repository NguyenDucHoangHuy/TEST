import java.util.Scanner;

public class tímonguyenlonnhat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner (System.in);
   System.out.println("Nhap cac so");
   int a,b,c,d,e,f;
   a=sc.nextInt();
   b=sc.nextInt();
   c=sc.nextInt();
   d=sc.nextInt();
   e=sc.nextInt();
   f=sc.nextInt();
   
   Math.max(a,b);
   Math.max(c,d);
   Math.max(e,f);
  int g=Math.max(a,b);
  int h=Math.max(c,d);
  int k=Math.max(e,f);
   if ((g>h)&&(g>k))
         { System.out.println("so lon nhat la"+g);}
   if ((h>g)&&(h>k))
	         { System.out.println("so lon nhat la"+h);}
  if ((k>h)&&(k>g))
	         { System.out.println("so lon nhat la"+k);}
 
   
   
 
	}

}
