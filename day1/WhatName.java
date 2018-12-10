package day1;

import java.util.Scanner;

public class WhatName {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름이 뭐에요?");
		String name = scan.next();
		System.out.println("어디 사세요?");
		String add = scan.next();
		System.out.println(name+add);
	}

}
