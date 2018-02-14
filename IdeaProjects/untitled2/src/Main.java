import java.util.*;

//this is my comment for my git

public class Main {
    public static void main(String args[]) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a hexadecimal number:");
        String number = keyboard.nextLine();


        char location;
        int len = number.length();
        int exp = 0;
        int value;
        long sum = 0;




        if(number.substring(0,2).equals("0x")) {
            number = number.substring(2);
            len = number.length();
        }



        for (int i = len-1; i >= 0; i--) {
            char num = number.charAt(i);
           //int hex = Integer.parseInt(num);
            double base;


               switch (num)
               {
                   case 'A':
                       value = 10;
                       base = Math.pow(16.0, exp);
                       sum += value * base;
                       break;
                   case 'a':
                       value = 10;
                       base = Math.pow(16.0, exp);
                       sum += value * base;
                       break;
                   case 'B':
                       value = 11;
                       base = Math.pow(16.0, exp);
                       sum += value * base;
                       break;
                   case 'b':
                       value = 11;
                       base = Math.pow(16.0, exp);
                       sum += value * base;
                       break;
                   case 'C':
                       value = 12;
                       base = Math.pow(16.0, exp);
                       sum += value * base;
                       break;
                   case 'c':
                       value = 12;
                       base = Math.pow(16.0, exp);
                       sum += value * base;
                       break;
                   case 'D':
                       value = 13;
                       base = Math.pow(16.0, exp);
                       sum += value * base;
                       break;
                   case 'd':
                       value = 13;
                       base = Math.pow(16.0, exp);
                       sum += value * base;
                       break;
                   case 'E':
                       value = 14;
                       base = Math.pow(16.0, exp);
                       sum += value * base;
                       break;
                   case 'e':
                       value = 14;
                       base = Math.pow(16.0, exp);
                       sum += value * base;
                       break;
                   case 'F':
                       value = 15;
                       base = Math.pow(16.0, exp);
                       sum += value * base;
                       break;
                   case 'f':
                       value = 15;
                       base = Math.pow(16.0, exp);
                       sum += value * base;
                       break;
               }



               int hex = num - 48;

               switch (hex) {

                   case 0:
                       value = 0;
                       base = Math.pow(16.0, exp);
                       sum += value * base;
                       break;
                   case 1:
                       value = 1;
                       base = Math.pow(16.0, exp);
                       sum += value * base;
                       break;
                   case 2:
                       value = 2;
                       base = Math.pow(16.0, exp);
                       sum += value * base;
                       break;
                   case 3:
                       value = 3;
                       base = Math.pow(16.0, exp);
                       sum += value * base;
                       break;
                   case 4:
                       value = 4;
                       base = Math.pow(16.0, exp);
                       sum += value * base;
                       break;
                   case 5:
                       value = 5;
                       base = Math.pow(16.0, exp);
                       sum += value * base;
                       break;
                   case 6:
                       value = 6;
                       base = Math.pow(16.0, exp);
                       sum += value * base;
                       break;
                   case 7:
                       value = 7;
                       base = Math.pow(16.0, exp);
                       sum += value * base;
                       break;
                   case 8:
                       value = 8;
                       base = Math.pow(16.0, exp);
                       sum += value * base;
                       break;
                   case 9:
                       value = 9;
                       base = Math.pow(16.0, exp);
                       sum += value * base;
                       break;

               }

            exp++;


            }
        System.out.println("Your number is " + sum + " in decimal");





    }


}