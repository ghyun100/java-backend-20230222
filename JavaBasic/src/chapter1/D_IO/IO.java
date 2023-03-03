package chapter1.D_IO;

import java.util.Scanner;

// 입 출력
// console을 통해서 개발자로 부터 입력을 받을 때 Scanner 객체를 사용 함
// console로 데이터를 출력할 땐 System 객체를 사용 함

public class IO {

	public static void main(String[] args) {
		// 출력
		// System.out.println(출력하고자하는 변수 혹은 상수);
		// syso 단축키로 바로 작성 가능
		String comment = "이것은 변수에 저장된 문자열입니다.";
		System.out.println("이것은 리터럴 상수 문자열입니다.");
		System.out.println(comment);
		
		// System.out.println(변수 혹은 상수);
		// 변수 혹은 상수 자리에 어떤 데이터 타입이 와도 됨
		float float1 = 1.111111111111F;
		System.out.println(float1);
		
		// 입력
		// Scanner scanner = new Scanner(System.in); (참조형 데이터 타입, 메모리 주소가 들어가 있음)
		Scanner scanner = new Scanner(System.in);
		// Scanner 객체의 .next**(); 기능(메서드)을 사용해서 입력을 받을 수 있음
		// new는 생성
//		int intputInteger = scanner.nextInt();
//		System.out.print("입력 받은 값: ");
//		System.out.println(intputInteger);
		
		String inputString = scanner.nextLine();
		System.out.print("입력한 문자열: ");
		System.out.println(inputString);
		
		
		
	}

}
