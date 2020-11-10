import org.w3c.dom.ls.LSOutput;

public class FirstDay {
    public static void main(String[] args) {

        System.out.println("Первое задание");

        int i = 0;

        while(i<10){
            if (i<9){
                System.out.printf("JAVA ");
            }else{
                System.out.printf("JAVA");
            }
            i++;
        }
        System.out.println("");
        System.out.println("Конец Первого задания");


        System.out.println("Второе задание");

        for(i=0;i<10;i++){
            if (i<9){
                System.out.printf("JAVA ");
            }else{
                System.out.printf("JAVA");
            }
        }
        System.out.println("");
        System.out.println("Конец Второго задания");


        System.out.println("Третье задание");

        for(i=0;i<10;i++){
            System.out.println("JAVA ");
        }
        System.out.println("");
        System.out.println("Конец Третьего задания");


        System.out.println("Четвертое задание");

        int year = 1980;
        while(year<=2020){
            System.out.printf("Олимпиада %d года \n", year);
            year+=4;
        }
        System.out.println("");
        System.out.println("Конец Четвертого задания");


        System.out.println("Пятое задание");

        for(year = 1980;year<=2020;year+=4){
            System.out.printf("Олимпиада %d года \n", year);
        }
        System.out.println("");
        System.out.println("Конец Пятого задания");


        System.out.println("Шестое задание");

        int x = 5;
        int result;

        for(i=1;i<=9;i++){
            result = x*i;
            System.out.printf("%d x %d = %d \n", i, x, result);
        }
        System.out.println("");
        System.out.println("Конец Шестого задания");
    }
}
