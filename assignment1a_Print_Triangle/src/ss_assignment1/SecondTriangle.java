package ss_assignment1;

public class SecondTriangle extends Triangle {

    private int depth;

    public SecondTriangle(int depth) {
        this.depth = depth;
    }

    public void display(int number, int dots){

        System.out.println(number + ")");

        for(int dot=0; dot < dots; dot++) System.out.print(".");
        System.out.print("\n");

        for(int i=depth ; i >= 1; i--){

            for(int j = 1; j <= i; j++){

                System.out.print('*');

            }
            System.out.print("\n");
        }

        System.out.print("\n");


    }

}
