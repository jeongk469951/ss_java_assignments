package ss_assignment1;



public class Main {


    public static void main(String[] args) {

        int size = 4;
        int dots = 8;

        Triangle[] triangles = { new FirstTriangle(size),
                                 new SecondTriangle(size),
                                 new ThirdTriangle(size),
                                 new FourthTriangle(size)
                                };

        for(int i=1; i <= triangles.length; i++)
            triangles[i-1].display(i, dots + i);

    }
}