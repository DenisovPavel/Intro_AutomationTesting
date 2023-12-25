package Composite;

// Composite (Компоновщик)
// Группирует несколько объектов в древовидную структуру используя один класс.
// Позволяет работать с несколькими классами через один объект, в данном случае обьект класса TEAM.
public class BaseProject {
    public static void main(String[] args) {
        Team projectTeam = new Team(); // команда разработчиков в проекте Java;

        Developer developerJavaFirst = new JavaDeveloper(); // Первый Джава разработчик в проекте;
        Developer developerJavaSecond = new JavaDeveloper();// Второй Джава разработчик в проекте;
        Developer developerPythonFirst = new PythonDeveloper(); // Первый Пайтон разработчик в проекте;
        Developer developerPythonSecond = new PythonDeveloper(); // Второй Пайтон разработчик в проекте;

        projectTeam.addDeveloper(developerJavaFirst);// Добавили Первого Джава разработчика в проект;
        projectTeam.addDeveloper(developerJavaSecond); // Добавили Второго Джава разработчика в проект;
        projectTeam.addDeveloper(developerPythonFirst); // Добавили  Первого Пайтон разработчик в проект;
        projectTeam.addDeveloper(developerPythonSecond);// Добавили  Второго Пайтон разработчик в проект;

        System.out.println(projectTeam.createProject()); // Метод который заставляет разработчиков писать код;

        System.out.println("===================");// Пропуск для удобства
        ProjectMembersChecker pMChecker = new ProjectMembersChecker(); // Создали чекера;
        System.out.println("The number of Developers is: " + pMChecker.findNumberInList(projectTeam));
        // Посчитали количество учатников в команде;
        projectTeam.removeDeveloper(developerJavaFirst); // Убрали из команды Первого Джава разработчика;
        System.out.println("The number of Developers is: " + pMChecker.findNumberInList(projectTeam));
        // Посчитали еще раз количество учатников в команде;


    }

}



