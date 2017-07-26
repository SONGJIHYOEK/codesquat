package rhkwp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Munja4 {
	static int[] computer() {
		List<Integer> tntwk = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Collections.shuffle(tntwk);
		int[] picka = new int[3];
		picka[0] = tntwk.get(0);
		picka[1] = tntwk.get(1);
		picka[2] = tntwk.get(2);
		return picka;
	}

	static int strike(int[] input, int[] humans) {
		int num = 0;
		int thenumberofStrike = 0;
		while (num < input.length) {
			int a = input[num];
			int b = humans[num];
			if (a == b) {
				thenumberofStrike += 1;
			}
			num++;
		}
		return thenumberofStrike;
	}
	static int ball(int[] input, int[] robot) {
	int ball= 0; 
		for (int i = 0; i< input.length; i++  )
			{for (int k =0 ; k< robot.length;k++)
			{
				int inputs = input[i];
				int robots = robot[k];
				if(inputs == robots && i!=k) {
					ball++;
				}
			}
		}
		return ball;
	}


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] RandomInt = computer();
		while (true) {
			System.out.println("야구게임입니다. 숫자를 맞추세요 ");
			String line = scanner.nextLine();
			if ("그만".equals(line)) {
				break;
			}
			String[] input = line.split(" ");
			if (input.length != 3) {
				continue;
			}
			int[] perfect = new int[3];
			perfect[0] = Integer.parseInt(input[0]);
			perfect[1] = Integer.parseInt(input[1]);
			perfect[2] = Integer.parseInt(input[2]);
			int ThenumberofStrike = strike(RandomInt, perfect);
			int ThenumberofBall = ball(RandomInt, perfect);
			System.out.println("스트라이크: " + ThenumberofStrike + " 볼: " + ThenumberofBall);
			
			if (ThenumberofStrike == 3) {
				System.out.println("수고하셨습니다");
				break;
			}
		}
	}
}
