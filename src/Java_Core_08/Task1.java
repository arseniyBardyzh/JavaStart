package Java_Core_08;

public class Task1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        String str = "";
        for(int i =0; i<=20000;i++){
            str+= i + " ";
        }

        System.out.println(str);

        long finish = System.currentTimeMillis();

        long timeConsumedMillis = finish - start;


        long startStringBuilder = System.currentTimeMillis();

        StringBuilder strBuilder  = new StringBuilder("");

        for(int i = 0; i<=20000;i++){
            strBuilder.append(" ");
            strBuilder.append(i);
        }

        System.out.println(strBuilder);

        long finishStringBuilder = System.currentTimeMillis();

        long timeConsumedMillisStringBuilder = finishStringBuilder - startStringBuilder;

        System.out.println(timeConsumedMillis);
        System.out.println(timeConsumedMillisStringBuilder);


    }
}
