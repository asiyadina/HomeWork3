package javaException.HomeWork3;
public class DataException {
    public DateException() {
    }

    public void dataException(String i) {
        System.out.println("исключение: DateNotCorrectFormat");
        System.out.printf("не правильный формат: %s", i);
        System.out.println();
    }
}
