import java.util.Scanner;
public class SortingQ1
{
void SortingQ()
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the sentence:" );
String x=sc.nextLine();
String y[]=x.split(" ");
for(int i=0;i<y.length;i++)
{
for(int j=i+1;j<y.length;j++)
{
if(y[i].compareTo(y[j])>0)
{
String temp=y[i];
y[i]=y[j];
y[j]=temp;
}
}
System.out.println(y[i]);
}
}
public static void main(String args[])
{
SortingQ1 re=new SortingQ1();
re.SortingQ();
}
}










