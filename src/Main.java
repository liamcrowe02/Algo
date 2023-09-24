import java.util.ArrayList;
import java.util.List;
import java.util.random.RandomGenerator;

public class Main {

    public static void main(String[] args) {
        int selectionSortArray[] = {64, 25, 12, 22, 11};

        selectionSort selectionObject = new selectionSort();
        heapSort heapObject = new heapSort();

        selectionObject.selectedSort(selectionSortArray);
        heapObject.heapSort(selectionSortArray);

        for (int i = 0; i < selectionSortArray.length; i++) {
           System.out.println(selectionSortArray[i]);
        }

        Algorithim obj = new Algorithim();

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        a.add(5);
        a.add(6);
        a.add(7);

        b.add(3);
        b.add(6);
        b.add(10);


        System.out.println(obj.func());
        System.out.println(obj.func2(56));
        System.out.println(obj.switchIt());
        System.out.println(compareTriplets(a, b));

        int rand = (int) (Math.random()*10);

        System.out.println(rand);
    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> fin = new ArrayList<>();
        int bob = 0;
        int alice = 0;

        for(int i = 0; i < a.size(); i++) {
            if(a.get(i) < b.get(i)) {
                bob += 1;
            }
            else if(a.get(i) > b.get(i)) {
                alice += 1;
            }
        }
        fin.add(bob);
        fin.add(alice);
        return fin;
    }
}
