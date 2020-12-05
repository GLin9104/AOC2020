import java.io.*;
import java.util.*;
public class AOC5{
    public static void main(String[]args){
        int o = 30;
        int highest = 0;
        int row = 0;
        int column = 0;
        int temp = 0;
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        while(!StdIn.isEmpty()){
            String x = StdIn.readString();
            x = x.replace('F', '0').replace('B', '1').replace('R', '1').replace('L', '0');
            row = Integer.parseInt(x.substring(0,7), 2);
            column = Integer.parseInt(x.substring(7,10), 2);
            temp = row * 8 + column;
            if (temp > highest)
                highest = temp;
            arraylist.add(temp);
        }
        int [] newarray = new int[highest+1];
        for (int i : arraylist)
            newarray[i] = 1;
        for (int i = 1; i < highest; i++){
            if (newarray[i] == 0 && newarray[i-1] == 1 && newarray[i+1]== 1)
            System.out.println(i);
        }
        System.out.println(highest);
    }
}