public class Anagram
{
static String sort(String input)
{
String output=" ";
char c[]=input.toCharArray();
for(int i=0;i<c.length;i++)
{
for(int j=i+1;j<c.length;j++)
{
if(c[i]>c[j])
{
char temp=c[i];
c[i]=c[j];
c[j]=temp;
}
}
}
// coverting char array into string 
for(int i=0;i<c.length;i++)
{
output=output+c[i];
}
return output;
}
public static void main(String args[])
{
Anagram obj=new Anagram();
String a="care";
String b="race";
String x=sort(a);
String y=sort(b);
if(x.equals(y))
{
System.out.print("Anagram");
}
else
{
System.out.print("Not Anagram");
}
}
}








