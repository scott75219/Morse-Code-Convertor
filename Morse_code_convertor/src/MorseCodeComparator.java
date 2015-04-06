import java.util.Comparator;

 class MorseCodeComparator implements Comparator<String> {
	private String Short="";
	private String Long="";
	  char char1;
	  char char2;
	 @Override
	 public int compare(String Morsecode1, String Morsecode2) {
 
   if(Morsecode1.length()>Morsecode2.length())
  {
	  Long=Morsecode1;
	  Short=Morsecode2;
  }
  else if ( Morsecode1.length()<Morsecode2.length()){
	  Long=Morsecode2;
  	  Short=Morsecode1;
  }

   if(Morsecode1.length()!=Morsecode2.length()){
	  for(int x=0;x<Short.length();x++)
	  {
		 char1=Short.charAt(x);
		 char2=Long.charAt(x);
			  if(char1=='.'&&char2=='-')
				  return -1;
			  else if(char1=='-'&&char2=='.')
				  return 1;
	   }
			 char2=Long.charAt(Short.length());
			 if(char2=='.')
				 return -1;
			 else if(char2=='-')
				 return 1;
  }
  else {
	  for(int x=0;x<Morsecode2.length();x++)
	  {
		 char1=Morsecode1.charAt(x);
		 char2=Morsecode2.charAt(x);
		  if(char1!=char2)
		  	{
			  if(char1=='.'&&char2=='-')
				  return -1;
			  else if(char1=='-'&&char2=='.')
				  return 1;
			}
	  }
	  
  	}
return 0;
}
}