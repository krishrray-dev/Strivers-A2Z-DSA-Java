public class basicMaths{
    public static void main(String[] args){
        System.out.println(countDigits(1234567891));
        System.out.println(reverseANumber((123456789)));
        System.out.println(ifPalindrome(404));
        System.out.println(gcd(9, 12));
        System.out.println(ifArmstrong(153));
        printDivisors(12);
        ifPrime(2);


    }
    public static int countDigits(int n){
        int rem = 1; int count = 0;
        while(n!=0){
            rem = n%10;
            count++;
            n=n/10;    
        }
        return (count);
    }
    public static int reverseANumber(int n){
        int rem = 1; int count = 0;
        int revDigit = 0;
        while(n!=0){
            rem = n%10;
            count++;
            revDigit = (revDigit*10)+rem;
            n=n/10;    
        }
        return(revDigit);
    }

    public static boolean ifPalindrome(int n){
        return n==reverseANumber(n);
    }
    public static int gcd(int n1, int n2){ 
        boolean a = n1<n2; int smaller;
        if(a){
            smaller = n1;
        }else{
            smaller =n2;
        } int i = 1; int gcd =-1;
        while(i<=smaller){
            if(n1%i==0 && n2%i==0){
                gcd = i;
            }
            i++;
        }
        return gcd;
    }
    public static boolean ifArmstrong(int n){
        int rem = 0; int check = 0; int power = countDigits(n); int copyN = n;
        while(n!=0){
            rem = n%10;
            check = check + (int) Math.pow(rem,power );
            n = n/10;
        }
        return (copyN == check);
    }
    public static void printDivisors(int n){
        int i = 1;
        while(i<=n){
            if(n%i==0){
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
    }
    public static boolean ifPrime(int n){
        int i = 2;
        while(i<n){
            if(n%i==0 && i!= n){
                return true;
            }
            i++;
        }
        return false;
    }
    
        

}
