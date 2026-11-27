public class Equals_function {
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";

        if (s1.equals(s2)) { // dont use the (==) here couse it only checks the memory location that are
                             // pointed by both strings are same or not
                             // it not checks the actual content from the both strings. 
                            // [ .equals() ] instead use Function.                   
            System.out.println("Both strings are equal");
        } else
            System.out.println("Not equal");

    }
}
