package Task_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NewFiles {
    public static void main(String[] args) {
        List<StringBuilder> paragraphs = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("poem.txt"));
            String line = reader.readLine();
            while (line != null) {
                StringBuilder sb = new StringBuilder();

                while (line != null && !line.equals("")) {
                    sb.append(line).append("\n");
                    line = reader.readLine();
                }
                paragraphs.add(sb);
                if (line != null)
                    line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < paragraphs.size(); i++) {
            try (FileWriter fw = new FileWriter("part" + (i + 1) + ".txt", true)) {
                fw.append(paragraphs.get(i).toString());
                fw.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}