package serialize;

import java.io.*;

/**
 * Created by Diane on 2019-05-09.
 * Goal: 实现Serializable 接口
 */
public class User2 implements Externalizable {

    private String name;
    private String email;
    private int age;

    public User2(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public User2() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User2{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

    //
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeObject(email);
        out.writeInt(age);
    }

    // 按照写的顺序读对象
    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        email = (String) in.readObject();
        age = in.readInt();
    }
}
