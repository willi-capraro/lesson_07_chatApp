import java.util.Scanner;
public class ChatApp {



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input;
        String inputName;
        String[] chatArray = new String[0];
        System.out.print("input name: ");
        inputName = s.nextLine();
        do{
            // Input new chat message
            System.out.print("--> ");
            input = s.nextLine();

            // Copy "old" (last iteration of loop) array into current + allow for one more element
            String[] oldArray = chatArray;
            chatArray = new String[oldArray.length + 1];
            chatArray[chatArray.length - 1] = input;

            // Print all chat messages
            clearScreen();
            for (int i = 0; i < chatArray.length ; i++) {
                if (i < chatArray.length - 1) {
                    chatArray[i] = oldArray[i];
                }

                System.out.println("[" + inputName + "]: "+ chatArray[i]);
            }


        } while(!input.contentEquals("stop"));


    }

    private static void clearScreen() {
        System.out.println("\r\n".repeat(25));
    }
}
