/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import javax.swing.JPanel;
import model.Address;
import model.Person;
import model.PersonDirectory;
import ui.PersonManager.AddPersonJPanel;
import ui.PersonManager.ListPersonJPanel;
import ui.PersonManager.SearchPersonJPanel; 

/**
 *
 * @author nanik
 */
public class MainJFrame extends javax.swing.JFrame {
    
    private PersonDirectory personDirectory;
  

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        
        // Initialize the PersonDirectory
        personDirectory = new PersonDirectory();
        
        // Pre-populate the PersonDirectory with some demo data
        generateDemoData();
        
        // Set up CardLayout for the userProcessContainer panel
        CardLayout cardLayout = new CardLayout();
        userProcessContainer.setLayout(cardLayout);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        leftJPanel = new javax.swing.JPanel();
        btnAddPerson = new javax.swing.JButton();
        btnListPerson = new javax.swing.JButton();
        btnSearchPerson = new javax.swing.JButton();
        userProcessContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAddPerson.setText("Add Person");
        btnAddPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPersonActionPerformed(evt);
            }
        });

        btnListPerson.setText("List Person");
        btnListPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListPersonActionPerformed(evt);
            }
        });

        btnSearchPerson.setText("Search Person");
        btnSearchPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchPersonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftJPanelLayout = new javax.swing.GroupLayout(leftJPanel);
        leftJPanel.setLayout(leftJPanelLayout);
        leftJPanelLayout.setHorizontalGroup(
            leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddPerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnListPerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSearchPerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        leftJPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddPerson, btnListPerson, btnSearchPerson});

        leftJPanelLayout.setVerticalGroup(
            leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftJPanelLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(btnAddPerson)
                .addGap(18, 18, 18)
                .addComponent(btnListPerson)
                .addGap(18, 18, 18)
                .addComponent(btnSearchPerson)
                .addContainerGap(439, Short.MAX_VALUE))
        );

        leftJPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAddPerson, btnListPerson, btnSearchPerson});

        splitPane.setLeftComponent(leftJPanel);

        userProcessContainer.setLayout(new java.awt.CardLayout());
        splitPane.setRightComponent(userProcessContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1046, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPersonActionPerformed
        // TODO add your handling code here:
          AddPersonJPanel addPersonPanel = new AddPersonJPanel(userProcessContainer, personDirectory);
        userProcessContainer.add("AddPersonJPanel", addPersonPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnAddPersonActionPerformed

    private void btnListPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListPersonActionPerformed
        // TODO add your handling code here:
        ListPersonJPanel listPersonPanel = new ListPersonJPanel(userProcessContainer, personDirectory);
        userProcessContainer.add("ListPersonJPanel", listPersonPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnListPersonActionPerformed

    private void btnSearchPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchPersonActionPerformed
        // TODO add your handling code here:
        
       SearchPersonJPanel searchPersonPanel = new SearchPersonJPanel(userProcessContainer, personDirectory);
        userProcessContainer.add("SearchPersonJPanel", searchPersonPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSearchPersonActionPerformed

    private void generateDemoData() {
 // Address for Person 1
    Address homeAddress1 = new Address("123 Main St", "Apt 4", "New York", "NY", "10001", "123-456-7890");
    Address workAddress1 = new Address("456 Work Blvd", "Suite 100", "New York", "NY", "10002", "987-654-3210");
    Person person1 = new Person("John", "Doe", "111-22-3333", "American", "john.doe@example.com", "555-555-5555", homeAddress1, workAddress1);
    
    // Address for Person 2
    Address homeAddress2 = new Address("789 Elm St", "2B", "Los Angeles", "CA", "90001", "234-567-8901");
    Address workAddress2 = new Address("101 Office Way", "Suite 200", "Los Angeles", "CA", "90002", "876-543-2109");
    Person person2 = new Person("Jane", "Smith", "222-33-4444", "Canadian", "jane.smith@example.com", "555-123-4567", homeAddress2, workAddress2);

    // Address for Person 3
    Address homeAddress3 = new Address("654 Maple Ave", "Unit 1", "Chicago", "IL", "60601", "345-678-9012");
    Address workAddress3 = new Address("789 Corporate Dr", "Floor 3", "Chicago", "IL", "60602", "543-210-9876");
    Person person3 = new Person("Michael", "Johnson", "333-44-5555", "British", "michael.johnson@example.com", "555-234-5678", homeAddress3, workAddress3);

    // Address for Person 4
    Address homeAddress4 = new Address("321 Oak St", "5A", "Houston", "TX", "77001", "456-789-0123");
    Address workAddress4 = new Address("123 Business Rd", "Suite 400", "Houston", "TX", "77002", "654-321-0987");
    Person person4 = new Person("Emily", "Brown", "444-55-6666", "Australian", "emily.brown@example.com", "555-345-6789", homeAddress4, workAddress4);

    // Address for Person 5
    Address homeAddress5 = new Address("987 Pine St", "3C", "Miami", "FL", "33101", "567-890-1234");
    Address workAddress5 = new Address("456 Enterprise Ln", "Suite 500", "Miami", "FL", "33102", "765-432-1098");
    Person person5 = new Person("David", "Williams", "555-66-7777", "Mexican", "david.williams@example.com", "555-456-7890", homeAddress5, workAddress5);

    // Adding demo persons to the personDirectory
    personDirectory.addPerson(person1);
    personDirectory.addPerson(person2);
    personDirectory.addPerson(person3);
    personDirectory.addPerson(person4);
    personDirectory.addPerson(person5);
        // Add more people as needed...
    }
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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPerson;
    private javax.swing.JButton btnListPerson;
    private javax.swing.JButton btnSearchPerson;
    private javax.swing.JPanel leftJPanel;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}
