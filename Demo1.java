import java.util.*;
 
class Student{
    int rollNo;
    String name ;
}
public class Demo1 {

    
    public static void main(String[] args) {
        /*In ArrayList we add Object one by one like array we do. 
         Here list is an Interface as we know that we cant create 
         an object of Interface only we can create the object of
         that class which implements the Interface here List is 
         implemented by ArrayList*/
        List <Integer>l = new ArrayList();
     
        List l1 = new ArrayList();

        l.add(5);
        l.add(59);

        Student s1 = new Student();
        s1.rollNo=101;
        s1.name ="Avi";
        
        Student s2 = new Student();
        s2.rollNo=102;
        s2.name ="Raju";
// 1.add element in list

        l1.add(5);
        l1.add(5.9);
        l1.add(8.7f);
        l1.add("alok");
        l1.add(s1);
        l1.add(s2);

//2. printing the list         
        System.out.println("For First list where type is spacific "+l);
        System.out.println("list type not spacific "+l1);

// 3. get the element at the index 

        Object o = l1.get(4);
        System.out.println(o);

// 4.update the list

        l1.set(1,"1000");
        System.out.println("updating the list1"+l1);
        
// 5.remove element from list 
        
        l1.remove(2);
        System.out.println("Removeing element form the list1"+l1);

// 6.searching for an element 
        if(l1.contains("1000")){
            System.out.println("1000 is in the list ");
        }
        
    }
    
}
