public class FinalEx1 {
     int a=3;
    static void show(int i){
        System.out.println(i);
    }

    final static void show(String i){
        System.out.println(i);
    }



    public static void main(String[] args) {
        final int a=10;
        //a=3;
        System.out.println(a);
        show(9);

    }
}
