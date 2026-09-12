public class basicHashing {
    public static void main(String[] args){
        int[] arr = {1, 2, 1, 2, 1, 4};
        calculateFrequency(arr, 4);
        highestAndLowestFrequencyIn(arr, 4);
    }

    public static void calculateFrequency(int arr[], int max){
        int[] hash = new int[max+1];
        for(int i = 0; i < arr.length; i++){
            int number = arr[i];
            hash[number] = hash[number] + 1;
        }
        for (int i = 0; i < hash.length; i++){
            System.out.println("Count of " + i + " " + hash[i]);
        }
    }

    public static void highestAndLowestFrequencyIn(int arr[], int max){
        int[] hash = new int[max+1];
        for(int i = 0; i < arr.length; i++){
            int number = arr[i];
            hash[number] = hash[number] + 1;
        }

        int highestFreq = 0, highestNum = 1;
        int lowestFreq = Integer.MAX_VALUE, lowestNum = 1;

        for (int i = 1; i < hash.length; i++){
            if (hash[i] > highestFreq){
                highestFreq = hash[i];
                highestNum = i;
            }
            if (hash[i] < lowestFreq && hash[i]>0){
                lowestFreq = hash[i];
                lowestNum = i;
            }
        }

        System.out.println("Highest frequency is of: " + highestNum + " (count " + highestFreq + ")");
        System.out.println("Lowest frequency is of: " + lowestNum + " (count " + lowestFreq + ")");
    }
}