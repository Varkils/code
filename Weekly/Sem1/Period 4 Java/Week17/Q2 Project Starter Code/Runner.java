import javax.swing.JFrame;


public class Runner {

  public static void main(String[] args) {


    JFrame frame = new JFrame("Get Enemies Game");

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //Create panel and add it to the frame
    GamePanel sc = new GamePanel();

    frame.add(sc);
    frame.pack();
    frame.setVisible(true);
    sc.animate();

    }
}
