package com.mycompany.study.ch03;

public class ExIncreaseDecreaseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			//증감 연산자 (++, --)
		
		int i = 0;
		int j = 0;
		
		++i;
		j++;
		
		System.out.println("i : " + i);
		System.out.println("j : " + j);
		// 연산자가 앞에 있으면 먼저 연산 / 뒤에있으면 다 연산하고 마지막 연산
		
		int a = 1;
		int b = 1;
		
		--a;
		b--;
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		int k = i++; // i를 k에 대입, i를 1증감
		int m = ++j; // j를 1증가, j를 m에 대입
		
		System.out.println("k : " + k);
		System.out.println("i : " + i);
		System.out.println("m : " + m);
		System.out.println("j : " + j);
		
		--i;
		
		int z = ++i + j++; //i가 여기서 먼저 증가되어 2가됨 그래서 z는 4가 됨
		System.out.println("z: " + z);
		System.out.println("i: " + i);
		System.out.println("j: " + j);
		
		
	}

}
