import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {

        ArrayList<Integer> Array = new ArrayList<Integer>();

        Array.add(4);
        Array.add(5);
        Array.add(3);
        Array.add(7);
        Array.add(2);

        Search(Array);

        Array.clear();
    }

    public static void Search(ArrayList<Integer> array){
        boolean containsSeven = array.contains(7);

        if (containsSeven){
            System.out.println("Boom!");
        } else {
            System.out.println("There is no 7 in the array :( ");
        }
    }
}