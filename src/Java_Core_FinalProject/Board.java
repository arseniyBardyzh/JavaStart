package Java_Core_FinalProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Board {

    private List<Ship> userShips = new ArrayList<>();
    private int[][] busyPlace = new int[12][12];
    private int[][] shipOnMap = new int[10][10];
    private String inputStream = "";
    private boolean inputFlag = false;
    private boolean shipCreateFlag = false;
    private String fourPlaneText = "четырехпалубного";
    private String planeFormat = "x,y;x,y;x,y;x,y";
    private String threePlaneText = "трехпалубного";
    private String twoPlaneText = "двухпалубного";
    private String onePlaneText = "однопалубного";


    public Board(){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++){
            if (i==0){
                while(!inputFlag){
                    System.out.printf("Введите координаты %s корабля (формат: %s)\n",fourPlaneText, planeFormat);
                    inputStream = sc.nextLine();
                    if(Ship.checkInputShipData(inputStream,4) && isBusyPlace(inputStream)) {
                        Ship ship = new Ship(inputStream);
                        this.addBusyPlace(ship);
                        this.addShipOnMapPlace(ship);
                        userShips.add(ship);
                        this.getBusyPlaceString();
                        inputFlag = true;
                    }
                }
                inputFlag = false;
            }else if(i<3){
                while(!inputFlag) {
                    System.out.printf("Введите координаты %s корабля (формат: %s)\n",threePlaneText, planeFormat.substring(0,11));
                    inputStream = sc.nextLine();
                    if(Ship.checkInputShipData(inputStream,3) && isBusyPlace(inputStream)){
                        Ship ship = new Ship(inputStream);
                        this.addBusyPlace(ship);
                        this.addShipOnMapPlace(ship);
                        userShips.add(ship);
                        this.getBusyPlaceString();
                        inputFlag = true;
                    }
                }
                inputFlag = false;
            }else if(i<6){
                while(!inputFlag) {
                    System.out.printf("Введите координаты %s корабля (формат: %s)\n",twoPlaneText, planeFormat.substring(0,7));
                    inputStream = sc.nextLine();
                    if(Ship.checkInputShipData(inputStream,2) && isBusyPlace(inputStream)){
                        Ship ship = new Ship(inputStream);
                        this.addBusyPlace(ship);
                        this.addShipOnMapPlace(ship);
                        userShips.add(ship);
                        this.getBusyPlaceString();
                        inputFlag = true;
                    }
                }
                inputFlag = false;
            }
            else{
                while(!inputFlag) {
                    System.out.printf("Введите координаты %s корабля (формат: %s)\n",onePlaneText, planeFormat.substring(0,3));
                    inputStream = sc.nextLine();
                    if(Ship.checkInputShipData(inputStream,1) && isBusyPlace(inputStream)){
                        Ship ship = new Ship(inputStream);
                        this.addBusyPlace(ship);
                        this.addShipOnMapPlace(ship);
                        userShips.add(ship);
                        this.getBusyPlaceString();
                        inputFlag = true;
                    }
                }
                inputFlag = false;
            }
        }
    }

    public List<Ship> getUserShips() {
        return userShips;
    }

    public String getBusyPlaceString() {
        StringBuilder str = new StringBuilder();
        for(int i=0; i<busyPlace.length;i++){
            for(int j=0;j<busyPlace[i].length;j++){
                str.append(busyPlace[j][i]);
                str.append(", ");
            }
            str.append("\n");
        }
        return str.toString();
    }

    public int[][] getBusyPlace() {
        return busyPlace;
    }

    public void getBoard(){
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                System.out.printf("\u25FB");
            }
            System.out.println("");
        }
    }
    public void addShip(Ship ship){
        //Проверка свободных мест на доске

        //Добавление корабля на поле
        userShips.add(ship);
    }

    public void addShipOnMapPlace(Ship ship) {
        int[] positionX = new int[ship.getAllCoordinateList().size()/2];
        int[] positionY = new int[ship.getAllCoordinateList().size()/2];
        for (int i=0; i<ship.getAllCoordinateList().size();i++){
            if(i%2==1){
                positionY[i/2] = ship.getAllCoordinateList().get(i);
            }else{
                positionX[i/2] = ship.getAllCoordinateList().get(i);
            }
        }
        if(positionX.length==1){
            //Однопалубные корабли
            shipOnMap[positionX[0]-1][positionY[0]-1]=1;
        }else{
            if(positionX[0] == positionX[1]) {
                for (int i = 0; i < positionX.length; i++) {
                    shipOnMap[positionX[i]-1][positionY[i]-1] = 1;
                }
            }else{
                for (int i = 0; i < positionY.length; i++) {
                    shipOnMap[positionX[i]-1][positionY[i]-1] = 1;
                }
            }
        }
    }

    public void addSinkArea(Ship ship){
        int[] positionX = new int[ship.getAllCoordinateList().size()/2];
        int[] positionY = new int[ship.getAllCoordinateList().size()/2];
        for (int i=0; i<ship.getAllCoordinateList().size();i++){
            if(i%2==1){
                positionY[i/2] = ship.getAllCoordinateList().get(i);
            }else{
                positionX[i/2] = ship.getAllCoordinateList().get(i);
            }
        }
        if(positionX.length==1){
            //Однопалубные корабли
            isPlaceLast(positionX[0],positionY[0]);
        }else{
            if(positionX[0] == positionX[1]) {
                for (int i = 0; i < positionX.length; i++) {
                    isPlaceLast(positionX[i],positionY[i]);
                }
            }else{
                for (int i = 0; i < positionY.length; i++) {
                    isPlaceLast(positionX[i],positionY[i]);
                }
            }
        }
    }

    public void isPlaceLast(int x, int y){
        if(x==10 && y==10){
            shipOnMap[x-2][y-2] = 3;
            shipOnMap[x-2][y-1] = 3;
            shipOnMap[x-1][y-2] = 3;
            shipOnMap[x-1][y-1] = 2;
        }else if(x==10 && (y!=10 || y!=1)){
            shipOnMap[x-2][y-2] = 3;
            shipOnMap[x-2][y-1] = 3;
            shipOnMap[x-2][y] = 3;
            shipOnMap[x-1][y-2] = 3;
            shipOnMap[x-1][y-1] = 2;
            shipOnMap[x-1][y] = 3;
        }else if(x==10 && y==1){
            shipOnMap[x-2][y-1] = 3;
            shipOnMap[x-2][y] = 3;
            shipOnMap[x-1][y-1] = 2;
            shipOnMap[x-1][y] = 3;
        }else if(x==1 && y==1){
            shipOnMap[x-1][y-1] = 2;
            shipOnMap[x-1][y] = 3;
            shipOnMap[x][y-1] = 3;
            shipOnMap[x][y] = 3;
        }else if(x==1 && (y!=1 || y!= 10)){
            shipOnMap[x-1][y-2] = 3;
            shipOnMap[x-1][y-1] = 2;
            shipOnMap[x-1][y] = 3;
            shipOnMap[x][y-2] = 3;
            shipOnMap[x][y-1] = 3;
            shipOnMap[x][y] = 3;
        }else if(x==1 && y==1){
            shipOnMap[x-1][y-1] = 2;
            shipOnMap[x-1][y] = 3;
            shipOnMap[x][y-1] = 3;
            shipOnMap[x][y] = 3;
        }else if((x!=10 || x!= 1) && y==1){
            shipOnMap[x-2][y-1] = 3;
            shipOnMap[x-2][y] = 3;
            shipOnMap[x-1][y-1] = 2;
            shipOnMap[x-1][y] = 3;
            shipOnMap[x][y-1] = 3;
            shipOnMap[x][y] = 3;
        }else if((x!=10 || x!=1) && y==10){
            shipOnMap[x-2][y-2] = 3;
            shipOnMap[x-2][y-1] = 3;
            shipOnMap[x-1][y-2] = 3;
            shipOnMap[x-1][y-1] = 2;
            shipOnMap[x][y-2] = 3;
            shipOnMap[x][y-1] = 3;
        }else{
            shipOnMap[x-2][y-2] = 3;
            shipOnMap[x-2][y-1] = 3;
            shipOnMap[x-2][y] = 3;
            shipOnMap[x-1][y-2] = 3;
            shipOnMap[x-1][y-1] = 2;
            shipOnMap[x-1][y] = 3;
            shipOnMap[x][y-2] = 3;
            shipOnMap[x][y-1] = 3;
            shipOnMap[x][y] = 3;
        }
    }

    public void addBusyPlace(Ship ship){
        int[] positionX = new int[ship.getAllCoordinateList().size()/2];
        int[] positionY = new int[ship.getAllCoordinateList().size()/2];
        for (int i=0; i<ship.getAllCoordinateList().size();i++){
            if(i%2==1){
                positionY[i/2] = ship.getAllCoordinateList().get(i);
            }else{
                positionX[i/2] = ship.getAllCoordinateList().get(i);
            }
        }
        if(positionX.length==1){
            //Однопалубные корабли
            busyPlace[positionX[0]-1][positionY[0]-1]=1;
            busyPlace[positionX[0]][positionY[0]-1]=1;
            busyPlace[positionX[0]+1][positionY[0]-1]=1;
            busyPlace[positionX[0]-1][positionY[0]]=1;
            busyPlace[positionX[0]][positionY[0]]=1;
            busyPlace[positionX[0]+1][positionY[0]]=1;
            busyPlace[positionX[0]-1][positionY[0]+1]=1;
            busyPlace[positionX[0]][positionY[0]+1]=1;
            busyPlace[positionX[0]+1][positionY[0]+1]=1;
        }else{
            if(positionX[0] == positionX[1]) {
                for (int i = -1; i < positionX.length + 1; i++) {
                    if (i == -1){
                        busyPlace[positionX[i+1]-1][positionY[i+1]-1] = 1;
                        busyPlace[positionX[i+1]][positionY[i+1]-1] = 1;
                        busyPlace[positionX[i+1]+1][positionY[i+1]-1] = 1;
                    } else if (i == positionX.length ) {
                        busyPlace[positionX[i-1]-1][positionY[i-1]+1] = 1;
                        busyPlace[positionX[i-1]][positionY[i-1]+1] = 1;
                        busyPlace[positionX[i-1]+1][positionY[i-1]+1] = 1;
                    } else {
                        busyPlace[positionX[i]-1][positionY[i]] = 1;
                        busyPlace[positionX[i]][positionY[i]] = 1;
                        busyPlace[positionX[i]+1][positionY[i]] = 1;
                    }
                }
            }else{
                for (int i = -1; i < positionY.length + 1; i++) {
                    if (i == -1){
                        busyPlace[positionX[i+1]-1][positionY[i+1]-1] = 1;
                        busyPlace[positionX[i+1]-1][positionY[i+1]] = 1;
                        busyPlace[positionX[i+1]-1][positionY[i+1]+1] = 1;
                    } else if (i == positionX.length) {
                        busyPlace[positionX[i-1]+1][positionY[i-1]-1] = 1;
                        busyPlace[positionX[i-1]+1][positionY[i-1]] = 1;
                        busyPlace[positionX[i-1]+1][positionY[i-1]+1] = 1;
                    } else {
                        busyPlace[positionX[i]][positionY[i]-1] = 1;
                        busyPlace[positionX[i]][positionY[i]] = 1;
                        busyPlace[positionX[i]][positionY[i]+1] = 1;
                    }
                }
            }
        }

    }

    public boolean isBusyPlace(String inputStream){
        int[][] coordinate = new int[4][2];
        coordinate = Ship.getCoordinate(inputStream);
        for(int i=0;i<4;i++){
            if(coordinate[i][0]!=0 && coordinate[i][1]!=0){
                if(this.getBusyPlace()[coordinate[i][0]][coordinate[i][1]]==1){
                    System.out.println("Вокруг\n" +
                            "корабля должна быть область шириной в одну клетку, в\n" +
                            "которой не может быть других кораблей (ореол\n" +
                            "корабля)");
                    return false;
                }
            }
        }
        return true;
    }

    public String getBoardImage(){
        StringBuilder str = new StringBuilder();
        for(int i=0; i<shipOnMap.length;i++){
            for(int j=0;j<shipOnMap[i].length;j++){
                if(shipOnMap[j][i] == 1){
                    str.append("\uD83D\uDEE5");
                }else if(shipOnMap[j][i] == 2){
                    str.append("\uD83D\uDFE5");
                }else if(shipOnMap[j][i] == 3){
                    str.append("\uD83D\uDFE6");
                }else{
                    str.append("\u25FC");
                }
            }
            str.append("\n");
        }
        return str.toString();
    }

    public String getAnonymousBoardImage(){
        StringBuilder str = new StringBuilder();
        for(int i=0; i<shipOnMap.length;i++){
            for(int j=0;j<shipOnMap[i].length;j++){
                if(shipOnMap[j][i] == 1){
                    str.append("\u25FC");
                }else if(shipOnMap[j][i] == 2){
                    str.append("\uD83D\uDFE5");
                }else if(shipOnMap[j][i] == 3){
                    str.append("\uD83D\uDFE6");
                }else{
                    str.append("\u25FC");
                }
            }
            str.append("\n");
        }
        return str.toString();
    }

    public boolean isHitWithoutShout(String inputString){
        try{
            int positionX = Integer.parseInt(inputString.split(",")[0]);
            int positionY = Integer.parseInt(inputString.split(",")[1]);
            if(shipOnMap[positionX-1][positionY-1] == 1){
                return true;
            }else{
                return false;
            }
        }catch (Exception e){
            System.out.println("Вы ввели некорректные координаты выстрела");
            return true;
        }

    }

    public boolean isHit(String inputString){
        try {
            int positionX = Integer.parseInt(inputString.split(",")[0]);
            int positionY = Integer.parseInt(inputString.split(",")[1]);
            if(shipOnMap[positionX-1][positionY-1] == 1){
                shipOnMap[positionX-1][positionY-1] = 2;
                return true;
            }else{
                shipOnMap[positionX-1][positionY-1] = 3;
                return false;
            }
        }catch (Exception e){
            return false;
        }

    }

    public boolean isSink(String inputString){
        int positionX = Integer.parseInt(inputString.split(",")[0]);
        int positionY = Integer.parseInt(inputString.split(",")[1]);
        int count = 0;
        int currentI = 0;

        for(int i=0;i<userShips.size();i++){
            for(int k=0;k<userShips.get(i).getCoordinateArray().length;k++){
                if(positionX == userShips.get(i).getCoordinateArray()[k][0] &&
                        positionY == userShips.get(i).getCoordinateArray()[k][1]){
                    userShips.get(i).setShootResult(inputString);
                    currentI = i;
                    for(int x=0;x<4;x++){
                        if (userShips.get(i).getCoordinateArray()[x][0] == 0 &&
                                userShips.get(i).getCoordinateArray()[x][1] == 0){
                            count+=1;
                        }
                    }
                }
            }
        }

        System.out.println("isSink count: " + count);
        if(count==4){
            addSinkArea(userShips.get(currentI));
            return true;
        }else{
            return false;
        }
    }

    public boolean isBoardEmpty (){
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(shipOnMap[i][j]==1){
                    return false;
                }
            }
        }
        return true;
    }

    public static void clearBoard(){
        for(int i=0; i<30;i++){
            for(int j=0;j<70;j++){
                System.out.printf("=");
            }
            System.out.println("");
        }
    }

}
