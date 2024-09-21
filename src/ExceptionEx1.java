import java.io.FileNotFoundException;

public class ExceptionEx1 {


    public static void main(String[] args) {

        try{
            int a=10;
            int b=0;
            int c=a/b;
        }catch(NullPointerException e){
            System.out.println("1st catch");
            System.out.println(e.getMessage());
            //e.printStackTrace();
            //System.out.println(e);

        }catch(RuntimeException e) {
            System.out.println("2nd catch");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("in finally");
        }


    }
}
