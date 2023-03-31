public class RemoveInBetweenSpace
{
public static void main(String args[])
{
String s = "Narayanaswamy resigned as chief minister from Pondicherry"; 
//string to char array conversion
char c[]=new char[s.length()];
for(int i=0;i<c.length;i=i+1)
{
c[i]=s.charAt(i);
}
for(char i:c)
{
if(i!=' ')
System.out.print(i);
}
}
}









