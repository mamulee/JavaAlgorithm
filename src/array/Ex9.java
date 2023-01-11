package array;

import java.util.Scanner;

/*
 * 9. 격자판 최대합
설명

5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.

Image1.jpg

N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.


입력
첫 줄에 자연수 N이 주어진다.(2<=N<=50)

두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.


출력
최대합을 출력합니다.


예시 입력 1 

5
10 13 10 12 15
12 39 30 23 11
11 25 50 53 15
19 27 29 37 27
19 13 30 13 19

예시 출력 1

155
 */
public class Ex9 {
	// 왜 오답이징,,,,,비교 if문이 문제인듯...
	public static int solution(int n, int[][] arr) {
		int answer = 0, Rsum = 0, Lsum = 0;;
		
		for(int i=0; i<n; i++) {
			int rsum = 0;
			int csum = 0;
			for(int j=0; j<n; j++) {
				rsum += arr[i][j];
				csum += arr[j][i];
				//if(i == j) Rsum += arr[i][j];
				//if ((i+j) == (n-1)) Lsum += arr[i][j];
			}
			System.out.println("========="+i+"===========");
			System.out.println("rsum : " + rsum);
			System.out.println("csum : " + csum);
			System.out.println("answer : " + answer);
//			if(answer < rsum) {
//				if(rsum < csum) answer = csum;
//				else answer = rsum;
//			}
			answer = Math.max(answer, rsum);
			answer = Math.max(answer, csum);
			System.out.println("answer : " + answer);
			Rsum += arr[i][i];
			Lsum += arr[i][n-i-1];
		}
		
		System.out.println("Rsum : " + Rsum);
		System.out.println("Lsum : " + Lsum);
		
//		if(answer < Rsum) {
//			if(Rsum < Lsum) {
//				answer = Lsum;
//			}else {
//				answer = Rsum;
//			}
//		}
		answer = Math.max(answer, Rsum);
		answer = Math.max(answer, Lsum);
		
		return answer;
	}
	
	//풀이
//	public static int solution(int n, int[][] arr) {
//		int answer = Integer.MIN_VALUE;
//		int sum1, sum2;
//		for(int i=0; i<n; i++) {
//			sum1=sum2=0;
//			for(int j=0; j<n; j++) {
//				sum1 += arr[i][j];
//				sum2 += arr[j][i];
//			}
//			answer = Math.max(answer, sum1);
//			answer = Math.max(answer, sum2);
//		}
//		
//		sum1=sum2=0;
//		for(int i=0; i<n; i++) {
//			sum1 += arr[i][i];
//			sum2 += arr[i][n-i-1];
//		}
//		answer = Math.max(answer, sum1);
//		answer = Math.max(answer, sum2);
//		
//		return answer;
//	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(solution(n, arr));
	}
}
