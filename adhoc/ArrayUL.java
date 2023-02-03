// implements 2D arraylist
package adhoc;
import java.util.ArrayList;

public class ArrayUL {
    public static void main(String[] args) {
        
        ArrayList<ArrayList<Integer>> list  = new ArrayList<>(10);

        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(1);
            }
        }
        System.out.println(list);
    }
}

