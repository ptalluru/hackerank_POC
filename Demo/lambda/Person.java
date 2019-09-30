package lambda;
import java.time.LocalDate;
import java.util.List;

public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public int getAge() {
		return 0;
        // ...
    }

    public void printPerson() {
        // ...
    }

	public static List<Person> createRoster() {
		// TODO Auto-generated method stub
		return null;
	}

	public Sex getGender() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getEmailAddress() {
		// TODO Auto-generated method stub
		return null;
	}
}