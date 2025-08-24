public class Wrapper_class {
    public static void main(String[] args) {
        int a=10;
        /* Auto unboxing
        Converting int to Integer object
         */
        Integer obj=a;
        System.out.println(obj);

        String s1="123";
        int i1= Integer.parseInt(s1);
        double d1=Double.parseDouble(s1);
        float f1=Float.parseFloat(s1);

    }
}
