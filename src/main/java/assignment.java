/*public class assignment
{
    public static void main(String[] args)
    {
        System.out.println("Hello, World!");
    }
}*/

/*
import java.util.Scanner;

public class assignment
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        System.out.println("안녕하세요, " + name + "님!");

        scanner.close();
    }
}*/
/*
import java.util.Scanner;

public class assignment
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        if (num >0)
        {
            System.out.println("양수");
        }
        else if(num<0)
        {
            System.out.println("음수");
        }
        else
        {
            System.out.println("0");
        }

        scanner.close();
    }
}*/
/*
import java.util.Scanner;

public class assignment
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();

        switch(number)
        {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("No");
        }
        sc.close();
    }
}*/
/*
public class assignment
{
    public static void main(String[] args)
    {
        int i = 1;

        while (i <= 5)
        {
            System.out.println(i);
            i++;
        }
    }
}*/
/*
public class assignment
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 5; i++)
        {
            System.out.println(i);
        }

    }
}*/

public class assignment
{
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        for (int num : numbers)
        {
            System.out.println(num);
        }
    }
}

