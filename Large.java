import java.util.*;
public class Large
{
public static void main(String args[])
{
int a,b,c;
Scanner w=new Scanner(System.in);
a=w.nextInt();
b=w.nextInt();
c=w.nextInt();
if(a>b&&a>c)
{
System.out.println("The Largest number is",a);
}
else if(b>c)
{
System.out.println("The Largest number is",b);
}
else
{
System.out.println("The largest number is",c);
}}
}
