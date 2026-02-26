import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main58 {
    public static void main(String[] args) {

        String filePath = "C:\\Users\\user\\Desktop\\test.txt";
        String textContent = "Subject of Ymir My name is Eren Yeager";

        try(FileWriter writer = new FileWriter(filePath)){
            writer.write(textContent);
            System.out.println("File has been written");
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file location");
        }
        catch(IOException e){
            System.out.println("Could not write file");
        }

    }
}
