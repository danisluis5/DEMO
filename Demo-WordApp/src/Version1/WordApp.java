package Version1;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class WordApp extends JFrame{
    private JTextField tfWord,tfResult;
    private JButton btnDao,btnLat;
    public WordApp(){
        /** JFrame * ***/
        this.setTitle("VinaENTER - WordApp"); 
        this.setLocation(300, 400);
        this.setSize(500, 220);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        /** JControl * *****/
        JLabel lblRoot = new JLabel("Đoạn gốc:");
        lblRoot.setBounds(10, 10, 100, 30);
        lblRoot.setFont(new Font("Arial", Font.BOLD, 12));
        this.getContentPane().add(lblRoot);
        
        tfWord = new JTextField(10);
        tfWord.setBounds(10, 35, 460, 30);
        this.getContentPane().add(tfWord);
        
        JLabel lblResult = new JLabel("Kết quả:");
        lblResult.setBounds(10, 70, 100, 30);
        lblResult.setFont(new Font("Arial", Font.BOLD, 12));
        this.getContentPane().add(lblResult);
        
        tfResult = new JTextField(10);
        tfResult.setBounds(10, 95, 460, 30);
        this.getContentPane().add(tfResult);
        
        btnDao = new JButton("Đảo chữ");
        btnDao.setBounds(120, 130, 100, 30);
        this.getContentPane().add(btnDao);
        btnDao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               tfResult.setText(new StringBuilder(new String(tfWord.getText())).reverse().toString());
            }
        });
        
        btnLat = new JButton("Lật chữ");
        btnLat.setBounds(250, 130, 100, 30);
        this.getContentPane().add(btnLat);
        btnLat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String normal = "abcdefghijklmnopqrstuvwxyz_,;.?!/\\'";
                String flip  = "ɐqɔpǝɟbɥıظʞןɯuodbɹsʇnʌʍxʎz‾'؛˙¿¡/\\,";
                normal += "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                flip += "∀qϽᗡƎℲƃHIſʞ˥WNOԀὉᴚS⊥∩ΛMXʎZ";
                normal += "0123456789";
                flip  += "0ƖᄅƐㄣϛ9ㄥ86";
                char letter;
                String root = new String(tfWord.getText());
                String newStr = "";
                for(int i = 0;i < root.length(); i++){
                    letter = root.charAt(i);
                    int a = normal.indexOf(letter);
                    newStr += (a != -1) ? flip.charAt(a) : letter;
                }
                tfResult.setText(newStr);
            }
        });
        
        JLabel notice = new JLabel("Copyright by VinaENTER EDU");
        notice.setFont(new Font("Arial",Font.BOLD,11));
        notice.setBounds(150, 160, 200, 30);
        this.getContentPane().add(notice);
    }
    public static void main(String[] args) {
        new WordApp().setVisible(true);
    }
}
