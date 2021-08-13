
    import javax.swing.*;
    public class SwingTesting {
        public static void main(String[] args) {
            JFrame f=new JFrame();//creating instance of JFrame

            //Adds Lineup Button
            JButton b=new JButton("Lineup");//creating instance of JButton
            b.setBounds(130,100,100, 40);//x axis, y axis, width, height

            //Adds Match UP Button
            JButton b2 = new JButton("Match up");
            b2.setBounds(130, 150, 100, 40);

            //Adds Exit Button
            JButton b3 = new JButton("Exit");
            b3.setBounds(130, 250,100,40);

            //Adds Draft Button
            JButton b4 = new JButton("Draft");
            b4.setBounds(130, 200,100,40);

            f.add(b);//adding button in JFrame
            f.add(b2);
            f.add(b3);
            f.add(b4);

            f.setSize(400,500);//400 width and 500 height
            f.setLayout(null);//using no layout managers
            f.setVisible(true);//making the frame visible
        }
    }
