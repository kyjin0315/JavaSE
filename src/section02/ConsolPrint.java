package section02;
/*
 * 출력문
 *  데이터를 화면에 출력하는 방법
 * 
 * System.out.println() 	: 괄호안 내용 출력 후 행 바꿈
 * System.out.print()		: 괄호안 내용 출력 행 바꿈 x
 * System.out.printf()		: 문자열 서식 문자를 이용해 형식화된 내용 출력 행 바꿈 x
 * 
 * 
 * 서식문자
 *  %d : 정수(10진수)
 *  %o : 정수(8진수)
 *  %x : 정수(16진수)
 *  %f : 실수(소수점 있는거)
 *  %s : 문자열(문자가 여러 개 있음) ""
 *  %c : 문자(딱 한글자) ''
 * 
 * 
 * 
 */
public class ConsolPrint {
	
	public static void main(String[] args) {
		//print - 줄바꿈o
		System.out.print("Welcome.");
		//println - 줄바꿈x
		System.out.println("Java World");
		//printf - 서식문자 이용해 형식화. 줄바꿈x. f => 포맷터. 
		System.out.printf("오늘은 %d월 %d일입니다.\n", 11, 14);
		
		System.out.println("오늘은 " + 11 +"월 " + 14 +"일 입니다.");
		
		System.out.printf("%d은 첫번째, %f는 두번째, %s는 세번째.\n", 1, 2.0, "셋");
		
		
		
		
	}

}
