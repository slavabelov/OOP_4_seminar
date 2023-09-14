public class PrintArray {
    public <T> void ArrayPrint(T[] register) {
        for (T items : register) {
            System.out.println(items);
        }
    }
}