public class AOC3{
    public static void main(String[]args){
        int a = 0;
        int total = 0;
        char z = '#';
        while (!StdIn.isEmpty()){
            String y = StdIn.readString();
            if (y.charAt(a) == z){
                total++;
            } 
            a +=1;
            if (a >= y.length()){
                a = a - y.length();
            }
            if (!StdIn.isEmpty()){
                y = StdIn.readString();
            }
        }
        System.out.println(total);
    }
}