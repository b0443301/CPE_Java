import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		while (true) {// �@������Ū,�p��,��X
			int sum = 0;
			String input = scanner.nextLine();// String�bjava���}�C�������b,���ݭn�ƥ����D����,�h�������׳��i�H��

			if (input.equals("0")) {// �r�ꪺ�g�kequals,�@�w��true
				break;
			}

			if (input.length() == 1) {// ��J�Ȫ����׬�1��,EX:2
				sum = input.charAt(0) - '0';// ��r���ন���(String�O�r���զ�)
			}

			while (input.length() != 1) {// ��J�Ȫ����פ���1��,EX:11,47,�h���H�U����while(�P�_����true�~�|�i�h�H�U�{��),��if(�P�_��)
				sum = 0;
				for (int i = 0; i < input.length(); i++)
					sum += input.charAt(i) - '0';
				input = String.valueOf(sum);// ��Ʀr�ର�r��
			}

			System.out.println(sum);// ��X���
		}
	}
}
