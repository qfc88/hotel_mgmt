
import db.Operation;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Group6-PDM
 */

public class ManageEmp extends javax.swing.JFrame {
    private int row=-1;
    public void setRow(int row){ 
        this.row = row;
    }
    public int getRow(){
        return row;
    }
    
    /**
     * Creates new form Employee
     */
    private void DisplayEmp(){
        try{
            ResultSet rs = Operation.getData("SELECT EmployeeID, FirstName, MiddleName, LastName, Role, DateOfBirth, HireDate, Phone, Email FROM HMS.Employee");
            EmpTable.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (Exception e){
         JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    public ManageEmp() {
       
        setUndecorated(true);
        initComponents();
        DisplayEmp();
        AddEmployeeDialog.setLocationRelativeTo(null);
        ModifyEmp.setLocationRelativeTo(null);
         CloseButton.addMouseListener(new java.awt.event.MouseAdapter()
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

        AddEmployeeDialog = new javax.swing.JDialog();
        FName = new javax.swing.JLabel();
        MName = new javax.swing.JLabel();
        LName = new javax.swing.JLabel();
        Role = new javax.swing.JLabel();
        DOB = new javax.swing.JLabel();
        HireDate = new javax.swing.JLabel();
        Phone = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        FNameBox = new javax.swing.JTextField();
        MNameBox = new javax.swing.JTextField();
        LNameBox = new javax.swing.JTextField();
        EmailBox = new javax.swing.JTextField();
        PhoneBox = new javax.swing.JTextField();
        AddEmpBtn = new javax.swing.JButton();
        ClearText = new javax.swing.JButton();
        CloseBtn = new javax.swing.JButton();
        RoleSelect = new javax.swing.JComboBox<>();
        DOBchoosing = new com.toedter.calendar.JDateChooser();
        HireDateBox = new com.toedter.calendar.JDateChooser();
        ModifyEmp = new javax.swing.JDialog();
        FName1 = new javax.swing.JLabel();
        MName1 = new javax.swing.JLabel();
        LName1 = new javax.swing.JLabel();
        Role1 = new javax.swing.JLabel();
        DOB1 = new javax.swing.JLabel();
        Phone1 = new javax.swing.JLabel();
        Email1 = new javax.swing.JLabel();
        FNameBox1 = new javax.swing.JTextField();
        MNameBox1 = new javax.swing.JTextField();
        LNameBox1 = new javax.swing.JTextField();
        EmailBox1 = new javax.swing.JTextField();
        PhoneBox1 = new javax.swing.JTextField();
        RoleSelect1 = new javax.swing.JComboBox<>();
        SaveEmpBtn1 = new javax.swing.JButton();
        ClearText1 = new javax.swing.JButton();
        CloseBtn1 = new javax.swing.JButton();
        DOBchoosing1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        HireDateBox1 = new com.toedter.calendar.JDateChooser();
        empBG2 = new EmpBG();
        AddEmployee = new javax.swing.JButton();
        CloseButton = new javax.swing.JLabel();
        EmpPane = new javax.swing.JScrollPane();
        EmpTable = new javax.swing.JTable();
        RemoveEmpBtn = new javax.swing.JButton();
        Modify = new javax.swing.JButton();

        AddEmployeeDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        AddEmployeeDialog.setTitle("Add Employee");
        AddEmployeeDialog.setLocation(new java.awt.Point(500, 300));
        AddEmployeeDialog.setResizable(false);
        AddEmployeeDialog.setSize(new java.awt.Dimension(340, 500));
        AddEmployeeDialog.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                AddEmployeeDialogComponentShown(evt);
            }
        });

        FName.setText("First Name");

        MName.setText("Middle Name");

        LName.setText("Last Name");

        Role.setText("Role");

        DOB.setText("Date Of Birth");

        HireDate.setText("Hire Date");

        Phone.setText("Phone");

        Email.setText("E-mail");

        AddEmpBtn.setText("Add");
        AddEmpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddEmpBtnActionPerformed(evt);
            }
        });

        ClearText.setText("Clear");
        ClearText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearTextActionPerformed(evt);
            }
        });

        CloseBtn.setText("Close");
        CloseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseBtnActionPerformed(evt);
            }
        });

        RoleSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Receptionist", "Chef", "Waiter", "Housekeeping", "Reservation", "Bell man" }));

        DOBchoosing.setDateFormatString("yyyy-MM-dd");

        HireDateBox.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout AddEmployeeDialogLayout = new javax.swing.GroupLayout(AddEmployeeDialog.getContentPane());
        AddEmployeeDialog.getContentPane().setLayout(AddEmployeeDialogLayout);
        AddEmployeeDialogLayout.setHorizontalGroup(
            AddEmployeeDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddEmployeeDialogLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(AddEmployeeDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FName)
                    .addComponent(MName)
                    .addComponent(LName)
                    .addComponent(Role)
                    .addComponent(DOB)
                    .addComponent(HireDate)
                    .addComponent(Phone)
                    .addComponent(Email)
                    .addComponent(AddEmpBtn))
                .addGroup(AddEmployeeDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddEmployeeDialogLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ClearText)
                        .addGap(18, 18, 18)
                        .addComponent(CloseBtn)
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addGroup(AddEmployeeDialogLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(AddEmployeeDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FNameBox)
                            .addComponent(MNameBox)
                            .addComponent(LNameBox)
                            .addComponent(EmailBox)
                            .addComponent(RoleSelect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PhoneBox)
                            .addComponent(DOBchoosing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(HireDateBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(51, 51, 51))
        );
        AddEmployeeDialogLayout.setVerticalGroup(
            AddEmployeeDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddEmployeeDialogLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(AddEmployeeDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FName)
                    .addComponent(FNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddEmployeeDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MName)
                    .addComponent(MNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(AddEmployeeDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LName)
                    .addComponent(LNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddEmployeeDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Role)
                    .addComponent(RoleSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddEmployeeDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DOB)
                    .addComponent(DOBchoosing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddEmployeeDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(HireDate)
                    .addComponent(HireDateBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddEmployeeDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Phone)
                    .addComponent(PhoneBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddEmployeeDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email)
                    .addComponent(EmailBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(AddEmployeeDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClearText)
                    .addComponent(AddEmpBtn)
                    .addComponent(CloseBtn))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        ModifyEmp.setTitle("Modify Information");
        ModifyEmp.setResizable(false);
        ModifyEmp.setSize(new java.awt.Dimension(340, 500));

        FName1.setText("First Name");

        MName1.setText("Middle Name");

        LName1.setText("Last Name");

        Role1.setText("Role");

        DOB1.setText("Date Of Birth");

        Phone1.setText("Phone");

        Email1.setText("E-mail");

        RoleSelect1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Receptionist", "Chef", "Waiter", "Housekeeping", "Reservation", "Bell man" }));

        SaveEmpBtn1.setText("Save");
        SaveEmpBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveEmpBtn1ActionPerformed(evt);
            }
        });

        ClearText1.setText("Clear");
        ClearText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearText1ActionPerformed(evt);
            }
        });

        CloseBtn1.setText("Close");
        CloseBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseBtn1ActionPerformed(evt);
            }
        });

        DOBchoosing1.setDateFormatString("yyyy-MM-dd");

        jLabel1.setText("Hire Date");

        HireDateBox1.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout ModifyEmpLayout = new javax.swing.GroupLayout(ModifyEmp.getContentPane());
        ModifyEmp.getContentPane().setLayout(ModifyEmpLayout);
        ModifyEmpLayout.setHorizontalGroup(
            ModifyEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModifyEmpLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(ModifyEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ModifyEmpLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(ModifyEmpLayout.createSequentialGroup()
                        .addGroup(ModifyEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FName1)
                            .addComponent(MName1)
                            .addComponent(LName1)
                            .addComponent(Role1)
                            .addComponent(DOB1)
                            .addComponent(Phone1)
                            .addComponent(Email1)
                            .addComponent(SaveEmpBtn1))
                        .addGroup(ModifyEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ModifyEmpLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(ClearText1)
                                .addGap(18, 18, 18)
                                .addComponent(CloseBtn1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(ModifyEmpLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(ModifyEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FNameBox1)
                                    .addComponent(MNameBox1)
                                    .addComponent(LNameBox1)
                                    .addComponent(EmailBox1)
                                    .addComponent(RoleSelect1, 0, 148, Short.MAX_VALUE)
                                    .addComponent(PhoneBox1)
                                    .addComponent(DOBchoosing1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(HireDateBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(51, 51, 51))))))
        );
        ModifyEmpLayout.setVerticalGroup(
            ModifyEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModifyEmpLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(ModifyEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FName1)
                    .addComponent(FNameBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ModifyEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MName1)
                    .addComponent(MNameBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(ModifyEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LName1)
                    .addComponent(LNameBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ModifyEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Role1)
                    .addComponent(RoleSelect1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ModifyEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DOB1)
                    .addComponent(DOBchoosing1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ModifyEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(HireDateBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ModifyEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Phone1)
                    .addComponent(PhoneBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ModifyEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email1)
                    .addComponent(EmailBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(ModifyEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveEmpBtn1)
                    .addComponent(ClearText1)
                    .addComponent(CloseBtn1))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(250, 250, 250));
        setResizable(false);

        AddEmployee.setText("Add Employee");
        AddEmployee.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                AddEmployeeComponentShown(evt);
            }
        });
        AddEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddEmployeeActionPerformed(evt);
            }
        });

        CloseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close_button.png"))); // NOI18N
        CloseButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        EmpTable.setBackground(new java.awt.Color(242, 242, 242));
        EmpTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "First Name", "Middle Name", "Last Name", "Role", "Date Of Birth", "Phone", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        EmpTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        EmpTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        EmpTable.getTableHeader().setReorderingAllowed(false);
        EmpTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmpTableMouseClicked(evt);
            }
        });
        EmpPane.setViewportView(EmpTable);
        EmpTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        RemoveEmpBtn.setText("Remove Employee");
        RemoveEmpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveEmpBtnActionPerformed(evt);
            }
        });

        Modify.setText("Modify");
        Modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout empBG2Layout = new javax.swing.GroupLayout(empBG2);
        empBG2.setLayout(empBG2Layout);
        empBG2Layout.setHorizontalGroup(
            empBG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empBG2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(empBG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(empBG2Layout.createSequentialGroup()
                        .addComponent(AddEmployee)
                        .addGap(18, 18, 18)
                        .addComponent(RemoveEmpBtn)
                        .addGap(18, 18, 18)
                        .addComponent(Modify))
                    .addComponent(EmpPane, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, empBG2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CloseButton)
                .addGap(24, 24, 24))
        );
        empBG2Layout.setVerticalGroup(
            empBG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empBG2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(CloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(empBG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddEmployee)
                    .addComponent(RemoveEmpBtn)
                    .addComponent(Modify))
                .addGap(18, 18, 18)
                .addComponent(EmpPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(empBG2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(empBG2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddEmployeeActionPerformed

        // TODO add your handling code here:
        AddEmployeeDialog.setVisible(true);
        
    }//GEN-LAST:event_AddEmployeeActionPerformed

    private void AddEmployeeDialogComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_AddEmployeeDialogComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_AddEmployeeDialogComponentShown

    private void AddEmployeeComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_AddEmployeeComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_AddEmployeeComponentShown

    private void AddEmpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddEmpBtnActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd"); // your template here
        
        Operation.setOrDel("insert into HMS.Employee (FirstName, MiddleName, LastName, Role, DateOfBirth, HireDate, Phone, Email)"
                + " values ('"+FNameBox.getText()+"','"+MNameBox.getText()+"','"+LNameBox.getText()+"','"
        +RoleSelect.getSelectedItem()+ "','"+formatter.format(DOBchoosing.getDate())+"','"+formatter.format(HireDateBox.getDate())+"','"
        +PhoneBox.getText()+"','"+EmailBox.getText()+"')", "Add Employee Successfully!");
        
        DisplayEmp();
        
    }//GEN-LAST:event_AddEmpBtnActionPerformed

    private void ClearTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearTextActionPerformed
        FNameBox.setText("");
        MNameBox.setText("");
        LNameBox.setText("");
        RoleSelect.setSelectedIndex(0);
        DOBchoosing.setDate(null);
        HireDateBox.setDate(null);
        EmailBox.setText("");
        PhoneBox.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearTextActionPerformed

    private void CloseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseBtnActionPerformed
        FNameBox.setText("");
        MNameBox.setText("");
        LNameBox.setText("");
        RoleSelect.setSelectedIndex(0);
        DOBchoosing.setDate(null);
        HireDateBox.setDate(null);
        EmailBox.setText("");
        PhoneBox.setText("");    
        AddEmployeeDialog.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_CloseBtnActionPerformed

    private void RemoveEmpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveEmpBtnActionPerformed
        
        DefaultTableModel model = (DefaultTableModel)EmpTable.getModel();
        String temprole = model.getValueAt(getRow(), 4).toString();
        if (!temprole.equals("manager")){

        Operation.setOrDel("DELETE FROM HMS.Employee WHERE EmployeeID="+model.getValueAt(getRow(), 0)+" AND Role!='Manager'", "Remove Employee Successfully!");
        DisplayEmp();
        row = -1;
    }
        else                         javax.swing.JOptionPane.showMessageDialog(null,"<html>"
                                + "<b style=\"color:red\"> Cannot remove manager!</b>"
                                + "</html>","Message",JOptionPane.ERROR_MESSAGE);

        // TODO add your handling code here:
    }//GEN-LAST:event_RemoveEmpBtnActionPerformed
    String[] RoleList = new String[]{"Receptionist", "Chef", "Waiter", "Housekeeping", "Reservation","Bell man"};
    private void ModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifyActionPerformed
        
        ModifyEmp.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_ModifyActionPerformed

    private void SaveEmpBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveEmpBtn1ActionPerformed
        DefaultTableModel model = (DefaultTableModel)EmpTable.getModel();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Operation.setOrDel("UPDATE HMS.Employee SET "
                + "FirstName='"+FNameBox1.getText()+"',"
                + "MiddleName='"+MNameBox1.getText()+"',"
                + "LastName='"+LNameBox1.getText()+"',"
                + "Role='"+RoleSelect1.getSelectedItem()+"',"
                + "DateOfBirth='"+formatter.format(DOBchoosing1.getDate())+"'," 
                + "HireDate='"+formatter.format(HireDateBox1.getDate())+"'," 
                + "Phone='"+PhoneBox1.getText()+"',"  
                + "Email='"+EmailBox1.getText()+"' "
                        + "WHERE EmployeeID="+model.getValueAt(row, 0)
                ,"Save successfully!");
        System.out.print(row);
        DisplayEmp();
// TODO add your handling code here:
    }//GEN-LAST:event_SaveEmpBtn1ActionPerformed

    private void ClearText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearText1ActionPerformed
        FNameBox1.setText("");
        MNameBox1.setText("");
        LNameBox1.setText("");
        RoleSelect1.setSelectedIndex(0);
        DOBchoosing1.setDate(null);
        HireDateBox1.setDate(null);
        EmailBox1.setText("");
        PhoneBox1.setText(""); 

        // TODO add your handling code here:
    }//GEN-LAST:event_ClearText1ActionPerformed

    private void CloseBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseBtn1ActionPerformed
        ModifyEmp.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_CloseBtn1ActionPerformed

    private void EmpTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmpTableMouseClicked
        int row = EmpTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)EmpTable.getModel();
        String a = model.getValueAt(row, 4).toString();
        if (!a.equals("manager")){

                FNameBox1.setText(model.getValueAt(row, 1).toString());
                MNameBox1.setText(model.getValueAt(row, 2).toString());
                LNameBox1.setText(model.getValueAt(row, 3).toString());
                DOBchoosing1.setDate((Date)model.getValueAt(row, 5));
                HireDateBox1.setDate((Date)model.getValueAt(row, 6));
                PhoneBox1.setText(model.getValueAt(row, 7).toString());
                EmailBox1.setText(model.getValueAt(row, 8).toString());
                int RoleIndex = Arrays.asList(RoleList).indexOf(a);
                RoleSelect1.setSelectedIndex(RoleIndex);
                SaveEmpBtn1.setEnabled(true);

        }
        else SaveEmpBtn1.setEnabled(false);
        setRow(row);
        // TODO add your handling code here:
    }//GEN-LAST:event_EmpTableMouseClicked

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
            java.util.logging.Logger.getLogger(ManageEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageEmp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddEmpBtn;
    private javax.swing.JButton AddEmployee;
    private javax.swing.JDialog AddEmployeeDialog;
    private javax.swing.JButton ClearText;
    private javax.swing.JButton ClearText1;
    private javax.swing.JButton CloseBtn;
    private javax.swing.JButton CloseBtn1;
    private javax.swing.JLabel CloseButton;
    private javax.swing.JLabel DOB;
    private javax.swing.JLabel DOB1;
    private com.toedter.calendar.JDateChooser DOBchoosing;
    private com.toedter.calendar.JDateChooser DOBchoosing1;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Email1;
    private javax.swing.JTextField EmailBox;
    private javax.swing.JTextField EmailBox1;
    private javax.swing.JScrollPane EmpPane;
    private javax.swing.JTable EmpTable;
    private javax.swing.JLabel FName;
    private javax.swing.JLabel FName1;
    private javax.swing.JTextField FNameBox;
    private javax.swing.JTextField FNameBox1;
    private javax.swing.JLabel HireDate;
    private com.toedter.calendar.JDateChooser HireDateBox;
    private com.toedter.calendar.JDateChooser HireDateBox1;
    private javax.swing.JLabel LName;
    private javax.swing.JLabel LName1;
    private javax.swing.JTextField LNameBox;
    private javax.swing.JTextField LNameBox1;
    private javax.swing.JLabel MName;
    private javax.swing.JLabel MName1;
    private javax.swing.JTextField MNameBox;
    private javax.swing.JTextField MNameBox1;
    private javax.swing.JButton Modify;
    private javax.swing.JDialog ModifyEmp;
    private javax.swing.JLabel Phone;
    private javax.swing.JLabel Phone1;
    private javax.swing.JTextField PhoneBox;
    private javax.swing.JTextField PhoneBox1;
    private javax.swing.JButton RemoveEmpBtn;
    private javax.swing.JLabel Role;
    private javax.swing.JLabel Role1;
    private javax.swing.JComboBox<String> RoleSelect;
    private javax.swing.JComboBox<String> RoleSelect1;
    private javax.swing.JButton SaveEmpBtn1;
    private EmpBG empBG2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
