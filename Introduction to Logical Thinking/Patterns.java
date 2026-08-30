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
        increasingNumberTriangle(5);
        increasingLetterTriangle(5); 
        System.out.println();
        reverseLetterTriangle(5);
        alphaRamp(5);
        lettersTriangle(5);
        alphaTriangle(5);
        symmetricVoid(10);
        symmetricButterfly(10); 
        hollowRectangle(4);
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
    public static void specialPrintNumbers(int n){
        for (int i = 1; i<=n; i++){
            System.out.print(1+(i*(i-1)/2));
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
    public static void printLetters(int size){
        for (int i = 0; i<size; i++ ){
            char character = (char) ('A' +i);
            System.out.print(character);
        }
    }
    public static void printRepeatedLetters(int size){
        char character = (char) ('A' + (size -1));
        for (int i = 1; i<=size; i++){
            System.out.print(character + " ");
        }
    }
    public static void printReversedCharacters(int size){
        char Character = (char) ('A' + size-1);
        for (char i = Character; i>='A';i--){
            System.out.print(i);

        }
    }
    public static void printReversedCharactersSpecial(int totalSize, int currentRow) {
    char startChar = (char) ('A' + totalSize - 1); 
    
    char endChar = (char) (startChar - (currentRow - 1));
    
        for (char c = startChar; c >= endChar; c--) {
            System.out.print(c + " ");
        }
    }
    public static void symmetricVoidHelper1(int size){
        for(int i =1;i<=size;i++){
            printStars(size-i+1);
            printSpaces(2*(i-1));
            printStars(size-i+1);
            System.out.println();
        }
    }
    public static void symmetricVoidHelper2(int size){
        for(int i =1;i<=size;i++){
            printStars(i);
            printSpaces(2*(size-i));
            printStars(i);
            System.out.println();
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
    public static void increasingNumberTriangle(int size){
        int num = 1;
        for (int i = 1; i<=size; i++){
            for(int j =1;j<=i;j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
            }
    }
    public static void increasingLetterTriangle(int size){
        for (int i = 1; i<=size; i++){
            printLetters(i);
            System.out.println();
    }
    }
    public static void reverseLetterTriangle(int size){
        for( int i = size; i>=1;i--){
            printLetters(i);
            System.out.println();
        }
    }
    public static void alphaRamp(int size){
        for (int i = 1; i<=size;i++){
            printRepeatedLetters(i);
            System.out.println();
        }
    }
    public static void lettersTriangle(int size){
        for(int i =1;i<=size;i++){
            printSpaces(size-i);
            printLetters(i);
            printReversedCharacters(i-1);
            System.out.println();
        }
    }
    public static void alphaTriangle(int size){
        for(int i = 1; i<=size;i++){
            printReversedCharactersSpecial(size, i);
            System.out.println();
        }
    }
    public static void symmetricVoid(int size){
        symmetricVoidHelper1(size/2);
        symmetricVoidHelper2(size/2);
    }
    public static void symmetricButterfly(int size){
        symmetricVoidHelper2(size/2);
        symmetricVoidHelper1(size/2);
    }

    public static void hollowRectangle(int size){
        for(int i =1;i<=size;i++){
            for(int j = 1; j<=size;j++){
                if(j==1||j==size||i==1||i==size){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        } 
    }
}



    
