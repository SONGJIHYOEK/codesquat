package rhkwp;
import java.util.Scanner;

public class Munja1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputValue = input.nextLine ();
		if(inputValue.charAt(inputValue.length()-1)=='?')
		{
			String splits = inputValue.substring(0, inputValue.length()-1);
			String [] splitValue = splits.split(" "); 
		for (int i= splitValue.length ; i >1 ; i--) {
			System.out.printf(splitValue[i-1]);
			System.out.printf(" ");
			}
		System.out.printf(splitValue[0]+"?");
		}
		else if (inputValue.charAt(inputValue.length()-1)=='!'){
			String splits = inputValue.substring(0, inputValue.length()-1);
			String [] splitValue = splits.split(" "); 
		for (int i= splitValue.length ; i >1 ; i--) {
			System.out.printf(splitValue[i-1]);
			System.out.printf(" ");
			}
		System.out.printf(splitValue[0]+"!");
		}
		else if (inputValue.charAt(inputValue.length()-1)=='.'){
			String splits = inputValue.substring(0, inputValue.length()-1);
			String [] splitValue = splits.split(" "); 
		for (int i= splitValue.length ; i >1 ; i--) {
			System.out.printf(splitValue[i-1]);
			System.out.printf(" ");
			}
		System.out.printf(splitValue[0]+".");
		}
		else {
			String [] splitValue = inputValue.split(" ");
			for (int i= splitValue.length ; i >0 ; i--) {
				System.out.printf(splitValue[i-1]);
				System.out.printf(" ");
				}
		}
	}
}

