package v1ch03;

/*
 * 括号和运算符级别：
 * 在不使用括号的情况下，
 * 同一级别的运算符按照结合性方向进行先后运算，不同级别的运算符则是高级别的先行运算
 * java不使用逗号运算符

 * */
public class OperatorHierarchy {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;

        a += b += c;  // a += ( b += c)
        System.out.println(a); //6
    }
}
