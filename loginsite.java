import java.util.Scanner;

public class loginsite
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String usermonth; int day;
        System.out.print("Enter Name:");
        String name = in.nextLine();
        System.out.print("Enter Year Of Birth:");
        int yob = in.nextInt();
        if(yob>1 && yob<2023)
        {
            int year = 2022-yob;
        if(year<=17)
        {
            System.out.println("Your Not Eligible to access website");
        }
        else if(year==18)
        {
            System.out.print("Enter birth Month:");
            usermonth = in.next();
            if(usermonth.equals("july"))
            {
                System.out.print("Enter birth day:");
                day = in.nextInt();
                if(day<27)
                {
                    System.out.println("Your Not Eligible to access website");
                }
                else if(day<1 || day >31)
                {
                    System.out.println("Enter proper date");
                }
                else if(day>=27)
                {
                    System.out.println("Proceed");
                    System.out.println("-----------------------------------");
                    System.out.println(name);
                    System.out.println("-----------------------------------");
                    System.out.println(usermonth);
                    System.out.println("-----------------------------------");
                    System.out.println(day);
                    System.out.println("-----------------------------------");
                }
                else 
                {
                    System.out.println("Enter proper date");
                }
            }
            else if(usermonth.equals("august") || usermonth.equals("september") || usermonth.equals("october") || usermonth.equals("november") || usermonth.equals("december"))
            {
                System.out.println("Your Not Eligible to access website");
            }
            else if(usermonth.equals("january") || usermonth.equals("february") || usermonth.equals("march") || usermonth.equals("april") || usermonth.equals("may") || usermonth.equals("june"))
            {
                System.out.print("Enter date of birth:");
                day = in.nextInt();
                if(day<1 || day >31)
                {
                    System.out.println("Enter proper date");
                }
                else
                {
                    System.out.println("Proceed");
                    System.out.println("-----------------------------------");
                    System.out.println(name);
                    System.out.println("-----------------------------------");
                    System.out.println(usermonth);
                    System.out.println("-----------------------------------");
                    System.out.println(day);
                    System.out.println("-----------------------------------");
                }
            }
            else 
            {
                System.out.println("Enter proper birth month");
            }
        }
        else if(year>18)
        {
            System.out.print("Enter birth Month:");
            usermonth = in.next();
            if(usermonth.equals("january") || usermonth.equals("february") || usermonth.equals("march") || usermonth.equals("april") || usermonth.equals("may") || usermonth.equals("june") || (usermonth.equals("july")) || usermonth.equals("august") || usermonth.equals("september") || usermonth.equals("october") || usermonth.equals("november") || usermonth.equals("december"))
            {
                System.out.print("Enter date of birth:");
                day = in.nextInt();
                if(day<1 || day >31)
                {
                    System.out.println("Enter proper date");
                }
                else 
                {
                    System.out.println("-----------------------------------");
                    System.out.println(name);
                    System.out.println("-----------------------------------");
                    System.out.println(usermonth);
                    System.out.println("-----------------------------------");
                    System.out.println(day);
                    System.out.println("-----------------------------------");
                }
            }
            else 
            {
                System.out.println("Enter right month");
            }
        }
        else 
        {
            System.out.println("Error");
        }
        }
        else if(yob<0 && yob>2023)
        {
            System.out.println("Enter Proper birth year");
        }
         else
        {
            System.out.println("Enter Proper birth year");
        }
    }
}