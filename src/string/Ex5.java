package string;

import java.util.Scanner;

/*
 * 5. 특정 문자 뒤집기
설명

영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,

특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.


입력
첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.


출력
첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.


예시 입력 1 

a#b!GE*T@S
예시 출력 1

S#T!EG*b@a
 * */
public class Ex5 {
	public static String solution (String str) {
		String answer = "";
		
		char[] s = str.toCharArray();
		int lt = 0, rt = s.length-1;
		
		while(lt < rt) {
			if((s[lt] > 64 && s[lt] < 91) || (s[lt] > 96 && s[lt] < 123)) {
				if((s[rt] > 64 && s[rt] < 91) || (s[rt] > 96 && s[rt] < 123)) {					
					char tmp = s[lt];
					s[lt] = s[rt];
					s[rt] = tmp;
					lt++;
					rt--;
				}else {
					rt--;
				}
			}else {
				lt++;
			}
		}
		
		answer = String.valueOf(s);

		return answer;
	}
	
	// 풀이
//	public static String solution(String str) {
//		String answer;
//		char[] s = str.toCharArray();
//		int lt = 0, rt = str.length()-1;
//		
//		while(lt < rt) {
//			if(!Character.isAlphabetic(s[lt])) {
//				lt++;
//			}else if(!Character.isAlphabetic(s[rt])) {
//				rt--;
//			}else {
//				char tmp = s[lt];
//				s[lt] = s[rt];
//				s[rt] = tmp;
//				lt++;
//				rt--;
//			}
//		}
//		
//		answer = String.valueOf(s);
//		
//		return answer;
//	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(solution(str));
	}
	
	

}
