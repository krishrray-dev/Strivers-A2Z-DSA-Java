public class Patterns{
    public static void main (String[] args){
        rectangularStar(5);
        rightAngledStarsTriangle(5);
        rightAnglednumberPyramid(5);
        rightAngledRepeatedNumberedPyramid(5);
        invertedRightStarsPyramid(5);
        invertedRightNumberedPyramid(5);
        starPyramid(5);
        invertedStarPyramid(5);
        starDiamond(5);
        halfstarDiamond(5);
        binaryNumberRightTriangle(5);
        numberCrown(5);
    }
    public static void printSpaces(int n){
        for (int i = 0; i<n; i++){
            System.out.print(" ");
        }
    }
    public static void printStars(int n){
        for(int i = 0; i<n; i++){
            System.out.print("*");
        }

    }
    public static void printNumbers(int n){
        for (int i = 1; i<=n; i++){
            System.out.print(i);
        }
    }
    public static void printRepeatedNumbers(int numberToRepeat){
        for (int i = 1;i<=numberToRepeat;i++){
            System.out.print(numberToRepeat);
        }
    }
    public static void printZerosAndOnes(int size){
        int start = 0;
        if(size%2==0){
             start = 0;
        } else{
             start = 1;
        }
        for (int i = 1; i<=size; i++){
            System.out.print(start + " ");
            start=1-start;
        }
    }
    public static void printReversedNumbers(int size){
        for (int i = size; i>=1; i--){
            System.out.print(i);
        }
    }

    public static void rectangularStar(int size){
        for (int i = 0; i<size;i++){
            printStars(size);
            System.out.println();
        }
    }

    public static void rightAngledStarsTriangle(int size){
        for (int i = 1; i<=size;i++){
            printStars(i);
            System.out.println();
        }
    }

    public static void rightAnglednumberPyramid(int size){
        for (int i = 1; i<=size; i++){
            printNumbers(i);
            System.out.println();
        }
    }
    public static void rightAngledRepeatedNumberedPyramid(int size){
        for (int i = 1; i<=size; i++){
            printRepeatedNumbers(i);
            System.out.println();
        }
    }
    public static void invertedRightStarsPyramid(int size){
        for (int i = size; i>=1;i--){
            printStars(i);
            System.out.println();

        }
    }
    public static void invertedRightNumberedPyramid(int size){
        for (int i =size ; i>=1 ; i--){
            printNumbers(i);
            System.out.println();
        }
    }
    public static void starPyramid(int size){
        for (int i = 1; i<=size;i++){   
            printSpaces(size-i);
            printStars(2*i-1);
            System.out.println();
        }
    }
    public static void invertedStarPyramid(int size){
        for (int i = 1; i<=size;i++){
            printSpaces(i-1);
            printStars(1+2*(size-i));
            System.out.println();
        }
    }
    public static void starDiamond(int size){
        starPyramid(size);
        invertedStarPyramid(5);
    }
    public static void halfstarDiamond(int size){
        rightAngledStarsTriangle(size);
        invertedRightStarsPyramid(size-1);
    }
    public static void binaryNumberRightTriangle(int size){
        for (int i = 1; i<= size; i++){
            printZerosAndOnes(i);
            System.out.println();
        }
    }
    public static void numberCrown(int size){
        for (int i = 1; i<=size; i++){
            printNumbers(i);
            printSpaces(2*(size-i));
            printReversedNumbers(i);
            System.out.println();

        }
    }

    
}