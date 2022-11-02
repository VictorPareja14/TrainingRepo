package BuildTower;

import java.util.Arrays;

public class highLow {
    public static void main (String[] args){
        System.out.println(highAndLow("-1 -2 0"));
    }

    public static String highAndLow(String numbers) {

        String [] stringNumberArray = numbers.split(" ");
        int[] values = Arrays.stream(stringNumberArray)
                .mapToInt(Integer::parseInt)
                .toArray();
        int min = Arrays.stream(values).min().getAsInt();
        int max = Arrays.stream(values).max().getAsInt();


        return String.valueOf(max).concat(" "+String.valueOf(min));
    }

}
