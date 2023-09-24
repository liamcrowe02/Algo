import java.util.Iterator;
import java.util.LinkedList;

public class Linky {

    //toString helps you print an object
    int StudentId;
    String name;

    Linky(int StudentId, String name) {
        this.StudentId = StudentId;
        this.name = name;
    }

    public String toString() {
        return StudentId + " " + name;
    }

    public static void main(String[] args) {
        //LinkedList Tutorial
        LinkedList linky = new LinkedList();

        linky.add("liam");
        linky.add("joe");
        linky.add("bloggs");

        System.out.println(linky.get(1));

        Iterator it = linky.iterator();

        while(it.hasNext()) {
            if((String) it.next() == "joe") {
                System.out.println("We found joe");
            }
        }

        //toString Tutorial
        Linky obj = new Linky(1, "Liam");
        Linky obj2 = new Linky(2, "Crowe");

        System.out.println(obj.toString()); //Output without toString: Linky@65ab7765

    }
}
