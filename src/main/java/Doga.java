import java.util.Scanner;

public class Doga {
    public static void main(String[] args) {
        String logo = "+=================================+\n"
                + "|   _____                         |\n"
                + "|  |  __ \\                        |\n"
                + "|  | |  | |  ___    __ _   __ _   |\n"
                + "|  | |  | | / _ \\  / _` | / _` |  |\n"
                + "|  | |__| || (_) || (_| || (_| |  |\n"
                + "|  |_____/  \\___/  \\__, | \\__,_|  |\n"
                + "|                   __/ |         |\n"
                + "|                  |___/          |\n"
                + "+=================================+\n";
        System.out.println(logo);
        System.out.println(" Hello! I'm Doga");
        System.out.println(" What can I do for you?\n");


        // Accept user input
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();  // Just waits for user input before exiting
        System.out.println(command);

        System.out.println("____________________________________________________________");
        System.out.println(" Bye. Hope to see you again soon!");
        System.out.println("____________________________________________________________");

        scanner.close();
    }
}











