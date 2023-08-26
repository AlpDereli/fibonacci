import jdk.jshell.spi.ExecutionControl;

import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.println("Please enter the length of a fibonacci sequence: ");
        int len = take.nextInt();
        int first = 0;
        int second = 1;
        System.out.println("0");
        if (len >1)
        {
            System.out.println("1");
        }
        if (len >=2)
        {
            for(int i = 0;i<len-2;i++)
            {
                int con = first + second;
                first=second;
                second=con;
                System.out.println(con);
            }
        }
    }
}
