public class ArrayJoke<counter> {

    public static void main(String[] args){
        int array []= {2, 4, 6, 8, 10};
            System.out.printf("%s%10s%n ", "index", "values");
        for(int counter=0; counter< array.length; counter++)
      System.out.printf("%d%10d%n", counter, array[counter]);
    }
}
