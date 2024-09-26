import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        String newName;
        do {
            System.out.println("Give me a name or hit Enter: ");
            newName = input.nextLine();
            names.add(newName);
        } while(!newName.equals(""));
        names.remove(names.size() - 1 );

        HashMap<String, ArrayList<Integer>> hoursList = new HashMap<>();
        String[] days = {"Mon", "Tues", "Wed", "Thurs", "Fri"};
        for(String name: names){
            ArrayList<Integer> hoursForWeek = new ArrayList<>();
            for(String day: days){
                System.out.println("How many hours did " + name + " work on " + day + "?");
                hoursForWeek.add(input.nextInt());
            }
            hoursList.put(name, hoursForWeek);
        }

        System.out.println(hoursList);
    }
}