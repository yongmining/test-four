package test_four;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		/*보림이는 엄마와 함께 놋데리아에 갔다.
		보림이는 먹고 싶은게 많았으나 엄마가 살찐다고 2가지만 골라서 먹으라고 했다.
		그리고 2메뉴의 칼로리 합이 500보다 크면 엄마가 화를 내고, 500이하면 화를 내지 않으신다.
		보림이가 선택할 수 있는 메뉴는 다음과 같다.
		1. 치즈버거 : 400 칼로리
		2. 야채버거 : 340 칼로리
		3. 우유 : 170 칼로리
		4. 계란말이 : 100 칼로리
		5. 샐러드 : 70 칼로리
		이 메뉴들 중 2가지 메뉴를 선택했을 때 칼로리 합을 계산하고, 그 칼로리 합이 500보다 크면 "angry", 500이하면 "no angry"를 출력하시오.
		입력
		메뉴의 번호가 차례대로 두개 주어진다. (정수)
		출력
		그 번호의 메뉴 칼로리를 계산하여 500보다 크면 "angry", 500이하면 "no angry"를 출력하시오.
		입력 예시 
		1
		2
		출력 예시
		angry
		 */

		Scanner sc = new Scanner(System.in);
		int cal = 0;
		System.out.println("1.치즈버거 | 2. 야채버거 | 3. 우유 | 4. 계란말이 | 5. 셀러드 |");


		for(int i =0; i<2; i++) {
			System.out.print("메뉴를 선택하세요>");
			int num = sc.nextInt();

			switch(num) {
			case 1: 
				int cheese = 400;
				cal += cheese;
				continue;
			case 2:
				int veget = 340;
				cal += veget;
				continue;
			case 3:
				int milk = 170;
				cal += milk;
				continue;
			case 4:
				int egg = 100;
				cal += egg;
				continue;
			case 5:
				int salad = 70;
				cal += salad;
				continue;
			}

		}
		System.out.println("총 칼로리: "+cal);

		if(cal > 500) {
			System.out.println("Mom say : angry");
		}else {
			System.out.println("Mom say : no angry");
		}

	}

}

