package javaprogram;

import java.util.*;

class Guess_the_number{
	
	int user_number;
	int random_number;
	private int number_of_guesses;
	
	
	 Guess_the_number(int random_number) {
		
		this.random_number = random_number;
	}
	 
	
	 void get_user_number(int user_number) {
		 this.user_number=user_number;
	}
	 

	int getNumber_of_guesses() {
		return number_of_guesses;
	}
	

	 void setNumber_of_guesses(int number_of_guesses) {
		this.number_of_guesses = number_of_guesses;
	}
	 
	 
	 boolean actual_number() {
		 number_of_guesses++;
		 
		 if(user_number==random_number) {
			 System.out.printf("The no. is (%d)"+"\n",random_number);
			 System.out.printf("You found the no. (%d) in (%d) guesses",user_number,number_of_guesses);
			 return false;
		 }
		 
		 
		 if(user_number>random_number) {
			 System.out.printf("(%d) is too high"+"\n",user_number);
			 return true;
			 
		 }else System.out.printf("(%d) is too low "+"\n",user_number);
			 return true;
		 }
		 
	 }

public class Game2 {
	

	public static void main(String[] args) {
		System.out.println("Guess no. limit is 100");
		boolean c=true;
		Random rn=new Random();
		int random_number=rn.nextInt(100);
		
		Guess_the_number n=new Guess_the_number(random_number);
		n.setNumber_of_guesses(0);
		
		Scanner sc=new Scanner(System.in);
		
	while(c) {
		System.out.println("-------------------------------------------------------");
		try {
		System.out.println("Enter the guess the no.");
		int user_number=sc.nextInt();
		
		n.get_user_number(user_number);
		c=n.actual_number();
		}catch(Exception e) {
			System.out.println(sc.next()+" is not a no. please enter a valid no.");
		}
	}
		
		
		
		
		
		
		
		
		
		

	}

}
