/*
Without main method.
@author beyzanurkarakaya
*/

public class Odev1
{

	private String alfabe = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	public static void main(String[] args){}

	public String encrypt(String originalText, String key)
	{
		String text = toUpperString(originalText);
		String encrypted = "";
		// int Originaltxt = originalText.length();
		//int keys  = key.length();

		for(int i = 0, d =0; i < originalText.length(); i++, d =(d+1) %  key.length())
		{
			int position = (alfabe.indexOf(text.charAt(i)) + alfabe.indexOf(key.charAt(d)+1)) % alfabe.length();
			encrypted += alfabe.charAt(position);
		}
		return encrypted.toString();
	}

	public String toUpperString(String text)
	{
		text = text.toUpperCase();
		for(int j = 0; j < text.length(); j++)
		{
			int index = alfabe.indexOf(text.charAt(j));
			if(index == -1)
			{
				text = text.replace(text.charAt(j), ' ');
			}
		}
		return text.toString();
	}

	public String decrypt(String encryptedText, String key )
	{
		String text = toUpperString(encryptedText);
		String decrypted = "";
		//int Encrypttxt= encryptedText.length();
		// int keys= key.length();

		for(int i = 0, j = 0; i< encryptedText.length(); i++, j = (j+1) % key.length())
		{
			int position = (alfabe.indexOf(text.charAt(i)) - alfabe.indexOf(key.charAt(j)+1));
			position = (position < 0) ? (position + alfabe.length()): position;
			decrypted += alfabe.charAt(position);
		}
		return decrypted.toString();

	}
}
