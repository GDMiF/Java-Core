import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main61 {
    public static void main(String[] args) {

        String filePath = "words.txt";
        ArrayList<String> words = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = reader.readLine()) != null){
                words.add(line.trim());
            }
        }catch(FileNotFoundException e){
            System.out.println("Could not fing file");
        }
        catch(IOException e){
            System.out.println("Something went wrong");
        }

        Random random = new Random();

        String word = words.get(random.nextInt(words.size()));

        Scanner scanner = new Scanner(System.in);

        ArrayList<Character> gameWord = new ArrayList<>();
        int wrongGuess = 0;

        for(int i = 0; i < word.length(); i++){
            gameWord.add('_');
        }

        System.out.println("*******************");
        System.out.println("Welcome to HangMan!");
        System.out.println("*******************");

        while(wrongGuess < 6){

            System.out.print("Word: ");
            for(char c : gameWord){
                System.out.print(c + " ");
            }
            System.out.println();

            System.out.print("Guess a letter: ");
            char guess = scanner.nextLine().toLowerCase().charAt(0);

            if(word.indexOf(guess) >= 0){
                System.out.println("Correct guess");

                for(int i = 0; i < word.length(); i++){
                    if(word.charAt(i) == guess){
                        gameWord.set(i, guess);
                    }
                }
                if(!gameWord.contains('_')){
                    System.out.println("You Win");
                    System.out.println("The word was " + word);
                    break;
                }

            }else {
                System.out.println("Wrong guess");
                wrongGuess ++;
                System.out.println(gameArt(wrongGuess));
            }

        }
        System.out.println("Game Over!");
        System.out.println("The word was " + word);
        System.out.println(gameArt(wrongGuess));


        scanner.close();
    }

    static String gameArt(int wrongGuess){
        return switch(wrongGuess){
            case 0 -> """
                       
                        
                        
                      """;
            case 1 -> """
                       O 
                       
                        
                      """;
            case 2 -> """
                       o 
                       |                       
                        
                      """;
            case 3 -> """
                       o
                      /| 
                        
                      """;
            case 4 -> """
                       o 
                      /|\\                       
                       
                      """;
            case 5 -> """
                       o 
                      /|\\   
                      / 
                      """;
            case 6 -> """
                       o 
                      /|\\   
                      / \\  
                      """;
            default -> "";
        };
    }

}
