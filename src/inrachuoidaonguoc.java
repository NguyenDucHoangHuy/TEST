import java.util.Scanner;
public class inrachuoidaonguoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner (System.in);
       System.out.println("nhap vao chuoi");
       String chuoi=sc.nextLine();
       StringBuilder daonguochuoi=new  StringBuilder(chuoi);
       System.out.println("dao nguoc chuoi "+daonguochuoi.reverse());
       
       
	}

}
