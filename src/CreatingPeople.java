import java.util.ArrayList;
import java.util.List;

public class CreatingPeople {
    // 1st list with residents of building 1, 2, 3
    public static List<Person> residents1 = new ArrayList<>();
    public static List<Person> residents2 = new ArrayList<>();
    public static List<Person> residents3 = new ArrayList<>();

    // people of building 1
    Person person1 = new Person("Ani", 8);
    Person person2 = new Person("Anna", 30);
    Person person3 = new Person("David", 50);
    Person person4 = new Person("Robert", 61);
    Person person5 = new Person("Babken", 80);
    // people of building 2
    Person person6 = new Person("Bob", 75);
    Person person7 = new Person("Ann", 24);
    Person person8 = new Person("Lilith", 66);
    Person person9 = new Person("Alice", 45);
    // people of building 3
    Person person11 = new Person("Eliot", 48);
    Person person12 = new Person("Eve", 90);
    Person person13 = new Person("Quinn", 56);
    Person person14 = new Person("Margo", 60);

    public Building createBuilding1() {
        residents1.add(person1);
        residents1.add(person2);
        residents1.add(person3);
        residents1.add(person4);
        residents1.add(person5);
        return new Building(1, CreatingPeople.residents1);
    }

    public Building createBuilding2() {
        residents2.add(person6);
        residents2.add(person7);
        residents2.add(person8);
        residents2.add(person9);
        return new Building(2, CreatingPeople.residents2);
    }

    public Building createBuilding3() {
        residents3.add(person11);
        residents3.add(person12);
        residents3.add(person13);
        residents3.add(person14);
        return new Building(3, CreatingPeople.residents3);
    }

}
