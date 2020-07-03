package www.rachana.Java8LambdasStreams1;

import java.util.*;
import java.util.stream.Collectors;
class stringCheck
{
public static List<String> search(List<String> list)
{
return list.stream()
  .filter(s -> s.startsWith("a"))
  .filter(s -> s.length() == 3)
  .collect(Collectors.toList());
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("*****ENTER SIZE OF LIST*****");
int n=sc.nextInt();
List<String> list=new ArrayList<String>();
System.out.println("*****ENTER LIST OF STRINGS*****");
for(int i=0;i<n;i++)
{
list.add(sc.next());
}
List<String> al=search(list);
System.out.print("The List is:"+al);
sc.close();
}
}