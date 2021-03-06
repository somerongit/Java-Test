
# Java Practice Examples (Check Commits)
<p>
<img src="https://raw.githubusercontent.com/somerongit/somerongit/main/img/java-gif.gif">
<img src="https://raw.githubusercontent.com/somerongit/somerongit/main/img/java%20refernce.gif">
</p>

### [Java Regex](https://www.adevguide.com/java-regular-expressions-regex/)
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
<h4>Constructor</h4>
<p>Constructor name should be same as Class name
</p>
<p>Can not have any Return Type</p>
<h3>Inheritance</h3>
<p>It is inheriting the properties of parent 
class into child class</p>
<p>Inheritance is the procedure by which
one object acquires all the properties
 and behaviors of a parent object</p>
 <p>Private, Constructor this 2 property never inherited into Chlid calss from the Parents class</p>
<h4>Types</h4>
<img src="https://raw.githubusercontent.com/somerongit/somerongit/main/img/java/types_of_inheritance.png">
<h3>Polymorphism</h3>

<img src="https://raw.githubusercontent.com/somerongit/somerongit/main/img/java/poly_java.jpg" wdith="50"><img src="https://raw.githubusercontent.com/somerongit/somerongit/main/img/java/poly2_java.png" wdith="50" >
<h3>Encapsulation</h3>
<img src="https://raw.githubusercontent.com/somerongit/somerongit/main/img/java/encapsulation_java.png">
<img src="https://raw.githubusercontent.com/somerongit/somerongit/main/img/java/abstract_interface_java.png">
<h3>Abstraction</h3>
<img src='https://raw.githubusercontent.com/somerongit/somerongit/main/img/java/abstract2_java.png'>
</details>

## [Algorithms](https://github.com/TheAlgorithms/Java)
## [Cheat Sheet](https://github.com/in28minutes/java-cheat-sheet)
	
<!-- ghttps://github.com/ABSphreak/readme-jokesg -->
	
![Jokes Card](https://readme-jokes.vercel.app/api?theme=buefy)
	
