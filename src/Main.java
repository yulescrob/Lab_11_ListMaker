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
                    addToList(console, list);
                    break;
                case "D":
                    deleteFromList(console, list);
                    break;
                case "P":
                    printMenu(list);
                    break;
                case "Q":
                    if (SafeInput.getYNConfirm(console, "Are you sure")){
                        done =true;
                    }
                    System.exit(0); //quits
                    break;


            }
            System.out.println("cmd is " + cmd);
        }
        while (!done);
    }
    public static void addToList(Scanner in, ArrayList list){
        String objectToAdd = SafeInput.getNonZeroLenString(in, "Enter the item to add to the array list" );
        list.add(objectToAdd); //adds object to list
    }
    public static void  deleteFromList(Scanner in, ArrayList list ){
        int objectToDelete = SafeInput.getRangedInt(in, "Enter the number of the item to delete", 1, list.size());
        list.remove(objectToDelete-1); //removes object based on base 1 index
    }
    public static void printMenu(ArrayList list){
        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
    private static void displayList() {
        if (list.size() != 0) {
            for (int i = 0; i < list.size(); i++) {
                System.out.printf("%d. %s\n", i + 1, list.get(i)); //for index based 1
            }
        }
        else
            System.out.println("++++          List is empty           ++++");
        System.out.println("");
    }
}