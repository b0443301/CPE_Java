import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		int[] month_day = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };// ����Ѽ�
		String[] week = { "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };// �վ㬰2011/1/1���O§�����Ĥ@�ѬO§����

		Scanner scanner = new Scanner(System.in);
		int run = scanner.nextInt();
		for (int i = 0; i < run; i++) {
			int month = scanner.nextInt();// Ū���
			int day = scanner.nextInt();// Ū���

			for (int j = 0; j < month - 1; j++) {// �����ର�Ѽ�
				day += month_day[j];
			}

			System.out.println(week[day % 7 - 1]);// �}�C��X�覡,�p��P���X,-1�O�����}�C���P���X,�]���}�C�q0�}�l
			// for (int j = 1; j < month; j++) {
			// day += month_day[j - 1];
			// }
		}
	}
}
