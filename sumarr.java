import java.util.Scanner;

class MaxSumSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int N = sc.nextInt();
        
       
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        
        int maxSum = 0;
        int maxElement = Integer.MIN_VALUE;
        boolean hasPositive = false;

       
        for (int i = 0; i < N; i++) {
            if (arr[i] > 0) {
                maxSum += arr[i];
                hasPositive = true;
            }
            maxElement = Math.max(maxElement, arr[i]);
        }
        
        
        if (!hasPositive) {
            maxSum = maxElement;
        }
        
        
        System.out.println(maxSum);
        
        sc.close();
    }
