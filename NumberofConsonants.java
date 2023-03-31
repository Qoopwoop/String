public class NumberofConsonants
{
public static void main(String args[])
{
String s="Narayanaswamy resigned as chief minister from Pondicherry"; 
int count=0;
for(int i=0;i<s.length();i=i+1)
{
if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
{
System.out.print("");
}
else if(s.charAt(i)!=' ')
{
count++;
}
}
System.out.println("Total no of consonants:"+count);
}
}








