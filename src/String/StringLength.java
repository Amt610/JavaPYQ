package String;

public class StringLength {
    public static void main(String[] args) {
        //Print String length
        String cc="Developer";
        int count=0;

        for (char ch:cc.toCharArray()){
            count++;
        }
        System.out.println("String length: "+count);
    }
}
