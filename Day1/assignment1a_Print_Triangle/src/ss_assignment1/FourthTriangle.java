package ss_assignment1;

public class FourthTriangle extends Triangle {

    private int depth;

    public FourthTriangle(int depth) {
        this.depth = depth;
    }

    public void display(int number, int dots) {


        int offset = dots%(depth+(depth-1))/2;
        int counter = depth + (depth-1);

        System.out.println(number+")");

        for(int dot= 0; dot < dots; dot++) System.out.print(".");
        System.out.print("\n");

        for (int i = 0; i < depth; i++) {

            for(int j = 0; j < i + offset; j++){
                System.out.print(" ");
            }

            for(int z = 0; z < counter; z++){

                System.out.print("*");
            }

            System.out.print("\n");

            counter-=2;

        }
    }


}
