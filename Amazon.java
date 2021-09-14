@FunctionalInterface
interface Abc{
    void display();
/*
    public void initAbc(){System.out.println("Init Abc");}

    We can't define a method inside a Interface untill 1.7, but after that
    we can define a method inside a interface by only using "default"
    because every method inside the Interface is by default added "abstract"
    keyword which can not be defined, so we need to use this keyword as below
*/
    default void initAbc(){System.out.println("Define Method Inside Interface!");}
}


class Amazon{
      public static void main(String args[]){

/* Actual Java Code :
          Abc obj = new Abc(){
          public void display(){
             System.out.println("Implemeting Functional Interface using Anonymous Class");
            }
          };
   After using Lamda Expression which is came from Scale
*/
          Abc obj = () -> System.out.println("Implementing Functional Intreface using Lamda Expression");
          obj.initAbc();
          obj.display();

       }

}
