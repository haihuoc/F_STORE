/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Form;

import static Form.KhachHang.ClearText;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class SanPham extends javax.swing.JInternalFrame {

     
    public SanPham() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        
        Showdata();
        ShowCombobox();
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTSanPham = new javax.swing.JTabbedPane();
        jPAddSanpham = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNameSP = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButtonAddSP = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtGiaTien = new javax.swing.JTextField();
        txtMoTa = new javax.swing.JTextField();
        cmbNCC = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        jPQlSanpham = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableSanPham = new javax.swing.JTable();
        txtSearchNameSP = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jButtonSearch = new javax.swing.JLabel();
        jPOptionsSanpham = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButtonChange = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtGiaThanh1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtMoTa1 = new javax.swing.JTextField();
        cmbNCC1 = new javax.swing.JComboBox<>();
        txtID = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButtonDelete = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        txtNameSP1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtSoLuong1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1020, 710));

        jTSanPham.setBackground(new java.awt.Color(255, 255, 255));
        jTSanPham.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        jTSanPham.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTSanPham.setOpaque(true);

        jPAddSanpham.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(22, 67, 108));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add-button.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Thêm Sản Phẩm");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(618, Short.MAX_VALUE))
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

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Tên Sản Phẩm :");

        jButtonAddSP.setBackground(new java.awt.Color(22, 67, 108));
        jButtonAddSP.setPreferredSize(new java.awt.Dimension(185, 45));
        jButtonAddSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonAddSPMousePressed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add-button (1).png"))); // NOI18N
        jLabel15.setText("Thêm Sản Phẩm");

        javax.swing.GroupLayout jButtonAddSPLayout = new javax.swing.GroupLayout(jButtonAddSP);
        jButtonAddSP.setLayout(jButtonAddSPLayout);
        jButtonAddSPLayout.setHorizontalGroup(
            jButtonAddSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jButtonAddSPLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(18, 18, 18))
        );
        jButtonAddSPLayout.setVerticalGroup(
            jButtonAddSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jButtonAddSPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Mô Tả ");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Giá Tiền :");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Số Lượng :");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Nhà Cung Cấp :");

        javax.swing.GroupLayout jPAddSanphamLayout = new javax.swing.GroupLayout(jPAddSanpham);
        jPAddSanpham.setLayout(jPAddSanphamLayout);
        jPAddSanphamLayout.setHorizontalGroup(
            jPAddSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPAddSanphamLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jPAddSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNameSP, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAddSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(85, 85, 85)
                .addGroup(jPAddSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(txtGiaTien, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPAddSanphamLayout.setVerticalGroup(
            jPAddSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAddSanphamLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addGroup(jPAddSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPAddSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNameSP, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPAddSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPAddSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPAddSanphamLayout.createSequentialGroup()
                        .addComponent(txtGiaTien, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtMoTa))
                .addGap(55, 55, 55)
                .addComponent(jButtonAddSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jTSanPham.addTab("Thêm sản phẩm ", jPAddSanpham);

        jPQlSanpham.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(22, 67, 108));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/manage.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quản Lý Sản Phẩm");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        TableSanPham.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TableSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Tên sản phẩm", "Mô tả ", "Giá tiền ", "Số lượng ", "Nhà cung cấp "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableSanPham.setRowHeight(40);
        TableSanPham.setSelectionBackground(new java.awt.Color(22, 67, 108));
        TableSanPham.setSelectionForeground(new java.awt.Color(255, 255, 255));
        TableSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TableSanPhamMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(TableSanPham);

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setText("Thông tin sản phẩm :");

        jButtonSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search.png"))); // NOI18N
        jButtonSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonSearchMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPQlSanphamLayout = new javax.swing.GroupLayout(jPQlSanpham);
        jPQlSanpham.setLayout(jPQlSanphamLayout);
        jPQlSanphamLayout.setHorizontalGroup(
            jPQlSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPQlSanphamLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPQlSanphamLayout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSearchNameSP, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSearch)
                .addGap(259, 259, 259))
        );
        jPQlSanphamLayout.setVerticalGroup(
            jPQlSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPQlSanphamLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addGroup(jPQlSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSearch, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPQlSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearchNameSP, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel24)))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 100, Short.MAX_VALUE))
        );

        jTSanPham.addTab("Quản lý sản phẩm", jPQlSanpham);

        jPOptionsSanpham.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(22, 67, 108));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/orther.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Orther");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap(780, Short.MAX_VALUE))
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

        jButtonChange.setBackground(new java.awt.Color(22, 67, 108));
        jButtonChange.setPreferredSize(new java.awt.Dimension(185, 45));
        jButtonChange.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonChangeMousePressed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/change.png"))); // NOI18N
        jLabel16.setText("Change");

        javax.swing.GroupLayout jButtonChangeLayout = new javax.swing.GroupLayout(jButtonChange);
        jButtonChange.setLayout(jButtonChangeLayout);
        jButtonChangeLayout.setHorizontalGroup(
            jButtonChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jButtonChangeLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(49, 49, 49))
        );
        jButtonChangeLayout.setVerticalGroup(
            jButtonChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jButtonChangeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Số lượng :");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("ID");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Mô Tả :");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("Giá Thành :");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("Nhà Cung Cấp :");

        jButtonDelete.setBackground(new java.awt.Color(22, 67, 108));
        jButtonDelete.setPreferredSize(new java.awt.Dimension(185, 45));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete.png"))); // NOI18N
        jLabel21.setText("Delete");

        javax.swing.GroupLayout jButtonDeleteLayout = new javax.swing.GroupLayout(jButtonDelete);
        jButtonDelete.setLayout(jButtonDeleteLayout);
        jButtonDeleteLayout.setHorizontalGroup(
            jButtonDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jButtonDeleteLayout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(49, 49, 49))
        );
        jButtonDeleteLayout.setVerticalGroup(
            jButtonDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jButtonDeleteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setText("Tên Sản Phẩm :");

        javax.swing.GroupLayout jPOptionsSanphamLayout = new javax.swing.GroupLayout(jPOptionsSanpham);
        jPOptionsSanpham.setLayout(jPOptionsSanphamLayout);
        jPOptionsSanphamLayout.setHorizontalGroup(
            jPOptionsSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPOptionsSanphamLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jPOptionsSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPOptionsSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButtonChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPOptionsSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)))
                    .addComponent(txtMoTa1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addGroup(jPOptionsSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(cmbNCC1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGiaThanh1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel20)
                    .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNameSP1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(txtSoLuong1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPOptionsSanphamLayout.setVerticalGroup(
            jPOptionsSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPOptionsSanphamLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addGroup(jPOptionsSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPOptionsSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNameSP1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPOptionsSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPOptionsSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPOptionsSanphamLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtSoLuong1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19)
                        .addGap(12, 12, 12)
                        .addComponent(txtGiaThanh1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel20)
                        .addGap(12, 12, 12)
                        .addComponent(cmbNCC1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtMoTa1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPOptionsSanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonChange, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        jTSanPham.addTab("Các lựa chọn khác", jPOptionsSanpham);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTSanPham)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTSanPham, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddSPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddSPMousePressed
    String TenSP , GiaTien,Mota ,NCC,soluong ;
    TenSP = txtNameSP.getText();
    soluong = txtSoLuong.getText();
    GiaTien = txtGiaTien.getText();
    Mota = txtMoTa.getText();
    NCC = GetCbbSelected(cmbNCC);
    
    String sql = "INSERT INTO Products VALUES (N'"+TenSP+"',N'"+Mota+"','"+GiaTien+"','"+soluong+"','"+NCC+"')";
    if (TenSP.isEmpty())
        {
           JOptionPane.showMessageDialog(this, "Bạn chưa nhập Tên khách hàng !","Thông báo",JOptionPane.WARNING_MESSAGE);
        }
    else if (GiaTien.isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Bạn chưa nhập Tên giá tiền !","Thông báo",JOptionPane.WARNING_MESSAGE);
            }
    else if (NCC.isEmpty())
    {
        JOptionPane.showMessageDialog(this, "Bạn chưa nhập Nhà cung cấp !","Thông báo",JOptionPane.WARNING_MESSAGE);
    }
        else {
            desktopapp.DesktopApp.connection.ExcuteQueryUpdateDB(sql);
            JOptionPane.showMessageDialog(this, "Thêm thành công!","Thông báo",JOptionPane.INFORMATION_MESSAGE);
            ClearText(txtNameSP,txtGiaTien,txtMoTa,txtSoLuong);
            Showdata();
        }
    }//GEN-LAST:event_jButtonAddSPMousePressed

    private void jButtonSearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSearchMousePressed
        SearchSanPham();
    }//GEN-LAST:event_jButtonSearchMousePressed

    private void TableSanPhamMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableSanPhamMousePressed
        DefaultTableModel tableSanPham  = (DefaultTableModel) TableSanPham.getModel();
        
        String IDSP = tableSanPham.getValueAt(TableSanPham.getSelectedRow(),0).toString();
        String Name = tableSanPham.getValueAt(TableSanPham.getSelectedRow(),1).toString();
        String Mota  = tableSanPham.getValueAt(TableSanPham.getSelectedRow(), 2).toString();
        String Gia = tableSanPham.getValueAt(TableSanPham.getSelectedRow(), 3).toString();
        String Soluong  = tableSanPham.getValueAt(TableSanPham.getSelectedRow(), 4).toString();   
        setSelectedCombobox(tableSanPham.getValueAt(TableSanPham.getSelectedRow(), 5).toString(),cmbNCC1);
        
        txtID.setText(IDSP);
        txtNameSP1.setText(Name);
        txtMoTa1.setText(Mota);
        txtGiaThanh1.setText(Gia);
        txtSoLuong1.setText(Soluong);
        
   
        jTSanPham.setSelectedIndex(2);
    }//GEN-LAST:event_TableSanPhamMousePressed

    private void jButtonChangeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonChangeMousePressed
        String ID , Name ,soluong ,giathanh , mota ,ncc  ;
        ID = txtID.getText();
        Name = txtNameSP1.getText();
        soluong = txtSoLuong1.getText();
        giathanh = txtGiaThanh1.getText();
        mota = txtMoTa1.getText();
        ncc = GetCbbSelected(cmbNCC1);
        if (!ID.isEmpty())
        {
            String sql ="UPDATE Products SET Name ='"+Name+"',Description='"+mota+"',Price = '"+giathanh+"',Quantity = '"+soluong+"',ManufacturerID='"+ncc+"' where ProductID ='"+ID+"'";
        
            desktopapp.DesktopApp.connection.ExcuteQueryUpdateDB(sql);
            JOptionPane.showMessageDialog(this,"Sửa thành công","Thông báo",JOptionPane.INFORMATION_MESSAGE);
            Showdata();
            ClearText(txtID,txtGiaThanh1,txtSoLuong1,txtMoTa1);
        
            jTSanPham.setSelectedIndex(1);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Không tìm thấy !","Thông báo",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_jButtonChangeMousePressed
    public void SearchSanPham()
    {
        String Search = txtSearchNameSP.getText();
        String sql = "SELECT * FROM Products where Name like N'%"+Search+"%'";
        ResultSet rs = desktopapp.DesktopApp.connection.ExcuteQueryGetTable(sql);
        
        DefaultTableModel tbModel = (DefaultTableModel) TableSanPham.getModel();
        tbModel.setRowCount(0);
        
        Object obj[] = new Object[10];
        
        try {
            while (rs.next()) {
                obj[0] = rs.getString("ProductID");
                obj[1] = rs.getString("Name");
                obj[2] = rs.getString("Description");
                obj[3] = rs.getString("Price");
                obj[4] = rs.getString("Quantity");
                obj[5] = rs.getString("ManufacturerID");
                
                tbModel.addRow(obj);
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(new JFrame(),"Lỗi truy xuất dữ liệu ");
        }
        
    }

    public void Showdata(){
        String sql = "select * from Products";
        ResultSet rs = desktopapp.DesktopApp.connection.ExcuteQueryGetTable(sql);
        
        DefaultTableModel tbModel = (DefaultTableModel) TableSanPham.getModel();
        tbModel.setRowCount(0);
        
        Object obj[] = new Object[10];
        
        try {
            while (rs.next()) {
                obj[0] = rs.getString("ProductID");
                obj[1] = rs.getString("Name");
                obj[2] = rs.getString("Description");
                obj[3] = rs.getString("Price");
                obj[4] = rs.getString("Quantity");
                obj[5] = rs.getString("ManufacturerID");
                
                tbModel.addRow(obj);
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(new JFrame(),"Lỗi truy xuất dữ liệu ");
        }
    }
    public static void ClearText(JTextField...textFields)
    {
        for(JTextField textField : textFields)
        {
            textField.setText("");
        }
    }
    public DefaultComboBoxModel LayDuLieucbb(String bang, String Ten, String Ma) {
        String cautruyvan = "select *from " + bang;
        ResultSet rs = desktopapp.DesktopApp.connection.ExcuteQueryGetTable(cautruyvan);
        DefaultComboBoxModel cbbmodel = new DefaultComboBoxModel();
        try {
            while (rs.next()) {
                DisplayModel valueModel = new DisplayModel(rs.getString(Ten), rs.getString(Ma));
                cbbmodel.addElement(valueModel);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return cbbmodel;
    }
    public void ShowCombobox()
    {
        cmbNCC.setModel(LayDuLieucbb("Manufacturers", "ManufacturerID","Name"));
    }
    public String GetCbbSelected(JComboBox cbb) {
        Object[] obj = cbb.getSelectedObjects();
        DisplayModel item = (DisplayModel) obj[0];
        return item.DisplayValue.toString();
    }

    public void setSelectedCombobox(String cbbselected, JComboBox cbb) {
        for (int i = 0; i < cbb.getItemCount(); i++) {
            Object obj = cbb.getItemAt(i);
            if (obj != null) {
                DisplayModel m = (DisplayModel) obj;
                if (cbbselected.trim().equals(m.displayMember)) {
                    cbb.setSelectedItem(m);
                }
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableSanPham;
    private javax.swing.JComboBox<String> cmbNCC;
    private javax.swing.JComboBox<String> cmbNCC1;
    private javax.swing.JPanel jButtonAddSP;
    private javax.swing.JPanel jButtonChange;
    private javax.swing.JPanel jButtonDelete;
    private javax.swing.JLabel jButtonSearch;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPAddSanpham;
    private javax.swing.JPanel jPOptionsSanpham;
    private javax.swing.JPanel jPQlSanpham;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTSanPham;
    private javax.swing.JTextField txtGiaThanh1;
    private javax.swing.JTextField txtGiaTien;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMoTa;
    private javax.swing.JTextField txtMoTa1;
    private javax.swing.JTextField txtNameSP;
    private javax.swing.JTextField txtNameSP1;
    private javax.swing.JTextField txtSearchNameSP;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtSoLuong1;
    // End of variables declaration//GEN-END:variables

    private void ClearText(JTextField txtNameSP, JTextField txtGiaTien, JTextField txtMoTa, JSpinner txtSoLuong) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
