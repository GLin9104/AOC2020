import java.io.*;
public class AOC2{
    public static void main(String[]args){
        int total = 0;
        while (!StdIn.isEmpty()){
            int count = 0;
            String idk = StdIn.readString();
            String[] parts = idk.split("-", 2);
            int part1 = Integer.parseInt(parts[0]);
            int part2 = Integer.parseInt(parts[1]);
            String ree = StdIn.readString();
            char x = ree.charAt(0);
            String bop = StdIn.readString();
            if (bop.charAt(part1 -1) == x) {
                    count++;
            }
            if (bop.charAt(part2 -1) == x) {
                    count++;
            }
            if (count == 1){
                total++;
            }
        }
        System.out.println(total);
    }
    /*public static void main(String[]args){
        int total = 0;
        while (!StdIn.isEmpty()){
            int count = 0;
            String idk = StdIn.readString();
            String[] parts = idk.split("-", 2);
            int min = Integer.parseInt(parts[0]);
            int max = Integer.parseInt(parts[1]);
            String ree = StdIn.readString();
            char x = ree.charAt(0);
            String bop = StdIn.readString();
            for (int i = 0; i < bop.length(); i++) {
                if (bop.charAt(i) == x) {
                    count++;
                }
            }
            if (count >= min && count <= max){
                total++;
            }
        }
        System.out.println(total);
    }*/
}