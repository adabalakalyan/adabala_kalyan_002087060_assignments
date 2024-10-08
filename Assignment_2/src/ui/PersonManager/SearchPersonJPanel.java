/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.PersonManager;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Address;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author nanik
 */
public class SearchPersonJPanel extends javax.swing.JPanel {
    
        private JPanel userProcessContainer;
    private PersonDirectory personDirectory;
    private Person person; // Store the found person

    /**
     * Creates new form SearchPersonJPanel
     */
    public SearchPersonJPanel(JPanel userProcessContainer, PersonDirectory personDirectory) {
        initComponents();
        
                this.userProcessContainer = userProcessContainer;
        this.personDirectory = personDirectory;
        
                setViewMode();
    }
    
     private void setViewMode() {
        txtfirstname.setEnabled(false);
        txtlastname.setEnabled(false);
        txtemail.setEnabled(false);
        txtphone.setEnabled(false);
        txtnationality.setEnabled(false);
        txtssn.setEnabled(false);
        txtAddressLine1Home.setEnabled(false);
        txtAddressLine2Home.setEnabled(false);
        txtCityHome.setEnabled(false);
        txtStateHome.setEnabled(false);
        txtzip.setEnabled(false);
        txtAddressLine1Office.setEnabled(false);
        txtAddressLine2Office.setEnabled(false);
        txtCityOffice.setEnabled(false);
        txtStateOffice.setEnabled(false);
        txtZipOffice.setEnabled(false);
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(false);
    }

    /**
     * Method to enable fields for updating
     */
    private void setEditMode() {
        txtfirstname.setEnabled(true);
        txtlastname.setEnabled(true);
        txtemail.setEnabled(true);
        txtphone.setEnabled(true);
        txtnationality.setEnabled(true);
        txtssn.setEnabled(true);
        txtAddressLine1Home.setEnabled(true);
        txtAddressLine2Home.setEnabled(true);
        txtCityHome.setEnabled(true);
        txtStateHome.setEnabled(true);
        txtzip.setEnabled(true);
        txtAddressLine1Office.setEnabled(true);
        txtAddressLine2Office.setEnabled(true);
        txtCityOffice.setEnabled(true);
        txtStateOffice.setEnabled(true);
        txtZipOffice.setEnabled(true);
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
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
        btnBack = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        txtssn = new javax.swing.JTextField();
        lblNationality = new javax.swing.JLabel();
        txtfirstname = new javax.swing.JTextField();
        lblFirstName = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblLasteName = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        lblTelephone = new javax.swing.JLabel();
        lblSsn = new javax.swing.JLabel();
        txtnationality = new javax.swing.JTextField();
        txtlastname = new javax.swing.JTextField();
        txtphone = new javax.swing.JTextField();
        txtStateHome = new javax.swing.JTextField();
        txtzip = new javax.swing.JTextField();
        lblTtileHome = new javax.swing.JLabel();
        lblTitleOffice = new javax.swing.JLabel();
        txtAddressLine1Home = new javax.swing.JTextField();
        lblZipOffice = new javax.swing.JLabel();
        txtAddressLine2Home = new javax.swing.JTextField();
        txtAddressLine1Office = new javax.swing.JTextField();
        txtCityHome = new javax.swing.JTextField();
        txtAddressLine2Office = new javax.swing.JTextField();
        txtCityOffice = new javax.swing.JTextField();
        txtStateOffice = new javax.swing.JTextField();
        lblAddressLine1Home = new javax.swing.JLabel();
        txtZipOffice = new javax.swing.JTextField();
        lblAddressLine2Home = new javax.swing.JLabel();
        lblAddressLine1Office = new javax.swing.JLabel();
        lblCityHome = new javax.swing.JLabel();
        lblAddressLine2Office = new javax.swing.JLabel();
        lblStateHome = new javax.swing.JLabel();
        lblCityOffice = new javax.swing.JLabel();
        lblStateOffice = new javax.swing.JLabel();
        lblZipHome = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();

        btnBack.setText("<<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtssn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtssnActionPerformed(evt);
            }
        });

        lblNationality.setText("Nationality");

        lblFirstName.setText("First Name");

        lblEmail.setText("E-mail");

        lblLasteName.setText("Last Name");

        lblTelephone.setText("Telephone");

        lblSsn.setText("SSN");

        lblTtileHome.setText("Home Address");

        lblTitleOffice.setText("Office Address");

        lblZipOffice.setText("Zip");

        lblAddressLine1Home.setText("Address line 1");

        lblAddressLine2Home.setText("Address line 2");

        lblAddressLine1Office.setText("Address line 1");

        lblCityHome.setText("City");

        lblAddressLine2Office.setText("Address line 2");

        lblStateHome.setText("State");

        lblCityOffice.setText("City");

        lblStateOffice.setText("State");

        lblZipHome.setText("Zip");

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(161, 161, 161)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblAddressLine1Home)
                                        .addComponent(lblAddressLine2Home))
                                    .addComponent(lblCityHome))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtCityHome)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblStateHome)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtStateHome, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblZipHome)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtzip, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtAddressLine2Home, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtAddressLine1Home)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFirstName)
                                    .addComponent(lblTelephone)
                                    .addComponent(lblSsn))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtssn)
                                    .addComponent(txtfirstname)
                                    .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblLasteName)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtlastname, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblNationality)
                                                .addGap(18, 18, 18))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(lblEmail)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtemail)
                                            .addComponent(txtnationality, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblTitleOffice)
                                .addGap(196, 196, 196))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAddressLine1Office)
                                    .addComponent(lblAddressLine2Office)
                                    .addComponent(lblCityOffice))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAddressLine1Office)
                                    .addComponent(txtAddressLine2Office)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtCityOffice)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblStateOffice)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtStateOffice, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblZipOffice)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtZipOffice, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                        .addGap(40, 40, 40))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTtileHome)
                .addGap(241, 241, 241))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtlastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFirstName)
                    .addComponent(lblLasteName))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSsn)
                    .addComponent(txtssn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelephone)
                    .addComponent(lblNationality)
                    .addComponent(txtnationality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(lblTtileHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddressLine1Home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddressLine1Home))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddressLine2Home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddressLine2Home)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCityHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStateHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtzip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCityHome)
                    .addComponent(lblStateHome)
                    .addComponent(lblZipHome)
                    .addComponent(btnSearch))
                .addGap(39, 39, 39)
                .addComponent(lblTitleOffice)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAddressLine1Office, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAddressLine1Office))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtAddressLine2Office, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblAddressLine2Office)))
                .addGap(18, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCityOffice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStateOffice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtZipOffice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCityOffice)
                    .addComponent(lblStateOffice)
                    .addComponent(lblZipOffice))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnUpdate))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtssnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtssnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtssnActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String searchText = txtSearch.getText().trim();

        person = personDirectory.searchPerson(searchText, searchText, searchText);

        if (person != null) {
            // Populate all fields with the found person's data
            txtfirstname.setText(person.getFirstName());
            txtlastname.setText(person.getLastName());
            txtemail.setText(person.getEmail());
            txtphone.setText(person.getPhoneNumber());
            txtnationality.setText(person.getNationality());
            txtssn.setText(person.getSocialSecurityNumber());
            txtAddressLine1Home.setText(person.getHomeAddress().getAddressLine1());
            txtAddressLine2Home.setText(person.getHomeAddress().getAddressLine2());
            txtCityHome.setText(person.getHomeAddress().getCity());
            txtStateHome.setText(person.getHomeAddress().getState());
            txtzip.setText(person.getHomeAddress().getZipCode());
            txtAddressLine1Office.setText(person.getWorkAddress().getAddressLine1());
            txtAddressLine2Office.setText(person.getWorkAddress().getAddressLine2());
            txtCityOffice.setText(person.getWorkAddress().getCity());
            txtStateOffice.setText(person.getWorkAddress().getState());
            txtZipOffice.setText(person.getWorkAddress().getZipCode());

            // Enable the Update button so the user can edit the details
            btnUpdate.setEnabled(true);
        } else {
            // Display error if no person was found
            JOptionPane.showMessageDialog(this, "No person found with the given criteria.", "Error", JOptionPane.ERROR_MESSAGE);
            setViewMode();
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
                setEditMode();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
      if (txtfirstname.getText().isEmpty() || txtlastname.getText().isEmpty() ||
            txtemail.getText().isEmpty() || txtphone.getText().isEmpty() ||
            txtnationality.getText().isEmpty() || txtssn.getText().isEmpty() ||
            txtAddressLine1Home.getText().isEmpty() || txtCityHome.getText().isEmpty() ||
            txtStateHome.getText().isEmpty() || txtzip.getText().isEmpty() ||
            txtAddressLine1Office.getText().isEmpty() || txtCityOffice.getText().isEmpty() ||
            txtStateOffice.getText().isEmpty() || txtZipOffice.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields are required.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Save the updated person's details
        person.setFirstName(txtfirstname.getText());
        person.setLastName(txtlastname.getText());
        person.setEmail(txtemail.getText());
        person.setPhoneNumber(txtphone.getText());
        person.setNationality(txtnationality.getText());
        person.setSocialSecurityNumber(txtssn.getText());
        person.getHomeAddress().setAddressLine1(txtAddressLine1Home.getText());
        person.getHomeAddress().setAddressLine2(txtAddressLine2Home.getText());
        person.getHomeAddress().setCity(txtCityHome.getText());
        person.getHomeAddress().setState(txtStateHome.getText());
        person.getHomeAddress().setZipCode(txtzip.getText());
        person.getWorkAddress().setAddressLine1(txtAddressLine1Office.getText());
        person.getWorkAddress().setAddressLine2(txtAddressLine2Office.getText());
        person.getWorkAddress().setCity(txtCityOffice.getText());
        person.getWorkAddress().setState(txtStateOffice.getText());
        person.getWorkAddress().setZipCode(txtZipOffice.getText());

        JOptionPane.showMessageDialog(this, "Person updated successfully.", "Information", JOptionPane.INFORMATION_MESSAGE);

        // Switch back to view mode after saving
        setViewMode();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
    userProcessContainer.removeAll();
    userProcessContainer.repaint();
    userProcessContainer.revalidate();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAddressLine1Home;
    private javax.swing.JLabel lblAddressLine1Office;
    private javax.swing.JLabel lblAddressLine2Home;
    private javax.swing.JLabel lblAddressLine2Office;
    private javax.swing.JLabel lblCityHome;
    private javax.swing.JLabel lblCityOffice;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLasteName;
    private javax.swing.JLabel lblNationality;
    private javax.swing.JLabel lblSsn;
    private javax.swing.JLabel lblStateHome;
    private javax.swing.JLabel lblStateOffice;
    private javax.swing.JLabel lblTelephone;
    private javax.swing.JLabel lblTitleOffice;
    private javax.swing.JLabel lblTtileHome;
    private javax.swing.JLabel lblZipHome;
    private javax.swing.JLabel lblZipOffice;
    private javax.swing.JTextField txtAddressLine1Home;
    private javax.swing.JTextField txtAddressLine1Office;
    private javax.swing.JTextField txtAddressLine2Home;
    private javax.swing.JTextField txtAddressLine2Office;
    private javax.swing.JTextField txtCityHome;
    private javax.swing.JTextField txtCityOffice;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtStateHome;
    private javax.swing.JTextField txtStateOffice;
    private javax.swing.JTextField txtZipOffice;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfirstname;
    private javax.swing.JTextField txtlastname;
    private javax.swing.JTextField txtnationality;
    private javax.swing.JTextField txtphone;
    private javax.swing.JTextField txtssn;
    private javax.swing.JTextField txtzip;
    // End of variables declaration//GEN-END:variables
}
