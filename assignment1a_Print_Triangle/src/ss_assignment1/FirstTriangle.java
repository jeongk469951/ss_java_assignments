package ss_assignment1;

public class FirstTriangle extends Triangle{

    private int depth;

    public FirstTriangle(int depth) {
        this.depth = depth;
    }

    public void display(int number, int dots){

        System.out.println(number+ ")");

        for(int i=1 ; i <= depth; i++){

            for(int j=1; j <= i; j++){

                System.out.print('*');

            }
            System.out.print("\n");
        }
        for(int dot=0; dot < dots; dot++) System.out.print(".");
        System.out.println("\n");
    }
}
