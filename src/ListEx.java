import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class ListEx {

    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("John");
        list.add("Adam");
        list.add("John");
        //new line
        //second line

        System.out.println("ArrayList.........."+list);

        ArrayList<String> list1=new ArrayList<>(list);
        list1.add("Adam");

        System.out.println("Put list to another list........"+list1);

        Set<String> set=new HashSet<>(list1);

//        for(String name:list1){
//            set.add(name);
//        }
        System.out.println("Set--------------"+set);


    }
}
