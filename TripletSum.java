import java.util.*;

class TripletSum{

    public static int findTriplets(Integer[] arr, int n) {
        int count = 0;
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i = 0; i < n; i++)
        {
            //System.out.print(arr[i]+" : ");
            for(int j = i + 1; j < n; j++)
            {
                for(int k = j + 1; k < n; k++)
                {                
                        if(arr[i] == arr[j] + arr[k])
                        {
                            //System.out.print("("+arr[j]+","+arr[k]+"); ");
                            count++;
                        }
                }
            }
            //System.out.println("");
        }
        if(count == 0)
        {
            return -1;
        }
        else
        {
            return count;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tc = sc.nextLine();
        int t = Integer.parseInt(tc);
        Integer array[][] = new Integer[t][];
        int n[] = new int[t];
        int j = 0;
        while(j < t)
        {
            n[j] = sc.nextInt();
            int num = n[j];
            array[j] = new Integer[num];
            for(int i = 0; i < n[j]; i++)
            {
                array[j][i] = sc.nextInt();
            }
            j++;
        }
        j = 0;
        while(j < t)
        {
            int count = findTriplets(array[j], n[j]);
            System.out.println(count);
            j++;
        }
        sc.close();
    }
}