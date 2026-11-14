public class Linear_Search_1 {

    public static int Linear(int marks[]) {
        int key = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int marks[] = { 22, 44, 66, 77, 88 };
        int index = Linear(marks);
        if (index == -1) {
            System.out.print("Key not found");
        } else
            System.out.print("The Key was found at index " + index);
    }
}
