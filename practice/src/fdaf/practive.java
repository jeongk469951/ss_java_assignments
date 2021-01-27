package fdaf;

import java.util.HashMap;
import java.util.Map;


public class practive {

    public static void main(String[] args) {
        Person p1 = new Person(123, "John");

        Person p2 = new Person(123, "John");

        if(p1.equals(p2)){
            System.out.println("Same Person");
        }else{
            System.err.println("Different Person");
        }

        System.out.println("Person 1: Hashcode -> "+p1.hashCode());
        System.out.println("Person 2: Hashcode -> "+p2.hashCode());

        Map<Person, Integer> personMap = new HashMap<>();
        personMap.put(p1, 100);
        personMap.put(p2, 200);

        System.out.println("Size of my Map: "+personMap.size());
        System.out.println(personMap.get(p1));
        System.out.println(personMap.get(p2));

    }

}
