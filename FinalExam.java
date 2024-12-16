import java.util.Stack;

public class FinalExam {

    // Creature class to store name and power level
    static class Creature {
        String name;
        int power;

        // Constructors to initialize a creatures' name and power level
        Creature(String name, int power) {
            this.name = name;
            this.power = power;
        }

        @Override
        public String toString() {
            return name + " - " + power;
        }
    }

    // Bubble Sort: Sort in Descending Order (Power Level)
    public static void bubbleSortDescending(Creature[] creatures) {
        int n = creatures.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (creatures[j].power < creatures[j + 1].power) {
                    // Swap creatures
                    Creature temp = creatures[j];
                    creatures[j] = creatures[j + 1];
                    creatures[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort: Sort in Ascending Order (Power Level)
    public static void selectionSortAscending(Creature[] creatures) {
        int n = creatures.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (creatures[j].power < creatures[minIndex].power) {
                    minIndex = j;
                }
            }
            // Swap creatures
            Creature temp = creatures[minIndex];
            creatures[minIndex] = creatures[i];
            creatures[i] = temp;
        }
    }

    // Stack Implementation: Push and Pop Creatures
    public static void stackImplementation(Creature[] creatures) {
        Stack<Creature> stack = new Stack<>();

        // Push creatures onto the stack
        for (Creature creature : creatures) {
            stack.push(creature);
        }

        // Pop and display
        System.out.println("\n*** Stack Implementation: Popping Creatures ***");
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }
    }

    public static void main(String[] args) {
        // Initial data: List of creatures and their power levels
        Creature[] creatures = {
            new Creature("Dragon", 95),
            new Creature("Phoenix", 92),
            new Creature("Griffin", 88),
            new Creature("Centaur", 85),
            new Creature("Unicorn", 78)
        };


        // Bubble Sort: Descending Order
        bubbleSortDescending(creatures);
        System.out.println("\n*** Bubble Sort: Descending Order by Power Level ***");
        for (Creature creature : creatures) {
            System.out.println(creature);
        }

        // Selection Sort: Ascending Order
        selectionSortAscending(creatures);
        System.out.println("\n*** Selection Sort: Ascending Order by Power Level ***");
        for (Creature creature : creatures) {
            System.out.println(creature);
        }

        // Stack Implementation
        selectionSortAscending(creatures); // Ensure descending order for stack
        stackImplementation(creatures);
    }
}