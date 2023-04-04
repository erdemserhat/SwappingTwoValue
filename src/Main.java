public class Main {
    public static void main(String[] args) {
        System.out.println(" \nSwapping Two value without using another variable");

        int a = 25;
        int b = 26;
        System.out.printf(" First a value : %d \n First b value : %d\n",a,b);

        a=a+b;
        b=a-b; // b=a+b-b -> b=a anymore, a equals b
        a=a-b; // a=a+b - b(a) -> a=a+b-a, anymore, b equals a

        System.out.printf("\n Last a value : %d \n Last b value : %d\n",a,b);
    }
}