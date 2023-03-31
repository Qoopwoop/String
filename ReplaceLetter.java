public class ReplaceLetter
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
//logic to remove char(i)
for(int i=0;i<c.length;i=i+1)
{
if(c[i]=='i')
{
c[i]='!';
}
}
for(char p:c)
{
System.out.print(p);
}
}
}









