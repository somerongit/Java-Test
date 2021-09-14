@FunctionalInterface
interface Abc{
    void display();
    default void initAbc(){System.out.println("Define Method Inside Abc Interface!");}
}

interface Abc2{
    default void initAbc(){System.out.println("Define Method Inside Abc2 Interface!");}
}

class Amazon implements Abc,Abc2{
      public void display(){
      System.out.println("Interface is Implemeted");
      }
      public void initAbc(){

      Abc2.super.initAbc();

//      System.out.println("Multiple Implements with common function by overrideing methods");
      }
      public static void main(String args[]){
          Amazon obj = new Amazon();
          obj.initAbc();
          obj.display();

       }

}
