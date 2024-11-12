import java.util.Scanner;
import java.util.Stack;

class main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        
        int[] nextGreater = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        
        for (int i = n - 1; i >= 0; i--) {
          
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            
          
            if (stack.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = stack.peek();
            }
            

            stack.push(arr[i]);
        }

    
        System.out.print("Next Greater Elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print(nextGreater[i] + " ");
        }
    }
}
