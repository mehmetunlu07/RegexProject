public class Largest2ndElement {

    public static void main(String[] args) {

        //write a code to finf 2nd largest

        int[] numbers={0,3,9,11,-55,20,0,55,100};
        int largest=0;
        int largest2nd=0;
        int smallest=numbers[0];

        for(int i=0;i<numbers.length;i++){

            if(numbers[i]>largest){
                largest2nd=largest;
                largest=numbers[i];

            }else if(numbers[i]>largest2nd && numbers[i]!=largest){
                largest2nd=numbers[i];
            }else if(numbers[i]<smallest){
                smallest=numbers[i];

            }
        }

        System.out.println("smallest:"+smallest);
        System.out.println("2nd largest:"+largest2nd);
        System.out.println("Largest:"+largest);
    }
}
