import java.util.*;
import java.lang.Integer;

class Inventory
{
    String id;
    int thres;
    Inventory(final String iId, final int ithres) 
    {
        id = iId;
        thres = ithres;
    }

    public String getId() 
    {
        return id;
    }

    public int getThreshold() 
    {
        return thres;
    }
}

class SolutionInventory 
{
    public static void status(final Inventory obj) 
    {
        if (obj.getThreshold() < 50) 
        {
            System.out.println(obj.getId() + " Non - Critical Filling");
        } else 
        {
            return;
        }
    }
    public static void main(final String[] args) 
    {
        final Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of inventories: ");
        final String s = sc.nextLine();
        final int n = Integer.parseInt(s);
        final Inventory inv[] = new Inventory[n];

        for (int i = 0; i < n; i++) 
        {
            final String id = sc.nextLine();
            final String dummy = sc.nextLine();
            final int thres = Integer.parseInt(dummy);
            inv[i] = new Inventory(id, thres);
        }

        for(int j = 0; j < n; j++)
        {
            status(inv[j]);
        }
        sc.close();
    }
}