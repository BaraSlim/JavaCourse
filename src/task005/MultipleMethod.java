package task005;

public class MultipleMethod {
    public static void multipleMethod(int number, int i) {
        if (i < 10) {
            ++i;
            System.out.println(i + " x " + number + " = " + number * i);
            multipleMethod(number, i);
        }
    }
}
