import java.io.*;

public class Main {
    public static void main(String[] args) {
        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";

        try (
                BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.replace(" ", "-"));
                writer.newLine();
            }
            System.out.println("File was copied to " + outputFilePath);
        } catch (IOException e) {
            System.err.println("An error occurred while copying the file: " + e.getMessage());
        }
    }
}
