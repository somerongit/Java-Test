final class Printer{ // This class can not be extends by any other class
      protected final void cout(Number input){
         System.out.print(input);
   }
      protected final void cout(String input){
         System.out.print(input);
   }
      protected final void cout(Boolean input){
         System.out.print(input);
   }

      protected final void coutln(Number input){
         System.out.println(input);
   }
      protected final void coutln(String input){
         System.out.println(input);
   }
      protected final void coutln(Boolean input){
         System.out.println(input);
   }
}
abstract class Online { 

        Printer print = new Printer();
        String name;
        int age;
        final double pi=3.141;
   public Online(String passName, int passAge){
        this.name=passName;
        this.age=passAge;
   }
   public abstract void display();

}

public class Test extends Online{ 
   public Test(String passName, int passAge){
         super(passName,passAge);
         print.coutln("Child Object is Initialized!");
   }
   public void display(){

        print.coutln("Display is Called!");
        print.coutln("Name is: "+name+"\nAge is: "+age+"\nPI Value: "+pi);
   }
   public static void  main(String[] arg){

        System.out.println("Hi! I am Som 3.0");

        Test obj=new Test("Oke",25);
        obj.display();
   }
}