import java.util.Scanner;
public class Baekjoon_0630_pratice {

	//Baekjoon if�� 9498�� ���� / � �߰���
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(" ������? ");
		 String name = sc.next();

		 System.out.print(" ������ �Է��ϼ��� ");
		int score = sc.nextInt();
		sc.close();

		if(score >= 90) {
			System.out.println("A ��� �Դϴ�.");
		}else if (score >= 80) {
			System.out.println("B ��� �Դϴ�.");
		}else if (score >= 70) {
			System.out.println("C ��� �Դϴ�.");
		}else if (score >= 60) {
			System.out.println("D ��� �Դϴ�.");
		}else {
			System.out.print("F ��� �Դϴ�.");
		}

	}

}
