import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    Scanner Obj = new Scanner(System.in);  
    System.out.println("Enter username");

    String Name = Obj.nextLine();  
    System.out.println("Username is: " + Name);  
  }
}