package Student;
import java.util.Scanner;
public class Student {
    public String name;
    public int age;
    public String group;


    public Student(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ім'я: ");
        String name = scanner.nextLine();

        System.out.print("Введіть вік: ");
        int age = scanner.nextInt();

        System.out.print("Введіть групу: ");
        String group = scanner.next();

    }
}
