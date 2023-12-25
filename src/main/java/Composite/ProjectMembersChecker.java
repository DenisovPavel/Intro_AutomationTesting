package Composite;

// Класс который выдает количество участников в команде.

public class ProjectMembersChecker {
    /**
     * @params findNumberInList - метод показывающий количество участников в команде.
     */
    public int findNumberInList(Team team) {
        int count = 0;
        if (team.listDevelopers.size() == 0) {
            return 0;
        } else
            for (int i = 0; i < team.listDevelopers.size(); i++) {
                count++;
            }
        return count;
    }
}
