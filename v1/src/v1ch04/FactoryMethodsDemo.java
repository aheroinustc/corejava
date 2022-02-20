package v1ch04;

import java.text.NumberFormat;

public class FactoryMethodsDemo {
    public static void main(String[] args) {

        /**
         * 静态方法的常见用途。
         * NumberFormat使用工厂方法产生不同风格的格式对象。
         */
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        NumberFormat percentFormatter = NumberFormat.getPercentInstance();
        double x = 0.1;
        System.out.println(currencyFormatter.format(x)); // prints ￥0.10
        System.out.println(percentFormatter.format(x)); // prints 10%
    }
}
