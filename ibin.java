import java.io.*;

public class ibin {

    public static void main(String[] args) throws IOException 
    {
        int number; 

        BufferedReader x =new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a positive integer");
        number = Integer.parseInt(x.readLine());

        if (number < 0) {
            System.out.println("negative nuber");
        } else { 

            System.out.print("binary :");
            printBinaryform(number);
        }
    }

    private static void printBinaryform(int number) 
    {
        int remainder;

        if (number <= 1) 
        {
            System.out.print(number);
            return; 
        }

        remainder = number %2; 
        printBinaryform(number >> 1);
        System.out.print(remainder);
    }
}