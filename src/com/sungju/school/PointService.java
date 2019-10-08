package com.sungju.school;

import java.util.Scanner;

public class PointService {
	Scanner sc;
	public PointService() {
	sc = new Scanner(System.in);
	}
	
	
	
	public int inputNum() {
		
		System.out.println("번호를 입력하세요");
		int num = sc.nextInt();
		
		return num;
	}

}
