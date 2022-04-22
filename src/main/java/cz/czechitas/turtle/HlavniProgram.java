package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.Turtle;

import javax.swing.*;
import java.awt.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();
        Color sedaBarva;
        sedaBarva = new Color(140,140,140);

        Color modraBarva;
        modraBarva = new Color(70,70,140);

        //zmrzlina//
        zofka.setLocation(150.0, 200.0);
        zofka.turnRight(30.0);
        nakresliRovnostrannyTrojuhelnik(zofka, 100.0);
        zofka.setLocation(80.0, 230.0);
        zofka.turnLeft(90.0);
        nakresliKolecko(zofka, 11.0);


        // zofka.setLocation(150.0, 350.0);
        // zofka.turnLeft(30.0);
        // nakresliCtverec(zofka, 100.0);

        //snehulak//
        zofka.setLocation(350.0, 350.0);
        zofka.turnRight(160.0);
        nakresliKolecko(zofka, 16.0);
        zofka.setLocation(350.0, 235.0);
        nakresliKolecko(zofka, 12.0);
        zofka.setLocation(350.0, 138.0);
        nakresliKolecko(zofka, 10.0);
        zofka.setLocation(270.0, 260.0);
        nakresliKolecko(zofka, 4.0);
        zofka.setLocation(425.0, 260.0);
        nakresliKolecko(zofka, 4.0);

        //masinka//
        zofka.setLocation(800.0, 400.0);
        zofka.turnLeft(10.0);
        nakresliObdelnik(zofka, 100.0, 200.0, sedaBarva);
        zofka.turnRight(90.0);
        nakresliObdelnik(zofka, 100.0, 200.0, sedaBarva);
        zofka.setPenColor(modraBarva);
        zofka.setLocation(900.0, 400.0);
        nakresliKolecko(zofka, 10.0);
        zofka.setLocation(760.0, 425.0);
        nakresliKolecko(zofka, 5.0);
        zofka.setLocation(680.0, 425.0);
        nakresliKolecko(zofka, 5.0);
        zofka.setLocation(600.0, 420.0);
        zofka.turnLeft(60.0);
        nakresliRovnostrannyTrojuhelnik(zofka, 100.0);


    }

    private void nakresliKolecko(Turtle zofka, double polomer) {
        nakresliMnohouhelnik(zofka, polomer, 30.0);

    }


    private void nakresliMnohouhelnik(Turtle zofka, double polomer, double pocetStran) {
        double uhel = 360.0 / pocetStran;
        for (int i = 0; i < pocetStran; i++) {
            zofka.move(polomer);
            zofka.turnRight(uhel);
        }
    }


    private void nakresliObdelnik(Turtle zofka, double delkaStranyA, double delkaStranyB, Color barvaCary) {
        zofka.setPenColor(barvaCary);
        for (int i = 0; i < 2; i++) {
            zofka.turnLeft(90.0);
            zofka.move(delkaStranyA);
            zofka.turnLeft(90.0);
            zofka.move(delkaStranyB);
        }
    }


    private void nakresliCtverec(Turtle zofka, double delkaStrany) {
        for (int i = 0; i < 4; i++) {
            zofka.turnRight(90.0);
            zofka.move(delkaStrany);
        }
    }


    private void nakresliRovnostrannyTrojuhelnik(Turtle zofka, double delkaStrany) {
        for (int i = 0; i < 3; i++) {
            zofka.turnLeft(120.0);
            zofka.move(delkaStrany);
        }

    }


}










