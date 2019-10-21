public class StringOperations2 {

    public static void main(){

        String st1="Object Oriented Class";
        char [] charArray=new char[15];

        System.out.println("The length of the st1 is "+st1.length());

        for(int i=st1.length()-1; i>=0; i--)
          System.out.printf("%c",st1.charAt(i));

        st1.getChars(0,5,charArray,0);

        System.out.println("Char Array Content\n");
        for(char character:charArray)
        {
            System.out.printf("%c",character);

        }
    }

    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class StringOperations2
     */
    public StringOperations2()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
	}
}
