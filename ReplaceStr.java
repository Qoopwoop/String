public class ReplaceStr
{
public static void main(String args[])
{
String car1="Nissan";
char c[]=new char[car1.length()];
for(int i=0;i<c.length;i=i+1)
{
c[i]=car1.charAt(i);
}
//logic to remove char(i)
for(int i=0;i<c.length;i=i+1)
{
if(c[i]=='a')
{
c[i]='@';
}
}
for(char p:c)
{
System.out.print(p);
}
}
}








