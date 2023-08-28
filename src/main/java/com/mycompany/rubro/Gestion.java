/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.rubro;

import java.awt.Color;
import javax.swing.JOptionPane;


/**
 *
 * @author nahue
 */
public class Gestion extends javax.swing.JInternalFrame {

    /**
     * Creates new form Gestion
     */
    public Gestion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane2 = new javax.swing.JDesktopPane();
        jBnuevo1 = new javax.swing.JButton();
        jCrubro1 = new javax.swing.JComboBox<>();
        jLDisponible1 = new javax.swing.JLabel();
        jTcodigo1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jBguardar1 = new javax.swing.JButton();
        jbbuscar1 = new javax.swing.JButton();
        jBeliminar1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jBsalir1 = new javax.swing.JButton();
        jTdescripcion1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTstock1 = new javax.swing.JTextField();
        jTprecio1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);

        jBnuevo1.setText("Nuevo");
        jBnuevo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnuevo1ActionPerformed(evt);
            }
        });

        jCrubro1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comestible", "Limpieza", "Perfumeria" }));
        jCrubro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCrubro1ActionPerformed(evt);
            }
        });

        jLDisponible1.setText(".");

        jTcodigo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTcodigo1ActionPerformed(evt);
            }
        });
        jTcodigo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTcodigo1KeyReleased(evt);
            }
        });

        jLabel8.setText("Stock");

        jBguardar1.setText("Guardar");
        jBguardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardar1ActionPerformed(evt);
            }
        });

        jbbuscar1.setIcon(new javax.swing.ImageIcon("D:\\Users\\nahue\\Downloads\\lupa.png")); // NOI18N
        jbbuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbbuscar1ActionPerformed(evt);
            }
        });

        jBeliminar1.setText("Eliminar");
        jBeliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminar1ActionPerformed(evt);
            }
        });

        jLabel9.setText("Descripcion");

        jBsalir1.setText("Salir");

        jTdescripcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTdescripcion1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Gestion de producto");

        jLabel11.setText("Precio");

        jLabel12.setText("Codigo");

        jLabel7.setText("Rubro");

        jLabel2.setText("Ver listas de codigos");

        jDesktopPane2.setLayer(jBnuevo1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jCrubro1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLDisponible1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jTcodigo1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jBguardar1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jbbuscar1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jBeliminar1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jBsalir1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jTdescripcion1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jTstock1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jTprecio1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addGap(35, 35, 35))
                                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane2Layout.createSequentialGroup()
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCrubro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTprecio1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTstock1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                        .addComponent(jBguardar1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBnuevo1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBeliminar1)
                                        .addGap(11, 11, 11))
                                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                                .addComponent(jTcodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLDisponible1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jTdescripcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE))
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel10))
                                    .addComponent(jLabel12))
                                .addGap(22, 22, 22)))
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jBsalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jbbuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(2, 2, 2)))
                .addGap(0, 80, Short.MAX_VALUE))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(20, 20, 20)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jTcodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLDisponible1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTdescripcion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTprecio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCrubro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTstock1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbbuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBguardar1)
                    .addComponent(jBnuevo1)
                    .addComponent(jBeliminar1)
                    .addComponent(jBsalir1))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBnuevo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnuevo1ActionPerformed
        // TODO add your handling code here:
        
        jTcodigo1.setText("");
        jTdescripcion1.setText("");
        jTprecio1.setText("");
        jCrubro1.setSelectedIndex(0);
        jTstock1.setText("");
        jLDisponible1.setText(""); 
    }//GEN-LAST:event_jBnuevo1ActionPerformed

    private void jCrubro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCrubro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCrubro1ActionPerformed

    private void jTcodigo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTcodigo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTcodigo1ActionPerformed

    private void jBguardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardar1ActionPerformed
        // TODO add your handling code here:
        
        if (jTcodigo1.getText().isEmpty() || jTdescripcion1.getText().isEmpty() || jTprecio1.getText().isEmpty() || jTstock1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Campo vacío.");

        } else {
            try {

                int codigo = Integer.parseInt(jTcodigo1.getText());
                String descripcion = jTdescripcion1.getText();
                double precio = Double.parseDouble(jTprecio1.getText());
                Categoria rubro = null;
                int stock = Integer.parseInt(jTstock1.getText());
                
                
                
                if (jCrubro1.getSelectedIndex() == 0) {
                    rubro = Categoria.COMESTIBLE;
                } else if (jCrubro1.getSelectedIndex() == 1) {
                    rubro = Categoria.LIMPIEZA;
                } else {
                    rubro = Categoria.PERFUMERIA;
                }
                Producto prod = new Producto(codigo, descripcion, precio, stock, rubro);

                for (Producto producto : DeTodoSA.listaProductos) {
                    if (codigo == producto.getCodigo()) {
                        JOptionPane.showMessageDialog(this, "El codigo ya se registró anteriormente.");
                        jBnuevo1ActionPerformed(evt);
                        return;
                    }
                }

                DeTodoSA.listaProductos.add(prod);

                JOptionPane.showMessageDialog(this, "Producto registrado exitosamente");

                jBnuevo1ActionPerformed(evt); //Borrar los campos de texto.

            } catch (NumberFormatException e) {

                JOptionPane.showMessageDialog(this, "Error en el campo de texto. (solo numeros)");

            }

        }
        
        
    }//GEN-LAST:event_jBguardar1ActionPerformed

    private void jbbuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbbuscar1ActionPerformed
        // TODO add your handling code here:

        GestionCodigo ventana = new GestionCodigo();
        ventana.setVisible(true);
        jDesktopPane2.add(ventana);
        jDesktopPane2.moveToFront(ventana);
    }//GEN-LAST:event_jbbuscar1ActionPerformed

    private void jBeliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminar1ActionPerformed
        // TODO add your handling code here:
        
        try {
            int codigo = Integer.parseInt(jTcodigo1.getText());
            for (Producto producto : DeTodoSA.listaProductos) {

                if (producto.getCodigo() == codigo) {
                    DeTodoSA.listaProductos.remove(producto);
                    JOptionPane.showMessageDialog(this, "Producto eliminado exitosamente. (cod. " + codigo + ")");
                    return;
                }
            }
            JOptionPane.showMessageDialog(this, "No se encontró un producto con ese código.");
            jBnuevo1ActionPerformed(evt);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un codigo válido. (solo numeros)");
        }
        
    }//GEN-LAST:event_jBeliminar1ActionPerformed

    private void jTdescripcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTdescripcion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTdescripcion1ActionPerformed

    private void jTcodigo1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTcodigo1KeyReleased
        // TODO add your handling code here:
        
        try {
            for (Producto prod : DeTodoSA.listaProductos) {
                if (prod.getCodigo() == Integer.parseInt(jTcodigo1.getText())) {
                    jLDisponible1.setText("No disponible...");
                    jLDisponible1.setForeground(Color.RED);
                    return;
                } else {
                    jLDisponible1.setText("Disponible");
                    jLDisponible1.setForeground(Color.GREEN);
                }
            }
        } catch (NumberFormatException e) {
            jLDisponible1.setText("");
        }
        
        
    }//GEN-LAST:event_jTcodigo1KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBeliminar1;
    private javax.swing.JButton jBguardar1;
    private javax.swing.JButton jBnuevo1;
    private javax.swing.JButton jBsalir1;
    private javax.swing.JComboBox<String> jCrubro1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLDisponible1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTcodigo1;
    private javax.swing.JTextField jTdescripcion1;
    private javax.swing.JTextField jTprecio1;
    private javax.swing.JTextField jTstock1;
    private javax.swing.JButton jbbuscar1;
    // End of variables declaration//GEN-END:variables

}
