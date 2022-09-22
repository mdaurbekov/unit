import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsChecker {
    private String string = "";
    private Set<String> set;

    public WordsChecker(String string) {
        this.string = string;
        set = new HashSet<>(List.of(this.string.split("\\P{IsAlphabetic}+")));

    }

    public boolean hasWord(String word) {


        return this.set.contains(word);
    }
}
