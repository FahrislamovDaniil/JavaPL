package Task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        List<Animal> animalList = new ArrayList<>();
        int count;
        int dogCount = 0;
        int houseCatCount = 0;
        int parrotCount = 0;
        int penguinCount = 0;
        int tigerCount = 0;

        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 0:
                    count = random.nextInt(4 - 1) + 1;
                    while (count > 0) {
                        animalList.add(new Dog("Собака " + count));
                        count--;
                    }
                    break;
                case 1:
                    count = random.nextInt(4 - 1) + 1;
                    while (count > 0) {
                        animalList.add(new HouseCat("Домашний кот " + count));
                        count--;
                    }
                    break;
                case 2:
                    count = random.nextInt(4 - 1) + 1;
                    while (count > 0) {
                        animalList.add(new Parrot("Попугай " + count));
                        count--;
                    }
                    break;
                case 3:
                    count = random.nextInt(4 - 1) + 1;
                    while (count > 0) {
                        animalList.add(new Penguin("Пингвин " + count));
                        count--;
                    }
                    break;
                case 4:
                    count = random.nextInt(4 - 1) + 1;
                    while (count > 0) {
                        animalList.add(new Tiger("Тигр " + count));
                        count--;
                    }
                    break;
            }
        }

        for (int i = 0; i < animalList.size(); i++) {
            int dist = random.nextInt(1001 - 1) + 1;
            Animal current = animalList.get(i);
            current.run(dist);
            current.swim(dist);

            if (current instanceof Dog)
                dogCount++;
            else if (current instanceof HouseCat)
                houseCatCount++;
            else if (current instanceof Parrot)
                parrotCount++;
            else if (current instanceof Penguin)
                penguinCount++;
            else if (current instanceof Tiger)
                tigerCount++;
        }

        System.out.println("Всего животных: " + animalList.size());
        System.out.println("Всего собак: " + dogCount);
        System.out.println("Всего домашних кошек: " + houseCatCount);
        System.out.println("Всего попугаев: " + parrotCount);
        System.out.println("Всего пингвинов: " + penguinCount);
        System.out.println("Всего тигров: " + tigerCount);
    }
}