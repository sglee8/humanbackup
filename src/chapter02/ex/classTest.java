package chapter02.ex;

import java.util.Scanner;

public class classTest {

	public static void main(String[] args) {
		
		
//		if(a>14) { 1 
//			
//		}else if(a<=12||a>22) {
//			
//		}else if(a>5&&a<=9) {
//			
//		}else {
//			
//		}
//		
//		
//			
//		if(a<=14) { 2
//			
//		}else if(a>12&&a<=22) {
//			
//		}else if(a<=5||a>9) {
//			
//		}else {
//			
//		}
//		
//		
//		 int a= sc.nextInt();
//		 if(a%3==0||a%7==0) {3
//			 System.out.println("3또는 7의배수");
//		 }else if(a%2==0&&a%5==0) {
//			 System.out.println("2와 5의배수");
//		 }else if((a%3==0||a%7==0)&&(a%2==0&&a%5==0)) {
//			 System.out.println("3또는 7의배수");
//			 System.out.println("2와 5의배수");
//		 }
//		Scanner sc = new Scanner(System.in);
//		System.out.println("x,y값을 입력하세요");
//		 int x= sc.nextInt();
//		 int y= sc.nextInt();
//		if(x<0 && y<0) {
//			System.out.println("1번 위치입니다");
//		
//		}else if(x>0 && y>0) {
//			System.out.println("2번 위치입니다");
//		}else if(x>0 && y<0) {
//			System.out.println("3번 위치입니다");
//		}else if(x<0 && y<0) {
//			System.out.println("4번 위치입니다");
//		}else{
//			System.out.println("x,y축 위에있습니다");
//		}
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요");
//		 int input= sc.nextInt();
//		 int a=5;
//		 int b=7;
//		if(input==0) {
//			a=a+2;
//		}else if(input==1) {	
//			b=b+4;
//		}else if(input==2) {
//			a=a+b;
//		}else {
//			b=b+5;
//		}
//		System.out.println("a는"+a+"b는"+b);
//		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요");
//		 int input= sc.nextInt();
//		 int a=5;
//		 int b=7;
//		switch(input) {
//		case 0:
//			a=a+2;
//		break;
//		
//		case 1:
//			b=b+4;
//			break;
//			
//		case 2:
//			a=a+b;
//			break;
//			
//		default:
//			b=b+5;
//		}		
//		System.out.println("a는"+a+"b는"+b);	
		
//		boolean breakfast =true;
//		
//		if(breakfast) {
//			System.out.println("밥을 먹었음");
//		}else {
//			
//		}
//		
//		if(breakfast) {
//			System.out.println("빵을 먹었음");
//		}else {
//			
//		}
//		
//		if(breakfast) {
//			System.out.println("밥을 먹었음");
//		}else {
//			System.out.println("빵을 먹었음");
//		}	
//		
//		if(breakfast) {
//			System.out.println("밥을 먹었음");
//		}else {
//			System.out.println("아무것도 안먹었음");
//		}
//		
//		int breakfast1=1;
//		switch(breakfast1) {
//		case 1:
//			System.out.println("밥을먹었음");
//			break;
//		case 2:
//			System.out.println("빵을먹었음");
//			break;
//		case 3:
//			System.out.println("국을먹었음");
//			break;
//		default :
//			System.out.println("우유를먹었음");
//		}
//		
//		if(true) {
//			System.out.println("밥");
//			if(true) {
//				System.out.println("국");
//			}else {
//				System.out.println("아이스크림");
//			}
//		}else {
//			System.out.println("빵");
//			if(true) {
//				System.out.println("우유");
//			}else {
//				System.out.println("커피");
//			}
//		}
//		
//		if(true) {
//			System.out.println("밥을 먹었음");
//			System.out.println("국을 먹었음");
//			
//		}else {
//			System.out.println("빵을 먹었음");
//			System.out.println("우유를 먹었음");
//		}
//		boolean sky= true;
//		if(sky) {
//			System.out.printf("%-6s %-6s %6s %6s" ,"-해","-해,구름","-구름","-달");
//		
//			
//		}else {
//			System.out.printf("%6s %-6s ","-달,별","별");
//			
//		}
		
//		int i=(new java.util.Date()).getDay();
//		switch(i) {
//		case 0:
//			System.out.println("일요일");
//			break;
//		case 1:
//			System.out.println("월요일");
//			break;
//		case 2:
//			System.out.println("화요일");
//			break;
//		case 3:
//			System.out.println("수요일");
//			break;
//		case 4:
//			System.out.println("목요일");
//			break;
//		case 5:
//			System.out.println("금요일");
//			break;
//		default :
//				System.out.println("토요일");
//		}
//		Scanner sc = new Scanner(System.in);
//		System.out.println("몇월인지 입력하세요");
//		int i= sc.nextInt();
//		
//		switch(i) {
//		case 1:
//			System.out.println("1월은 31일입니다");
//			break;
//		case 2:
//			System.out.println("2월은 29일입니다");
//			break;
//		case 3:
//			System.out.println("3월은 31일입니다");
//			break;
//		case 4:
//			System.out.println("4월은 30일입니다");
//			break;
//		case 5:
//			System.out.println("5월은 31일입니다");
//			break;
//		case 6:
//			System.out.println("6월은 30일입니다");
//			break;
//		case 7:
//			System.out.println("7월은 31일입니다");
//			break;
//		case 8:
//			System.out.println("8월은 31일입니다");
//			break;
//		case 9:
//			System.out.println("9월은 30일입니다");
//			break;
//		case 10:
//			System.out.println("10월은 31일입니다");
//			break;
//		case 11:
//			System.out.println("11월은 30일입니다");
//			break;
//		case 12:
//			System.out.println("12월은 31일입니다");
//			break;
//		default :
//				
//		}
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("한국사이즈를 입력하세요");
//		int i= sc.nextInt();
//		if(i>=90&&i<=95) {//숫자겹치는줄알았는데 알아서처리하네
//			System.out.println("미국사이즈는 s입니다");
//		}else if(i>=95&&i<=100) {
//			System.out.println("미국사이즈는 m입니다");
//		}else if(i>=100&&i<=105) {
//			System.out.println("미국사이즈는 l입니다");
//		}else if(i>=105&&i<=120) {
//			System.out.println("미국사이즈는 xl입니다");
//		}else if(i>=120) {
//			System.out.println("미국사이즈는 xxl입니다");
//		}else {
//			
//		}
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("java 점수를 입력하세요");
//		int j= sc.nextInt();
//		System.out.println("html 점수를 입력하세요");
//		int h= sc.nextInt();
//		System.out.println("db 점수를 입력하세요");
//		int d= sc.nextInt();
//		if(j<=40) {
//			System.out.println("java "+j+"점 과락");
//		}else if(h<=40){
//			System.out.println("html "+h+"점 과락");
//		}else if(d<=40) {
//			System.out.println("db "+d+"점 과락");
//		}else {
//			
//		}
//		int sum=0;
//		sum=(j+h+d)/3;		
//		if(sum>=60) {
//			System.out.println("합격");
//			
//		}else {
//			System.out.println("불합격");
//		} 
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("허리둘레를 입력하세요");
//		int i= sc.nextInt(); // next 다음에 대문자 안쓰면 에러
//		if(i>=28&&i<=29) {
//			System.out.println("한국사이즈는 90~95입니다");
//			System.out.println("미국사이즈는 S입니다");
//		}else if(i>=30&&i<=31) {
//			System.out.println("한국사이즈는 95~100입니다");
//			System.out.println("미국사이즈는 M입니다");
//		}else if(i>=32&&i<=34) {
//			System.out.println("한국사이즈는 100~105입니다");
//			System.out.println("미국사이즈는 L입니다");
//		}else if(i>=34&&i<=37) {
//			System.out.println("한국사이즈는 105~110입니다");
//			System.out.println("미국사이즈는 XL입니다");
//		}else if(i>=38&&i<=40) {
//			System.out.println("한국사이즈는 110이상입니다");
//			System.out.println("미국사이즈는 XXL입니다");
//		}else{
//			System.out.println("다시입력하세요");
		Scanner sc = new Scanner(System.in);
		System.out.println("허리둘레를 입력하세요");
		int i= sc.nextInt();
		int i=(int)(Math.random() * 3)+1;
		if(i==1) {
			System.out.println("가위");
		}else if(i==2) {
			System.out.println("바위");
		}else {
			System.out.println("보");
		}
	}
}
