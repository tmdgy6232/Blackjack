package com.biz.model;

import java.util.Random;
import java.util.Scanner;

public class blackVO {

	Random rnd = new Random();
	Scanner scan = new Scanner(System.in);
		
	private int user;
	private int com;
	private int score_u;
	private int score_c;
	private int total_u;
	private int total_c;
	
	public void input() {
		while(true) {
			System.out.println("user님의 차례입니다. 카드를 오픈하시겠습니까?");
			String str_u = scan.nextLine();
			if(str_u.equals("open")) {
				score_u = rnd.nextInt(13)+1;
				System.out.println(score_u+"를 뽑았습니다.");
				total_u += score_u;
			}

			if(str_u.equals("stop")) {
				System.out.println("user님의 총합은 :" + total_u+ "입니다.");
				System.out.println("차례를 넘깁니다.");
				while(true) {	System.out.println("com님의 차례입니다. 카드를 오픈하시겠습니까?");
				String str_c = scan.nextLine();
				if(str_c.equals("open")) {
					score_c = rnd.nextInt(13)+1;
					System.out.println(score_c+"를 뽑았습니다.");
					total_c += score_c;
				}

				if(str_c.equals("stop")) {
					System.out.println("user님의 총합은 :" + total_c+ "입니다.");
					System.out.println("차례를 넘깁니다.");
				break;
				}
					
				}
			
			}
			System.out.println("com님의 차례입니다. 카드를 오픈하시겠습니까?");
			String str_c = scan.nextLine();
			if(str_c.equals("open")) {
				score_c = rnd.nextInt(13)+1;
				System.out.println(score_c+"를 뽑았습니다.");
				total_c += score_c;
			}

			if(str_c.equals("stop")) {
				System.out.println("user님의 총합은 :" + total_c+ "입니다.");
				System.out.println("차례를 넘깁니다.");
			
			}
		}
	}
	public void better() {
		if(score_u > score_c) {
			System.out.println("user님의 승리입니다.");
		}if(score_u < score_c) {
			System.out.println("com님의 승리입니다.");
		}if(score_u == score_c) {
			System.out.println("무승부입니다.");
		}
		
		
	}
	
	
}
