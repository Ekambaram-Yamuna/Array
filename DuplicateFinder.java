package Array;
import java.util.Scanner;

public class DuplicateFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        boolean[] visited = new boolean[n];

        // Step 2: Take array elements input
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Step 3: Find duplicates using nested loop
        System.out.print("Duplicate elements: ");
        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;   //If visited[i] is true, skip the current number (already processed)

            boolean isDuplicate = false;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;  // if it match - Mark visited[j] = true so it's skipped in the future.
                    isDuplicate = true;
                }
            }
            if (isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }

        scanner.close();
    }
}
