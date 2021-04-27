
class FixingExceptions {

    public static void calculateSquare(int[] array, int index) {
        // write your code here

        if (array == null) {
            System.out.println("Exception!");
        } else if (index < array.length && index >= 0) {
            System.out.println(array[index] * array[index]);
        } else {
            System.out.println("Exception!");
        }

    }
}