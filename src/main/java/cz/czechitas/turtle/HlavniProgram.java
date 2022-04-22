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

         zofka.setLocation(150, 350);
         zofka.turnLeft(30);
         nakresliCtverec(zofka, 100);



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
            zofka.turnLeft(120.0);
            zofka.move(delkaStrany);
        }

    }




}










