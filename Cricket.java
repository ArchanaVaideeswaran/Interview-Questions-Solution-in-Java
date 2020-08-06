import java.util.Scanner;

class Player
{
    int id;
    String name;
    int rank;
    int runs;
    int matches;

    Player(int i, String n, int r, int ru, int m)
    {
        id = i;
        name = n;
        rank = r;
        runs = ru;
        matches = m;
    }
    public int getRuns()
    {
        return runs;
    }
    public int getMatches()
    {
        return matches;
    }
}

class Cricket
{
    public static double[] findAvgRunRate(Player[] p, int t) {
        int j = 0;
        for(int i = 0; i < p.length; i++)
        {
            if(p[i].getMatches() > t)
            {
                j++;
            }
        }
        double[] r = new double[j];
        j = 0;
        for(int i = 0; i < p.length; i++)
        {
            if(p[i].getMatches() > t)
            {
                r[j] = (p[i].getRuns() * 1.00) / (p[i].getMatches() * 1.00);
                j++;
            }
        }
        return r;
    }
    public static void main(String[] args)
    {
        Player p[] = new Player[4];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < p.length; i++)
        {
            int id = sc.nextInt();
            sc.nextLine();
            String n = sc.nextLine();
            int r = sc.nextInt();
            int ru = sc.nextInt();
            int m = sc.nextInt();
            sc.nextLine();
            p[i] = new Player(id, n, r, ru, m);
        }
        int t = sc.nextInt();
        double[] avgRunRate = findAvgRunRate(p, t);
        for(int i = 0; i < avgRunRate.length; i++)
        {
            if(avgRunRate[i] >= 80.0)
            {
                System.out.println("Grade A Player");
            }
            else if(avgRunRate[i] >= 60.0 && avgRunRate[i] < 80.0)
            {
                System.out.println("Grade B Player");
            }
            else
            {
                System.out.println("Grade C Player");
            }
        }
        sc.close();
    }
}