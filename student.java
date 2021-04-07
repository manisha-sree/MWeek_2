public class student
{
String name;
String course;
int Regno;
public student(String name, String course,int age)
{
this.name = name;
this.course = course;
this.Regno = Regno;
}
public String getName()
{
return name;
}
public static void main(String[] args)
{
student s1 = new student("Manisha","EEE",206);
System.out.println(s1.getName());
}
}