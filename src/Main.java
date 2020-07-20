public class Main {

    public static void main(String[] args) {
        Comparable [] forme = { new Rectangle(3,2),new Cercle(17)};
        for (Comparable f:forme){
            System.out.println(f.toString());
        }
    }
}
