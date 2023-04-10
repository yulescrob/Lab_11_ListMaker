import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) {

        boolean done = false;
        final String menu = "A - Add D - Delete P - Print Q - Quit";
        String cmd = "";
        Scanner console = new Scanner(System.in);


        do {
            //display list
            displayList();
            //display menu options
            //get menu choice
            cmd = SafeInput.getRegExString(console,menu,"[AaDdPpQq]");
            cmd = cmd.toUpperCase();
            //execute the choice
            switch (cmd)
            {
                case "A":
                    //prompt the user for a list item
                    //make sure it is not an empty string using method
                    //add it to the list
                    break;
                case "D":
                    //prompt user for number of item to delete
                    //translate the number to an index by subtracting 1
                    //remove item from the list
                    break;
                case "P":

                    break;
                case "Q":
                    System.exit(0);
                    break;

            }
            System.out.println("cmd is " + cmd);


        }
        while (!done);

    }

    private static void displayList() {
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        if (list.size() != 0) {
            for (int i = 0; i < list.size(); i++) {
                System.out.printf("%3d%40s", i + 1, list.get(i)); //for index based 1
            }
        }
        else
            System.out.println("++++          List is empty           ++++");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
    }
}