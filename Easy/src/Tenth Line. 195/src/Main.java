import java.io.*;

public class Main {
    public static void main(String[] args) {
        String filePath = "file.txt"; // Попробуйте относительный путь
        System.out.println("Текущая рабочая директория: " + System.getProperty("user.dir"));

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineCount = 0;

            while ((line = br.readLine()) != null && lineCount < 10) {
                System.out.println(line);
                lineCount++;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Файл не найден: " + e.getMessage(), e);
        } catch (IOException e) {
            throw new RuntimeException("Ошибка ввода-вывода: " + e.getMessage(), e);
        }
    }
}
