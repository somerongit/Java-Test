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
interface Online { 

        Printer print = new Printer();
/* We can't declear var inside Interface
        String name;
        int age;
*/
        final double pi=3.141;
        String hi="Hi I'm Java";
        static final String devName="Someron";
   public abstract void display();

}

class TestParent{
        Printer print1 = new Printer();
        String name;
        int age;
   public void display(){

        print1.coutln("Display is Called!");
        print1.coutln("Name is: "+name+"\nAge is: "+age);
   }
}

public class Test extends TestParent implements Online{ 

   public Test(String passName, int passAge){
         this.name=passName;
         this.age=passAge;
         print.coutln("Child Object is Initialized!");
   }

   public static void  main(String[] arg){

        System.out.println("Hi! I am Som 3.0");

        Test obj=new Test("Oke",25){
           public void display(){
                System.out.println("Display is Called defined anonymously!");
                System.out.println("Name is: "+name+"\nAge is: "+age+"\nPI : "+pi);
             }
        };
        obj.display();
   }
}