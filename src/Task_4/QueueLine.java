package Task_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueLine {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("poem.txt"));
            String line = reader.readLine();
            while (line != null) {
                queue.add(line);

                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        printQueueTimed(queue);
    }

    private static void printQueueTimed(Queue<String> queue) {
        Random random = new Random();

        while (queue.size() != 0) {
            int waitTime = random.nextInt(3) + 1;

            try {
                Thread.sleep(waitTime * 1000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

            System.out.println(queue.poll());
        }
    }
}