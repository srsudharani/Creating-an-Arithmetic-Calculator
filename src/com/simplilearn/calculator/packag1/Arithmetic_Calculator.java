package com.simplilearn.calculator.packag1;


	import java.util.Scanner;

	class Calculater{
		
		
		final  String display ="\n Select any No\n 1. Addidion\n 2. Subtraction\n 3. Multiply\n 4. Divid\n 5. Exit";   // this is final and static variable
		
		
	}

	public class Arithmetic_Calculator {
		
		static long addition,subtract,multiply,divide;  // static variable
		
		
		{
			System.out.println("Enter First Number ");
		}
		
		Scanner sc = new Scanner(System.in);
		int no1 = sc.nextInt(); 
		
		{
			System.out.println("Enter Second Number ");
		}
		int no2 = sc.nextInt(); 
		
		public static void main(String args[]) {
			
			System.out.println("Enter Number");
			System.out.println();
			
			Arithmetic_Calculator ac = new Arithmetic_Calculator();   // creating object
			
			ac.operation();  // calling method 
		}
		
		
		protected void operation() {
			
			while(true) {
				
				Calculater c = new Calculater();
				System.out.println(c.display);
				
			int operator =this.sc.nextInt();  // using this key word
			
			if(operator==1) {
				addition =no1 +no2;   // this keyword hide
				System.out.println(no1+" + "+no2+" = "+addition);
				System.out.println();
			}
			
			
			
			else if(operator==2){
				subtract =no1 -no2;   // this keyword hide
				System.out.println(no1+" - "+no2+" = "+subtract);
				System.out.println();
			}
			
			
			
			else if(operator==3){
				multiply =no1 *no2;   // this keyword hide
				System.out.println(no1+" * "+no2+" = "+multiply);
				System.out.println();
			}
			
			else if(operator==4){
				divide =no1 /no2;   // this keyword hide
				System.out.println(no1+" / "+no2+" = "+divide);
				System.out.println();
			}
			
			else {
				
				if(operator==5) {
				System.out.println(" Exit ");
				break;
				}
				
				else {
					System.out.println("Enter Valide Number");
				}
			}
			
		}  
		}
		
		
		
	}

