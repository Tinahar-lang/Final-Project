// NinjaCat class implementation
import java.awt.*;
import java.util.Random;


public class NinjaCat extends Critter {
    public Color getColor() {
        return Color.MAGENTA; // Custom color
    }

    public String toString() {
        return "NC"; // Custom representation
    }

    public Action getMove(CritterInfo info) {
        if (info.frontThreat()) {
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.EMPTY) {
            return Action.HOP;
        } else if (info.getLeft() == Neighbor.WALL || info.getRight() == Neighbor.WALL) {
            return Action.RIGHT;
        } else {
            return Action.LEFT;
        }
    }
}