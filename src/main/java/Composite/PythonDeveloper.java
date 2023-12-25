package Composite;

public class PythonDeveloper implements Developer {
    @Override
    public void createCode() {
        System.out.println("PythonDeveloper write code..");
    }
    @Override
    public String toString() {
        return "PythonDeveloper";
    }
}
