public class RemoveOneCharInString
{
public static void main(String args[])
{
String River_name="mississippi";
//string to char array conversion
char c[]=new char[River_name.length()];
for(int i=0;i<c.length;i=i+1)
{
c[i]=River_name.charAt(i);
}
//logic to remove char(i)
for(int i=0;i<c.length;i=i+1)
{
if(c[i]=='i')
{
c[i]='e';
}
}
for(char p:c)
{
System.out.print(p);
}
}
}








