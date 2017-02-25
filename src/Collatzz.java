class Collatzz {
	public long collatzz(long num) {
		long answer = 0;

		do {
			if (answer >= 500) {
				answer = -1;
				break;
			}
			if (num == 1) {
				answer = 1;
				break;
			}
			if (num % 2 == 0) {
				num /= 2;
				System.out.println("짝수라서 나눔"+num);
			} else {
				num *= 3;
				num++;
				if(num > 2147483647) {
					System.out.println("--------- overflow ----------");
				}
				System.out.println("홀수라서 3을 곱하고 1을 더함"+num);
			}
			answer++;
			System.out.println("카운터:"+answer);
			
		} while (num != 1);
		return answer;
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		Collatzz c = new Collatzz();
//		int ex = 1252663;
		int ex = 704623;
		System.out.println(c.collatzz(ex));
	}
}