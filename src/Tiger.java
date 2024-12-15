// Tiger class implementation
import java.awt.*;
import java.util.Random;


public class Tiger extends Critter {
    private static final Color[] COLORS = {Color.RED, Color.GREEN, Color.BLUE};
    private Color color;
    private int moveCount;

    public Tiger() {
        pickRandomColor();
        moveCount = 0;
    }

    private void pickRandomColor() {
        color = COLORS[new Random().nextInt(COLORS.length)];
    }

    public Color getColor() {
        if (moveCount % 3 == 0) {
            pickRandomColor();
        }
        moveCount++;
        return color;
    }

    public String toString() {
        return "TGR";
    }

    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.WALL || info.getRight() == Neighbor.WALL) {
            return Action.LEFT;
        } else if (info.getFront() == Neighbor.SAME) {
            return Action.RIGHT;
        } else {
            return Action.HOP;
        }
    }
}
