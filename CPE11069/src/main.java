import java.util.Scanner;

public class main {
	

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		while (true) {// �@���s��Ū�i��,�p��,��X
			int run = scanner.nextInt();
			int mod = scanner.nextInt();

			if (run == 0 && mod == 0) {
				System.out.println("0" + " " + "0");
				break;
			}

			int[] arrrun = new int[run];// array��l��
			for (int i = 0; i < run; i++) {
				arrrun[i] = scanner.nextInt();// �}�CŪ�J����s��n�񪺰}�Carrrun�̭�
			}

			for (int i = 0; i < run; i++) {
				for (int j = i + 1; j < run; j++) {
					int a = arrrun[i] % mod;// ��X�e���Ʀr���l��
					int b = arrrun[j] % mod;// ��X�᭱�Ʀr���l��

					if (a > b) {// �p�G�e���Ʀr���l��>�᭱�Ʀr���l��
						int temp = arrrun[i];// �h���洫,�T�O�e���Ʀr���l��<�᭱�Ʀr���l��
						arrrun[i] = arrrun[j];
						arrrun[j] = temp;
					} else if (a == b) {// �p�G�e���Ʀr���l�Ƶ���᭱�Ʀr���l��
						if ((arrrun[i] % 2 == 1) && (arrrun[j] % 2 == 1) && (arrrun[i] < arrrun[j])) {// ��ӼƦP���_��,�ӥB�᭱����>�e������,�h�洫,�T�O�Ʀr�j���b�e��
							int temp = arrrun[i];
							arrrun[i] = arrrun[j];
							arrrun[j] = temp;
						} else if (arrrun[i] % 2 == 0 && arrrun[j] % 2 == 1) {// �e�����Ƭ�����,�᭱���Ƭ��_�Ʈ�,�h�洫,�T�O�_�Ʀb�e,���Ʀb��
							int temp = arrrun[i];
							arrrun[i] = arrrun[j];
							arrrun[j] = temp;
						} else if (arrrun[i] % 2 == 0 && arrrun[j] % 2 == 0 && (arrrun[i] > arrrun[j])) {// ��ӼƦP������,�ӥB�e������>�᭱���ƫh�洫,�T�O�Ʀr�p���b�e��
							int temp = arrrun[i];
							arrrun[i] = arrrun[j];
							arrrun[j] = temp;
						}

					}
				}
			}

			for (int i = 0; i < run; i++) {// ��X�}�C����
				System.out.println(arrrun[i]);
			}
		}
	}
}