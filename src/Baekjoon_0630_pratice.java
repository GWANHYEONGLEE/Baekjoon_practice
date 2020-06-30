import java.util.Scanner;
public class Baekjoon_0630_pratice {

	//Baekjoon if문 9498번 문제 / 몇개 추가함
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(" 성함은? ");
		 String name = sc.next();

		 System.out.print(" 점수를 입력하세요 ");
		int score = sc.nextInt();
		sc.close();

		if(score >= 90) {
			System.out.println("A 등급 입니다.");
		}else if (score >= 80) {
			System.out.println("B 등급 입니다.");
		}else if (score >= 70) {
			System.out.println("C 등급 입니다.");
		}else if (score >= 60) {
			System.out.println("D 등급 입니다.");
		}else {
			System.out.print("F 등급 입니다.");
		}

	}

}
