import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		// init

		Scanner scanner = new Scanner(System.in);
		while (true) {
			int[] arr1;
			int[] arr2;
			int num1 = 0, num2 = 0, temp = 0, count1 = 0, count2 = 0, countmin = 0;
			int carry = 0;

			num1 = scanner.nextInt();
			num2 = scanner.nextInt();

			if (num1 == 0 && num2 == 0) {
				break;
			}

			temp = num1;
			while (true) {// �P�_�Ĥ@�ӼƦ��X���
				temp = temp / 10;
				count1++;
				if (temp == 0)
					break;
			}
			temp = num2;
			while (true) {// �P�_�ĤG�ӼƦ��X���
				temp = temp / 10;
				count2++;
				if (temp == 0)
					break;
			}

			arr1 = new int[count1];// �Ĥ@�ӼƦU�O���X�ʦ�ơB�Q��ơB�Ӧ��
			for (int i = 0; i < count1; i++) {
				arr1[i] = num1 % 10;
				num1 = num1 / 10;
			}
			arr2 = new int[count2];
			for (int i = 0; i < count2; i++) {
				arr2[i] = num2 % 10;
				num2 = num2 / 10;
			}

			if (count1 > count2)// �ۥ[�ɥH����p���Ƭ��D,���Ocount2
				countmin = count2;
			else
				countmin = count1;// �N�Ocount1

			// for(int i=0; i<arr1.length; i++)//�]�����H������
			// arr1[arr1.length-1]++;//���̫�@��(�]���O�}�C)

			for (int i = 0; i < countmin; i++) {// countmin�b�o�̪��F�̤p�ƪ����
				arr1[i] += arr2[i];
				if (arr1[i] >= 10) {
					carry++;
					if (i == countmin - 1) {// �P�_�̫�@�쪺�i��(�۹諸for�j�骺countmin����)
						if (count1 > count2) {// �p�G�Ĥ@�ӼƤj��ĤG�Ӽ� EX:1234 456
							if (arr1[countmin] == 9) {// �̫�@�쪺�U�@�쵥��9����(�۹諸if��countmin����)
								carry++;// �i��@��
							}
						} else if (count2 > count1) {// �p�G�ĤG�ӼƤj��Ĥ@�Ӽ� EX:995 1456
							if (arr2[countmin] == 9) {// �̫�@�쪺�U�@�쵥��9����(�۹諸if��countmin����)
								carry++;// �i��@��
							}
						}
					}
				}
			}

			// if (arr1[count1 + 1] == 9)
			// if (carry > 1)
			// System.out.print(carry + "carry operation");
			// if (carry == 1)
			// System.out.print(carry + "carry operation");

			// if (count1 > count2)
			// count1 = count2;
			//
			// for (int i = 0; i < count1; i++) {
			// arr1[i] += arr2[i];
			// if (arr1[i] >= 10) {
			// arr1[i] -= 10;
			// carry++;
			// arr1[i + 1]++;
			//
			// }
			// }
			if (carry == 1) {
				System.out.println(carry + " carry opration");
			} else if (carry == 0) {
				System.out.println("No carry opration");
			} else {
				System.out.println(carry + " carry oprations");
			}
		}
	}
}