import java.util.*;
import java.lang.String;
class Stringpractice
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final String str = sc.nextLine();
        final char ch[] = str.toCharArray();
        final int len = str.length();
        for(int i = 0; i < len; i++)
        {
            if(ch[i] == ' ')
                System.out.print(ch[i - 1]);
            if(i + 1 == len)
                System.out.print(ch[i]);
        }
        sc.close();
    }
}