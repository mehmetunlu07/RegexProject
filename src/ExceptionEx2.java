public class ExceptionEx2 {

    static void sum1(String str){
        int a=str.length();
        System.out.println(a);
    }

    void division(int a, int b) throws ArithmeticException, InterruptedException {
        Thread.sleep(1000);
        int c=a/b;
        System.out.println("c---->"+c);
    }

    public static void main(String[] args) {
        sum1("hello");
        System.out.println("completed");

        ExceptionEx2  obj=new ExceptionEx2();
        try {
            obj.division(10,2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        FinalEx1.show(5);
        FinalEx1 f=new FinalEx1();
        int c=f.a+10;
        System.out.println(c);
    }


}
