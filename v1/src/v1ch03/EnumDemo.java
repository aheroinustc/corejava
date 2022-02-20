package v1ch03;

/*
 * 变量的取值只在有限的集合内，可以使用自定义的枚举类型
 * */
public class EnumDemo {
    enum Size {
        SMALL,
        MEDIUM,
        LARGE,
        EXTRA_LARGE
    }

    ;

    public static void main(String[] args) {
        Size size = null;
        size = Size.MEDIUM; //size存储枚举值或者null值

        System.out.println(size);

    }
}
