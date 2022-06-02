package structure.adapter.firstex.adapter;

import structure.adapter.firstex.round.RoundPeg;
import structure.adapter.firstex.square.SquarePeg;

// RoundAdapter는 RoundPeg의 타입이면서 필드로는 변환할 요소를 가지고있다.
// 후에 변환할 요소 Adaptee를 Adapter를 통해서 Target(RoundPeg)화 시킨다.
public class RoundAdapter extends RoundPeg {
    private SquarePeg squarePeg;

    public RoundAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public double getRadius() {
        return Math.sqrt(Math.pow(((double) this.squarePeg.getWidth() / 2), 2) * 2);
    }
}
