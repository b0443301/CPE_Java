
import java.util.ArrayList;
import java.util.Scanner;

//��Arraylist�s���
public class main {
	public static void main(String args[]) {
		int max = 0;
		ArrayList<String> list = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNextLine()) {
			String input = scanner.nextLine();
			if (input.equals("0"))// �q���~��End Of File
				break;
			list.add(input);// �@��@��[�JString������
		}
		// for (int i = 0; i < list.size(); i++) {
		// if (max < list.get(i).length()) {
		// max = list.get(i).length();
		// }
		// }
		for (String e : list) {// ��foreach�M����ثe�̤j���ꪺ����
			if (max < e.length()) {
				max = e.length();
			}
		}
		// for (int i = 0; i < list.size(); i++) {
		//
		// }
		for (int i = 0; i < max; i++) {// �ĴX��
			for (int j = list.size() - 1; j >= 0; j--) {// ����b�ĴX��
				if (list.get(j).length() - 1 < i) {// �P�_��j�檺����<i(-1�O��X�Ӧ]���}�C���O0�}�l��),�P�_��ư�������
					System.out.print(" ");// �������L�ť�
				} else {
					System.out.print(list.get(j).charAt(i));// ����j��̭���i�檺�r��,�����L�r��
				}
			}
			System.out.print("\n");
		}
		// for (String e : list) {
		// System.out.println(e);
		// }
	}
}