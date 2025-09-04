package lesson2.methods;

public class Methods {
    public static String getCallingMethodName() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}