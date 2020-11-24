public class Test {
    public static void main(String[] args) {


        System.out.println(getCountsOfDigits(50));
    }

    public static int getCountsOfDigits(int number) {
        int count = (number == 0) ? 1 : 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}
