public class Wordsarray
{
public static void main(String args[])
{
String s="Narayanaswamy resigned as chief minister from Pondicherry"; 
int counter=0;
for(int i=0;i<s.length();i=i+1)
{
if(s.charAt(i)==' ')
{
counter=counter+1;
}
}
System.out.println("Total no of words:" +(counter+1));
}
}








