package ss_assignment1;

public class ThirdTriangle extends Triangle {

    private int depth;

    public ThirdTriangle(int depth) {
        this.depth = depth;
    }

    public void display(int number, int dots){

        int counter = 1;
        int offset = dots%(depth+(depth-1))/2;

        System.out.println(number+")");

        for (int i =depth; i >= 1; i--){

            for(int j= 1; j < i+offset; j++){
                System.out.print(" ");

            }

            for(int z = 0; z < counter; z++) {
                System.out.print("*");

            }

            System.out.print("\n");

            counter+=2;

        }
        for(int dot = 0; dot < dots; dot++) System.out.print(".");
        System.out.println("\n");

    }
}
