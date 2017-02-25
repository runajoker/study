import java.util.InputMismatchException;
import java.util.Scanner;

public class Excercise09 {
	boolean run = true;
	int studentNum = 0;
	int[] scores = null;
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		Excercise09 ex = new Excercise09();
		ex.jumsoo();
	}
	
	public void jumsoo(){

		try {
		while (run) {
			System.out.println(studentNum);
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택>");

			int selectNo = scanner.nextInt();

				switch (selectNo) {
				case 1:
					System.out.print("학생수> ");

					studentNum = scanner.nextInt();

					scores = new int[studentNum];
					break;
				case 2:
					for (int i = 0; i < studentNum; i++) {
						System.out.print("scores[" + i + "] :");
						scores[i] = scanner.nextInt();
						System.out.println();
					}
					break;
				case 3:
					for (int a = 0; a < studentNum; a++) {
						System.out.print("scores[" + a + "] :" + scores[a] + "\n");
					}
					break;
				case 4:
					int sum = 0;
					int max = 0;
					for (int i = 0; i < studentNum; i++) {
						sum += scores[i];
						if (max < scores[i])
							max = scores[i];
					}
					System.out.print("최고 점수:" + max + "\n");
					System.out.print("평균점수 점수:" + (sum / (float) scores.length) + "\n");
					break;
				case 5:
					run = false;
					System.out.println("프로그램 종료");
					break;
				}
			}
		} catch (InputMismatchException e) {
				System.out.println("숫자만 입력하세요");
				jumsoo();
			}

		}

	}
