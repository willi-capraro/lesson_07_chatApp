import java.util.Scanner;
public class ChatApp {

    private static final int MAX_CHAT_ENTRIES = 9999999;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input;
        int arrayCount = 0;

        String[] chatArray;
        chatArray = new String[MAX_CHAT_ENTRIES];
        do{
            System.out.print("--> ");
            input = s.nextLine();
            chatArray[arrayCount] = input;
            arrayCount = arrayCount + 1;
            clearScreen();
            for (int i = 0; i < arrayCount; i++) {
                System.out.println("[Wilhelm]: " + chatArray[i]);

            }

        } while(!input.contentEquals("stop"));


    }

    private static void clearScreen() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("");
        }
    }
}
