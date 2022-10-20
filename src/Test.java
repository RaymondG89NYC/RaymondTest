public class Test {
    public static void main(String[] args){
        int x = 10;
        int y = 11;
        int z = 12;

        System.out.println(Integer.compare(x, y));
        System.out.println(Integer.compare(x, z));
        System.out.println(Integer.compare(y, x));
        System.out.println(Integer.compare(z, x));
        System.out.println(Integer.compare(x, y-1));
    }
}
