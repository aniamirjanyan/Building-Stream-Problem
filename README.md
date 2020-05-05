# Building-Stream-Problem

This code contains multiple Stream Operations.

1. List of people who are older than 60.
```
List<Person> list = listOfBuildings.stream()                      
    .map(Building::getResidents)
    .flatMap(Collection::stream)
    .filter(a -> a.getAge() >= 60)
    .collect(Collectors.toList());
```

2. The person with minimum age.
```
Optional<Person> list1 = list.stream()                           
    .min(Comparator.comparingInt(Person::getAge));
```

3. Sorting by age.
```
List<Person> avgList = listOfBuildings.stream()                   
    .map(Building::getResidents)
    .flatMap(Collection::stream)
    .sorted(Comparator.comparingInt(Person::getAge))
    .collect(Collectors.toList());
```

4. Counting amount of elements in the nested list.
```
long amountList = listOfBuildings.stream()                        
    .map(Building::getResidents)
    .mapToLong(Collection::size)
    .sum();
```
