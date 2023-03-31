public class Stringtochar
{
public static void main(String args[])
{
String place_name="London";
char c[]=new char[place_name.length()];
for(int i=0;i<c.length;i=i+1)
{
c[i]=place_name.charAt(i);
}
for(int i=0;i<c.length;i=i+1)
{
for(int j=i+1;j<c.length;j=j+1)
{
if(c[i]==c[j])
{
c[i]=' ';
}
}
}
for(char v:c)
{
System.out.println(v);
}
}
}









