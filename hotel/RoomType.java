
import db.Operation;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author WOW
 */
public class RoomType extends javax.swing.JFrame {

    /**
     * Creates new form RoomType
     */
    private int row=-1;
    public void setRow(int row){ 
        this.row = row;
    }
    public int getRow(){
        return row;
    }
    private void DisplayEmp(){
        try{
            ResultSet rs = Operation.getData("SELECT RoomType.TypeID, RoomType.Name, RoomType.Description, RoomType.Price, RoomType.Capacity, Room.RoomNumber, Room.Status FROM RoomType, Room WHERE RoomType.TypeID = Room.TypeID");
            RTTable.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (Exception e){
         JOptionPane.showMessageDialog(null, e);
        }
        
    }
    private void GetRoom(){
//        try{
//            ResultSet rs = Operation.getData("SELECT Room.RoomNumber FROM HMS.Room");
//            while (rs.next()){
//            String NoRoom = rs.getString("RoomNumber");
//            RoomNo.addItem(NoRoom);
//            }
//        }
//        catch (Exception e){
//        }
    }
    
    public RoomType() {
        setUndecorated(true);
        initComponents();
        DesBox.setTransferHandler(null);
        DisplayEmp();
        GetRoom();
        ModifyBtn.setEnabled(false);
        
        CloseButton3.addMouseListener(new java.awt.event.MouseAdapter()
                {
                    public void mouseClicked(java.awt.event.MouseEvent e)
                {
                    dispose();
                }
                }
        
        );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roomTypeBG4 = new RoomTypeBG();
        CloseButton3 = new javax.swing.JLabel();
        AddRoomBtn = new javax.swing.JButton();
        RoomTypeLabel = new javax.swing.JLabel();
        BedLabel = new javax.swing.JLabel();
        RoomList = new javax.swing.JComboBox<>();
        BedList = new javax.swing.JComboBox<>();
        ModifyBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        RTTable = new javax.swing.JTable();
        InfRoom = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        InfDes = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        InfRoomname = new javax.swing.JLabel();
        InfPrice = new javax.swing.JLabel();
        InfCapacity = new javax.swing.JLabel();
        DesLabel = new javax.swing.JLabel();
        DesBox = new javax.swing.JTextField();
        PriceLabel = new javax.swing.JLabel();
        PriceBox = new javax.swing.JTextField();
        RoomNumberLabel = new javax.swing.JLabel();
        StatusRoom = new javax.swing.JLabel();
        StatusRoomBox = new javax.swing.JComboBox<>();
        SetStatusRoom = new javax.swing.JButton();
        RoomNo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1000, 509));

        CloseButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close_button.png"))); // NOI18N
        CloseButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        AddRoomBtn.setText("Add Room");
        AddRoomBtn.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                AddEmployeeComponentShown(evt);
            }
        });
        AddRoomBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddEmployeeActionPerformed(evt);
            }
        });

        RoomTypeLabel.setText("Room Type");

        BedLabel.setText("Bed");

        RoomList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Superior Room", "Queen Room", "Single Room", "Studio Room", "Deluxe Room" }));

        BedList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        ModifyBtn.setText("Modify");
        ModifyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        RTTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Description", "Price", "Capacity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        RTTable.getTableHeader().setReorderingAllowed(false);
        RTTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RTTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(RTTable);
        RTTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        InfRoom.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Room");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/booking.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Description");

        InfDes.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Price");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Capacity");

        javax.swing.GroupLayout InfRoomLayout = new javax.swing.GroupLayout(InfRoom);
        InfRoom.setLayout(InfRoomLayout);
        InfRoomLayout.setHorizontalGroup(
            InfRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InfRoomLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(59, 59, 59))
            .addGroup(InfRoomLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(InfRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InfDes, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addGroup(InfRoomLayout.createSequentialGroup()
                        .addGroup(InfRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(InfRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InfCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(InfRoomLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(39, 39, 39)
                        .addComponent(InfRoomname, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        InfRoomLayout.setVerticalGroup(
            InfRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfRoomLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(InfRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(InfRoomLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7))
                    .addComponent(InfRoomname, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(InfDes, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(InfRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addGroup(InfRoomLayout.createSequentialGroup()
                        .addGroup(InfRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(InfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(19, 19, 19)
                        .addComponent(InfCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        DesLabel.setText("Description");

        DesBox.setColumns(32);
        DesBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesBoxActionPerformed(evt);
            }
        });

        PriceLabel.setForeground(new java.awt.Color(255, 255, 255));
        PriceLabel.setText("Price");

        RoomNumberLabel.setText("Room Number");

        StatusRoom.setText("Status");

        StatusRoomBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ready", "Cleaning", "Used" }));
        StatusRoomBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusRoomBoxActionPerformed(evt);
            }
        });

        SetStatusRoom.setText("Set");
        SetStatusRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetStatusRoomActionPerformed1(evt);
            }
        });

        RoomNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roomTypeBG4Layout = new javax.swing.GroupLayout(roomTypeBG4);
        roomTypeBG4.setLayout(roomTypeBG4Layout);
        roomTypeBG4Layout.setHorizontalGroup(
            roomTypeBG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roomTypeBG4Layout.createSequentialGroup()
                .addGroup(roomTypeBG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, roomTypeBG4Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(roomTypeBG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(roomTypeBG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1)
                                .addGroup(roomTypeBG4Layout.createSequentialGroup()
                                    .addGroup(roomTypeBG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(roomTypeBG4Layout.createSequentialGroup()
                                            .addComponent(DesLabel)
                                            .addGap(18, 18, 18)
                                            .addComponent(DesBox))
                                        .addGroup(roomTypeBG4Layout.createSequentialGroup()
                                            .addComponent(RoomTypeLabel)
                                            .addGap(18, 18, 18)
                                            .addComponent(RoomList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(BedLabel)
                                            .addGap(18, 18, 18)
                                            .addComponent(BedList, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(AddRoomBtn)))
                                    .addGroup(roomTypeBG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(roomTypeBG4Layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(ModifyBtn)
                                            .addGap(18, 18, 18)
                                            .addComponent(DeleteBtn))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roomTypeBG4Layout.createSequentialGroup()
                                            .addGap(21, 21, 21)
                                            .addComponent(PriceLabel)
                                            .addGap(18, 18, 18)
                                            .addComponent(PriceBox, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(roomTypeBG4Layout.createSequentialGroup()
                                .addComponent(RoomNumberLabel)
                                .addGap(18, 18, 18)
                                .addComponent(RoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(StatusRoom)
                                .addGap(18, 18, 18)
                                .addComponent(StatusRoomBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(SetStatusRoom)))
                        .addGap(18, 18, 18)
                        .addComponent(InfRoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(roomTypeBG4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CloseButton3)))
                .addGap(23, 23, 23))
        );
        roomTypeBG4Layout.setVerticalGroup(
            roomTypeBG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roomTypeBG4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CloseButton3)
                .addGap(28, 28, 28)
                .addGroup(roomTypeBG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roomTypeBG4Layout.createSequentialGroup()
                        .addGroup(roomTypeBG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddRoomBtn)
                            .addComponent(RoomTypeLabel)
                            .addComponent(BedLabel)
                            .addComponent(RoomList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BedList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ModifyBtn)
                            .addComponent(DeleteBtn))
                        .addGap(18, 18, 18)
                        .addGroup(roomTypeBG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DesLabel)
                            .addComponent(DesBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PriceLabel)
                            .addComponent(PriceBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(roomTypeBG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RoomNumberLabel)
                            .addComponent(StatusRoom)
                            .addComponent(StatusRoomBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SetStatusRoom)
                            .addComponent(RoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(InfRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(roomTypeBG4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(roomTypeBG4, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AddEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddEmployeeActionPerformed
        Operation.setOrDel("insert into HMS.RoomType (Name, Description, Price, Capacity)"
                + " value ('"+RoomList.getSelectedItem()+"','"+DesBox.getText()+"','"+PriceBox.getText()+"','"+BedList.getSelectedItem()+"')","Add room type successfully!");
        Operation.setOrDel("insert into Room(TypeID) value ((select max(RoomType.TypeID) from RoomType ORDER BY RoomType.TypeID DESC LIMIT 1))", "");
        DisplayEmp();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_AddEmployeeActionPerformed

    private void AddEmployeeComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_AddEmployeeComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_AddEmployeeComponentShown

    private void RTTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RTTableMouseClicked
        int row = RTTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)RTTable.getModel();    
        InfRoomname.setText(model.getValueAt(row, 1).toString());
        InfDes.setText(model.getValueAt(row, 2).toString());
        InfPrice.setText(model.getValueAt(row, 3).toString());
        InfCapacity.setText(model.getValueAt(row, 4).toString());
        RoomNo.setText(model.getValueAt(row, 5).toString());
        RoomNo.setEnabled(true);
        setRow(row);
        // TODO add your handling code here:
    }//GEN-LAST:event_RTTableMouseClicked

    private void DesBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesBoxActionPerformed
        // TODO add your handling code here:
        DesBox.setTransferHandler(null);
    }//GEN-LAST:event_DesBoxActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        DefaultTableModel model = (DefaultTableModel)RTTable.getModel();
        Operation.setOrDel("DELETE FROM HMS.Room WHERE RoomNumber="+model.getValueAt(getRow(), 5), "Remove this room type successfully!");
        //Operation.setOrDel("DELETE FROM HMS.RoomType WHERE TypeID="+model.getValueAt(getRow(), 0),"");
        DisplayEmp();
        row = -1;

        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void SetStatusRoomActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetStatusRoomActionPerformed1
        Operation.setOrDel("update Room set Status ='"+StatusRoomBox.getSelectedItem()+"' where RoomNumber = "+RoomNo.getText(), "Update Successfully!");
        DisplayEmp();
        // TODO add your handling code here:
    }//GEN-LAST:event_SetStatusRoomActionPerformed1

    private void StatusRoomBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusRoomBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StatusRoomBoxActionPerformed

    private void RoomNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoomNoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RoomType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoomType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoomType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoomType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoomType().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddRoomBtn;
    private javax.swing.JLabel BedLabel;
    private javax.swing.JComboBox<String> BedList;
    private javax.swing.JLabel CloseButton3;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JTextField DesBox;
    private javax.swing.JLabel DesLabel;
    private javax.swing.JLabel InfCapacity;
    private javax.swing.JLabel InfDes;
    private javax.swing.JLabel InfPrice;
    private javax.swing.JPanel InfRoom;
    private javax.swing.JLabel InfRoomname;
    private javax.swing.JButton ModifyBtn;
    private javax.swing.JTextField PriceBox;
    private javax.swing.JLabel PriceLabel;
    private javax.swing.JTable RTTable;
    private javax.swing.JComboBox<String> RoomList;
    private javax.swing.JTextField RoomNo;
    private javax.swing.JLabel RoomNumberLabel;
    private javax.swing.JLabel RoomTypeLabel;
    private javax.swing.JButton SetStatusRoom;
    private javax.swing.JLabel StatusRoom;
    private javax.swing.JComboBox<String> StatusRoomBox;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private RoomTypeBG roomTypeBG4;
    // End of variables declaration//GEN-END:variables
}
