package Hackerrank;


//Starting with a 1-indexed array of zeros and a list of operations, for each operation add a value to each the array element between two given indices, inclusive.
//Once all operations have been performed, return the maximum value in the array.

public class ArrayManipulation {
    public int getSum(int[] array) {
        int sum = 0;
        for(int index =0; index < array.length; index++){
            sum += array[index];
        }
        return sum;
    }

    public int getMinimumValue(int[] array){
        int lowestNumber = array[0];

        for(int index = 0; index < array.length; index++){
            int nextNumber = array[index];
            if(nextNumber < lowestNumber){
                lowestNumber = nextNumber;
            }
        }
        return lowestNumber;
    }

    public int getMaximumValue(int[] array){
        int highestNumber = array[0];

        for(int index = 0; index < array.length; index++){
            int nextNumber = array[index];
            if(nextNumber > highestNumber) {
                highestNumber = nextNumber;
            }
        }
        return highestNumber;
    }

    public int getMaximumValue(){

        return  0;
    }

//    int[][] resultingArray;
//
//    public int manipulateArray(int[][] array){
//        int firstIndex = 0;
//        int lastIndex = 0;
//        for(int row=0; row<array.length; row++){
//            for(int column = 0; column<array[row].length; column++) {
//                firstIndex = array[row][column];
//                if (column + 2 == array.length - 1){
//                    lastIndex = array[row][column+1];
//                }
//            }
//        }
//
//    }


}
