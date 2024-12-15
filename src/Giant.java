// Giant class implementation
import java.awt.*;
import java.util.Random;


public class Giant extends Critter {
    private static final String[] STATES = {"fee", "fie", "foe", "fum"};
    private int moveCount;

    public Giant() {
        moveCount = 0;
    }

    public Color getColor() {
        return Color.GRAY;
    }

    public String toString() {
        return STATES[(moveCount / 6) % STATES.length];
    }

    public Action getMove(CritterInfo info) {
        moveCount++;
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.EMPTY) {
            return Action.HOP;
        } else {
            return Action.RIGHT;
        }
    }
}