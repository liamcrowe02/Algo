import java.util.ArrayList;
import java.util.List;

public class Algorithim {

    ArrayList<Integer> arr = new ArrayList<>();

    public ArrayList<Integer> func() {
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(5);
        arr.add(45);
        ArrayList<Integer> newArr = new ArrayList<>();

        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) >= 2 && arr.get(i) < 43) {
                int total = arr.get(i);
                newArr.add(total);
            }
        }
        return newArr;
    }

    public String func2(int k) {
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(5);
        arr.add(45);
        int n = arr.size();
        String word = "";

        for (int i = 0; i < n; i++) {
            if(arr.contains(k)) {
                word = "Yes";
                return word;
            }
            else {
                word = "Not in arraylist";
                return word;
            }
        }
        return word;
    }

    public ArrayList<Integer> switchIt() {
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(5);
        arr.add(45);

        ArrayList<Integer> newArr = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            for (int j = i+1; i < arr.size(); j++) {
                if(arr.get(i) < arr.get(j)) {
                    int iTemp = arr.get(i);
                    int jTemp = arr.get(j);
                    int t;
                    t = jTemp;

                    jTemp = iTemp;
                    iTemp = t;

                    newArr.add(jTemp);

                    return newArr;
                }
            }
        }
        return newArr;
    }
}
