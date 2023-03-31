public class SorttoChar
{
public static void main(String args[])
{
String river_name="Mississippi";
char c[]=new char[river_name.length()];
for(int i=0;i<c.length;i=i+1)
{
c[i]=river_name.charAt(i);
}
for(int i=0;i<c.length;i=i+1)
{
for(int j=i+1;j<c.length;j=j+1)
{
if(c[i]<c[j])
{
char temp=c[i];
c[i]=c[j];
c[j]=temp;
}
}
}
for(char p:c)
{
System.out.println(p);
}
}
}









