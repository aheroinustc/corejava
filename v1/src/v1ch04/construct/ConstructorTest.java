package v1ch04.construct;

import java.util.*;

/**
 * This program demonstrates object construction.
 *
 * @author Cay Horstmann
 * @version 1.01 2004-02-19
 */
public class ConstructorTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Harry", 40000);
        staff[1] = new Employee(60000);
        staff[2] = new Employee();

        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ",id=" + e.getId() +
                    ",salary="
                    + e.getSalary());
    }
}


class Employee {

    private static int nextId;

    private int id;
    private String name = ""; //实例域初始化
    private double salary;

    //静态初始化块
    static {
        Random generator = new Random();
        // set nextId to a random number between 0 and 9999
        nextId = generator.nextInt(10000);
    }

    //对象初始化块
    {
        id = nextId;
        nextId++;
    }

    //三个重载的构造器
    public Employee(String n, double s) {
        name = n;
        salary = s;
    }

    public Employee(double s) {
        this("Employee #" + nextId, s);
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
}
