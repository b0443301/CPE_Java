import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		Boolean flag = true;// ��flag�Otrue���ɭ�,��X''

		while (scanner.hasNextLine()) {
			String input = scanner.nextLine();
			// if (input.equals("0")) {
			// break;
			// }
			for (int i = 0; i < input.length(); i++) {
				if (input.charAt(i) == '\"') {// input���r���O"����
					// count++;
					// if (count % 2 == 1) {
					// System.out.print("``");
					// } else {
					// System.out.print("''");
					// }

					flag = !flag;// �P�_��ت��A�Ӥw,���O�u����P�����[��,true�O1,false�O0,����(�쥻�Otrue,��o���ܦ�false)
					if (!flag) {// ��false���ɭԿ�X``
						System.out.print("``");// �_�Ʀ�����XEX:�Ĥ@����X,�ĤT����X...
					} else {
						System.out.print("''");// ���Ʀ�����XEX:�Ĥ@����X,�ĤT����X...
					}
				} else {
					System.out.print(input.charAt(i));// ��X�r��
				}
			}
			System.out.print('\n');// print�i�H��X�r���r����,�ҥH'���׿�X',"���׿�X"�]�_�ӳ��S����
		}
	}
}