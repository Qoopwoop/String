public class PatternCom1
{
public static void main(String []args)
{
String name ="computer";
for(int i=0;i<name.length();i=i+1)
{
for(int j=i;j<=name.length();j=j+1)
{
System.out.print(" ");
}
for(int j=0;j<=i;j=j+1)
{

System.out.print(" "+name.charAt(j));
}
System.out.println();
}
}
}








