public class StringEx {


    public static void main(String [] args){

        String str="hello new nice world";

       /* reverse string:letter by letter
        String reverse="";
        for(int i=str.length()-1;i>=0; i--){

            reverse=reverse + str.charAt(i);
        }

        System.out.println("new string:"+reverse);

        //reverse with String buffer

        StringBuffer sb=new StringBuffer(str);
        sb=sb.reverse();
        System.out.println("Reverse with String Builder:"+sb); */

        //reverse with array
        String s="tenet";
        char[] array=s.toCharArray();
        String rev="";
        for(int i=array.length-1; i>=0; i--){
            rev=rev+array[i];
        }
        System.out.println("Reversing with array:"+rev);

        //check if it is palindrome or not
        if(s.equals(rev)){
            System.out.println(s+" is palindrome");
        }else{
            System.out.println(s+" is NOT palindrome");
        }

       //reverse with split

        String [] arr=str.split(" ");
        String rev1="";
        for(int i=arr.length-1; i>=0; i--){

            rev1=rev1+" "+arr[i];
        }

        System.out.println("Reverse with split:"+rev1);

    }

}
