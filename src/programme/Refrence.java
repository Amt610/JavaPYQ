package programme;

public class Refrence {
    public static void main(String[] args) {
        //String Object 01
        //String Object 02
        String a=new String("Java");
        String b=new String("Java");

        if (a==b){
            System.out.println("True");;
        }
        else if (a!=b) {
            System.out.println("False");
        };
    }
}
