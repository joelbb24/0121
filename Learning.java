
import java.util.*;

public class Learning 
{
    public static void main(String [] args)
    {
        String str = "Hello World!";

        char[] ch = str.toCharArray();
        for(char c : ch)
            System.out.print(c+ " ");

        System.out.println();
        String out = Arrays.toString(ch);
        System.out.println(out);
    }
}
