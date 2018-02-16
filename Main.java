import java.util.Scanner;
public class Main {

    public static void main(String args[]) {


        Scanner scnr = new Scanner(System.in);
        int decimal = 0;   // each variable and character are intiailized
        int n = 0;
int Length = 0;
         int valueint = 0;
         String hexadecimal = null;
         char value;
         int Length1 = 0;

         System.out.print("Enter a hexadecimal number: " );
         hexadecimal = scnr.nextLine();

Length = hexadecimal.length();
        value = hexadecimal.charAt(1); // this will check for 0x at beginning of string
         valueint = (int) value;


if (valueint == 120) {n = n + 2;} // 120 is the value for ASCII character x

        while (n < Length) {
            value = hexadecimal.charAt(n); // gets the character and position from the string

            valueint = (int) value; // turns the character into a value
            Length1 = Length - n - 1; // inverts position so that hexadecimal will be read right to left
            if (valueint == 48){valueint = 0;} // assigns a number to the value
            if (valueint == 49){valueint = 1;}
            if (valueint == 50){valueint = 2;}
            if (valueint == 51){valueint = 3;}
            if (valueint == 52){valueint = 4;}
            if (valueint == 53){valueint = 5;}
            if (valueint == 54){valueint = 6;}
            if (valueint == 55){valueint = 7;}
            if (valueint == 56){valueint = 8;}
            if (valueint == 57){valueint = 9;}
            if (valueint == 65){valueint = 10;}
            if (valueint == 97){valueint = 10;}
            if (valueint == 66){valueint = 11;}
            if (valueint == 98){valueint = 11;}
            if (valueint == 67){valueint = 12;}
            if (valueint == 99){valueint = 12;}
            if (valueint == 68){valueint = 13;}
            if (valueint == 100){valueint = 13;}
            if (valueint == 69){valueint = 14;}
            if (valueint == 101){valueint = 14;}
            if (valueint == 70){valueint = 15;}
            if (valueint == 102){valueint = 15;}
            if (valueint == 120){valueint = 0;}




            decimal = decimal + valueint * (int) Math.pow (16,Length1); // calculates the decimal from the hex base
            n = n + 1; //cycles to the next position in the string

                 }
                 System.out.println("Your number is " + decimal + "in decimal");}




        }






