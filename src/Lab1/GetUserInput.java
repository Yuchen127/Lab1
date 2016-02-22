package Lab1;

import java.util.Scanner;
import java.lang.Math;
 // import the input and math method.

public class GetUserInput {

	public static void main(String[] args) {
		
		Scanner user_input = new Scanner(System.in);
		 // read single input from (system.in).
		
		int YearsToWork;
		int AnnualReturnInves;
		int YearsRetired;
		int AnnualReturnPayBack;
		float RequiredIncome;
		float MonthlySSI;
		float SaveEachMonth;
		float NeedSaved;
		 // define and set types for all variables.
		
		System.out.print("Enter your years to work:");
		 // print out the message to ask for input.
		YearsToWork = user_input.nextInt();
		 // assign input value to variable YearsToWork.
		System.out.println("");
		 // print out an empty line.

			do{
				System.out.print("Enter your investment annual return percentage in range 0-20:");
				AnnualReturnInves = user_input.nextInt();
				AnnualReturnInves = AnnualReturnInves;
			}while (AnnualReturnInves <0 || AnnualReturnInves > 20);
			 // set the variable AnnualReturnInves in range 0-20. If AnnualReturnInves is out of range,
			 // the program will continue asking for the right input value.
		System.out.println("");
		
		System.out.print("Enter your years retired:");
		YearsRetired = user_input.nextInt();
		System.out.println("");
		
			do{
				System.out.print("Enter your pay back annual return percentage in range 0-3:");
				AnnualReturnPayBack = user_input.nextInt();
				AnnualReturnPayBack = AnnualReturnPayBack;
			}while (AnnualReturnPayBack <0 || AnnualReturnPayBack > 3);
		System.out.println("");
		
		System.out.print("Enter your required income:");
		RequiredIncome = user_input.nextFloat();
		System.out.println("");
		
		System.out.print("Enter your monthly SSI:");
		MonthlySSI = user_input.nextFloat();
		System.out.println("");
		
		NeedSaved = (float) ((RequiredIncome-MonthlySSI)*((1-(1/(Math.pow(1+(AnnualReturnPayBack/100)/12,YearsRetired*12 )))))/((AnnualReturnPayBack/100)/12));
		 // equation to calculate the total you need to save.
		System.out.println("You need to save "+"$"+NeedSaved);
		
		SaveEachMonth = (float) (NeedSaved*(((AnnualReturnInves/100)/12)/((Math.pow(1+(AnnualReturnInves/100)/12, YearsToWork*12))-1)));
		 // equation to calculate SaveEachMonth.
		System.out.println("You should save "+"$"+SaveEachMonth+" each month");
		 // print out the variable SaveEachMonth.
		
		
	
		
		
	}

}
