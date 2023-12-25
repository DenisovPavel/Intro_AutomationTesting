package Composite;

public class JavaDeveloper implements Developer {
    @Override
    public void createCode() {
        System.out.println("JavaDeveloper write code..");

    }
    @Override
    public String toString() {
        return "JavaDeveloper";
    }
}
