import java.util.ArrayList;
import java.util.HashSet;

public class Task10 {
    public static void RemoveDuplicatefromArrayList(){

        ArrayList A= new ArrayList();
        A.add(5);
        A.add(10);
        A.add(5);
        A.add(10);
        A.add(15);
        A.add(20);
        A.add(25);
        A.add(30);
        A.add(30);

        System.out.println("Before Removing Duplicate"+" "+ A);
        System.out.println();
        HashSet B=new HashSet();
        //converting list to set
        B.addAll(A);
        System.out.println("After Removing" +" "+ B);

    }
    public static void main(String[] args) {
        RemoveDuplicatefromArrayList();

    }
}
