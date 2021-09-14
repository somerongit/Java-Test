@FunctionalInterface
interface Abc{
    void display();
    default void initAbc(){System.out.println("Define Method Inside Interface!");}
}

interface Abc2{
    default void initAbc(){System.out.println("Define Method Inside Interface!");}
}

class Amazon implements Abc,Abc2{
      public void display(){
      System.out.println("Interface is Implemeted");
      }
      public void initAbc(){
      System.out.println("Multiple Implements with common function by overrideing methods");
      }
      public static void main(String args[]){
          Amazon obj = new Amazon();
          obj.initAbc();
          obj.display();

       }

}
