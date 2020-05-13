import java.util.*;

public class SortingAssignment {
    public static void main(String[] args) {
        ArrayList<Double> randNums = new ArrayList<Double>();
        
        for(int i=0;i<100;i++) {
            randNums.add(i, (Math.floor(Math.random()*100)));
        }
        Collections.sort(randNums);
        System.out.println(randNums);
        System.out.println();
        // Collections.reverse(randNums);
        Collections.sort(randNums, Collections.reverseOrder());
        System.out.println(randNums);
    }
}