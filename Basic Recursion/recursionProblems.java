public class recursionProblems {
    public static void main(String[] args) {
        // printNames(10);
        // printReverseNumbers(10);
        // printNumbers(1);
        //printSum(5,0);
        // printFactorial(5, 1);
        // printLinearNumbers(1, 10, 0);
        // int[] a = {1,2,3,4};
        // int b = a.length;
        // int c = 0;
        // printReverseArray(a, 0, a.length - 1);
        String word = "MADAM";
        System.out.println(ifPalindrome(word, 0, word.length()-1 ));
        System.out.print(0 + " ," + 1);
        printFibonacci(10, 0, 1, 1);
    }

    public static void printNames(int n){
        if(n==0)
            return;
        System.out.println("Krish");
        printNames(n-1);
    }
    public static void printReverseNumbers(int n){
        if(n==0)
            return;
        System.out.println(n);
        printReverseNumbers(n-1);
    }
    public static void printNumbers(int n){
        if (n==6)
            return;
        System.out.println(n);
        printNumbers(n+1);
    }
    public static void printSum(int n, int sum){
        if (n == 0){
            System.out.println(sum);
            return;
        }
        sum += n;
        printSum(n - 1, sum);
    }
    public static void printFactorial(int n, int fact){
        if(n==0){
            System.out.println(fact);
            return;
        }
        fact = fact*n;
        printFactorial(n-1, fact);

    }
    public static void printLinearNumbers(int i, int n, int sum){
        if (i==n){
            System.out.println(i);
            return;
        }
        System.out.println(i);
        printLinearNumbers(i+1, n, 0);
    }
    public static void printReverseArray(int[] a, int left, int right){
        if(left>=right ){
            for(int b: a){
                System.out.println(b);
            }
            return;
        }
        int temp = a[left];
        a[left]=a[right];
        a[right] = temp;
        printReverseArray(a, left+1, right-1);
    }
    public static boolean ifPalindrome(String word, int left, int right){
        if(left>=right){
            return true;
        }
        if(word.charAt(left)!=word.charAt(right)){
            return false;
        }
        return ifPalindrome(word, left+1, right-1);
            
    }
    public static void printFibonacci(int n, int first, int second, int i){
        if(i==n+1){
            return;
        }
        int nextTerm = first+second;
        System.out.print(", " + nextTerm);
        printFibonacci(n, second, nextTerm,i+1);
    }
}
