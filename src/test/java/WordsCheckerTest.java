import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class WordsCheckerTest {

        WordsChecker wordsChecker = new WordsChecker("Тестовая строка для проверки работы теста");
        Person person = new Person("Ivan", "Васильевич", 4);

    @Test
    void checkWord() {
        assertThat(wordsChecker.hasWord("строка")).isTrue();
    }
    @Test
    void checkTicket() {
        assertThat(person.getTickets()).isEqualTo(4);
    }

    @Test
    void checkTicketWhenDec() {
        person.decTickets();
        assertThat(person.getTickets()).isEqualTo(3);
    }

}