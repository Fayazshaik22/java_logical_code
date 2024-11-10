import java.util.Scanner;
public class Maximum_number {
public static void main(String Args[])
{
Scanner input = new Scanner(System.in);
System.out.println("enter the First number:");
int num1 = input.nextInt();
System.out.println("Enter the secend number:");
int num2 = input.nextInt();
if(num1>num2)
 System.out.println("Maximum number is"+num1);
 else if(num1<num2)
  System.out.println("Maximum number is"+num2);
  else
  System.out.println("Both are equal"+num1);
}
}