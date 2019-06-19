package mateacademy.homework.homework_11;

public class Main {
    public static String getCallerClassAndMethodName() {
        StackTraceElement[] stackTraceElements = new Exception().getStackTrace();
        try {
            return stackTraceElements[2].getClassName()
                    + " > "
                    + stackTraceElements[2].getMethodName();
        } catch (ArrayIndexOutOfBoundsException e) {
            return null;
        }
    }

    private static void call() {

        System.out.println(getCallerClassAndMethodName());
    }

    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        call();
    }
}
