import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;


public class Main {

    private static List<Person> generateClients() {
        ArrayList<Person> list = new ArrayList<>();

        list.add(new Person("Иван", "Иванович", 1));
        list.add(new Person("Петр", "Степаныч", 3));
        list.add(new Person("Князь", "Олегович", 1));
        list.add(new Person("Змей", "Горыныч", 5));
        list.add(new Person("Алеша", "Попович", 2));

        return list;

    }

    public static void main(String[] args) {

        Deque<Person> deque = new ArrayDeque<>();
        for (Person person : generateClients()) {
            deque.offer(person);
        }

        while (!deque.isEmpty()) {
            Person person = deque.removeFirst();
            System.out.println(person + " прокатился на аттракционе");
            person.decTickets();
            if (person.getTickets() > 0) {
                deque.addLast(person);
            }
        }


    }
}
