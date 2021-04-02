package CoreJavaOperatorssAndNumbers;

public class CoreJavaOperators {
    public static void main(String[] args) {
//        Write the following integers in binary notation. Do not use any Java functions or
//        online conversion applications to calculate the answer as this will hinder the learning process and your understanding of the concept. However, you may check your answers using Java methods.
//        1 = 1;
//        8 = 1000;
//        33 = 100001;
//        78 = 1001110;
//        787 = 11000010011;
//        33,987 = 1000010011000011;
//
//
//        Convert the following binary numbers to decimal notation. Do not use any Java functions or online conversion applications to calculate the answer as this will hinder the learning process and your understanding of the concept. However, you may check your answers using Java methods.
//        0010 = 2;
//        1001 = 9;
//        0011 0100 = 52;
//        0111 0010 = 114;
//        0010 0001 1111 = 543;
//        0010 1100 0110 0111 = 11367;
//
//
//        Write a program that declares an integer a variable x and assigns the value 2 to it
//        and prints out the binary string version of the number ( Integer.toBinaryString(x) ).
//        Now, use the left shift operator (<<) to shift by 1 and assign the result to x.
//        Before printing the results, write a comment with the predicted decimal value and binary string.
//        Now, print out x in decimal form and in binary notation.
//        Do the preceding exercise with the following values:
//
//        9
//        17
//        88
          int x = 2;
          System.out.println(Integer.toBinaryString(x));
          x = x << 1;
          System.out.println(Integer.toBinaryString(x));

          int y = 9;
          System.out.println(Integer.toBinaryString(y));
          y = y << 1;
          System.out.println(Integer.toBinaryString(y));

          int z = 17;
          System.out.println(Integer.toBinaryString(z));
          z = z << 1;
          System.out.println(Integer.toBinaryString(z));

          int a = 88;
          System.out.println(Integer.toBinaryString(a));
          a = a << 1;
          System.out.println(Integer.toBinaryString(a));

//        Write a program that declares a variable x and assigns 150 to it and prints out
//        the binary string version of the number. Now use the right shift operator (>>)
//        to shift by 2 and assign the result to x. Write a comment indicating what you anticipate
//        the decimal and binary values to be. Now print the value of x and the binary string.
//        Do the preceding exercise with the following values:
//
//        225
//        1555
//        32456

          int b = 150;
          System.out.println(Integer.toBinaryString(b));
          b = b >> 2;
          System.out.println(Integer.toBinaryString(b));

          int c = 225;
          System.out.println(Integer.toBinaryString(c));
          c = c >> 2;
          System.out.println(Integer.toBinaryString(c));

          int d = 1555;
          System.out.println(Integer.toBinaryString(d));
          d = d >> 2;
          System.out.println(Integer.toBinaryString(d));

          int f = 32456;
          System.out.println(Integer.toBinaryString(f));
          f = f >> 2;
          System.out.println(Integer.toBinaryString(f));

//        Write a program that declares 3 int variables x, y, and z. Assign 7 to x and 17 to y.
//        Write a comment that indicates what you predict will be the result of the bitwise &
//        operation on x and y. Now use the bitwise & operator to derive the decimal and binary
//        values and assign the result to z.
//        Now, with the preceding values, use the bitwise | operator to calculate the “or” value
//        between x and y. As before, write a comment that indicates what you predict the values
//        to be before printing them out.

          int g = 7;
          int h = 17;
          int m = 7 & 17; // Prediction is 0111 & 0001 0001 = 0111 (Not sure if this is right) decimal: 7
          System.out.println(Integer.toBinaryString(m)); // Result is 1; Not sure if this is right either
          int n = 7 | 17; //Prediction is  0111 | 0001 0001 = 0001 0001 decimal: 17
          System.out.println(Integer.toBinaryString(n)); // Result is 10111

//        Write a program that declares an integer variable, assigns a number,
//        and uses a postfix increment operator to increase the value. Print the value
//        before and after the increment operator.
          int p = 5;
          System.out.println(p);
          p++;
          System.out.println(p);

//        Write a program that demonstrates at least 3 ways to increment a variable by 1
//        and does this multiple times. Assign a value to an integer variable, print it,
//        increment by 1, print it again, increment by 1, and then print again.
          int q = 5;
          System.out.println(q);
          q++;
          System.out.println(q);
          q = q + 1;
          System.out.println(q);
          q += 1;
          System.out.println(q);

//        Write a program that declares 2 integer variables, x, and y, and then assigns 5 to x and 8 to y.
//        Create another variable sum and assign the value of ++x added to y and print the result.
//        Notice the value of the sum (should be 14). Now change the increment operator to postfix
//        (x++) and re-run the program. Notice what the value of sum is. The first configuration
//        incremented x and then calculated the sum while the second configuration calculated the sum
//        and then incremented x.
          int r = 5;
          int s = 8;
          int sum = ++r + s;
          System.out.println(sum);
          int sum2 = r++ + s;
          System.out.println(sum2);

    }
}
