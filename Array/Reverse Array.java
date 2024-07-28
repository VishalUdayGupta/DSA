// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        reverse(arr,n);
        
    }
    
    public static void reverse(int[] arr,int n)
    {
        int s=0,e=n-1;
        while(s<e)
        {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        for (int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}