package picka;

import java.util.Scanner;

class Gogodan { 
	public int maxdaysofmonth(int month) {
		int maxDays []= {31,28,31,30,31,30,31,30,31,30,31};
		return maxDays[month-1];
	}
	public void printSampleCalender() {
	System.out.println("�� �� ȭ �� �� �� ��");
	System.out.println("------------");
	System.out.println(" 1  2  3  4  5  6  7");
	System.out.println(" 8  9 10 11 12 13 14");
	System.out.println("15 16 17 18 19 20 21");
	System.out.println("22 23 24 25 26 27 28");
	}
	public static void main (String[] args) {
		String PROMPT= "<cal>:";
		System.out.print(PROMPT);
		 Gogodan cal = new Gogodan();
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���");
		int month = scanner.nextInt();
		while (true) {
		if (month == -1) {
			break;
		}
		if (month >12) {
			continue;
		}
		System.out.printf("%d����%d�ϱ��� �ֽ��ϴ�\n", month, cal.maxdaysofmonth(month));
		cal.printSampleCalender();
		scanner.close();
		break;
		}
	}
}
