import java.util.*;

class vowelSolution
{
    public static int isAlpha(char ch) 
    {
        char c = Character.toLowerCase(ch);
        switch(c)
        {
            case 'a':
                return 1;
            case 'b':
                return 2;
            case 'c':
                return 2;
            case 'd':
                return 2;
            case 'e':
                return 1;
            case 'f':
                return 2;
            case 'g':
                return 2;
            case 'h':
                return 2;
            case 'i':
                return 1;
            case 'j':
                return 2;
            case 'k':
                return 2;
            case 'l':
                return 2;
            case 'm':
                return 2;
            case 'n':
                return 2;
            case 'o':
                return 1;
            case 'p':
                return 2;
            case 'q':
                return 2;
            case 'r':
                return 2;
            case 's':
                return 2;
            case 't':
                return 2;
            case 'u':
                return 1;
            case 'v':
                return 2;
            case 'w':
                return 2;
            case 'x':
                return 2;
            case 'y':
                return 2;
            case 'z':
                return 2;
            default:
                return 0;
        }   
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch[] = str.toCharArray();
        int vowel = 0, consonant = 0;
        for(char c : ch)
        {
            int d = isAlpha(c);
            if(d == 1)
            {
                vowel++;
            }
            else if(d == 2)
            {
                consonant++;
            }
        }
        System.out.println("Number of Vowels: "+vowel);
        System.out.println("Number of Consonants: "+consonant);
        sc.close();        
    }
}