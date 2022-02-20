package v1ch04;

import java.util.Date;
import java.util.GregorianCalendar;

//一个源文件只能有一个公有类，可以有任意数目的非公有类
public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

        //所有人提高工资5%
        for (Employee e : staff) {
            e.raiseSalary(5);
        }
        //打印所有人员信息
        for (Employee e : staff) {
            System.out.println("name=" + e.getName() + "," + "salary=" + e.getSalary() + "," + "hireDay="
                    + e.getHireDay());
        }

    }
}

class Employee {

    /*
      id是每个对象都有一个，静态域nextId则是不同对象共享一个。
      即使没有对象，静态域也存在，它属于类。
      静态变量一般使用的较少
      反而是静态常量使用的较多，
      如 public static final double PI = 3.14159265358979323846;
      如 System.out

    */
    private static int nextId = 1;
    private int id;

    /*
    final大多用于基本类型的实例域，或者不可变类的实例域
    所谓不可变类，即该类的任何方法都不会改变其对象，例如String
    对于可变的类的实例域，如hireDay使用则会混乱，只能代表hireDay的引用值不再变化，而不代表引用的对象不可变
     */
    private final String name; //对象创建后不再修改、无setName方法
    private double salary;
    private Date hireDay;


    /*
     * 构造器与类同名
     * 每个类可以拥有一个以上的构造器
     * 构造器的参数个数可以是0、1或者多个
     * 构造器没有返回值
     * 构造器总是伴随着new一起调用
     * */
    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        hireDay = calendar.getTime();
    }

    public int getId() {
        return id;
    }

    public void setId() {
        id = nextId;
        nextId++;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    /*
      不要编写返回引用可变对象的访问器方法
      Date类的setTime方法可以修改私有成员状态,破坏封装性,增加了修改数据的其他途径
      如果需要返回一个可变对象的引用，应该首先克隆一份再返回
      对象clone就是指存放在另一位置的对象副本。

     */
    public Date getHireDay() {
        //return hireDay;
        return (Date) hireDay.clone();
    }

    /*
      raiseSalary方法的参数：
      1.隐式参数：Employee对象，不需要出现在方法的声明中
      2.显式参数：double byPercent
      在每一个方法中，使用this表示隐式参数，可以将该方法改写。
      这样可以将实例域和局部变量区分开。

      方法不仅可以访问隐式参数的私有数据、还可以访问所属类的所有对象的私有数据：
      这叫Class-Based Access Privileges

     */
    public void raiseSalary(double byPercent) {

//        double raise = this.salary * byPercent / 100;
//        this.salary += raise;
        double raise = this.salary * byPercent / 100;
        this.salary += raise;
    }

    /*
      静态方法：不能向对象实施操作的方法，没有隐式的参数
      不能访问实例域、但可以访问自身类的静态域
      通过类名直接调用静态方法
     */

    public static int getNextId() {
        return nextId;
    }
}
