# FILE-HANDLING-UTILITY-  

*COMPANY* : CODETECH IT SOLUTIONS

*NAME* : JARIPITI POOJITHA

*INTERN ID* : CT04DF549

*DURATION* : 4-WEEKS

*MENTOR* : NEELA SANTOSH

*DESCRIPTION* :

The provided Java program, FileUtility, is a simple command-line utility that allows users to perform basic file handling operations such as creating and writing to a file, reading from a file, and modifying (appending) content to an existing file. It uses Java I/O classes like FileWriter, BufferedWriter, and Scanner to interact with the file system. The main method runs an infinite loop, displaying a menu with four options and taking user input to determine which operation to execute. The user is prompted to choose an option: creating a file and writing content to it, reading contents of a file, appending data to an existing file, or exiting the application.

The writeFile() method is responsible for creating a new text file and writing user input into it. It takes the file name and content as input from the user. If the file already exists, it overwrites the content. File writing is done using the FileWriter class, and the writer is closed after the operation to release resources. Error handling is provided using a try-catch block to catch IOException.

The readFile() method allows the user to read and display the contents of a specified text file. It uses a Scanner object to read the file line by line and prints it to the console. If the file does not exist, the method catches a FileNotFoundException and informs the user accordingly.

The appendToFile() method enables the user to modify an existing file by appending new text to it. It first checks whether the specified file exists. If not, it displays an error message and returns. If the file exists, it uses FileWriter in append mode (true flag) along with a BufferedWriter to add the new content. A newline is inserted before appending to ensure the content remains properly formatted. Once writing is complete, the buffer is closed, and a success message is displayed. Exception 
handling for IOException is also included 
here.
Overall, this program serves as a useful tool for beginners to understand how file 
handling works in Java. It demonstrates 
basic concepts like user input handling, 
file operations, and exception handling. 
While functional, the code can be further improved with better validation, modular design, and use of try-with-resources to manage resource cleanup automatically.

*OUTPUT* :



