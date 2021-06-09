package teacher.lesson_2_variables.lessoncode;

//import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// comment

/*
sdhffhdgkjdfhgkdfh  jshefkjhdkjg
dsfgdf
 dfgdfgd

 */
class AddTwoNumbers {

	static final String ABC = "abc";
	static final Long CAR_COUNT = 1L;

    public static void main(String[] args) {

    	int carCounttrue = 0;
    	carCounttrue = 1;
    	carCounttrue = 3;

    	long c =  carCounttrue + 4 + CAR_COUNT;

    	float dd = 0.66F;
    	double dd1 = 0.66;

    	double fff = 0.66F;


    	boolean isMan = true;

    	boolean isWoman = false;

    	//double void = 444D;

		int d;

		 d = 0;

		int ff = 9 + 3 + d;

		Integer ffInt = Integer.valueOf(2323);

		Long lll = Long.valueOf(111L);

		Float ffff = Float.valueOf(999F);

		Boolean bbb = Boolean.FALSE;
		Boolean bbb1 = Boolean.TRUE;

		Integer ss = 123;
		//Integer ss = new Integer(123);

		int yy = new Integer(243543);

		var text = "text text";

		//var emptyString = null;

		//String text = "text text";

		String text1 = "text text";
		String text3 = "text text";

		text.toLowerCase();
		text.toUpperCase();

		text = text1 + text3;

		char symbol = 't';


		// emptyString

		String emptyString;
		if (true) {
			emptyString = "";
			emptyString = emptyString + "111";
		}



		//String str = carCount;


        // 1. get first number from user
        Scanner myInput = new Scanner( System.in );
        //ru.Scanner myInput = new ru.Scanner( System.in );
        System.out.println("Enter first number: ");
        int firstNumber = myInput.nextInt();

        // 2. get second number from user
        System.out.println("Enter second number: ");
        int secondNumber = myInput.nextInt();

        // 3. first number + second number
        int result = firstNumber + secondNumber;

        // 4. print result to console
        System.out.println("Result = " + result);

		List<Integer> mm = new ArrayList<>();
		for (int i = 0; i < 1000000; i++) {
			mm.add(i);
		}

		int sum = 0;
		//Integer sum = 0;
		for (int i = 0; i < 1000000; i++) {
			sum = sum + mm.get(i);
		}

	}

}
