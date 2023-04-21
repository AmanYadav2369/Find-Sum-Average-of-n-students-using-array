/* wajp to find  avg marks of test conducted for "n" students.(  using arrays ). ( using for loop, for-each loop ).  */

import java.io.*;
class Array
{
public static void main(String args[])
{
Console c=System.console();
int size=Integer.parseInt(c.readLine("enter the size of array :"));

int marks[]=new int[size];

for(int i=0; i<size; i++){
marks[i]=Integer.parseInt(c.readLine("enter the marks :"));
}

double sum=0.0, avg=0.0;
for(int i=0; i<size; i++){
sum=sum+marks[i];
avg=sum/size;
}
System.out.println("Total Marks ="+sum);
System.out.println("Average Marks ="+avg);

}
}
