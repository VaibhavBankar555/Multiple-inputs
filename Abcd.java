import java.util.Scanner;

class Abcd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Select An Options : A)Palindrome  B)Prime  C)Addition  D)Vowels  E)Fibnocci ");
        String opt = sc.nextLine();
        if (opt.equals("A")) {
            Palindrome();
        } else if (opt.equals("B")) {
            Prime();


        } else if (opt.equals("C"))
        {
            Addition();
        } else if (opt.equals("D"))
        {
            Vowels();
        } else if (opt.equals("E"))
        {
            Fibnocci();
        }

    }

    public static void Palindrome() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String:");
        String pal = sc.nextLine();
        String a = "";
        for (int j = pal.length() - 1; j >= 0; j--) {
            a += pal.charAt(j);

        }
        if (a.equals(pal)) {
            System.out.println("Given string is palindrome");
        } else {
            System.out.println("Given string is not palindrome");
        }
    }

    public static void Prime()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int flag=0;
        for (int i=2;i<num;i++)
        {
            //System.out.println(i);
            int b=i;

            if (num%b==0)
            {
                flag=1;
                break;
            }else
            {
                flag=0;
            }


        }
        if (flag==1)
        {
            System.out.println("Not Prime Number");
        }else
        {
            System.out.println("Prime No");

        }
    }
    public static void Addition()
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the first number: ");
             int x = sc.nextInt();
            System.out.print("Enter the second number: ");
              int y = sc.nextInt();
              int sum =x+y;
            System.out.println("The sum of two numbers x and y is: " + sum);
        }
        public static void Vowels()
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the String Want to Find total no of Vowels :");
            String a = scanner.next();
            System.out.println(a);
            int count=0;

            for (int i=0;i<a.length();i++)

            {
                char b=a.charAt(i);
                if (b==('a')||b==('e')||b==('i')||b==('o')||b==('u'))
                {
                    count++;

                }

            }
            System.out.println(count);
        }
        public static void Fibnocci() {
            int n, a = 0, b = 0, c = 1;

            Scanner s = new Scanner(System.in);
            System.out.print("Enter value of n:");
            n = s.nextInt();
            System.out.print("Fibonacci Series:");
            for (int i = 1; i <= n; i++) {
                a = b;
                b = c;
                c = a + b;
                System.out.print(a + " ");
            }
        }
}




