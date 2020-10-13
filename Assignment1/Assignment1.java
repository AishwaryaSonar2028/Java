public class Assignment1{
 
    String name;
    int age;
    String city;

    
    public void display(){
        System.out.println("\nThe name is "+ name);
         System.out.println("The age is "+ age);
          System.out.println("The city is " +city);
    }
    public static void main(String[] args){
        Assignment1 a1 = new Assignment1();
        Assignment1 a2 = new Assignment1();
        a1.name = "Aishwarya";
        a1.age = 20;
        a1.city = "Pune";

        a2.name = "Eshika";
        a2.age = 21;
        a2.city = "Akola";

        a1.display();
        a2.display();
    }
}