package com.kh.loop;

import java.util.Scanner;

public class D_While {
	
	Scanner sc = new Scanner(System.in);
	
	/*
	 * while문
	 * 
	 * [표현법]
	 * 
	 * 
	 * while(조건식) {
	 *      .. 실행 코드..
	 * }
	 * 
	 * */
	public void method1() {
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
		System.out.println();
		
		int i =1;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
	}
	
	/*
	 * break문
	 * -switch, 반복문의 실행을 중지하고 빠져나갈 때 사용
	 * - 반복문이 중첩되는 경우 break문이 포함되어 있는 반복문에서만 빠져나간다.
	 * 
	 * */
	//for문 무한루프
	public void method2() {
		
		for(int i=1; i<=5;) {
			System.out.println(i);
			i++;
		}
		
		
		for(int i=1; ;) {
			if(i<=5) {
			System.out.println(i);
		}else {
			break;
		}
		i++;
		}
		
		int i = 1;
		for(;;) {
			if(i<=5) {
				System.out.println(i);
			}else {
				break;
			}
			i++;
			}
	}
	//while문 무한루프
	public void method3() {
		int input = 0;
		while(true) {
			System.out.print("숫자 입력 > ");
			input = sc.nextInt();
			System.out.println(input);
		}
		
		
	}
	/*
	 * do-while문
	 * 
	 * [표현법]
	 * 
	 * do{
	 *    ...실행 코드 ...
	 * } while(조건식);
	 * 
	 * -조건과 상관없이 무조건 한 번은 실행
	 * */
	public void method4() {
		int number = 1;
		
		while(number == 0) {
			System.out.println("while문");
		}
		do {
			System.out.println("");
		} while(number == 0);
		
	}
	
	//반복문 + 조건문
	/*
	 * 
	 * 숫자 맞히기 게임!
	 * 1과 100 사이의 값을 입력해서 임의로 지정한(random) 값을 맞히면 게임 끝!
	 * 게임이 끝나면 몇 번만에 숫자를 맞혔는지 출력!
	 * (예 : 57)
	 * 1과 100사이의 값 입력 > 35
	 * 더 큰 수를 입력하세요.
	 * 1과 100사이의 값 입력 > 70
	 * 더 작은 수 를 입력하세요.
	 * 1과 100사이의 값 입력 > 57
	 * 3번 만에 맞췄습니다.
	 * 
	 * */
	public void method5() {

		
		int answer = (int)(Math.random()*100)+1;
		int input = 0;
		int count =0;
		
		while(true) {
			count++;
			System.out.println("1과 100사이의 값 입력 >");
			input = sc.nextInt();
			
			if(answer > input) {
				System.out.println("더 큰 수를 입력하세요. ");
			}else if (answer < input) {
				System.out.println("더 작은 수를 입력하세요.");
			}else {
				System.out.println(count + "번 만에 맞췄습니다.");
			}break;
		}
	}
	/*
	 * -----------------------------------
	 * 1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료
	 * ------------------------------------
	 * 선택 > 1
	 * 예금액 > 5000
	 * 
	 * -----------------------------------
	 * 1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료
	 * ------------------------------------
	 * 선택 > 2
	 * 출금액 > 2000
	 * 
	 * -----------------------------------
	 * 1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료
	 * ------------------------------------
	 * 선택 > 3
	 * 출금액 > 3000
	 * 
	 * 
	 * */
	public void method6() {
		
		int balance =0;
		boolean run = true;
		
		while(run) {
			System.out.println("-------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료 " );
			System.out.println("-------------------------");
			
			System.out.print("선택 > ");
			//Integer.parseInt : Integer 클래스의 paresInt 메소드
			// String -> int
			
			int menu = Integer.parseInt(sc.nextLine()); //문자열을 숫자로 둘다 사용 가능
			
			switch(menu) {
			case 1 :
				System.out.print("예금액 > ");
				balance += Integer.parseInt(sc.nextLine());
				break;
				
			case 2 :
				System.out.print("출금액 > ");
				balance -= Integer.parseInt(sc.nextLine());
				break;
				
			case 3 :
				System.out.print("잔고 > ");
				System.out.println(balance);
				break;
				
			case 4 :
				run = false;
			break;
			}	
		}
			System.out.print("프로그램 종료");
		}
	
			
		
		
//		System.out.println("-------------------------");
//		System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료 " );
//		int a = sc.nextInt();
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		System.out.println("-------------------------");
//		
//		switch(a) {
//		case 1 : System.out.println("예금액 > " + num1);
//		break;
//		
//		case 2 : System.out.println("출금액 > " + num2);
//		break;
//		
//		case 3 : System.out.println("잔고 > " + (num1-num2));
//		break;
//		
//		case 4 : System.out.println("종료");
//		
//		break;
//		
//	
//		}
	
	
		
	
	
	public static void main(String[] args) {
		D_While d = new D_While();
//		d.method1();
//		d.method2();
//		d.method3();
//		d.method4();
//		d.method5();
		d.method6();
		
		
}
}
