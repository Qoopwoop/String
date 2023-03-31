public class IndividualVowels
{
public static void main(String args[])
{
String s="Narayanaswamy resigned as chief minister from Pondicherry"; 
int countera=0,countere=0,counteri=0,countero=0,counteru=0;
for(int i=0;i<s.length();i=i+1)
{
if(s.charAt(i)=='a')
{
countera=countera+1;
}
if(s.charAt(i)=='e')
{
countere=countere+1;
}
if(s.charAt(i)=='i')
{
counteri=counteri+1;
}
if(s.charAt(i)=='o')
{
countero=countero+1;
}
if(s.charAt(i)=='u')
{
counteru=counteru+1;
}
}
System.out.println(countera);
System.out.println(countere);
System.out.println(counteri);
System.out.println(countero);
System.out.println(counteru);
}
}










