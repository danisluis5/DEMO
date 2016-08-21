package Version1;

import Version1.Library.PhanXuongException;
import Version1.Library.UtilsClass;
import javax.swing.JOptionPane;

public class EmployeesSalary extends javax.swing.JFrame {

    private int cost1 = 30000;
    private int cost2 = 20000;
            
    public EmployeesSalary() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfEmployee = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfProduct = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfPart = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfSalary = new javax.swing.JTextField();
        btSalary = new javax.swing.JButton();
        btReply = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("                                     Lương Nhân Viên");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(200, 100));
        setName("frame"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Tính Lương Nhân Viên");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Mã Nhân Viên:");

        tfEmployee.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Số Sản Phẩm:");

        tfProduct.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Phân Xưởng:");

        tfPart.setColumns(4);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Tiền Lương:");

        tfSalary.setColumns(4);

        btSalary.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btSalary.setText("Tính Lương");
        btSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalaryActionPerformed(evt);
            }
        });

        btReply.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btReply.setText("Nhập Lại");
        btReply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReplyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel1)
                .addGap(100, 100, 100))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfPart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                            .addComponent(tfEmployee)
                            .addComponent(tfSalary)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(btSalary)
                        .addGap(54, 54, 54)
                        .addComponent(btReply)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPart, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalary)
                    .addComponent(btReply))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalaryActionPerformed
        boolean cont = false;
        int soSanPham = 0;
        String maNV = tfEmployee.getText();
        try{
            soSanPham = Integer.parseInt(tfProduct.getText());
            if(tfPart.getText().charAt(0) < 'A'||tfPart.getText().charAt(0) > 'D'){
                throw new PhanXuongException("Không tồn tại phân xưởng");
            }
            cont = true;
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(new EmployeesSalary(), "Vui lòng nhập chữ số vào ô Số Sản Phẩm.",null,JOptionPane.WARNING_MESSAGE);
        }catch(PhanXuongException exx){
            JOptionPane.showMessageDialog(new EmployeesSalary(), "Vui lòng nhập A,B,C,D vào ô Phân Xưởng.",null,JOptionPane.WARNING_MESSAGE);
        }
        if(cont){
            if("A".equals(tfPart.getText())){
                if(500 < soSanPham){
                    String result = String.valueOf(500*cost1 + (soSanPham - 500)*cost2);
                    tfSalary.setText(new UtilsClass().changeCurrencyVND(result)+" VND");
                }else{
                    String result = String.valueOf(soSanPham*cost2);
                    tfSalary.setText(new UtilsClass().changeCurrencyVND(result) + " VND");
                }
            }else{
                if(300 < soSanPham){
                    String result = String.valueOf(300*cost1 + (soSanPham - 300)*cost2);
                    tfSalary.setText(new UtilsClass().changeCurrencyVND(result)+" VND");
                }else{
                    String result = String.valueOf(soSanPham*cost2);
                    tfSalary.setText(new UtilsClass().changeCurrencyVND(result)+" VND");
                }
            }
        }
    }//GEN-LAST:event_btSalaryActionPerformed

    private void btReplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReplyActionPerformed
        tfEmployee.setText("");
        tfPart.setText("");
        tfProduct.setText("");
        tfSalary.setText("");
    }//GEN-LAST:event_btReplyActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeesSalary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btReply;
    private javax.swing.JButton btSalary;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField tfEmployee;
    private javax.swing.JTextField tfPart;
    private javax.swing.JTextField tfProduct;
    private javax.swing.JTextField tfSalary;
    // End of variables declaration//GEN-END:variables
}
