package binsy;

import java.util.Scanner;
import java.util.Random;
public class binsy {

	public static void main(String[] args) {
		int TRUE=1, problem,AGAIN;
		Scanner in = new Scanner(System.in);
		
		while(TRUE==1)
		{
			System.out.println("What program do you want to execute?\n\n");
			System.out.println("1: Addition\n2: Substraction\n3: Multiplication\n4: Division\n5: Area of Triangle\n6: "
					+ "Display name and age\n7: Add random numbers\n8: Volume of Sphere\n9: Area of Circle\n10: Display 1-100 in reverse\n11: EXIT");
			
			problem = in.nextInt();
			
			
			
			if(problem ==1) 
			{
				problem1();
			}
			
			else if(problem ==2) 
			{
				problem2();
			}
			
			else if(problem ==3) 
			{
				problem3();
			}
			
			else if(problem ==4) 
			{
				problem4();
			}
			
			else if(problem ==5) 
			{
				problem5();
			}
			
			else if(problem ==6) 
			{
				problem6();
			}
			
			else if(problem ==7) 
			{
				problem7();
			}
			
			else if(problem ==8) 
			{
				problem8();
			}
			
			else if(problem ==9) 
			{
				problem9();
			}
			
			else if(problem ==10) 
			{
				problem10();
			}
			
			else if(problem == 11) 
			{
				TRUE = 0;
			}
		
			System.out.println("Try again? 1 for yes, 0 for no");
			
			AGAIN = in.nextInt();
			
			if(AGAIN==1)
			{
				TRUE =1;
			}
			else TRUE = 0;
			
		}
		
		
	}
	
	static void problem1()
	{
		Scanner in = new Scanner(System.in);
		
		int num1,num2,ans;
		System.out.println("Input first number: ");
		num1 = in.nextInt();
		
		System.out.println("Input second number: ");
		num2 = in.nextInt();
		
		ans = num1 + num2;
		
		System.out.println("The sum of "+num1 + " and " + num2 + " is "+ans );
		
		
	}
	
	static void problem2()
	{
		Scanner in = new Scanner(System.in);
		
		int num1,num2,ans;
		System.out.println("Input first number: ");
		num1 = in.nextInt();
		
		System.out.println("Input second number: ");
		num2 = in.nextInt();
		
		ans = num1 - num2;
		
		System.out.println("The difference of "+num1 + " and " + num2 + " is "+ans );
		
		
	}
	
	static void problem3()
	{
		Scanner in = new Scanner(System.in);
		
		int num1,num2,ans;
		System.out.println("Input first number: ");
		num1 = in.nextInt();
		
		System.out.println("Input second number: ");
		num2 = in.nextInt();
		
		ans = num1 * num2;
		
		System.out.println("The product of "+num1 + " and " + num2 + " is "+ans );
		
		
	}
	
	static void problem4()
	{
		Scanner in = new Scanner(System.in);
		
		int num1,num2,ans;
		System.out.println("Input first number: ");
		num1 = in.nextInt();
		
		System.out.println("Input second number: ");
		num2 = in.nextInt();
		
		ans = num1 / num2;
		
		System.out.println("The quotient of "+num1 + " and " + num2 + " is "+ans );
		
		
	}
	
	static void problem5()
	{
		Scanner in = new Scanner(System.in);
		
		int base,height,area;
		System.out.println("Input base of triangle: ");
		base = in.nextInt();
		
		System.out.println("Input height of triangle: ");
		height = in.nextInt();
		
		area = (base*height)/2;
		
		System.out.println("The area of triangle with base of "+base + " and height of " + height + " is "+area );
		
		
	}
	
	static void problem6()
	{
		Scanner in = new Scanner(System.in);
		
		int age;
		String name;
		System.out.println("Input your name: ");
		name = in.nextLine();
		
		System.out.println("Input your age: ");
		age = in.nextInt();
		
	
		System.out.println("Your name is "+name + " and your age is " + age);
		
	}
	
	static void problem7()
	{
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		
		int num1, num2, ans;
		
		num1 = rand.nextInt(100);
		num2 = rand.nextInt(100);
		
		ans = num1+num2;
		System.out.println("First random number is: " + num1);
		System.out.println("Second random number is: " + num2);
		
	
	
		System.out.println("The sum of "+num1 + " and " + num2 + " is: " +  ans);
		System.out.println();
	}
	
	static void problem8()
	{
		Scanner in = new Scanner(System.in);
	
		
		float rad,vol,rad_cube;
		
		
		
		System.out.println("The radius of sphere is: ");
		rad = in.nextFloat();
		
		rad_cube = rad*rad*rad;
		
		vol = 4/3*rad_cube*3.14f;
	
		System.out.println("The volume of sphere with radius of "+rad +" is " + vol);
	}
	
	static void problem9()
	{
		Scanner in = new Scanner(System.in);
	
		
		float rad,vol,rad_sq;
		
		
		
		System.out.println("The radius of circle is: ");
		rad = in.nextFloat();
		
		rad_sq = rad*rad;
		
		vol = rad_sq*3.14f;
	
		System.out.println("The area of circle with radius of "+rad +" is " + vol);
	}
	
	static void problem10()
	{
		Scanner in = new Scanner(System.in);
	
		int i;
		
		for(i=100;i>0;i--)
		{
			System.out.println(i);
		}
	}
	
	

}
