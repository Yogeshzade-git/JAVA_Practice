package Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationEx {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("obj.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Employee emp =(Employee)ois.readObject();

            emp.displayDetails();
            System.out.println(emp);
        }catch(IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
