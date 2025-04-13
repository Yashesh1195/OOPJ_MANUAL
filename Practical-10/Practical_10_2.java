import java.util.*;

public class Practical_10_2 {
    public static void main(String[] args) {
        // Create priority queues
        PriorityQueue<String> queue1 = new PriorityQueue<>();
        PriorityQueue<String> queue2 = new PriorityQueue<>();

        // Add elements to queue1
        Collections.addAll(queue1, "George", "Jim", "John", "Blake", "Kevin", "Michael");

        // Add elements to queue2
        Collections.addAll(queue2, "George", "Katie", "Kevin", "Michelle", "Ryan");

        // Display original queues
        System.out.println("Queue1: " + queue1);
        System.out.println("Queue2: " + queue2);

        // Union
        PriorityQueue<String> union = new PriorityQueue<>(queue1);
        union.addAll(queue2);
        System.out.println("\nUnion: " + union);

        // Difference (queue1 - queue2)
        PriorityQueue<String> difference = new PriorityQueue<>(queue1);
        difference.removeAll(queue2);
        System.out.println("Difference (queue1 - queue2): " + difference);

        // Intersection
        PriorityQueue<String> intersection = new PriorityQueue<>(queue1);
        intersection.retainAll(queue2);
        System.out.println("Intersection: " + intersection);
    }
}
