package com.kh.pratice;

import java.util.Scanner;

import com.kh.pratice.controller.CircleController;
import com.kh.pratice.controller.RectangleController;

public class Application {

	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();
	
	public static void main(String[] args) {
	
		Application a = new Application();
		a.mainMenu();
		
		
	}
	
		
		public void mainMenu() {
			
			boolean check = true;
			
			while(check) {
				
			System.out.println("==== 메뉴 ====");
			
			System.out.println("1. 원 ");
			
			System.out.println("2. 사각형 ");
			
			System.out.println("9. 끝내기  ");
			
			System.out.print("메뉴 번호 : ");
		
			switch(Integer.parseInt(sc.nextLine())){
				
				case 1 :
					this.circleMenu();//this 안써도 됨
					break;
				case 2 :
					this.rectangleMenu();
					break;
				case 9 :
					check = false;
					System.out.println("종료합니다.");
					break;
			
			}

			
			}
			
		}

		public void circleMenu() {
			
			boolean check = true;
			
			while(check) {
			System.out.println("==== 원 메뉴 ====");
			System.out.println("1. 원 둘레 ");
			System.out.println("2. 원 넓이 ");
			System.out.println("9. 메인으로 ");
			System.out.print("메뉴 번호 : ");
			
			switch(Integer.parseInt(sc.nextLine())){
			
			case 1 :
				this.calcCircum();//this 안써도 됨
				break;
			case 2 :
				this.calcCircleArea();
				break;
			case 9 :
				check = false;
				System.out.println("종료합니다.");
				break;
		
		}
			}
		}
		
		public void rectangleMenu() {
			System.out.println("==== 사각형 메뉴 ====");
			System.out.println("1. 사각형 둘레 ");
			System.out.println("2. 사각형 넓이 ");
			System.out.println("9. 메인으로 ");
			System.out.print("메뉴 번호 : ");
			
			boolean check = true;
			while(check) {
				switch(Integer.parseInt(sc.nextLine())){
				
				case 1 :
					this. calcPerimeter();//this 안써도 됨
					break;
				case 2 :
					this.calcRectArea();
					break;
				case 9 :
					check = false;
					System.out.println("종료합니다.");
					break;
			}
			}
		}
		
		public void calcCircum() {
			System.out.print("x 좌표 : ");
			int x = Integer.parseInt(sc.nextLine());
			
			System.out.print("y 좌표 : ");
			int y = Integer.parseInt(sc.nextLine());
			
			System.out.print("반지름 : ");
			int radius = Integer.parseInt(sc.nextLine());
			
			System.out.print(cc.calcArea(x, y, radius));
		}
		
		public void calcCircleArea() {
			System.out.print("x 좌표 : ");
			int x = Integer.parseInt(sc.nextLine());
			
			System.out.print("y 좌표 : ");
			int y = Integer.parseInt(sc.nextLine());
			
			System.out.print("반지름 : ");
			int radius = Integer.parseInt(sc.nextLine());
			
			System.out.print(cc.calcCircum(x, y, radius));
		}
		
		public void calcPerimeter() {
			System.out.print("x 좌표 : ");
			int x = Integer.parseInt(sc.nextLine());
			
			System.out.print("y 좌표 : ");
			int y = Integer.parseInt(sc.nextLine());
			
			System.out.print("높이 : ");
			int height = Integer.parseInt(sc.nextLine());
			
			System.out.print("너비 : ");
			int width = Integer.parseInt(sc.nextLine());
			
			System.out.print(rc.calcPerimeter(x, y, height, width));
		}
		
		public void calcRectArea() {
			System.out.print("x 좌표 : ");
			int x = Integer.parseInt(sc.nextLine());
			
			System.out.print("y 좌표 : ");
			int y = Integer.parseInt(sc.nextLine());
			
			System.out.print("높이 : ");
			int height = Integer.parseInt(sc.nextLine());
			
			System.out.print("너비 : ");
			int width = Integer.parseInt(sc.nextLine());
			
			System.out.print(rc.calcArea(x, y, height, width));
		}
	
}
