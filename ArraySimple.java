public class ArraySimple
{
public static void main(String args[])
{
int[] a = { 4, 7, 9, 2, 6, 5 };
//Single Rotation -> 7, 9, 2, 6, 5, 4
//take the first value as backup
  int temp = a[0]; // temp = 4 
//move all elements by one position toward right except last element 
  for(int i=0; i<a.length-1;i=i+1)
  {
   a[i]=a[i+1];
  }
//Assigning first value(which is taken as backup) in last location of an array
  a[a.length-1] = temp; 
  
  for(int i:a)
  {
   System.out.println(i);
  }
}
}








