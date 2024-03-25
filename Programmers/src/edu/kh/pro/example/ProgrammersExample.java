package edu.kh.pro.example;

import java.util.Scanner;

public class ProgrammersExample {

	
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        int start = sc.nextInt();
	        int before = sc.nextInt();
	        int after = sc.nextInt();

	        int money = start;
	        int month = 1;
	        while (money < 70) {
	            money += start;
	            month++;
	        }
	        while (before< 100) {
	            
	            month++;
	        }

	        System.out.println(month);
		
	}
	
	public static String solution(String myString) {
        String answer = "aBcDeFg";
        
        if(answer.toUpperCase().equals(answer)) {
        	
        }
        return answer;
    }


}
