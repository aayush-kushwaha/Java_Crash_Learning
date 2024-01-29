public class DoWhileLoopNumber {
    public static void main(String[] args) {
        int i = 0;
        do {  // Do while Loop won't look at the condition first. It will execute the block then checks for the condition
            System.out.println(i);
            i += 1;
        } while (i < 11);
    }
}
