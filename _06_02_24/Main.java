package _06_02_24;

import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "";
        String outputPath = "";

        try {
            System.out.println("/byte");
            FileInputStream fileStream = new FileInputStream(path);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileStream);
            byte[] myByte = bufferedInputStream.readAllBytes();
            for (int i = 0; i < myByte.length; i++) {
                System.out.print(Character.toChars(myByte[i]));
            }

            System.out.println("/character");
            FileReader reader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputPath));
            String line = bufferedReader.readLine();

            while(line != null){
                System.out.println(line);
                line = bufferedReader.readLine();
                bufferedWriter.newLine();
            }
            bufferedReader.close();
            bufferedWriter.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
