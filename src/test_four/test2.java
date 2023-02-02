package test_four;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		/*	세 개의 직선이 있다.
			숫자의 의미는 직선의 길이를 말한다.
			이 직선으로 삼각형을 만들 수 있는지 판단하는 프로그램을 작성하시오.
			삼각형의 성립 조건)
			a, b, c 가 변의 길이이고 c가 제일 긴 길이라고 한다면
			c < a + b 이면 삼각형이 성립됨.
			입력
			직선의 길이 3개가 입력으로 주어진다.(정수)
			출력
			삼각형이 가능하면 "yes", 삼각형을 만들 수 없다면 "no"를 출력하시오.
			입력 예시 
			2
			3
			4
			출력 예시
			yes  */

		System.out.println("삼각형이 만들어 질수 있는 길이를 입력하시오.");
		Scanner sc = new Scanner(System.in);
		System.out.print("a의 값을 입력해 주세요>");
		int a = sc.nextInt();
		System.out.print("b의 값을 입력해 주세요>");
		int b = sc.nextInt();
		System.out.print("c의 값을 입력해 주세요>");
		int c = sc.nextInt();

		int[] arr = new int [3];
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;

		int maxLength = 0;

		for(int i = 0; i<arr.length; i++) {
			if(maxLength<arr[i]) {
				maxLength=arr[i];
			}
		}

		if(maxLength == arr[0]) {
			if(a<b+c) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}else if(maxLength ==arr[1]) {
			if(b<a+c) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}else if(maxLength ==arr[2]) {
			if(c<a+b) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
	}
}