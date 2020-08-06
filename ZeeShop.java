import java.util.*;

class Item{
    String name;
    int price;
    int discount;
    float discountAmount;

    Item()
    {
        name = "";
        price = 0;
        discount = 0;
        discountAmount = 0;
    }

    Item(String n, int p, int d)
    {
        name = n;
        price = p; 
        discount = d;
        discountAmount = (price * discount) / 100;
    }
    public String getName()
    {
        return name;
    }
    public int getPrice()
    {
        return price;
    }
    public int getDiscount()
    {
        return discount;
    }
    public float getDiscountAmount()
    {
        return discountAmount;
    }
}

class ZeeShop{

    public static void findMinDiscount(Item[] items, int n)
    {
        float min = 9999999;
        Item minDiscount = new Item();
        for(int i = 0; i < n ; i++)
        {
            System.out.println(items[i].getDiscountAmount());
            if(min > items[i].getDiscountAmount())
            {
                min = items[i].getDiscountAmount();
                minDiscount = items[i];
            }
        }
        System.out.println(minDiscount.getName());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nOI = sc.nextLine();
        int n = Integer.parseInt(nOI);
        Item item[] = new Item[n];
        String array[] = new String[n];
        for(int i = 0; i < n; i++)
        {
            array[i] = sc.nextLine();
            String str[] = array[i].split(",");
            String name = str[0];
            int price  = Integer.parseInt(str[1]);
            int discount = Integer.parseInt(str[2]);
            item[i] = new Item(name, price, discount);
        }
        findMinDiscount(item, n);
        sc.close();
    }
}