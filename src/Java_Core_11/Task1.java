package Java_Core_11;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        Courier courier1 = new Courier(warehouse1, "Василий");
        Picker picker1 = new Picker(warehouse1, "Фёдор");

       System.out.println( "Количество заказов  |"+
                            "Доход               |"+
                            "ЗП Сборщика         |"+
                            "ЗП Курьера          |\n");

        for(int i = 0;i<1520;i++){
            picker1.doWork();
            courier1.doWork();


            System.out.printf("%s", warehouse1);
            System.out.printf("%s", picker1);
            System.out.printf("%s", courier1);
            System.out.println();

        }

        Warehouse warehouse2 = new Warehouse();
        Courier courier2 = new Courier(warehouse2,"Андрей");
        Picker picker2 = new Picker(warehouse2, "Виктор");

        picker2.doWork();
        courier2.doWork();

        System.out.println( "Количество заказов  |"+
                "Доход               |"+
                "ЗП Сборщика         |"+
                "ЗП Курьера          |\n");

        System.out.printf("%s", warehouse2);
        System.out.printf("%s", picker2);
        System.out.printf("%s", courier2);
        System.out.println();
    }


}
