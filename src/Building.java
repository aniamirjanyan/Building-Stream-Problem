import java.util.List;

public class Building {
    private int number;
    private List<Person> residents;

    public Building(int number, List<Person> residents) {
        this.number = number;
        this.residents = residents;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Person> getResidents() {
        return residents;
    }

    public void setResidents(List<Person> residents) {
        this.residents = residents;
    }

    @Override
    public String toString() {
        return "Building{" +
                "number=" + number +
                ", residents=" + residents +
                '}';
    }
}
