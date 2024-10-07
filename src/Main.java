import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("Введите слово:");
        if (palindrom(sc.nextLine()))
            System.out.println("Это палиндром");
        else
            System.out.println("Это не палиндром");
        System.out.println("Введите число:");
        System.out.println("Развёрнутое число: " + reverse(sc.nextInt(), 0));
        System.out.println("Введите последовательность (по 1 числу в строке):");
        System.out.println(ones(sc.nextInt()));
    }

    private static boolean palindrom(String word)
    {
        if (word.length() == 1 || word.isEmpty())
            return true;
        if (word.charAt(0) == word.charAt(word.length()-1))
            return palindrom(word.substring(1, word.length() - 1));
        return false;
    }

    private static int reverse(int n, int r)
    {
        r = r*10 + n%10;
        if (n < 10)
            return r;

        return reverse(n/10, r);
    }

    private static int ones(int prev)
    {
        int cur = sc.nextInt();

        if (prev == 0 && cur == 0)
            return 0;

        if (cur == 1)
            return 1 + ones(cur);

        return ones(cur);
    }
}