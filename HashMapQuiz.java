import java.util.HashMap; //Creation of Hashmap class

public class HashMapQuiz
{
    public static void main(String[] args) //application entry
    {
        HashMap < String , Integer > student = new HashMap < String, Integer>(); //Hashmap object called student
        student.put("Jacob",30209); //adding keys that are names and value is student id
        student.put("Samual",90301);
        student.put("Angela", 12333);
        for(String i : student.keySet()) //creation of for each loop
        {
         System.out.println("key: " + i + ", value : " + student.get(i));
        }
    }

}
