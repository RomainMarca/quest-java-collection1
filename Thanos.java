import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
        ArrayList<Hero> heros = new ArrayList<>();

        // TODO 2 : Add those heroes to the list
        // name: Black Widow, age: 34
        // name: Captain America, age: 100
        // name: Vision, age: 3
        // name: Iron Man, age: 48
        // name: Scarlet Witch, age: 29
        // name: Thor, age: 1500
        // name: Spider-Man, age: 18
        // name: Hulk, age: 49
        // name: Doctor Strange, age: 42

        heros.add(new Hero("Black Widow", 34));
        heros.add(new Hero("Captain America", 100));
        heros.add(new Hero("Vision", 3));
        heros.add(new Hero("Iron Man", 48));
        heros.add(new Hero("Scarlet Witch", 29));
        heros.add(new Hero("Thor", 1500));
        heros.add(new Hero("Hulk", 49));
        heros.add(new Hero("Doctor Strange", 42));

        // TODO 3 : It's Thor birthday, now he's 1501

        for (Hero heroes : heros) {
            if (heroes.getName().equals("thor")) {
                heroes.setAge(1501);
            }

        }
        // TODO 4 : Shuffle the heroes list

        Collections.shuffle(heros);

        // TODO 5 : Keep only the half of the list

        List<Hero> heros2 = heros.subList(0, heros.size() / 2);

        // TODO 6 : Loop throught the list and display the name of the remaining heroes

        for (Hero heroos : heros2) {
            System.out.println(heroos.getName());
        }
    }
}