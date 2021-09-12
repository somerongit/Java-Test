class Test { 

        String name;
        int age;
   public void initObj(String passName, int passAge){
         name=passName;
         age=passAge;
         System.out.println("Object is Initialized!");
   }
   public void display(){

        System.out.println("Display is Called!");
        System.out.println("Name is: "+name+"\nAge is: "+age);
   }
   public static void  main(String []arg){

        System.out.println("Hi! I am Som 3.0");

        Test obj=new Test();
        obj.initObj("Oke",25);
        obj.display();
   }
}