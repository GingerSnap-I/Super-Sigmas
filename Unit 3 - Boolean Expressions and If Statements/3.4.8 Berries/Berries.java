import java.util.Scanner;

public class Berries
{
    public static void main(String[] args)
    {
        System.out.println("Enter the initial of the berry: ");
        Scanner scan = new Scanner(System.in);
        char berry = scan.next().charAt(0);
        if(berry == 'E'){
            System.out.println("You ordered Elderberry");
        }else if(berry == 'L'){
            System.out.println("You ordered Lingonberry");
        }else if(berry == 'G'){
            System.out.println("You ordered Gooseberry");
        }else{
            System.out.println("Berry not recognized");
        }
    }
}
