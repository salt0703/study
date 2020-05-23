package com.example.study;

import java.util.Random;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudyApplication.class, args);
//		Random r = new Random();
//		System.out.println(r.nextInt(10));
//		System.out.println("あなたの名前を入力してください。");
//		Scanner name = new Scanner(System.in);
//		String name = new Scanner(System.in).nextLine();
//		
//		System.out.println("あなたの年齢を入力してください。");
//		int age = new Scanner(System.in).nextInt();
//		
//		//System.out.println(name.nextLine() + "さん。");
//		
//		System.out.println("ようこそ、" + age + "歳の" + name + "さん。" );
		
		boolean tenki = true;
		if (tenki!=false) {
			System.out.println("洗濯をします。");
			System.out.println("散歩に行きます。");
		} else {
			System.out.println("DVDを見ます");
		}
	}

}
