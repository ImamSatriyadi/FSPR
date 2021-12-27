package Sesi_10;

import java.util.List;

public class JavaReadXmlSaEx {
    public static void main(String[] args) {

        MyRunner runner = new MyRunner();
        List<User> lines = runner.parseUsers();

        lines.forEach(System.out::println);
    }
}
