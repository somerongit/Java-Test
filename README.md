
# Java Practice Examples
<p>
<img src="https://raw.githubusercontent.com/somerongit/somerongit/main/img/java-gif.gif">
<img src="https://raw.githubusercontent.com/somerongit/somerongit/main/img/java%20refernce.gif">
</p>

# Memory Consume
<details>
<h3> boolean -> 1 bit </h3>
<h3>  byte -> 1 byte </h3>
<h3>  char -> 2 byte </h3>
<h3>  short -> 2 byte </h3>
<h3>  int -> 4 byte </h3>
<h3>  float -> 4 byte </h3>
<h3>  double -> 8 byte </h3>
<h3>  long -> 8 byte </h3>
</details>

# Type Casting (Default)
<details>
<h3>  byte -> char</h3>
<h3>  short -> byte,char</h3>
<h3>  char -> byte,short</h3>
<h3>  int -> byte,short,char</h3>
<h3>  long -> byte,short,char,int</h3>
<h3>  float -> byte,short,char,int,long</h3>
<h3>  double -> byte,short,char,int,long,float </h3>
</details>

### Example

```
class Test { 
   public static void  main(String []arg){
        double temp=509.509;
        System.out.println("Hi! I am Som 3.0");
        System.out.println("Output is: "+(int)temp);
   }
}
```
# Cheat Sheet 
<details>
<img src="https://raw.githubusercontent.com/somerongit/somerongit/main/img/java-cheat-sheet.jpg">
</details>

# Architecture
  <a href="https://github.com/somerongit/java-cheat-sheet/blob/master/README.md">Full Details</a>
<details>
<img src="https://raw.githubusercontent.com/somerongit/java-cheat-sheet/master/images/java-write-once-run-anywhere.png">
</details>

# OOP'S
<details>
<h3>Class</h3>
<p>Class is the collection of Objects</p>
<p>Class is not a real world entity; It is just a template or blueprint or prototype</p>
<p>Class DOSN'T occupy Memory</p>
<h4>Syntax</h4>
```
access_modifiers Class ClassName {
	methods,
	constructors,
	fileds,
	blocks,
	nested Class,
}
```
<p>access_modifiers: default, public, private, protected
<h4>Real World Example:<h4>
<p>Animals, Birds, Vehicles</p>
<h3>Object and Methods</h3>
<h4>Object</h4>
<p>Object is an instance of class</p>
<p>Object is real world entity</p>
<p>Object occupies memory</p>
<h5>Consists Of<h5>
<p>Indentity: Name</p>
<p>State and Attributes: Color, Age</p>
<p>Behavior: Run, Eat, Sleep</p>
<h5>Create Object</h5>
<p>Declaration(Animal buzo;), Instantiation(buzo=new), Initialization(buzo=new Animal();)</p>
<p>new=> NewKeyword obj1 = new NewKeyword();</p>
<p>newInstance=>
    ClassName object = ClassName.class.newInstance();  
or
ClassName object = (ClassName) Class.forName("fully qualified name of the class").newInstance();
</p>
<p>clone=>
CreateObject3 obj1 = new CreateObject3();
CreateObject3 obj2 = (CreateObject3) obj1.clone(); 
</p>
<p>factory</p>
<p>deserialization =>
String d = new String("Code Never Lie");
FileOutputStream f = new FileOutputStream("file.txt");
ObjectOutputStream oos = new ObjectOutputStream(f);
            oos.writeObject(d);
            oos.close();
            f.close();
</p>
<h4>Method Syntax</h4>
<p>access_modifiers return_type methodName(list_of_parameters){ block_code}</p>
<h3>Inheritance</h3>
<p></p>
<h3>Polymorphism</h3>
<p></p>
<h3>Encapsulation</h3>
<p></p>
<h3>Abstraction</h3>
<p></p>
</details>
