package TaskTwo;

import static java.lang.Math.PI;

/* Skriv en klasse, der repræsenterer en cirkel med en radius som attribut og en set metode.
Hvis metoden modtager en negativ radius som parameter, skal der kastes en Exception.
Der skal være en metode til at udregne cirklens areal. */

public class Cirkel {
    private int radius;

    public void setRadius(int radius) {

        if (radius > 0) {
            this.radius = radius;
            System.out.println("Tallets radius er nu: " + this.radius);
        } else {
            System.out.println("Tallet skal være større end nul!");
            System.out.println("Cirklens radius blev ikke sat til! :" + this.radius);

        }
    }

    public void doAreal() {
        System.out.print("En cirkel på følgende radius " + this.radius + ", har følgende areal: ");
        this.radius = (int) (PI * (this.radius * 2));
        System.out.print(this.radius + ". Rundet til et helt tal");
    }
}

