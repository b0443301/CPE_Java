import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			int[] count1 = new int[26];// �p��Ĥ@������r���X�{����
			int[] count2 = new int[26];// �p��ĤG������r���X�{����
			String arrrun1 = scanner.nextLine();
			String arrrun2 = scanner.nextLine();

			for (int i = 0; i < arrrun1.length(); i++) {// �p��Ĥ@�Ӵ���r�����Ʀ����ǥ�for�j��M�Q
				count1[arrrun1.charAt(i) - 'a']++;// ��Xa�������q��X����a-->arrrun1[0],b--->arrrun1[1],c-->arrrun1[2]
			}
			for (int i = 0; i < arrrun2.length(); i++) {// �p��ĤG�Ӵ���r�����Ʀ����ǥ�for�j��M�Q
				count2[arrrun2.charAt(i) - 'a']++;// ��Xa�������q��X����a-->arrrun2[0],b--->arrrun2[1],c-->arrrun2[2]
			}
			for (int i = 0; i < 26; i++) {// ����մ���(a~z)26��
				if (count1[i] > 0 && count2[i] > 0) {// ���ⵧ��Ƴ��s�b���ɭ�,����==1���]�����i�঳2,3,4
					System.out.print(Character.toChars(i + 'a'));// ������m�����ন�r��
				}
			}
			System.out.print('\n');// ����
		}
	}
}