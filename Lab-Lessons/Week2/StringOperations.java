public class StringOperations{

    public static void main()
    {
        char [] charArray={'b','i','r','t','h',' ','d','a','y'};
        String s="hello";
        s=new String("hello");
        String s1=new String();
        String s2=new String(s);
        String s3=new String(charArray);
        String s4=new String(charArray,5,3);

        System.out.printf("s:%s\ns1:%s\ns2:%s\ns3:%s\ns4:%s\n",s,s1,s2,s3,s4);
        if(s==s2)
        		System.out.println("The references of s and s2 are the same");
    }
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class StringOperations
     */
    public StringOperations()
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
