package serialize;

import java.io.*;

/**
 * Created by Diane on 2019-05-13.
 * Goal:
 */
public class ExternalizableDemo {
    public static void main(String[] args) {
        User2 user = new User2();
        user.setName("Long Deng");
        user.setAge(24);
        user.setEmail("mcpaul@qq.com");

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tempFile2"))){
            oos.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("tempFile2")))) {
            User2 newInstance = (User2)ois.readObject();
            System.out.println(newInstance);
        } catch (IOException|ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
