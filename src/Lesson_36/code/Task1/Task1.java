package Lesson_36.code.Task1;

public class Task1<T,U> {
    private T one;
    private U two;

    public Task1(T one, U two) {
        this.one = one;
        this.two = two;
    }

    public T getOne() {
        return one;
    }

    public U getTwo() {
        return two;
    }

    @Override
    public String toString() {
        return "Task1{" +
                "one=" + one +
                ", two=" + two +
                '}';
    }
}
