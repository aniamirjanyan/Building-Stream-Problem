import java.util.*;
import java.util.stream.Collectors;

public class Inhabit {

    public static void main(String[] args) {

        Building building1 = new CreatingPeople().createBuilding1();
        Building building2 = new CreatingPeople().createBuilding2();
        Building building3 = new CreatingPeople().createBuilding3();

        List<Building> listOfBuildings = new ArrayList<>();
        listOfBuildings.add(building1);
        listOfBuildings.add(building2);
        listOfBuildings.add(building3);

        List<Person> list = listOfBuildings.stream()                      // older than 60
                .map(Building::getResidents)
                .flatMap(Collection::stream)
                .filter(a -> a.getAge() >= 60)
                .collect(Collectors.toList());

        System.out.println(list);

        Optional<Person> list1 = list.stream()                            // minimum
                .min(Comparator.comparingInt(Person::getAge));

        System.out.println(list1);

        List<Person> avgList = listOfBuildings.stream()                   // sorting
                .map(Building::getResidents)
                .flatMap(Collection::stream)
                .sorted(Comparator.comparingInt(Person::getAge))
                .collect(Collectors.toList());

        System.out.println(avgList);

        long amountList = listOfBuildings.stream()                        // amount of elements
                .map(Building::getResidents)
                .mapToLong(Collection::size)
                .sum();

        System.out.println(amountList);

    }
}

