package Java_Core_09;

public class TestFigure {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };

        System.out.printf("Площадь красных фигур равна %.2f\n",calculateRedArea(figures));
        System.out.printf("Периметр красных фигур равен %.2f\n",calculateRedPerimeter(figures));

    }



        public static double calculateRedPerimeter(Figure[] figures){
            double perimeterSum = 0;
            for(int i=0;i<figures.length;i++){
                if(figures[i].getColor()=="Red"){
                    perimeterSum += figures[i].perimeter();
                }
            }
            return perimeterSum;
        }

        public static double calculateRedArea(Figure[] figures){
            double areaSum = 0;
            for(int i=0;i<figures.length;i++){
                if(figures[i].getColor()=="Red"){
                    areaSum += figures[i].area();
                }
            }
            return areaSum;
        }

}
