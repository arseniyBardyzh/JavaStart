package Java_Core_18;

public class Task2 {
    public static void main(String[] args) {

        int n = 351313;
        System.out.println(count7(787571));
    }
    public static int count7(int number){
        int count = 0;
        String s = ""+number;
        if(number%10==7){
            count=1;
        }
        if(s.length()>1){
            return count + count7(Integer.parseInt(s.substring(0,s.length()-1)));
        }else {
            return count;
        }
    }
}
