import java.util.Scanner;
public class OccuranceQ1
{
static int occurance()
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the sentence:" );
String x=sc.nextLine();
//Occurance of the word "sea"
String y[]=x.split(" ");
int counter=0;
for(String z:y)
{
if(z.equals("sea"))
{
counter++;
}
}
System.out.println(counter);
return counter;
}
public static void main(String args[])
{
occurance();
}
}







