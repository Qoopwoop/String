public class ThirdCharacter
{
public static void main(String args[])
{
String s = "Laziness pays of overnight however hard work pays off throughout your life"; 
//string to char array conversion
char c[]=new char[s.length()];
for(int i=0;i<c.length;i=i+1)
{
c[i]=s.charAt(i);
}
for(int i=2;i<c.length;i=i+3)
{
System.out.print(c[i]);
}
}
}









