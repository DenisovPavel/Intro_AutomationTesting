package Composite;

import java.util.ArrayList;
import java.util.List;

public class Team {
    List<Developer> listDevelopers = new ArrayList<>();// Список команды;

    /**
     *
     * @params addDeveloper - Добавить разработчика в проект, в список команды;
     */
    public void addDeveloper(Developer developer) {
        System.out.println( developer.toString() + " added to project" );
        listDevelopers.add(developer);
    }
    /**
     *
     * @params removeDeveloper - убрать разработчика из проекта, убрать из списка команды;
     */
    public void removeDeveloper(Developer developer) {
        System.out.println( developer.toString() + " removed from project" );
        listDevelopers.remove(developer);
    }
    /**
     *
     * @params createProject - создание проекта, команды- команда начинает работу;
     */
    public String createProject() {
      String process = "Team begin project....";
        for (Developer developer : listDevelopers) {
            developer.createCode();
        }
        return process;
    }
    /**
     *
     * @params getSize() - указывает размер списка сотрудников;
     */
    public int getSize(){
        return listDevelopers.size();
    }
}
