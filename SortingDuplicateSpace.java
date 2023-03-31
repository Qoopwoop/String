public class SortingDuplicateSpace
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
for(int i=0;i<c.length;i=i+1)
{
for(int j=i+1;j<c.length;j=j+1)
{
if(c[i]>c[j])
{
char temp=c[i];
c[i]=c[j];
c[j]=temp;
}
if(c[i]==c[j])
{
c[j]=' ';
}
}
}
for(char i:c)
{
if(i!=' ')
{
System.out.print(i);
}
}
}
}









