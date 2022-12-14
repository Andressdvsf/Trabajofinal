/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formulario;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Andres
 */
public class inicio extends javax.swing.JFrame {
    
    DefaultTableModel dtm;

    
    public inicio() {
        initComponents();
        dtm = (DefaultTableModel) this.tabla1.getModel();
        
    }
    
    
    private void crearArchivo() throws IOException{
        File Archivo = new File("C:\\Users\\Andres\\Documents\\Archivo.txt");
        
        
        if(Archivo.exists()){
           System.out.println("Ya existe");        
        }else {
            JOptionPane.showMessageDialog(null, "No se encuentra el archivo, se creara" , "Gestios de Archivos", 1);
            Archivo.createNewFile();
           
        }

    }
        private void guardarArchivo(){
        try {
            FileWriter salvarArchivo = new FileWriter("C:\\Users\\Andres\\Documents\\Archivo.txt");
            
            for (int i=0; i < this.tabla1.getRowCount(); i++){
                salvarArchivo.write(dtm.getValueAt(i, 0).toString() + "\n");
                salvarArchivo.write(dtm.getValueAt(i, 1).toString() + "\n");
                salvarArchivo.write(dtm.getValueAt(i, 2).toString() + "\n");
                salvarArchivo.write(dtm.getValueAt(i, 3).toString() + "\n");
                salvarArchivo.write(dtm.getValueAt(i, 4).toString() + "\n");
            }
            salvarArchivo.close();
            JOptionPane.showMessageDialog(null, "Datos Almacenados","Gestion de Archivos", 1);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erorr" + ex);
        
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        btnguardar = new javax.swing.JButton();
        btncrear = new javax.swing.JButton();
        btnagregar = new javax.swing.JButton();
        btnmostrar = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabla1.setAutoCreateRowSorter(true);
        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "TELEFONO", "NOMBRE", "APELLIDO"
            }
        ));
        tabla1.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tabla1);
        tabla1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        btnguardar.setText("Guardar");

        btncrear.setText("Crear");
        btncrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncrearActionPerformed(evt);
            }
        });

        btnagregar.setText("Agregar");

        btnmostrar.setText("Mostrar");
        btnmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrarActionPerformed(evt);
            }
        });

        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        jButton6.setText("Salir");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnguardar)
                    .addComponent(btncrear)
                    .addComponent(btnagregar)
                    .addComponent(btnmostrar)
                    .addComponent(btnlimpiar)
                    .addComponent(jButton6))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnguardar)
                        .addGap(18, 18, 18)
                        .addComponent(btncrear)
                        .addGap(18, 18, 18)
                        .addComponent(btnagregar)
                        .addGap(18, 18, 18)
                        .addComponent(btnmostrar)
                        .addGap(18, 18, 18)
                        .addComponent(btnlimpiar)
                        .addGap(29, 29, 29)
                        .addComponent(jButton6)))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncrearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btncrearActionPerformed

    private void btnmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrarActionPerformed
        // TODO add your handling code here:
        
        String id, Nombre,Apellido;
        
        String au = "C:\\Users\\Andres\\Documents\\Archivo.txt";
        
        File arcLectura = new File(au);
        try {
           Scanner lecturaArchivo = new Scanner(arcLectura);
           
           while(lecturaArchivo.hasNextLine()){
               id = lecturaArchivo.nextLine();
               Nombre = lecturaArchivo.nextLine();
               Apellido = lecturaArchivo.nextLine();
               
               
               dtm.addRow(new Object[]{id, Nombre, Apellido});
           }
        }catch (FileNotFoundException e) {
             JOptionPane.showMessageDialog(null, "Erorr" + e);
        }

    }//GEN-LAST:event_btnmostrarActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        // TODO add your handling code here:
         
    int fila = this.tabla1.getRowCount();
    for (int i = fila -1; i>=0;i--){
        dtm.removeRow(i);
    }
    }//GEN-LAST:event_btnlimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btncrear;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnmostrar;
    private javax.swing.JButton jButton6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla1;
    // End of variables declaration//GEN-END:variables
}
