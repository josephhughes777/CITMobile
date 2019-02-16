/*troduction - Individual Assignment
Create a program that will prompt the user for and get at least two inputs
values from the console, save the values in variables, and the use the
variables in one or more equations. Print the results of your calculations.
For example you might calculate the area of a circle, the monthly payment
on a loan, the miles traveled per gallon on a trip. You can find equations
for most common calculations by searching on the Internet.
Instructions:
1. Start by opening a new file in your text editor.
2. Use the sample program that you did earlier as a template for your new
program. Create the source file for your new program. Be sure to save
the source file with the same name as the name of class and add
the .java file extension.
3. Change the statements in the main() function to accomplish your task
and then save your changes. Your main function should follow an
outline similar to this:
a. Prompt the user to enter an input value
b. Get the input from the console and save value in a variable
c. Prompt the user to enter the next input value
d. Get the input from the console and save value in a different variable.
e. Calculate the results using one or more equations
f. Print the results to the console.
4. Compile your program and fix any syntax errors.
5. Run and test your program.*/
import java.lang.Math; // headers MUST be above the first class



import java.util.Scanner;
public class areaRectangle {
	public static void main(String args[]){
		// length * width = area of reader
		int length = 0;
		int width = 0;
		int area = 0;
       Scanner in = new Scanner(System.in);
		System.out.println( "What is the length of your rectangle ");
     length = in.nextInt();
        System.out.println("What is the width of your rectangle ");
      width = in.nextInt();
      area = length * width;


     System.out.println("The area of the square is "+area);

    }
  
}
