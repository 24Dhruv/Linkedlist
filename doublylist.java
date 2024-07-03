
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> doublyList = new LinkedList<>();
        doublyList.add(1);
        doublyList.add(2);
        doublyList.add(3);
        doublyList.add(4);
        doublyList.add(5);

        // Find the middle index
        int middleIndex = sc.nextInt();

        // Insert the element in the middle
        doublyList.add(middleIndex, 6);

        // Print the doubly linked list
        System.out.println("Doubly Linked List after adding element in the middle:");
        for (int i = 0; i < doublyList.size(); i++) {
            System.out.print(doublyList.get(i) + " ");
        }
    }
