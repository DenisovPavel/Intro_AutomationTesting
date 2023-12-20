package max.home;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class DoGameTest {
    Door doorFirst;
    Door doorSecond;
    Door doorThird;
    static List<Door> doorList; // Список дверей;

    @BeforeEach
    void setUp() {
        doorList = new ArrayList<>(); //это можно сделать сразу при объявлении переменной
        doorFirst = new Door(true); // 1 дверь всегда -> Победа!
        doorSecond = new Door(false); // 2 дверь всегда -> Проигрыш!
        doorThird = new Door(false); // 3 дверь всегда -> Проигрыш!

        doorList.add(doorFirst); // index 0
        doorList.add(doorSecond); // index 1
        doorList.add(doorThird); // // index 2 - Буквально создали комнату с дверьми;
    }

    @AfterEach
    void tearDown() {
        doorList.clear(); // после каждого тесто обнуляем список дверей(комнату);
    }

    @Test
    @DisplayName("1.Gamer меняет 1 выбранную дверь на другую -> Проиграл! ")
    void checkRoundGamerLose() {
        //given
        Player gamer = new Player("Gamer1", true); // Будет менять свою дверь,при выборе true.
        Game game = new Game(gamer, doorList); // Класс для реализации игры;
        Door expected = game.round(0); // Выбрал первую дверь, затем поменял.
        //when
        //then
        Assertions.assertFalse(expected.isPrize());
        // Ожидаем в результате assertFalse -  что игрок ошибся, а мы корректно сравнили результаты.
        assertThat(expected.isPrize())
                .as("We need false door,but actual TRUE!")
                .isFalse(); // to StackTrace massage;
    }

    @Test
    @DisplayName("2.Gamer меняет 2 выбранную дверь на другую -> Победа!")
    void checkRoundGamerWin() {
        //given
        Player gamer = new Player("Gamer1", true); // Будет менять свою дверь, при выборе true.
        Game game = new Game(gamer, doorList); // Класс для реализации игры;
        Door expected = game.round(1); // Выбрал вторую дверь, затем поменял.
        //when
        //then
        Assertions.assertTrue(expected.isPrize());
        // Ожидаем в результате assertTrue - что игрок не ошибся, а мы корректно сравнили результаты.
        assertThat(expected.isPrize())
                .as("We need True door,but actual False!")
                .isTrue(); // to StackTrace massage;
    }

    @Test
    @DisplayName("3. Gamer  меняет  3 выбранную дверь на другую -> Победа!")
    void checkRoundGamerWinSecond() {
        //given
        Player gamer = new Player("Gamer1", true); // Будет менять свою дверь, при выборе true.
        Game game = new Game(gamer, doorList); // Класс для реализации игры;
        Door expected = game.round(2); // Выбрал вторую дверь, затем поменял.
        //when
        //then
        Assertions.assertTrue(expected.isPrize());
        // Ожидаем в результате assertTrue- что игрок не ошибся, а мы корректно сравнили результаты.
        assertThat(expected.isPrize())
                .as("We need True door,but actual False!")
                .isTrue(); // to StackTrace massage;
    }

    @Test
    @DisplayName("4.Gamer не меняет выбранную дверь -> Победа!")
    void checkRoundGamerWinWithOutChangingRoom() {
        //given
        Player gamer = new Player("Gamer1", false); // НЕ Будет менять свою дверь, при выборе false.
        Game game = new Game(gamer, doorList); // Класс для реализации игры;
        Door expected = game.round(0); // 1 дверь
        //when
        //then
        Assertions.assertTrue(expected.isPrize());
        // Ожидаем в результате assertFalse - что игрок не ошибся, а мы корректно сравнили результаты.
        assertThat(expected.isPrize())
                .as("We need True door,but actual False!")
                .isTrue(); // to StackTrace massage;
    }

    // Выбрал 1 не сменил дверь -> Победа!
    @Test
    @DisplayName("5.Gamer не меняет выбранную дверь -> Проигрыш!")
    // Выбрал 2 не сменил дверь -> Проиграл!
    void checkRoundGamerLoseWithOutChangingRoom() {
        //given
        Player gamer = new Player("Gamer1", false); // НЕ Будет менять свою дверь, при выборе false.
        Game game = new Game(gamer, doorList); // Класс для реализации игры;
        Door expected = game.round(1); // 2 дверь
        //when
        //then
        Assertions.assertFalse(expected.isPrize());
        // Ожидаем в результате assertFalse - что игрок  ошибся, а мы корректно сравнили результаты.
        assertThat(expected.isPrize())
                .as("We need False door,but actual True!")
                .isFalse();  // to StackTrace massage;
    }

    @Test
    @DisplayName("6.Gamer не меняет выбранную дверь -> Проигрыш!")
        // Выбрал 3 не сменил дверь -> Проиграл!
    void checkRoundGamerSecondLoseWithOutChangingRoom() {
        //given
        Player gamer = new Player("Gamer1", false); // НЕ Будет менять свою дверь, при выборе false.
        Game game = new Game(gamer, doorList); // Класс для реализации игры;
        Door expected = game.round(2); // 3 дверь
        //when
        //then
        Assertions.assertFalse(expected.isPrize());
        // Ожидаем в результате assertFalse - что игрок ошибся, а мы корректно сравнили результаты.
        assertThat(expected.isPrize())
                .as("We need False door,but actual True!")
                .isFalse(); // to StackTrace massage;
    }
}
