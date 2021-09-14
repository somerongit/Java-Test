import java.util.*;
class DataStructure{
    static String name = "Stack";
    

}

public class Som{

    public static void main(String args[]){
          System.out.println("Main Method is executing...");
          Scanner sc = new Scanner(System.in);
          int size=sc.nextInt();
          int arr[]=new int[size];
          for(int z=0;z<size;z++){
               arr[z]=sc.nextInt();
          }
          size=size+2;
          System.out.println("Length of Array is: "+arr.length+"\nSize is : "+size+"\nInputs are : ");
          for(int z=0;z<size;z++){
               System.out.print(arr[z]);
          }
          DataStructure obj=new DataStructure();
       }

}
