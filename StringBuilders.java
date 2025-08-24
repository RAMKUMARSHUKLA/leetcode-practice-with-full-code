import java.lang.StringBuilder;

public class StringBuilders {
    public static void main(String[] args)
    {
        StringBuilder sb=new StringBuilder("Hello World");
        sb.append(" Mayank");
        System.out.println(sb);
        sb.insert(5," moody");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);





    }
}
