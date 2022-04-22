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










