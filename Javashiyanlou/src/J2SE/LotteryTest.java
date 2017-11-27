package J2SE;

import java.util.Scanner;

public class LotteryTest {

	public static void main(String[] args) {
		Lottery lo=new Lottery();
		Scanner scan=new Scanner(System.in);
		System.out.println("please input the number of lottery group(s) that you want to generate:");
		String groupNum=scan.nextLine();
		lo.mm(groupNum);
	}
}
