package max_number;
/**
 * Jeong Kim
 */
public class ProblemTwo_FindLargestNum {
    /**
     *
     * construct 2d array of integers and pass values to findmax
     */
    public static void main(String[] args) {

        int[][] test_values = {{1, 2, 3, 4},
                {6, 7, 8, 9},
                {89, 56, 34},
                {24, 5423, 666}
        };

        int[] result = findMax(test_values);

        System.out.println("Max number is " + result[2] + " at Row " + result[0] + " Column " + result[1]);

    }
    /**
     *
     * @param values 2d array of integers
     * @return array containing coordinates and max values
     */
    public static int[] findMax(int[][] values) {

        int[] max_location = {0,0,0};
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < values.length; i++){
            for(int j = 0; j <values[i].length; j++){

                if(values[i][j] > max){
                    max = values[i][j];
                    max_location[0] = i + 1;
                    max_location[1] = j + 1;
                }
            }
        }
        max_location[2] = max;

        return max_location;
    }
}
