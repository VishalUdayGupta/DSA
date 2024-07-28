// "static void main" must be defined in a public class.

// ROTATE AN ARRAY BY K TIMES


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        k=k%n;
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
       for (int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
       
    }
    
    public static void reverse(int[] arr,int sp,int ep)
    {
        int s=sp,e=ep;
        while(s<e)
        {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
         
    }
}