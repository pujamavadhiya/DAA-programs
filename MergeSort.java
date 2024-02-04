import java.util.Scanner;
public class MergeSort {
    static int div=0;
    static int conq=0;
    public static void conquer(int arr[], int si, int mid, int ei ){
        int merged[] = new int[ei-si+1];
        int idx1 = si;
        int idx2 = mid+1;
        int x = 0;
        while (idx1 <= mid && idx2 <= ei){
            if(arr[idx1] <= arr[idx2]){
                merged[x++] = arr[idx1++];
            }else{
                merged[x++] = arr[idx2++];
            }
        }
        while (idx1 <= mid){
            merged[x++] = arr[idx1++];
        }
        while (idx2 <= ei){
            merged[x++] = arr[idx2++];
        }
        for (int i=0, j=si; i<merged.length; i++,j++){
            arr[j] = merged[i];
        }
    }
    public static void divide(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        int mid = si+(ei - si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        div++;
        conquer(arr, si, mid, ei);
        conq++;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array");
        int arr[]=new int[sc.nextInt()];
        System.out.println("Enter the elements ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int n = arr.length;
        divide(arr, 0 , n-1);
        System.out.println("after sorting");
        for (int i=0; i<n ;i++){
            System.out.println(arr[i]+"");

        }
        System.out.println("No of divisions:" +div);
        System.out.println("No. of 	Conquering:" +conq);
        System.out.println();
    }
}
