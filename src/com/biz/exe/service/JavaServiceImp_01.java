package com.biz.exe.service;

public class JavaServiceImp_01 implements JavaService {

	//클래스 생성
	//proto type이라고도 한다
	//proto type을 만든다 = JavaService라는 이름으로 클래스 파일을 만든다
	//JavaService.java라는 파일을 만든다

	
	public void call() {
		System.out.println("Call 메서드 호출");
	}
	
	public void call(int num) {
		System.out.println("Call 메서드 호출");
		System.out.println("매개변수 num에 " + num + "를 받음");
	}
	
	public void call(int num1,int num2) {
		System.out.println("매개변수 2개를 받음");
		
	}

	/*
	 * "프로그램(프로젝트,어플리케이션)을 업그레이드 한다" 라는 개념은
	 *  1. 전혀 새로운 기능을 만들어서 누군가 사용하도록 하는 것
	 *  2. 기존에 이미 만들어있는 기능을 성능등을 개선해서 
	 *     기존에 이미 사용하던 사람에게 다시 제공하는것  
	 */
	
	
	
	
}
