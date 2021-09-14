@FunctionalInterface
interface Abc{
    void display();
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
          obj.display();

       }

}
