package TaskTwo;

public class Main {

    public static void main(String[] args) {
        Cirkel cirkel1 = new Cirkel();

        try {
            cirkel1.setRadius(-3);
        } catch (Exception e) {
            System.out.println(e);
        }
        cirkel1.doAreal();

    }
}
