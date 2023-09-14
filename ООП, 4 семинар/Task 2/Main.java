public class Main {
    public static void Main(String[] args) {
        PrintArray printArray = new PrintArray();

        String[] StringArray = {"Hi", "Universe"};
        Integer[] IntegerArray = {5, 15, 25, 35};

        printArray.ArrayPrint(StringArray);
        printArray.ArrayPrint(IntegerArray);
    }
}