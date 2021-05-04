class fibonacci 
{
public static void main(String a[])
{
int n=Integer.parseInt(a[0]);
int n1=0,n2=1,n3;
System.out.println(n1);
System.out.println(n2);
for(int i=3;i<=n;i++)
{
n3=n1+n2;
System.out.println(n3);
n1=n2;
n2=n3;
}
}
}