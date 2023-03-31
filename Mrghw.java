public class Mrghw
{ 
public static void main(String args[]) 
{ 
int a[]={11,2,3,56,34,23,6,5}; 
int b[]={45,76,34,23,12,66,44}; 
int c[]=new int[a.length+b.length]; 
 
//combining the size of two array in one  
 
for(int i=0;i<a.length;i=i+1) 
{ 
c[i]=a[i]; 
} 
for(int i=0;i<b.length;i=i+1) 
{ 
c[i+a.length]=b[i]; 
} 
for(int i:c) 
{ 
System.out.print(i); 
} 
 System.out.println();
// Duplicate  
 
for(int i=0;i<c.length;i=i+1) 
{ 
for(int j=i+1;j<c.length;j=j+1) 
{ 
if(c[i]==c[j]) 
{ 
c[j]=0; 
} 
} 
} 
 
for(int i:c) 
{ 
System.out.print(i); 
} 
 System.out.println();
//Sorting  
 
for(int i=0;i<c.length;i=i+1) 
{ 
for(int j=i+1;j<c.length;j=j+1) 
{ 
if(c[i]<c[j]) 
{ 
int temp=c[i]; 
c[i]=c[j]; 
c[j]=temp; 
} 
} 
} 
 
for(int i:c) 
{ 
System.out.print(i); 
} 
} 
}








