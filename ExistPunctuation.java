public class ExistPunctuation
{
public static void main(String args[])
{
String s = "Successful people are not gifted; they just work-hard, then succeed on purpose."; 
int countPuncMarks=0;
for(int i=0;i<s.length();i++)
{
if(s.charAt(i) == '!' || s.charAt(i) == ',' || s.charAt(i) == ';' || s.charAt(i) == '.' || s.charAt(i) == '?' || s.charAt(i) == '-' ||  
s.charAt(i) == '\'' || s.charAt(i) == '\"' || s.charAt(i) == ':') 
{  
countPuncMarks++;  
}  
}  
System.out.println("Total number of punctuation characters exists in string: " +        countPuncMarks);  
}  
}  








