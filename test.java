class Online { 

        String name;
        int age;
   public Online(String passName, int passAge){
         this.name=passName;
         this.age=passAge;
         System.out.println("Parent Object is Initialized!");
   }
   public void display(){

        System.out.println("Display is Called!");
        System.out.println("Name is: "+name+"\nAge is: "+age);
   }

}

class Test extends Online{
   public Test(String passName, int passAge){
         super(passName,passAge);
         System.out.println("Child Object is Initialized!");
   }

   public static void  main(String[] arg){

        System.out.println("Hi! I am Som 3.0");

        Test obj=new Test("Oke",25);
        obj.display();
   }
}