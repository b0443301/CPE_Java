import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		int[] month_day = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };// 月份天數
		String[] week = { "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };// 調整為2011/1/1號是禮拜六第一天是禮拜六

		Scanner scanner = new Scanner(System.in);
		int run = scanner.nextInt();
		for (int i = 0; i < run; i++) {
			int month = scanner.nextInt();// 讀月份
			int day = scanner.nextInt();// 讀日期

			for (int j = 0; j < month - 1; j++) {// 把月份轉為天數
				day += month_day[j];
			}

			System.out.println(week[day % 7 - 1]);// 陣列輸出方式,計算星期幾,-1是對應陣列的星期幾,因為陣列從0開始
			// for (int j = 1; j < month; j++) {
			// day += month_day[j - 1];
			// }
		}
	}
}
