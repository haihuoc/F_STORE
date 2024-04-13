/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Form;

import java.sql.*;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bùi Tuấn
 */
public class KhachHang extends javax.swing.JInternalFrame {

    
    public KhachHang() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        
        ShowData();
        this.txtID.setEnabled(false);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTKhachHang = new javax.swing.JTabbedPane();
        jPAddSanpham = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        LableFullName = new javax.swing.JLabel();
        jButtonThemKH = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        LableEmail = new javax.swing.JLabel();
        Lableaddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        LablePhone = new javax.swing.JLabel();
        jPQlSanpham = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableKhachHang = new javax.swing.JTable();
        txtSearchFullName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPOptionsSanpham = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtFullName1 = new javax.swing.JTextField();
        jButtonDeleteKH = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jButtonChangeKH = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        txtAddress1 = new javax.swing.JTextField();
        txtEmail1 = new javax.swing.JTextField();
        txtPhone1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1020, 710));

        jTKhachHang.setBackground(new java.awt.Color(255, 255, 255));
        jTKhachHang.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        jTKhachHang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTKhachHang.setOpaque(true);

        jPAddSanpham.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(22, 67, 108));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add-button.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Thêm Khách Hàng");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        LableFullName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LableFullName.setText("Họ Và Tên :");

        jButtonThemKH.setBackground(new java.awt.Color(22, 67, 108));
        jButtonThemKH.setPreferredSize(new java.awt.Dimension(185, 45));
        jButtonThemKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonThemKHMouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add-button (1).png"))); // NOI18N
        jLabel15.setText("Thêm");

        javax.swing.GroupLayout jButtonThemKHLayout = new javax.swing.GroupLayout(jButtonThemKH);
        jButtonThemKH.setLayout(jButtonThemKHLayout);
        jButtonThemKHLayout.setHorizontalGroup(
            jButtonThemKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jButtonThemKHLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel15)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jButtonThemKHLayout.setVerticalGroup(
            jButtonThemKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jButtonThemKHLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        LableEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LableEmail.setText("Email :");

        Lableaddress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Lableaddress.setText("Địa Chỉ :");

        LablePhone.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LablePhone.setText("Phone :");

        javax.swing.GroupLayout jPAddSanphamLayout = new javax.swing.GroupLayout(jPAddSanpham);
        jPAddSanpham.setLayout(jPAddSanphamLayout);
        jPAddSanphamLayout.setHorizontalGroup(
            jPAddSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPAddSanphamLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jPAddSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonThemKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPAddSanphamLayout.createSequentialGroup()
                        .addGroup(jPAddSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LableFullName)
                            .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LableEmail))
                        .addGap(85, 85, 85)
                        .addGroup(jPAddSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LablePhone)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lableaddress))))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPAddSanphamLayout.setVerticalGroup(
            jPAddSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAddSanphamLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addGroup(jPAddSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LableFullName)
                    .addComponent(Lableaddress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPAddSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPAddSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LableEmail)
                    .addComponent(LablePhone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPAddSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(jButtonThemKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 205, Short.MAX_VALUE))
        );

        jTKhachHang.addTab("Thêm khách hàng", jPAddSanpham);

        jPQlSanpham.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(22, 67, 108));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/manage.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quản Lý Khách Hàng");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(551, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setText("Thông tin khách hàng :");

        TableKhachHang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TableKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tên khách hàng ", "Email", "Số điện thoại ", "Địa chỉ "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableKhachHang.setRowHeight(35);
        TableKhachHang.setSelectionBackground(new java.awt.Color(22, 67, 108));
        TableKhachHang.setSelectionForeground(new java.awt.Color(255, 255, 255));
        TableKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableKhachHangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableKhachHang);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPQlSanphamLayout = new javax.swing.GroupLayout(jPQlSanpham);
        jPQlSanpham.setLayout(jPQlSanphamLayout);
        jPQlSanphamLayout.setHorizontalGroup(
            jPQlSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPQlSanphamLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(jPQlSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPQlSanphamLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearchFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPQlSanphamLayout.setVerticalGroup(
            jPQlSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPQlSanphamLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addGroup(jPQlSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPQlSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearchFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel23))
                    .addComponent(jLabel8))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 82, Short.MAX_VALUE))
        );

        jTKhachHang.addTab("Quản lý khách hàng", jPQlSanpham);

        jPOptionsSanpham.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(22, 67, 108));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/orther.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Other");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Họ Và Tên :");

        txtFullName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFullName1ActionPerformed(evt);
            }
        });

        jButtonDeleteKH.setBackground(new java.awt.Color(22, 67, 108));
        jButtonDeleteKH.setPreferredSize(new java.awt.Dimension(185, 45));
        jButtonDeleteKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDeleteKHMouseClicked(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add-button (1).png"))); // NOI18N
        jLabel18.setText("Delete");

        javax.swing.GroupLayout jButtonDeleteKHLayout = new javax.swing.GroupLayout(jButtonDeleteKH);
        jButtonDeleteKH.setLayout(jButtonDeleteKHLayout);
        jButtonDeleteKHLayout.setHorizontalGroup(
            jButtonDeleteKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jButtonDeleteKHLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel18)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jButtonDeleteKHLayout.setVerticalGroup(
            jButtonDeleteKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jButtonDeleteKHLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButtonChangeKH.setBackground(new java.awt.Color(22, 67, 108));
        jButtonChangeKH.setPreferredSize(new java.awt.Dimension(185, 45));
        jButtonChangeKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonChangeKHMouseClicked(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add-button (1).png"))); // NOI18N
        jLabel19.setText("Change");

        javax.swing.GroupLayout jButtonChangeKHLayout = new javax.swing.GroupLayout(jButtonChangeKH);
        jButtonChangeKH.setLayout(jButtonChangeKHLayout);
        jButtonChangeKHLayout.setHorizontalGroup(
            jButtonChangeKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jButtonChangeKHLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel19)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jButtonChangeKHLayout.setVerticalGroup(
            jButtonChangeKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jButtonChangeKHLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("Địa chỉ :");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("Email :");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setText("Phone :");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setText("ID");

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPOptionsSanphamLayout = new javax.swing.GroupLayout(jPOptionsSanpham);
        jPOptionsSanpham.setLayout(jPOptionsSanphamLayout);
        jPOptionsSanphamLayout.setHorizontalGroup(
            jPOptionsSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPOptionsSanphamLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jPOptionsSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonChangeKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPOptionsSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtFullName1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17)
                        .addComponent(jLabel21)
                        .addComponent(jLabel24)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(85, 85, 85)
                .addGroup(jPOptionsSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jLabel20)
                    .addComponent(txtPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDeleteKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPOptionsSanphamLayout.setVerticalGroup(
            jPOptionsSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPOptionsSanphamLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addGroup(jPOptionsSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel20))
                .addGap(2, 2, 2)
                .addGroup(jPOptionsSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPOptionsSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPOptionsSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFullName1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(jPOptionsSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonChangeKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDeleteKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTKhachHang.addTab("Các lựa chọn khác", jPOptionsSanpham);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTKhachHang)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTKhachHang, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFullName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFullName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFullName1ActionPerformed

    private void jButtonThemKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonThemKHMouseClicked
        String HoVaTen,DiaChi,Sdt,Email;
        HoVaTen = txtFullName.getText();
        DiaChi = txtAddress.getText();
        Sdt = txtPhone.getText();
        Email = txtEmail.getText();
        
        String sql = "insert into Customers values (N'"+HoVaTen+"','"+Email+"','"+Sdt+"',N'"+DiaChi+"')";
        if (HoVaTen.isEmpty())
        {
           JOptionPane.showMessageDialog(this, "Bạn chưa nhập Tên khách hàng !","Thông báo",JOptionPane.WARNING_MESSAGE);
        }
        else if (DiaChi.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập Địa chỉ !","Thông báo",JOptionPane.WARNING_MESSAGE);
        }
        else if (Sdt.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập số điện thoại !","Thông báo",JOptionPane.WARNING_MESSAGE);
        }
        else if (Email.isEmpty()){
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập Email !","Thông báo",JOptionPane.WARNING_MESSAGE);
        }
        else {
            desktopapp.DesktopApp.connection.ExcuteQueryUpdateDB(sql);
            JOptionPane.showMessageDialog(this, "Thêm thành công!","Thông báo",JOptionPane.INFORMATION_MESSAGE);
            ClearText(txtFullName,txtAddress,txtPhone,txtEmail);
            ShowData();
        }
        
    }//GEN-LAST:event_jButtonThemKHMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        SearchKhachHang();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void TableKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableKhachHangMouseClicked
        DefaultTableModel tableKhachHang = (DefaultTableModel) TableKhachHang.getModel();
        
        String ID = tableKhachHang.getValueAt(TableKhachHang.getSelectedRow(),0).toString();
        String Name = tableKhachHang.getValueAt(TableKhachHang.getSelectedRow(),1).toString();
        String Email  = tableKhachHang.getValueAt(TableKhachHang.getSelectedRow(), 2).toString();
        String Phone = tableKhachHang.getValueAt(TableKhachHang.getSelectedRow(), 3).toString();
        String Address = tableKhachHang.getValueAt(TableKhachHang.getSelectedRow(), 4).toString();
        
        txtID.setText(ID);
        txtFullName1.setText(Name);
        txtEmail1.setText(Email);
        txtPhone1.setText(Phone);
        txtAddress1.setText(Address);
        
        jTKhachHang.setSelectedIndex(2);
        
    }//GEN-LAST:event_TableKhachHangMouseClicked

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void jButtonChangeKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonChangeKHMouseClicked
        String ID , Name ,Emai ,Phone , Address ;
        ID = txtID.getText();
        Name = txtFullName1.getText();
        Emai = txtEmail1.getText();
        Phone = txtPhone1.getText();
        Address = txtAddress1.getText();
        
        if (!ID.isEmpty())
        {
            String sql ="UPDATE Customers SET FullName = N'"+Name+"',Email = '"+Emai+"',Phone = '"+Phone+"',Address = N'"+Address+"' WHERE CustomerID = '"+ID+"'";
        
            desktopapp.DesktopApp.connection.ExcuteQueryUpdateDB(sql);
            JOptionPane.showMessageDialog(this,"Sửa thành công","Thông báo",JOptionPane.INFORMATION_MESSAGE);
            ShowData();
            ClearText(txtID,txtFullName1,txtEmail1,txtPhone1,txtAddress1);
        
            jTKhachHang.setSelectedIndex(1);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Không tìm thấy khách hàng!","Thông báo",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_jButtonChangeKHMouseClicked

    private void jButtonDeleteKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDeleteKHMouseClicked
        String ID =txtID.getText();
        if (!ID.isEmpty())
        {
            boolean hasOrder = CheckKhachHang(ID);
            if(!hasOrder)
            {
                String sql = "delete from Customers where CustomerID ="+ID;
                desktopapp.DesktopApp.connection.ExcuteQueryUpdateDB(sql);
                JOptionPane.showMessageDialog(this, "Xóa thành công","Thông báo",JOptionPane.INFORMATION_MESSAGE);
                ClearText(txtAddress1,txtID,txtEmail1,txtFullName1,txtPhone1);
                jTKhachHang.setSelectedIndex(1);
                ShowData();
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Không tìm thấy khách hàng","Thông báo",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_jButtonDeleteKHMouseClicked
    public static void ClearText(JTextField... textFields){
        for (JTextField textField : textFields)
        {
            textField.setText("");
        }
    }
    private boolean CheckKhachHang(String MaKH)
    {
        String sql = "SELECT COUNT(*) AS COUNT FROM Orders where CustomerID ="+MaKH;
        int OrderCount = 0;
        ResultSet rs  = desktopapp.DesktopApp.connection.ExcuteQueryGetTable(sql);
        try {
            if (rs.next())
            {
                OrderCount = rs.getInt("COUNT");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return OrderCount >0;
    }
    
    
    public void ShowData(){
        String sql = "Select * from Customers";
        ResultSet rs = desktopapp.DesktopApp.connection.ExcuteQueryGetTable(sql);
        
        DefaultTableModel tbModel = (DefaultTableModel) TableKhachHang.getModel();
        tbModel.setRowCount(0);
        
        Object obj[] = new Object[10];
        
        try {
            while (rs.next()) {
                obj[0] = rs.getString("CustomerID");
                obj[1] = rs.getString("FullName");
                obj[2] = rs.getString("Email");
                obj[3] = rs.getString("Phone");
                obj[4] = rs.getString("Address");
                
                tbModel.addRow(obj);
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(new JFrame(),"Lỗi truy xuất dữ liệu ");
        }
    }
    public void SearchKhachHang()
    {
        String sql = "SELECT * FROM Customers WHERE FullName LIKE N'%"+txtSearchFullName.getText()+"%'";
        ResultSet rs = desktopapp.DesktopApp.connection.ExcuteQueryGetTable(sql);
        
        DefaultTableModel tbModel = (DefaultTableModel) TableKhachHang.getModel();
        tbModel.setRowCount(0);
        
        Object obj[] = new Object[10];
        
        try {
            while (rs.next()) {
                obj[0] = rs.getString("CustomerID");
                obj[1] = rs.getString("FullName");
                obj[2] = rs.getString("Email");
                obj[3] = rs.getString("Phone");
                obj[4] = rs.getString("Address");
                
                tbModel.addRow(obj);
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(new JFrame(),"Lỗi truy xuất dữ liệu ");
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LableEmail;
    private javax.swing.JLabel LableFullName;
    private javax.swing.JLabel LablePhone;
    private javax.swing.JLabel Lableaddress;
    private javax.swing.JTable TableKhachHang;
    private javax.swing.JPanel jButtonChangeKH;
    private javax.swing.JPanel jButtonDeleteKH;
    private javax.swing.JPanel jButtonThemKH;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPAddSanpham;
    private javax.swing.JPanel jPOptionsSanpham;
    private javax.swing.JPanel jPQlSanpham;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTKhachHang;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAddress1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmail1;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtFullName1;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtPhone1;
    private javax.swing.JTextField txtSearchFullName;
    // End of variables declaration//GEN-END:variables
}
