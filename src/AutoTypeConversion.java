public class AutoTypeConversion {
    public static void main (String [] args){
        int x = 20;
        double y = 40.5;
        long p = 30;
        float q = 10.60f;

        double z = x + y;
        float r = p - q;
        System.out.println("Subtraction of two numbers: " + r);
    }
}
