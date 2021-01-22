import java.util.*;


public class Search
{
    public static void main(String [] args)
    {
        String[] names = {"Alhamza", "Ganesh", "Amar", "Harsimrann","Agila","Sowntharya"};

        int position = search(names, "Amar");

        System.out.print(position);
    }


    static int search(String[] names,String target)
    {
        for(int i=0; i<names.length; i++)
        {
            if(names[i].equals(target))
                return i;
        }
        return -1;
    }
}
