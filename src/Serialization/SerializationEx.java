package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx {
    public static void main(String[] args) throws IOException {
        Employee employee = new Employee(72, "Yogesh Zade", 22000.0, "ymzade2019@gmail.com");

        FileOutputStream fos = new FileOutputStream("obj.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(employee);
    }
}
