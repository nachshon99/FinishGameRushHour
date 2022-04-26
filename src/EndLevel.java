import javax.swing.*;
import java.awt.*;

public class EndLevel extends JPanel {
    public Car endLevelRec;
    private String cx;

    public EndLevel(){
        endLevelRec = new Car(cx,3,7, Color.black);
    }
}
