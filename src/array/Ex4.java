package array;

import java.util.Scanner;

/*
 * 4. 피보나치 수열
설명

1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.

2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.


입력
첫 줄에 총 항수 N(3<=N<=45)이 입력된다.


출력
첫 줄에 피보나치 수열을 출력합니다.


예시 입력 1 

10
예시 출력 1

1 1 2 3 5 8 13 21 34 55
 */
public class Ex4 {
	// 재귀함수로는 맨 마지막 합 밖에 안 나옴
//	public static int solution(int n) {
//		if ( n <= 1 ) {
//			return n;
//		}
//		
//		return solution(n-1) + solution(n-2);
//	}
	
	// 풀이
//	public static int[] solution(int n) {
//		int[] answer = new int[n];
//		answer[0] = 1;
//		answer[1] = 1;
//		for(int i=2; i<n; i++) {
//			answer[i] = answer[i-2]+answer[i-1];
//		}
//		
//		
//		return answer;
//	}
	
	// 배열 안 쓰기
	public static void solution(int n) {
		int a=1, b=1, c;
		System.out.print(a + " " + b + " ");
		for(int i=2; i<n; i++) {
			c = a+b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//for(int x : solution(n)) System.out.print(x + " ");
		solution(n);
	}
}