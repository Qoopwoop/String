import java.util.Scanner;
public class RemoveDuplicate
{
void Duplicate()
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the sentence:" );
String x=sc.nextLine();
String y[]=x.split(" ");
for(int i=0;i<y.length;i++)
{
for(int j=i+1;j<y.length;j++)
{
if(y[i].equals(y[j]))
{
y[j]=" ";
}
}
System.out.println(y[i]);
}
}
public static void main(String args[])
{
RemoveDuplicate re=new RemoveDuplicate();
re.Duplicate();
}
}










