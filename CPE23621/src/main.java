import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		for (int i = 1;; i++) {// �i�H�令while(scanner.hasNextInt())�i�O�n�[�@��i++�����p��
			Boolean isSequence = true;// �w�]�O���O���OB2-Sequence(�L�T��������,�u�n�p�G�g�L�H�U�P�_�٬O�Ltrue�F��,���N�OB2-Sequence)
			int input = scanner.nextInt();// �u��Ū�Jinput����
			int[] arrInput = new int[input];// �}�@��int�}�C�sŪ�J����EX:1 2 4 8
			for (int j = 0; j < input; j++) {// ��Ū�J���}�C�Ȧs�U��
				arrInput[j] = scanner.nextInt();
			}

			scanner.nextLine();// Ū�F/n�y�l�᳣̫���@�ӱ׽un
			scanner.nextLine();// Ū�ťը���

			// input = InputCalc(input);
			// main test = new main();

			for (int j = 0; j < input - 1; j++) {// �ˬd��J���ȬO�_�����W�ƦC
				if (arrInput[j] >= arrInput[j + 1]) {// �p�G�e�����H��᭱���H�j
					isSequence = false;// �⥦�O�������~��
				}
			}
			// int[] note = new int[10000];

			if (isSequence) {
				ArrayList<Integer> List = new ArrayList<Integer>();
				for (int j = 0; j < input; j++) {// �ثe�ۤv����
					for (int k = j; k < input; k++) {// �ۤv��ۤv����ۥ[k=j+1,�o�D�O�ۤv�����e�����H�ۥ[(�n��q���Ǧb�ۤv���᪺�H�ۥ[),�ګ᭱���H����
						List.add(arrInput[j] + arrInput[k]);
					}
				}
				Collections.sort(List);// �ƧǱq�p�ƨ�j
				// Collections.reverse(List);���p�ƨ�j����A�����ܦ��Ѥj�ܤp
				for (int j = 0; j < List.size() - 1; j++) {// �Τ@��for�j���
					if (List.get(j) == List.get(j + 1)) {// �p�G�e���[���ȸ�᭱�۵�����,���ݭn�[isSequence
															// =
															// true�O�]���u�n�P�_false������,;
						isSequence = false;// ���������~��
						break;
					}
				}
			}

			if (isSequence) {// �p�GisSequence��true�F��
				System.out.println("Case #" + i + " It is a B2-Sequence");
				System.out.println();
			} else {// �p�GisSequence��false�F��
				System.out.println("Case #" + i + " It is not a B2-Sequence");
				System.out.println();
			}
		}
	}

	static int InputCalc(int i) {
		return i * i;
	}
}
// if (arrInput[j] > arrInput[j + 1]) {
//
// }