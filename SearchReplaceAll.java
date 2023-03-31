import java.util.Scanner;
public class SearchReplaceAll
{
void ReplaceAll()
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the sentence:" );
String x=sc.nextLine();
String y[]=x.split(" ");
for(int i=0;i<y.length;i++)
{
if(y[i].equals("sea"))
{
y[i]="see";
}
System.out.println(y[i]);
}
}
public static void main(String args[])
{
SearchReplaceAll re=new SearchReplaceAll();
re.ReplaceAll();
}
}










