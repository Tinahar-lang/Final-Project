// WhiteTiger class implementation
import java.awt.*;
import java.util.Random;


public class WhiteTiger extends Tiger {
    private boolean hasInfected;

    public WhiteTiger() {
        hasInfected = false;
    }

    public Color getColor() {
        return Color.WHITE;
    }

    public String toString() {
        return hasInfected ? "TGR" : "tgr";
    }

    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            hasInfected = true;
            return Action.INFECT;
        }
        return super.getMove(info);
    }
}