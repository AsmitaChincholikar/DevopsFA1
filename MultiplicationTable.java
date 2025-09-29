public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 7; // Number for which multiplication table is printed
        for(int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
