package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.Turtle;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();
        //zmrzlina//
        zofka.setLocation(150, 200);
        zofka.turnRight(30);
        nakresliRovnostrannyTrojuhelnik(zofka, 100);
        zofka.setLocation(80, 230);
        zofka.turnLeft(90);
        nakresliKolecko(zofka, 11);


        // zofka.setLocation(150, 350);
        // zofka.turnLeft(30);
        // nakresliCtverec(zofka, 100);


        //snehulak//
        zofka.setLocation(350, 350);
        zofka.turnRight(160);
        nakresliKolecko(zofka, 16);
        zofka.setLocation(350, 235);
        nakresliKolecko(zofka, 12);
        zofka.setLocation(350, 138);
        nakresliKolecko(zofka, 10);
        zofka.setLocation(270, 260);
        nakresliKolecko(zofka, 4);
        zofka.setLocation(425, 260);
        nakresliKolecko(zofka, 4);

        //masinka//
        zofka.setLocation(800, 400);
        zofka.turnLeft(10);
        nakresliObdelnik(zofka, 100, 200);
        zofka.turnRight(90);
        nakresliObdelnik(zofka, 100, 200);
        zofka.setLocation(900, 400);
        nakresliKolecko(zofka, 10);
        zofka.setLocation(760, 425);
        nakresliKolecko(zofka, 5);
        zofka.setLocation(680, 425);
        nakresliKolecko(zofka, 5);
        zofka.setLocation(600, 420);
        zofka.turnLeft(60);
        nakresliRovnostrannyTrojuhelnik(zofka, 100);

    }

    private void nakresliKolecko(Turtle zofka, double polomer) {
        nakresliMnohouhelnik(zofka, polomer, 30);

    }

    private void nakresliMnohouhelnik(Turtle zofka, double polomer, double pocetStran) {
        double uhel = 360.0 / pocetStran;
        for (int i = 0; i < pocetStran; i++) {
            zofka.move(polomer);
            zofka.turnRight(uhel);
        }
    }

    private void nakresliObdelnik(Turtle zofka, double delkaStranyA, double delkaStranyB) {
        for (int i = 0; i < 2; i++) {
            zofka.turnLeft(90);
            zofka.move(delkaStranyA);
            zofka.turnLeft(90);
            zofka.move(delkaStranyB);
        }
    }

    private void nakresliCtverec(Turtle zofka, double delkaStrany) {
        for (int i = 0; i < 4; i++) {
            zofka.turnRight(90);
            zofka.move(delkaStrany);
        }
    }

    private void nakresliRovnostrannyTrojuhelnik(Turtle zofka, double delkaStrany) {
        for (int i = 0; i < 3; i++) {
            zofka.turnLeft(120);
            zofka.move(delkaStrany);
        }

    }

}










