package chapter2.C_For;

import java.nio.file.spi.FileSystemProvider;

// for 반복문
// 규칙이 있는 작업을 반복하는 제어문
// 일반적으로 반복 횟수가 정해져 있을 때 사용하는 반복문

public class For {

	public static void main(String[] args) {
		// 반복문을 사용하는 이유
		// 길이가 5인 int 타입의 배열(intArray5)을 선언 및 생성
		int[] intArray5 = new int[5];
		// intArray5의 각 인덱스에 1~5까지 값을 초기화
		intArray5[0] = 1;
		intArray5[1] = 2;
		intArray5[2] = 3;
		intArray5[3] = 4;
		intArray5[4] = 5;
		// for 반복문
		// 특정한 변수가 증감하며 조건에 부합하는 동안 반복하는 반복문
		// 사용방법:
		// for (변수 선언 또는 초기화; 조건; 증감식) { 실행할 코드}
		
		// 변수 선언 또는 초기화: 반복문을 위해 사용할 변수를 선언 또는 초기화
		// 조건: 반복을 계속하기 위한 조건, true이면 반복, false면 탈출
		// 실행할 코드: 조건이 true일 때 실행할 코드
	
		System.out.println("===== 일반 for문 =====");
		for(int index = 0; index < intArray5.length; index++) {
			// 실행할 코드
			intArray5[index] = index + 1;
			System.out.println(intArray5[index]);
		}
		
		
		// for 문의 경우 코드 블럭에 오는 실행할 코드가 한 구문이면 
		// {} 를 제거할 수 있음
		// 실행을 for문으로 한번 더 씀.

		for(int index = 0; index < intArray5.length; index++) 
			intArray5[index] = index + 1;

		for(int index = 0; index < intArray5.length; index++)
			System.out.println(intArray5[index]);
		
		
		// foreach 반복문
		// 배열의 요소 값을 직접 사용하고자 할 때 배열을 반복하면서
		// 요소를 하나씩 복사해서 사용할 수 있음(반복해서 변경시켜주지는 못함)
		// 사용 방법: for (배열요소의 데이터타입 변수명: 배열) { 실행할 코드 }
		for(int number: intArray5) System.out.println(number);
		
		System.out.println("===== foreach문 =====");
		for (int index = 0; index < intArray5.length; index++)
			intArray5[index] = index + 1;
		
		for(int number : intArray5) {
			System.out.println(number);
			number = 10; //(이줄을 써도 변경되지 않음 복사해왔기 때문 
						 //	number가 임시적인것 index가 변경된게 아니기 때문에 
			             // number변경해도 소용없음)
		}
		
		for (int number: intArray5) System.out.println(number);
		
		
		
	}

}
