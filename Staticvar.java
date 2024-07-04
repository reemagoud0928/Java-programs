class Sample
{
int a=10;
static int b=20;
}
class Staticvar{
public static void main(String[] args){
Sample s1=new Sample();
Sample s2=new Sample();
System.out.println(s1.a);
System.out.println(s2.a);
System.out.println(s1.b);
System.out.println(s2.b);
}
}