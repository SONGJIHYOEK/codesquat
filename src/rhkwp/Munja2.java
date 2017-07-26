package rhkwp;
import java.util.Scanner;

	public class Munja2 {
		public static void main(String[] args) {
			int num=0; 
			Scanner input = new Scanner(System.in);
			String picka= input.nextLine();
			
			for(int chu=0 ; chu < picka.length();chu++)
			{
				char chuchar = picka.charAt(chu);
				if ('a'<= chuchar && chuchar <= 'z') {
					num++;
				}
			}
			System.out.printf("%d",num);
		}
		
		
		
		
		
		
		


		

}

