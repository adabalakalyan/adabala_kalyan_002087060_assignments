/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import model.Product;

/**
 *
 * @author nanik
 */
public class ViewJPanel extends javax.swing.JPanel {
    
    Product product;

    /**
     * Creates new form ViewJPanel
     */
    public ViewJPanel(Product p) {
        initComponents();
        product = p;
        
        displayproduct();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtfirstname = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtlicensenumber = new javax.swing.JTextField();
        txtaddress1 = new javax.swing.JTextField();
        txtaddress2 = new javax.swing.JTextField();
        txtcity = new javax.swing.JTextField();
        txttelephone = new javax.swing.JTextField();
        txtnationality = new javax.swing.JTextField();
        txtrelationship = new javax.swing.JTextField();
        txtincome = new javax.swing.JTextField();
        txtlastname = new javax.swing.JTextField();
        txtphone = new javax.swing.JTextField();
        txtheight = new javax.swing.JTextField();
        txtweight = new javax.swing.JTextField();
        txtlicensestate = new javax.swing.JTextField();
        txtssn = new javax.swing.JTextField();
        txtstateaddress = new javax.swing.JTextField();
        txtzip = new javax.swing.JTextField();
        txtfax = new javax.swing.JTextField();
        txtoccupation = new javax.swing.JTextField();
        lblfirstname = new javax.swing.JLabel();
        lbllastename = new javax.swing.JLabel();
        lblemail = new javax.swing.JLabel();
        lblphone = new javax.swing.JLabel();
        lblheight = new javax.swing.JLabel();
        lblweight = new javax.swing.JLabel();
        lbllicensenumber = new javax.swing.JLabel();
        lbllicensestate = new javax.swing.JLabel();
        lblssn = new javax.swing.JLabel();
        lbladdress1 = new javax.swing.JLabel();
        lbladdress2 = new javax.swing.JLabel();
        lblcity = new javax.swing.JLabel();
        lblstate = new javax.swing.JLabel();
        lblzip = new javax.swing.JLabel();
        lbltelephone = new javax.swing.JLabel();
        lblfax = new javax.swing.JLabel();
        lblnationality = new javax.swing.JLabel();
        lblrelationshipstatus = new javax.swing.JLabel();
        lbloccupation = new javax.swing.JLabel();
        lblincome = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        lbltitle = new javax.swing.JLabel();

        txtssn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtssnActionPerformed(evt);
            }
        });

        lblfirstname.setText("First Name");

        lbllastename.setText("Last Name");

        lblemail.setText("E-mail");

        lblphone.setText("Phone");

        lblheight.setText("Height");

        lblweight.setText("Weight");

        lbllicensenumber.setText("Driver License No.");

        lbllicensestate.setText("State");

        lblssn.setText("SSN");

        lbladdress1.setText("Address line 1");

        lbladdress2.setText("Address line 2");

        lblcity.setText("City");

        lblstate.setText("State");

        lblzip.setText("Zip");

        lbltelephone.setText("Telephone");

        lblfax.setText("Fax");

        lblnationality.setText("Nationality");

        lblrelationshipstatus.setText("Relationship Status");

        lbloccupation.setText("Occupation");

        lblincome.setText("Income");

        btnSave.setText("Save");

        lbltitle.setText("Personal Profile");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblfirstname)
                    .addComponent(lblemail)
                    .addComponent(lblphone)
                    .addComponent(lbllicensenumber)
                    .addComponent(lbladdress1)
                    .addComponent(lbladdress2)
                    .addComponent(lblcity)
                    .addComponent(lbltelephone)
                    .addComponent(lblnationality)
                    .addComponent(lblrelationshipstatus)
                    .addComponent(lblincome))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSave)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtfirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbllastename)
                        .addGap(18, 18, 18)
                        .addComponent(txtlastname, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblheight)
                                .addGap(12, 12, 12)
                                .addComponent(txtheight, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblweight))
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txtweight, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtaddress2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtaddress1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtincome, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtrelationship, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbloccupation)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtoccupation, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtcity, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(lblstate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtfax, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                    .addComponent(txtstateaddress))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblzip)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtzip, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtlicensenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbllicensestate)
                                        .addGap(21, 21, 21)
                                        .addComponent(txtlicensestate, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txttelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblfax))
                                    .addComponent(txtnationality, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblssn)
                                .addGap(30, 30, 30)
                                .addComponent(txtssn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtlastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblfirstname)
                    .addComponent(lbllastename))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblemail))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtheight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtweight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblphone)
                    .addComponent(lblheight)
                    .addComponent(lblweight))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtlicensenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtlicensestate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtssn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbllicensenumber)
                    .addComponent(lbllicensestate)
                    .addComponent(lblssn))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtaddress1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbladdress1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtaddress2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbladdress2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtstateaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtzip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcity)
                    .addComponent(lblstate)
                    .addComponent(lblzip))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltelephone)
                    .addComponent(lblfax))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnationality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnationality))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtrelationship, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtoccupation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblrelationshipstatus)
                    .addComponent(lbloccupation))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtincome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblincome))
                .addGap(18, 18, 18)
                .addComponent(btnSave)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 756, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 572, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtssnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtssnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtssnActionPerformed


    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbladdress1;
    private javax.swing.JLabel lbladdress2;
    private javax.swing.JLabel lblcity;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblfax;
    private javax.swing.JLabel lblfirstname;
    private javax.swing.JLabel lblheight;
    private javax.swing.JLabel lblincome;
    private javax.swing.JLabel lbllastename;
    private javax.swing.JLabel lbllicensenumber;
    private javax.swing.JLabel lbllicensestate;
    private javax.swing.JLabel lblnationality;
    private javax.swing.JLabel lbloccupation;
    private javax.swing.JLabel lblphone;
    private javax.swing.JLabel lblrelationshipstatus;
    private javax.swing.JLabel lblssn;
    private javax.swing.JLabel lblstate;
    private javax.swing.JLabel lbltelephone;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JLabel lblweight;
    private javax.swing.JLabel lblzip;
    private javax.swing.JTextField txtaddress1;
    private javax.swing.JTextField txtaddress2;
    private javax.swing.JTextField txtcity;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfax;
    private javax.swing.JTextField txtfirstname;
    private javax.swing.JTextField txtheight;
    private javax.swing.JTextField txtincome;
    private javax.swing.JTextField txtlastname;
    private javax.swing.JTextField txtlicensenumber;
    private javax.swing.JTextField txtlicensestate;
    private javax.swing.JTextField txtnationality;
    private javax.swing.JTextField txtoccupation;
    private javax.swing.JTextField txtphone;
    private javax.swing.JTextField txtrelationship;
    private javax.swing.JTextField txtssn;
    private javax.swing.JTextField txtstateaddress;
    private javax.swing.JTextField txttelephone;
    private javax.swing.JTextField txtweight;
    private javax.swing.JTextField txtzip;
    // End of variables declaration//GEN-END:variables


    private void displayproduct(){
        
        txtaddress1.setText(product.getAddressline1());
        txtaddress2.setText(product.getAddressline2());
        txtcity.setText(product.getCity());
        txtemail.setText(product.getEmail());
        txtfax.setText(product.getFax());
        txtfirstname.setText(product.getFirstname());
        txtheight.setText(product.getHeight());
        txtincome.setText(product.getIncomeperannum());
        txtlastname.setText(product.getLastname());
        txtlicensenumber.setText(product.getDriverlicensenumber());
        txtlicensestate.setText(product.getDriverlicensestate());
        txtnationality.setText(product.getNationality());
        txtoccupation.setText(product.getOccupation());
        txtphone.setText(product.getPhone());
        txtrelationship.setText(product.getRelationshipstatus());
        txtssn.setText(product.getSsn());
        txtstateaddress.setText(product.getState());
        txttelephone.setText(product.getTelephone());
        txtweight.setText(product.getWeight());
        txtzip.setText(product.getZip());
    }

}

