package www.rachana.Java8LambdasStreams1;

import java.util.*;
class averageUsingStreams
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("****ENTER SIZE OF LIST****");
int size=sc.nextInt();
ArrayList<Integer> al=new ArrayList<Integer>();
System.out.println("****ENTER NUMBERS TO FIND AVERAGE****");
for(int i=0;i<size;i++)
{
al.add(sc.nextInt());
}
al.stream().mapToInt(i -> i).average().ifPresent(avg -> System.out.println("AVERAGE OF NUMBERS IS"+" "+ avg));
sc.close();
}
}
