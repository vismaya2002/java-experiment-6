import java.util.*;
class arexp
{
 public static void main(String args[])
 {
  Scanner obj=new Scanner(System.in);
  System.out.println("Enter number:");
  int x=obj.nextInt();
  System.out.println("Entered value is :"+x);
  try{
   int y=x/0;
   System.out.println("after division"+y);
  }
  catch(ArithmeticException e)
  {
   System.out.println(e);
  }
 }
}
