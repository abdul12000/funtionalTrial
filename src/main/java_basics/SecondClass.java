package java_basics;

public class SecondClass {

    public Integer dividMethod(int a, int b) {
        return a / b;
    }

    Integer multiplMethod(int a, int b) {
        return a * b;
    }

    private Integer additionMethod(int a, int b) {
        return a + b;
    }

    private Integer subtractionMethod(int a, int b) {
        return a - b;
    }

    private Integer remainderMethod(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        SecondClass sc = new SecondClass();
        System.out.println("the division value is : " + sc.dividMethod(10, 2));
        System.out.println("the multiplication  value is : " + sc.multiplMethod(10, 2));
        System.out.println("the addition  value is : " + sc.additionMethod(10000, 20));
        System.out.println("the subtraction value is : " + sc.subtractionMethod(10000, 20));

        System.out.println("the modulo value is : " + sc.remainderMethod(30, 8));

    }

}
