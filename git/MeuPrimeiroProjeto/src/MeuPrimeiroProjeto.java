import java.util.ArrayList;
import java.util.List;

public class MeuPrimeiroProjeto {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        int i = 0;
        while(i < 5) {
            User actual = new User("Renata", "Liborio");
            User actual2 = new User("Maria", "Silva");
            User actual3 = new User("Joana", "Antunes");
            users.add(actual);
            users.add(actual2);
            users.add(actual3);
            i++;
        }

        System.out.println(users.get(0).getFirstName());
        System.out.println(users.get(1).getFirstName());
        System.out.println(users.get(2).getFirstName());
        System.out.println(users.get(3).getLastName());
        System.out.println(users.get(4).getLastName());
        System.out.println(users.get(5).getLastName());
    }
}
