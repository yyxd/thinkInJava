package serialize;

import java.io.*;

/**
 * Created by Diane on 2019-05-09.
 * Goal: 序列化与反序列化
 * try-with-resource 不用显示的关闭文件，Java7 新特性中的语法糖
 */
public class SerializableDemo1 {
    public static void main(String[] args) {
        User1 user = new User1();
        user.setName("Diane");
        user.setAge(23);
        System.out.println(user);

        //write obj to file
        try (FileOutputStream fos = new FileOutputStream("tempFile"); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //read obj from file
        File file = new File("tempFile");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            User1 newUser1 = (User1) ois.readObject();
            System.out.println(newUser1);
        }catch (IOException|ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
