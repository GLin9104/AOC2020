import java.io.*; 
import java.util.*; 
public class AOC{
    public static void main(String[]args){
        ArrayList<Integer> cars = new ArrayList<Integer>();
        while (!StdIn.isEmpty()){
            cars.add(StdIn.readInt());
        }
        for (int i = 0; i < cars.size(); i++){
            for (int j = 0; j < cars.size(); j++){
                for (int k = 0; k < cars.size(); k++){
                    if (cars.get(i) + cars.get(j) + cars.get(k) == 2020){
                        System.out.println(cars.get(i) * cars.get(j) * cars.get(k));
                    }
                }
            }
        }
    }
}