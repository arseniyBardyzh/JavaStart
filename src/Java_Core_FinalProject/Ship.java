package Java_Core_FinalProject;


import org.w3c.dom.ls.LSOutput;

import javax.swing.event.InternalFrameEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ship {

    private ArrayList<Integer> shipCoordinate = new ArrayList<>();
    private int[][] coordinateArray = new int[4][2];

    public Ship(String coordinate){
        int planeQty = coordinate.split(";").length;
        int[] positionX = new int[planeQty];
        int[] positionY = new int[planeQty];
        for(int i=0;i<positionX.length;i++){
            positionX[i] = Integer.parseInt(coordinate.split(";")[i].split(",")[0]);
            positionY[i] = Integer.parseInt(coordinate.split(";")[i].split(",")[1]);
        }
        if(!checkPosition(positionX,positionY)){
            System.out.println("Некорректные координаты корабля");
        }else{
            for (int i=0;i<positionX.length;i++){
                coordinateArray[i][0] = positionX[i];
                coordinateArray[i][1] = positionY[i];
            }
            for (int i=0; i<positionX.length*2;i++){
                if(i%2==1){
                    shipCoordinate.add(positionY[i/2]);
                }else{
                    shipCoordinate.add(positionX[i/2]);
                }
            }
        }

    }

    public int[][] getCoordinateArray() {
        return coordinateArray;
    }

    public static boolean checkPosition(int[] positionX, int[] positionY){

        for(int i=0;i<positionX.length;i++){
            if(positionX[i]>10||positionX[i]<1||positionY[i]>10||positionY[i]<1){
                return false;
            }
        }

        int[] sortPositionY = sortArray(positionY);
        int[] sortPositionX = sortArray(positionX);

        if(sortPositionY.length==1){
            return true;
        }
        if((sortPositionX[0]!=sortPositionX[1])&&(sortPositionY[0]!=sortPositionY[1])){
            return false;
        }
        else if(sortPositionX[0]==sortPositionX[1]){
            int constNum = sortPositionX[0];
            for(int i=0;i<sortPositionX.length;i++){
                if(sortPositionX[i]!=constNum){
                    return false;
                }
            }
            if (sortPositionY[0]+1 == sortPositionY[1]){
                for(int i=0;i<sortPositionY.length-1;i++){
                    if(sortPositionY[i]+1!=sortPositionY[i+1]){
                        return false;
                    }
                }
            } else if (sortPositionY[0]-1 == sortPositionY[1]){
                for(int i=0;i<sortPositionY.length-1;i++){
                    if(sortPositionY[i]-1!=sortPositionY[i+1]){
                        return false;
                    }
                }
            }else{
                return false;
            }
        }else if(sortPositionY[0]==sortPositionY[1]){
            int constNum = sortPositionY[0];
            for(int i=0;i<sortPositionY.length;i++){
                if(sortPositionY[i]!=constNum){
                    return false;
                }
            }
            if (sortPositionX[0]+1 == sortPositionX[1]){
                for(int i=0;i<sortPositionX.length-1;i++){
                    if(sortPositionX[i]+1!=sortPositionX[i+1]){
                        return false;
                    }
                }
            } else if (sortPositionX[0]-1 == sortPositionX[1]){
                for(int i=0;i<sortPositionX.length-1;i++){
                    if(sortPositionX[i]-1!=sortPositionX[i+1]){
                        return false;
                    }
                }
            }else{
                return false;
            }
        }
        return true;
    }

    public String getAllCoordinate(){return shipCoordinate.toString();}

    public List<Integer> getAllCoordinateList(){return shipCoordinate;}

    public int[] getPositionX(){
        int[] position = new int[shipCoordinate.size()/2];
        for (int i=0; i<shipCoordinate.size();i++){
            if(i%2==0){
                position[i/2] = shipCoordinate.get(i);
            }/*else{
                shipCoordinate.add(positionX[i/2]);
            }*/
        }
        return position;
    }

    public int[] getPositionY(){
        int[] position = new int[shipCoordinate.size()/2];
        for (int i=0; i<shipCoordinate.size();i++){
            if(i%2==1){
                position[i/2] = shipCoordinate.get(i);
            }/*else{
                shipCoordinate.add(positionX[i/2]);
            }*/
        }
        return position;
    }

    public void shootToShip(){

    }

    public static int[] sortArray(int[] inputArray){
        for(int i = inputArray.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( inputArray[j] > inputArray[j+1] ){
                    int tmp = inputArray[j];
                    inputArray[j] = inputArray[j+1];
                    inputArray[j+1] = tmp;
                }
            }
        }
        return inputArray;
    }

    public static boolean checkInputShipData(String inputStream, int planeQty){
        try{
            int planeQtyCheck = inputStream.split(";").length;

            int[] positionX = new int[planeQtyCheck];
            int[] positionY = new int[planeQtyCheck];
            for (int i = 0; i < positionX.length; i++) {
                positionX[i] = Integer.parseInt(inputStream.split(";")[i].split(",")[0]);
                positionY[i] = Integer.parseInt(inputStream.split(";")[i].split(",")[1]);
            }
            if(!checkPosition(positionX,positionY)){
                return false;
            }else{
                /*if((4*planeQty)-1==inputStream.length()){
                    return true;
                }else{
                    return false;
                }*/
                return true;
            }
        }catch (Exception e){
            System.out.println("Некорректные координаты корабля");
            return false;
        }
    }

    public static int[][] getCoordinate(String inpStream){
        int planeQty = 1;

        for(int i=0;i<inpStream.length();i++){
            if(inpStream.charAt(i)==';'){
                planeQty+=1;
            }
        }
        int[][] outputCoordinate = new int[4][2];
        for(int i=0;i<planeQty;i++){
            outputCoordinate[i][0] = Integer.parseInt(inpStream.split(";")[i].split(",")[0]);
        }
        for(int i=0;i<planeQty;i++){
            outputCoordinate[i][1] = Integer.parseInt(inpStream.split(";")[i].split(",")[1]);
        }
        return outputCoordinate;
    }

    public void setShootResult(String inputStream){
        int coordinateX = Integer.parseInt(inputStream.split(",")[0]);
        int coordinateY = Integer.parseInt(inputStream.split(",")[1]);

        for (int i=0;i<4;i++){
            if(coordinateArray[i][0]==coordinateX
            && coordinateArray[i][1]==coordinateY){
                coordinateArray[i][0]=0;
                coordinateArray[i][1]=0;
            }
        }
    }
}
