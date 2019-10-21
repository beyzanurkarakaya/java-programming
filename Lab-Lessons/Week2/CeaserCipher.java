public class CeaserCipher {

    public static String encrypt(int key, String originalText)
    {
        String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String shiftedAlphabet=alphabet.substring(key);
        shiftedAlphabet=shiftedAlphabet+alphabet.substring(0,key);

        String encryptedText=originalText;
        StringBuilder  encrypted=new StringBuilder(encryptedText);

        for (int i = 0; i < originalText.length() ; i++) {

            char currentChar=originalText.charAt(i);
            int idx=alphabet.indexOf(currentChar);
            if(idx!=-1) {
                char encryptedChar = shiftedAlphabet.charAt(idx);
                encrypted.setCharAt(i, encryptedChar);
            }
        }
        return  encrypted.toString();
    }

    public static void main(String[] args) {

        int key=23;
        String originalText="OBJECTORIENTEDEXAM";
        System.out.println(" The encrypted text of "+originalText+" is:");
        System.out.println(encrypt(key,originalText));
    }
}