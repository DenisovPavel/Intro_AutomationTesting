package Composite;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


class TeamTest {
    Team teamProject = new Team();
    ProjectMembersChecker pmChecker = new ProjectMembersChecker();
    JavaDeveloper javaDeveloper;
    JavaDeveloper javaDeveloper2;
    PythonDeveloper pythonDeveloper;
    PythonDeveloper pythonDeveloper2;

    @BeforeEach
    void setUp() {
        javaDeveloper = new JavaDeveloper();
        javaDeveloper2 = new JavaDeveloper();
        pythonDeveloper = new PythonDeveloper();
        pythonDeveloper2 = new PythonDeveloper();

    }

    @Test
    @DisplayName("Test add developer to Team")
    void addDeveloperTest() {
        teamProject.addDeveloper(javaDeveloper);
        assertNotNull(teamProject);
    }

    @Test
    @DisplayName("Test remove developer to Team")
    void removeDeveloperTest() {
        teamProject.addDeveloper(javaDeveloper);
        teamProject.removeDeveloper(javaDeveloper);
        assertEquals(0, teamProject.getSize());
    }

    @Test
    @DisplayName("Test create Team project")
    void createProjectTest() {
        String expected = "Team begin project....";
        teamProject.addDeveloper(javaDeveloper);
        teamProject.addDeveloper(pythonDeveloper);
        teamProject.createProject();
        assertEquals(expected, teamProject.createProject());
    }

    @Test
    @DisplayName("Test Teams length")
    void checkLengthTeam() {
        teamProject.addDeveloper(javaDeveloper);
        teamProject.addDeveloper(javaDeveloper2);
        teamProject.addDeveloper(pythonDeveloper);
        teamProject.addDeveloper(pythonDeveloper2);
        System.out.println(teamProject.getSize());
        assertFalse(teamProject.getSize() == 5);
    }

    @Test
    @DisplayName("Test Teams length- empty")
    void checkLengthTeamMemberChecker() {
        Team teamProjectNew = new Team();
        int actual = pmChecker.findNumberInList(teamProjectNew);
        assertEquals(teamProjectNew.getSize(), actual);
    }
    @Test
    @DisplayName("Test Teams length not empty")
    void checkLengthTeamMemberCheckerTwo() {
        teamProject.addDeveloper(javaDeveloper);
        teamProject.addDeveloper(javaDeveloper2);
        int actual = pmChecker.findNumberInList(teamProject);
        assertEquals(teamProject.getSize(), actual);
    }

}