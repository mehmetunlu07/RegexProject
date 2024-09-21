import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListEx2 {

    public static void main(String[] args) {
        List<String> list=new ArrayList<>();

        list.add("Adam");
        list.add("Mary");
        list.add("Adam");

        System.out.println("List------------>"+list);
//        list.set(1,"vvv");
//        System.out.println("List------------>"+list);
//        list.remove(1);
//        System.out.println("List------------>"+list);
//        list.clear();
//        System.out.println("List------------>"+list);

        List<String> list1=new ArrayList<>();
        list1.add("jhjhjhjh");
        list1.add("kkkkkk");
        list1.add("llllll");

        list.addAll(0,list1);
        //list.addAll(list1);
        System.out.println("List------------>"+list);
        //System.out.println("1nci---------"+list.get(0));


//        Set<String> set=new HashSet<>(list);
//
//        System.out.println("Set-----------."+set);


    }
}
