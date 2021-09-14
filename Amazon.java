@FunctionalInterface
interface Abc{
    void display();
    int Age=25;// It is a constant final
// Interface can have a static method too
    static void initAbc(){System.out.println("Define Static Method Inside Abc Interface!");}
}

class Amazon{
      public static void main(String args[]){
          
          Abc.initAbc();

       }

}
