package Version1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener{
    private JButton btnCong,btnTru;
    private JTextField tfNum1,tfNum2,tfKetQua;
    public Calculator(){
        this.setTitle("Calculator");    
        this.setSize(500,250);
        this.setLocation(300,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        
        JLabel lblNum1 = new JLabel("Nhập số thứ nhất:");
        lblNum1.setBounds(10, 10, 100, 30);
        this.add(lblNum1);
        
        tfNum1 = new JTextField(5);
        tfNum1.setBounds(120, 10, 350, 30);
        this.getContentPane().add(tfNum1);
        
        JLabel lblNum2 = new JLabel("Nhập số thứ hai:");
        lblNum2.setBounds(10, 50, 100, 30);
        this.getContentPane().add(lblNum2);
        
        tfNum2 = new JTextField(5);
        tfNum2.setBounds(120, 50, 350, 30);
        this.getContentPane().add(tfNum2);
        
        JLabel lblNum3 = new JLabel("Kết Quả:");
        lblNum3.setBounds(10, 90, 130, 30);
        this.getContentPane().add(lblNum3);
        
        tfKetQua = new JTextField(5);
        tfKetQua.setBounds(120, 90, 350, 30);
        this.getContentPane().add(tfKetQua);
        
        btnCong = new JButton("Cộng");
        btnCong.setBounds(200, 140, 80, 30);
        this.getContentPane().add(btnCong);
        btnCong.addActionListener(this);
        
        btnTru = new JButton("Trừ");
        btnTru.setBounds(300, 140, 80, 30);
        this.getContentPane().add(btnTru);
        btnTru.addActionListener(this);
    }
    public static void main(String[] args) {
        new Calculator().setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(tfNum1.getText());
        int num2 = Integer.parseInt(tfNum2.getText());
        if(e.getSource() == btnCong){
            tfKetQua.setText(String.valueOf(num1+num2));
        }else if(e.getSource() == btnTru){
            tfKetQua.setText(String.valueOf(num1-num2));
        }
    }
}
