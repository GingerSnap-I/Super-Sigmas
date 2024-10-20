import java.util.Scanner;

public class ThreeStrings
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        //System.out.print("Enter your password:");
        String userPass = scan.nextLine();
        //System.out.print("Enter the company's secret code: ");
        String userCode = scan.nextLine();
        String companyCode = "1298";
        String userTotal = userPass + userCode;
        boolean equal = userTotal.equals(userPass+companyCode);
        if (equal) {
            System.out.println("Access granted");
        } else {
            System.out.println(userTotal+" is denied");
        }
    }
}
