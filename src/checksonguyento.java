import java.util.Scanner;
public class checksonguyento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
	    System.out.println("nhap a");
	    int a=sc.nextInt();
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
    }
	}


