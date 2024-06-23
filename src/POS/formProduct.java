/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POS;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aquino.Jay R
 */
public class formProduct extends javax.swing.JPanel {

    /**
     * Creates new form formProduct
     */
    public formProduct() {
        initComponents();
        table.setComponentPopupMenu(popup);
    }
    
    public void refresh_bruh(){
        try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pos_1","root","");
                Statement st = con.createStatement();
                String sql = "select * from pro_table";
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                int i = 1;
                model.setRowCount(0);
                ResultSet rs = st.executeQuery(sql);
                while(rs.next()){
                    model.addRow(new Object[]{
                        false,
                        i,
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6)
                    });
                    i++;
                }
                rs.close();
                st.close();
                con.close();
                System.out.println("Connection Good");
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        popup = new javax.swing.JPopupMenu();
        edit = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btn_print = new javax.swing.JButton();
        btn_refresh = new javax.swing.JButton();
        btn_remove = new javax.swing.JButton();
        btn_remove_all = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pro_sup = new javax.swing.JTextField();
        pro_pri = new javax.swing.JTextField();
        pro_bra = new javax.swing.JTextField();
        pro_des = new javax.swing.JTextField();
        pro_name = new javax.swing.JTextField();
        pro_id = new javax.swing.JTextField();
        btn_clear = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/POS/OIP (1).jpg"))); // NOI18N
        edit.setText("EDIT");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        popup.add(edit);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 153), 3, true), "PRODUCT", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(255, 0, 0))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "List of Product", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 24), new java.awt.Color(255, 51, 51))); // NOI18N

        table.setAutoCreateRowSorter(true);
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "No.", "Id", "Name", "Description", "Brand", "Price", "Suppllier"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setMinWidth(25);
            table.getColumnModel().getColumn(0).setPreferredWidth(25);
            table.getColumnModel().getColumn(0).setMaxWidth(25);
            table.getColumnModel().getColumn(1).setMinWidth(40);
            table.getColumnModel().getColumn(1).setPreferredWidth(40);
            table.getColumnModel().getColumn(1).setMaxWidth(40);
        }

        btn_print.setText("PRINT");
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });

        btn_refresh.setText("REFRESH");
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });

        btn_remove.setText("Remove");
        btn_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeActionPerformed(evt);
            }
        });

        btn_remove_all.setText("Remove All");
        btn_remove_all.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_remove_allActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btn_refresh)
                        .addGap(78, 78, 78)
                        .addComponent(btn_remove)
                        .addGap(18, 18, 18)
                        .addComponent(btn_remove_all)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_print)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_print)
                    .addComponent(btn_refresh)
                    .addComponent(btn_remove)
                    .addComponent(btn_remove_all))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(102, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Product Info", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 24), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Product id :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Name :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Description :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Brand :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Price :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Supplier :");

        pro_sup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pro_supActionPerformed(evt);
            }
        });

        pro_pri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pro_priActionPerformed(evt);
            }
        });

        pro_bra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pro_braActionPerformed(evt);
            }
        });

        pro_des.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pro_desActionPerformed(evt);
            }
        });

        pro_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pro_nameActionPerformed(evt);
            }
        });

        pro_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pro_idActionPerformed(evt);
            }
        });

        btn_clear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_clear.setText("CLEAR");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        btn_add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_add.setText("ADD");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pro_id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pro_name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pro_des, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pro_bra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pro_pri, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pro_sup, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_clear)
                .addGap(18, 18, 18)
                .addComponent(btn_add)
                .addGap(113, 113, 113))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pro_id, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pro_name, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pro_des, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pro_bra, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pro_pri, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pro_sup, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_clear)
                    .addComponent(btn_add))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pro_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pro_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pro_idActionPerformed

    private void pro_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pro_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pro_nameActionPerformed

    private void pro_desActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pro_desActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pro_desActionPerformed

    private void pro_braActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pro_braActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pro_braActionPerformed

    private void pro_priActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pro_priActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pro_priActionPerformed

    private void pro_supActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pro_supActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pro_supActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // TODO add your handling code here:
        pro_id.setText("");
        pro_name.setText("");
        pro_des.setText("");
        pro_bra.setText("");
        pro_pri.setText("");
        pro_sup.setText("");
    }//GEN-LAST:event_btn_clearActionPerformed
    
    public boolean duplicate_bruh(String id){
        boolean i = false ;
        int id_ = Integer.parseInt(id);
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pos_1", "root", "");
            Statement st = con.createStatement();
        
            // Construct the SQL query with parameters
            String sql = "SELECT * FROM pro_table WHERE id = '" + id_ + "'";
           
             // Execute the query
            ResultSet rs = st.executeQuery(sql);

            // Check if there are duplicate records
            if (rs.next()) {
                System.out.println("Duplicates found");
                JOptionPane.showMessageDialog(this, "Duplicates found! \n Product: "+ id_ );
                
                // Close ResultSet, Statement, and Connection
                rs.close();
                st.close();
                con.close();
                i = false;
                
                // Handle duplicate records here
            } else {
                System.out.println("No Duplicates, Good");
            
                // Close ResultSet, Statement, and Connection
                rs.close();
                st.close();
                con.close();
                i = true;
                
            }

            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return i;
    }
    
    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
        int i = JOptionPane.showConfirmDialog(this, "Are you sure ?", "CONFIRMATION",0);
        if(i == 0 && duplicate_bruh(pro_id.getText())){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pos_1","root","");
                Statement st = con.createStatement();
                String sql = "insert into pro_table values('"+pro_id.getText()+"',"
                        + "'"+pro_name.getText()+"',"
                        + "'"+pro_des.getText()+"',"
                        + "'"+pro_bra.getText()+"',"
                        + "'"+pro_pri.getText()+"',"
                        + "'"+pro_sup.getText()+"')";
                st.execute(sql);
                System.out.println("Good");
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e.getMessage());
                System.out.println(e.getMessage());
            }
        }
        refresh_bruh();
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        // TODO add your handling code here:
        refresh_bruh();
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void btn_remove_allActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_remove_allActionPerformed
        // TODO add your handling code here:
        int i = JOptionPane.showConfirmDialog(this, "Are you sure ?", "CONFIRMATION",0);
        if(i == 0 ){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pos_1", "root", "");
            Statement st = con.createStatement();
            // TARA DELETE NA
            String sql = "DELETE FROM pro_table";
            int rowsAffected = st.executeUpdate(sql); 
            System.out.println(rowsAffected + " rows deleted.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            System.out.println("Error: " + e.getMessage());
        }
        refresh_bruh();
        }
    }//GEN-LAST:event_btn_remove_allActionPerformed

    private void btn_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeActionPerformed
        // TODO add your handling code here:
        int c = JOptionPane.showConfirmDialog(this, "Are you sure ?", "CONFIRMATION",0);
        if(c == 0 ){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pos_1", "root", "");
            Statement st = con.createStatement();
            
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            int rowCount = model.getRowCount();
    
            // Be carefull Nigga Iterate through each ROW in the table
            for(int i = 0; i < rowCount ; i++){
                boolean isChecked = (boolean) model.getValueAt(i, 0); 
                if(isChecked){
                    String id = model.getValueAt(i, 2).toString(); 
                    // Construct and execute the SQL delete statement
                    String sql = "DELETE FROM pro_table WHERE id = '" + id + "'"; 
                    int rowsAffected = st.executeUpdate(sql);
                    System.out.println(rowsAffected + " row(s) deleted.");
                }
            }
    
            con.close();
            
            //  DELETE shit
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            System.out.println("Error: " + e.getMessage());
        }
        refresh_bruh();
        }
    }//GEN-LAST:event_btn_removeActionPerformed

    public class PrintObject implements Printable{
        public int print(Graphics g, PageFormat f, int pageIndex){
            
            if(pageIndex == 0){
                try{
                        
                    Graphics2D g2 = (Graphics2D) g;
                    
                    //image icon display
                    ImageIcon printImage = new javax.swing.ImageIcon("./src/POS/icons8-report-20.png");
                    g2.drawImage(printImage.getImage(), 275, 25, printImage.getIconWidth(), printImage.getIconHeight(), null);
                    
                    //header display
                    g2.setFont(new Font("Arial", Font.BOLD, 15));
                    g2.drawString("A&A", 300, 40);
                    g2.setFont(new Font("Arial", Font.BOLD, 10));
                    g2.drawString("Product Records", 270, 55);
                    
                    //margin design
                    g2.drawLine(25, 35, 250, 35);//hor top left
                    g2.drawLine(350, 35, 575, 35);//hor top right
                    //-----------------
                    g2.drawLine(25, 750, 200, 750);//hor bot left
                    g2.drawLine(400, 750, 575, 750);//hor bot right
                    //-----------------
                    g2.drawLine(25, 35, 25, 750);//ver left
                    g2.drawLine(575, 35, 575, 750);//ver right
                    
                    //First table row display "border"
                    g2.drawLine(50, 70, 550, 70);//hor top
                    g2.drawLine(50, 90, 550, 90);//hor bot
                    g2.drawLine(50, 70, 50, 90);//ver left
                    g2.drawLine(550, 70, 550, 90);//ver right
                    
                    //Collums Line "vertical or Y axis"
                    g2.drawLine(75, 70, 75, 90);
                    g2.drawLine(100, 70, 100, 90);
                    g2.drawLine(190, 70, 190, 90);
                    g2.drawLine(280, 70, 280, 90);
                    g2.drawLine(370, 70, 370, 90);
                    g2.drawLine(460, 70, 460, 90);
                    
                    //record's display
                    g2.setFont(new Font("Roboto", Font.BOLD, 11));
                    g2.drawString("No", 55, (float) 84);            //no
                    g2.drawString("ID", 80, (float) 84);            //id
                    g2.drawString("Name", 105, (float) 84);         //name
                    g2.drawString("Description", 195, (float) 84);  //decription
                    g2.drawString("Brand", 285, (float) 84);        //brand
                    g2.drawString("Price", 375, (float) 84);        //price
                    g2.drawString("Supplier", 465, (float) 84);     //supplier
                    
                    //my loop and find error
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pos_1","root","");
                    Statement st = con.createStatement();
                    String sql = "select * from pro_table";
                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    int i = 0;
                    int x = 0;
                    int height_a = 70;
                    int height_b = 90;
                    int height_c = 84;
                    model.setRowCount(0);
                    ResultSet rs = st.executeQuery(sql);
                    while(rs.next()){
                        
                        i++;
                        height_a+=20;
                        height_b+=20;
                        height_c+=20;
                        
                        //Second table row display "border" without the top line 
                        g2.drawLine(50, height_b, 550, height_b);   //hor bot
                        g2.drawLine(50, height_a, 50, height_b);    //ver left
                        g2.drawLine(550, height_a, 550, height_b);  //ver right
                    
                        //Collums Line "vertical or Y axis"
                        g2.drawLine(75, height_a, 75, height_b);
                        g2.drawLine(100, height_a, 100, height_b);
                        g2.drawLine(190, height_a, 190, height_b);
                        g2.drawLine(280, height_a, 280, height_b);
                        g2.drawLine(370, height_a, 370, height_b);
                        g2.drawLine(460, height_a, 460, height_b);
                    
                        //record's display
                        g2.setFont(new Font("Roboto", Font.PLAIN, 10));
                        g2.drawString(Integer.toString(i), 55, (float) height_c);   //no
                        g2.drawString(rs.getString(1), 80, (float) height_c);       //id
                        g2.drawString(rs.getString(2), 105, (float) height_c);      //name
                        g2.drawString(rs.getString(3), 195, (float) height_c);      //decription
                        g2.drawString(rs.getString(4), 285, (float) height_c);      //brand
                        g2.drawString(rs.getString(5), 375, (float) height_c);      //price
                        g2.drawString(rs.getString(6), 465, (float) height_c);      //supplier
                        
                    }
                    
                    g2.setFont(new Font("Roboto", Font.BOLD, 10));
                    g2.drawString("By : Jay R Aquino", 260, 750);
                    g2.drawString("Maximum Display of "+i+" records", 225, 760);
                        
                    rs.close();
                    st.close();
                    con.close();
                    System.out.println("Connection Good");
                    
                        
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
                    System.out.println("Error: " + e.getMessage());
                }
                return PAGE_EXISTS;
            }else{
                return NO_SUCH_PAGE;
            }
            
        }
    }
    
    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
        // TODO add your handling code here:
        int i = JOptionPane.showConfirmDialog(this, "Are you sure ?", "CONFIRMATION",0);
        if(i == 0 ){
            Printing();
            refresh_bruh();
        }
    }//GEN-LAST:event_btn_printActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        int selectedRow = table.getSelectedRow();
    
        if (selectedRow >= 0) {
            // get values' in the Table
            String id_ = table.getValueAt(selectedRow, 2).toString();
            String name_ = table.getValueAt(selectedRow, 3).toString();
            String description_ = table.getValueAt(selectedRow, 4).toString();
            String brand_ = table.getValueAt(selectedRow, 5).toString();
            String price_ = table.getValueAt(selectedRow, 6).toString();
            String supplier_ = table.getValueAt(selectedRow, 7).toString();
            
            frmMain.old_id = id_;
            
            //call the file and create a object and set the values on the textfields
            formEdit_product fep = new formEdit_product((JFrame)SwingUtilities.getWindowAncestor(this), true);
            
            // set value on textfields on edit
            fep.pro_id.setText(id_);
            fep.pro_name.setText(name_);
            fep.pro_des.setText(description_);
            fep.pro_bra.setText(brand_);
            fep.pro_pri.setText(price_);
            fep.pro_sup.setText(supplier_);
            
            
            // display the formEdit dialog
            fep.setLocationRelativeTo(this);
            fep.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "No row selected.");
        }
    }//GEN-LAST:event_editActionPerformed

    void Printing(){
        try {
            
            PrinterJob job = PrinterJob.getPrinterJob();
            PageFormat format = job.defaultPage();
            job.defaultPage(format);
            Paper paper = new Paper();
            double margin = 25;
            paper.setImageableArea(margin,margin,paper.getWidth() - margin*2,paper.getHeight()- margin*2);
            paper.setSize(8.5,13);
            format.setPaper(paper);
            
            job.setPrintable(new PrintObject(), format);
            if(job.printDialog()){
                job.print();
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_print;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_remove;
    private javax.swing.JButton btn_remove_all;
    private javax.swing.JMenuItem edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPopupMenu popup;
    private javax.swing.JTextField pro_bra;
    private javax.swing.JTextField pro_des;
    private javax.swing.JTextField pro_id;
    private javax.swing.JTextField pro_name;
    private javax.swing.JTextField pro_pri;
    private javax.swing.JTextField pro_sup;
    public javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

}
