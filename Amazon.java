class Amazon{
    static{
         int age=25;
         String lname="Bakuli";
         System.out.println("1st Static Block Excecuting...");
       }
    Amazon(){
         System.out.println("Constructor Excecuting...");
      }
    static{
         String fname="Someron";
         System.out.println("2nd Static Block Excecuting...");
       }
    public static void main(String args[]){
          System.out.println("Main Method is executing...");
          Amazon obj=new Amazon();
       }

}
