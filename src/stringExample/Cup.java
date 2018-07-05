package stringExample;

public class Cup{

    public static void main (String[] args)
    {
        // string literal
        String str1 = "Hello World!"; // String object referencing a literal string; can be empty
        // once run, "Hello World" is in the String pool
        String str2 = "Hello World!"; // this is referencing SAME String so if you change it . . . ALL of them change
        String str3 = "Hell World"; // is a DIFFERENT string

        System.out.println(str1.compareTo(str2));

        //char array 2345678
        char[] helloArray = {'h', 'e', 'l', 'l', 'o'};
        String helloString = new String(helloArray);

        str1 = "hello";
        System.out.println(str1);
        //str2 = "hello";
        System.out.println(str1.equals(str2));
        System.out.println(str1 == str2);


        // StringBuilder = mutable string, NOT threadsafe
        // StringBuffer = is threadsafe but much slower; if you have multiple threads working on a string, they'll take their time instead of conflicting & causing errors
        // do you have a string that'll change constantly? use one of the SBs
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" world");
        sb.toString();
    }
}