package com.mycompany.study.ch03;

public class ExLogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//논리 연산자
		// && = & and : 논리곱 : 연산 참 참 참, 나머지 폴스
		// || = | : or : 논리합 : 연산 참 폴스 참, 촐스 참 참, 참 참 참, 폴스 폴스 폴스  | = 파이프라고 함
		// ^ : 베타적 논리합 : 연산 참 참 폴스, 폴스 폴스 폴스, 참 폴스 참, 폴스 참 참
		
		int a = 65;
		
		if(a >= 65 && a<= 70) {
			System.out.println("&& : True");	//출력
		}
		
		if(a >= 65 & a<= 70) {
			System.out.println("& : True");		//출력
		}
		
		if(a > 65 && a<= 70) {
			System.out.println("&& : True");	//출력되지 않음
		}
		
		if(a > 65 || a<= 70) {
			System.out.println("|| : True");	//출력
		}
		
		if(a > 65 ^ a <= 70) {
			System.out.println("^1 : True");	//출력
		}
		
		if(a >= 65 ^ a <= 70) {
			System.out.println("^2 : True");	//출력되지 않음
		}
	}

}
