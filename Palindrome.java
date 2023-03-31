import java.util.Scanner;
public class Palindrome
{
void Palin()
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the sentence:" );
String x=sc.nextLine();
String y="";
        for(int i=x.length()-1;i>=0;i=i-1) {
            y = y + x.charAt(i);
        }
            if (x.equalsIgnoreCase(y)) {
                System.out.println("palindrom");

            } else {
                System.out.println("Not Palindrom");
}
}
public static void main(String args[])
{
Palindrome re=new Palindrome();
re.Palin();
}
}










