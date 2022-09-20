package Driverclaass;

public class CredServices {
	public String generateEmailID(String fname,String sname,String dept )
	{
		return fname+sname+"@"+dept+"."+"gl.com";
		
		
	}
	public char[] generatePassword()
	{
		String capLetterws="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallletters="abcdefghijkmnopqrstuvwxyz";
		String numbers= "012456789";
		String splchars="!@#$%^&*";
		String value=capLetterws+smallletters+numbers+splchars;
		char p[]=new char[8];
		int i;
		Random random =new Random();
		for(i=0;i<8;i++)
		{
		  p[i]=value.charAt(random.nextInt(value.length()));
		 
			 	
		}
		return p;
	}
	
   
}
