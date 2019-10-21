// BUILDER - PALINDROM
public class Builder {

    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Hello");
        sb.append("World");
        System.out.println(sb);
        sb.insert(5," Around The ");
        System.out.println(sb);

        //System.out.println(sb.substring(10));
        System.out.println(sb.substring(0,10));

        String isPalindrome="KABMNAK";
        int i;
        int j=isPalindrome.length()-1;
        for ( i = 0; i < isPalindrome.length(); i++) {

            if(isPalindrome.charAt(i)!=isPalindrome.charAt(j))
                break;

            j=j-1;

        }
        if(i==isPalindrome.length())
            System.out.println(isPalindrome + " is palindrome");
        else
            System.out.println(isPalindrome + "is not palindrome");

    }
}