package structure.adapter.firstex;

import structure.adapter.firstex.adapter.RoundAdapter;
import structure.adapter.firstex.round.RoundHole;
import structure.adapter.firstex.round.RoundPeg;
import structure.adapter.firstex.square.SquarePeg;

public class Main {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);

        if(hole.isFit(roundPeg)){
            System.out.println("case1 : fit " + roundPeg.getRadius());
        }

        SquarePeg squarePeg1 = new SquarePeg(7);
        SquarePeg squarePeg2 = new SquarePeg(20);

//        hole.isFit(squarePeg1);

        RoundPeg roundPegAdapter1 = new RoundAdapter(squarePeg1);
        RoundPeg roundPegAdapter2 = new RoundAdapter(squarePeg2);

        if(hole.isFit(roundPegAdapter1)){
            System.out.println("case2 : fit " + roundPegAdapter1.getRadius());
        }
        if(hole.isFit(roundPegAdapter2)){
            System.out.println("case3 : fit " + + roundPegAdapter2.getRadius());
        }
    }
}
