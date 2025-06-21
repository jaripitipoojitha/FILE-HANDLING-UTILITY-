import java.io.*;
import java.util.Scanner;

public class FileUtility {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- FILE HANDLING UTILITY ---");
            System.out.println("1. Create and Write to File");
            System.out.println("2. Read File");
            System.out.println("3. Modify File");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // displaying  newline

            switch (choice) {
                case 1:
                    writeFile();
                    break;
                case 2:
                    readFile();
                    break;
                case 3:
                    appendToFile();
                    break;
                case 4:
                    System.out.println("Exiting... Thank you!");
                    return;
                default:
                    System.out.println("Invalid option! Try again.");
            }
        }
    }

    // create a file to write
    public static void writeFile() {
        try {
            System.out.print("Enter file name (with .txt): ");
            String fileName = scanner.nextLine();
            System.out.println("Enter content to write:");
            String content = scanner.nextLine();

            FileWriter writer = new FileWriter(fileName);
            writer.write(content);
            writer.close();

            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }
    }

    //  Readig content from the file
    public static void readFile() {
        try {
            System.out.print("Enter file name to read (with .txt): ");
            String fileName = scanner.nextLine();

            File file = new File(fileName);
            Scanner fileReader = new Scanner(file);

            System.out.println("\n--- File Content ---");
            while (fileReader.hasNextLine()) {
                System.out.println(fileReader.nextLine());
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");}
        }
    

    // Append text to an existing file
    public static void appendToFile() {
        try {
            System.out.print("Enter file name to modify (with .txt): ");;
            String fileName = scanner.nextLine();

            File file = new File(fileName);
            if (!file.exists()) {
              System.out.println("File does not exists.cannot append:");  
               return;
            }

            System.out.println("Enter text to append:");
            String newText = scanner.nextLine();

            FileWriter fw = new FileWriter(fileName, true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.newLine();// Add a new line before appending
            bw.write(newText);
            bw.close();

            System.out.println("Text appended successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while appendtoFile:") ;
       }     
                       
            
        }       
