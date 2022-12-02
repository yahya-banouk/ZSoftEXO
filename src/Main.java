import java.util.ArrayList;

public class Main {
    /*

 “ABBDCA”, 2 -> true

“BAAABDBB”, 3 -> true

“BAABDB”, 3 -> false

“CABDDACCCA”, 2 -> true

CABDACCCA , 2 -> false



*/
    public static boolean occuranceComparator(String str, int a)
    {
        int count = 1;
        Character strChars = str.charAt(0);
        if(str.length()<a) return false;
        for(int i = 1  ; i< str.length() ; i++)
        {
            if(strChars.equals(str.charAt(i))) count++;
            else
            {
                if(count == a) return true;
                count = 1;
                strChars = str.charAt(i);
            }
            if(i == str.length()-1 && count == a) return true;
        }
      return false;
    }

    public static void main(String[] args) {

        System.out.println("les cas données:");
        System.out.println(occuranceComparator("ABBDCA", 2));
        System.out.println(occuranceComparator("BAAABDBB", 3));
        System.out.println(occuranceComparator("BAABDB", 3));
        System.out.println(occuranceComparator("CABDDACCCA", 2));
        System.out.println(occuranceComparator("CABDACCCA", 2));



    }
}
