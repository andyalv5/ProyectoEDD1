/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import javax.swing.JOptionPane;
import newpackage.Lista_productos;
import newpackage.Nodo_productos;
import newpackage.Nodoweight;
import newpackage.Vertex;

/**
 *
 * @author andy
 */
public class newFrame extends javax.swing.JFrame {
    public String a;
    public int b;
    public String c;
    public int d;
    public String e;
    public int f;
    public String g;
    public int h;
    public int pe;
    public int pe1;
    public Nodo_productos nodMine;
    public Nodo_productos nodMine1;
    public Nodo_productos nodMine2;
    public Nodo_productos nodMine3;
    public Inicio mywin;
    /**
     * Creates new form newFrame
     * @param mywin
     */
    public newFrame(Inicio mywin) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.mywin = mywin;
        
        
    }

    private newFrame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Peso = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Producto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Ruta2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Producto1 = new javax.swing.JTextField();
        Producto3 = new javax.swing.JTextField();
        Producto4 = new javax.swing.JTextField();
        Cantidad2 = new javax.swing.JTextField();
        Cantidad1 = new javax.swing.JTextField();
        Cantidad3 = new javax.swing.JTextField();
        Cantidad4 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        Cancelar = new javax.swing.JButton();
        Aceptar = new javax.swing.JButton();
        Producto2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Ruta1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Peso1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(630, 571));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Peso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesoActionPerformed(evt);
            }
        });
        getContentPane().add(Peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 40, 30));

        jTextField2.setEditable(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 40, 30));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Peso Del Arco:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));

        jLabel2.setText("--->");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, 20));

        Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductoActionPerformed(evt);
            }
        });
        Producto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ProductoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ProductoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ProductoKeyTyped(evt);
            }
        });
        getContentPane().add(Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 40, 30));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel3.setText("Agregar Almacen");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        Ruta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ruta2ActionPerformed(evt);
            }
        });
        getContentPane().add(Ruta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 40, 30));

        jLabel4.setText("--->");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, 20));

        jTextField5.setEditable(false);
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 40, 30));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel6.setText("Almacen:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        Producto1.setText("<Producto>");
        Producto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Producto1ActionPerformed(evt);
            }
        });
        Producto1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Producto1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Producto1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Producto1KeyTyped(evt);
            }
        });
        getContentPane().add(Producto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 150, 30));

        Producto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Producto3ActionPerformed(evt);
            }
        });
        Producto3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Producto3KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Producto3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Producto3KeyTyped(evt);
            }
        });
        getContentPane().add(Producto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 150, 30));

        Producto4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Producto4ActionPerformed(evt);
            }
        });
        Producto4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Producto4KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Producto4KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Producto4KeyTyped(evt);
            }
        });
        getContentPane().add(Producto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 150, 30));

        Cantidad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cantidad2ActionPerformed(evt);
            }
        });
        Cantidad2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Cantidad2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Cantidad2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Cantidad2KeyTyped(evt);
            }
        });
        getContentPane().add(Cantidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 50, 30));

        Cantidad1.setText("0");
        Cantidad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cantidad1ActionPerformed(evt);
            }
        });
        Cantidad1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Cantidad1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Cantidad1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Cantidad1KeyTyped(evt);
            }
        });
        getContentPane().add(Cantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 50, 30));

        Cantidad3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cantidad3ActionPerformed(evt);
            }
        });
        Cantidad3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Cantidad3KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Cantidad3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Cantidad3KeyTyped(evt);
            }
        });
        getContentPane().add(Cantidad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 50, 30));

        Cantidad4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cantidad4ActionPerformed(evt);
            }
        });
        Cantidad4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Cantidad4KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Cantidad4KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Cantidad4KeyTyped(evt);
            }
        });
        getContentPane().add(Cantidad4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 50, 30));

        jLabel22.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel22.setText("Producto:");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, 30));

        jLabel23.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel23.setText("Producto:");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, 30));

        jLabel24.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel24.setText("Producto:");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, 30));

        jLabel25.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel25.setText("Producto:");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, 30));

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel13.setText("Cantidad:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, -1, 30));

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel14.setText("Cantidad:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, 30));

        jLabel29.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel29.setText("Cantidad:");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, -1, 30));

        jLabel30.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel30.setText("Cantidad:");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, -1, 30));

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        getContentPane().add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 120, 60));

        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });
        getContentPane().add(Aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, 120, 60));

        Producto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Producto2ActionPerformed(evt);
            }
        });
        Producto2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Producto2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Producto2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Producto2KeyTyped(evt);
            }
        });
        getContentPane().add(Producto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 150, 30));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel5.setText("Rutas:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        Ruta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ruta1ActionPerformed(evt);
            }
        });
        getContentPane().add(Ruta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 40, 30));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel7.setText("Peso Del Arco:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, -1, -1));

        Peso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Peso1ActionPerformed(evt);
            }
        });
        getContentPane().add(Peso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 40, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PesoActionPerformed

    private void ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductoActionPerformed

    private void Ruta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ruta2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ruta2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void ProductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ProductoKeyPressed
        
    }//GEN-LAST:event_ProductoKeyPressed

    private void ProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ProductoKeyTyped
        
    }//GEN-LAST:event_ProductoKeyTyped

    private void ProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ProductoKeyReleased
        jTextField2.setText(Producto.getText());
        jTextField5.setText(Producto.getText());
    }//GEN-LAST:event_ProductoKeyReleased

    private void Producto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Producto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Producto1ActionPerformed

    private void Producto1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Producto1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Producto1KeyPressed

    private void Producto1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Producto1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Producto1KeyReleased

    private void Producto1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Producto1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Producto1KeyTyped

    private void Producto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Producto3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Producto3ActionPerformed

    private void Producto3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Producto3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Producto3KeyPressed

    private void Producto3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Producto3KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Producto3KeyReleased

    private void Producto3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Producto3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Producto3KeyTyped

    private void Producto4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Producto4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Producto4ActionPerformed

    private void Producto4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Producto4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Producto4KeyPressed

    private void Producto4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Producto4KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Producto4KeyReleased

    private void Producto4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Producto4KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Producto4KeyTyped

    private void Cantidad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cantidad2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cantidad2ActionPerformed

    private void Cantidad2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cantidad2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cantidad2KeyPressed

    private void Cantidad2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cantidad2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Cantidad2KeyReleased

    private void Cantidad2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cantidad2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Cantidad2KeyTyped

    private void Cantidad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cantidad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cantidad1ActionPerformed

    private void Cantidad1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cantidad1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cantidad1KeyPressed

    private void Cantidad1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cantidad1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Cantidad1KeyReleased

    private void Cantidad1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cantidad1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Cantidad1KeyTyped

    private void Cantidad3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cantidad3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cantidad3ActionPerformed

    private void Cantidad3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cantidad3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cantidad3KeyPressed

    private void Cantidad3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cantidad3KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Cantidad3KeyReleased

    private void Cantidad3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cantidad3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Cantidad3KeyTyped

    private void Cantidad4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cantidad4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cantidad4ActionPerformed

    private void Cantidad4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cantidad4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cantidad4KeyPressed

    private void Cantidad4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cantidad4KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Cantidad4KeyReleased

    private void Cantidad4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cantidad4KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Cantidad4KeyTyped

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        mywin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CancelarActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        Lista_productos newlis=new Lista_productos();
        try{
            
            
            if ("".equals(Producto1.getText()) || "0".equals(Cantidad1.getText())){
                throw new Exception();
            }
            if ("".equals(Ruta1.getText()) || "".equals(Ruta2.getText())){
                throw new Exception();
            }
            
            a = Producto1.getText();
            b =Integer.parseInt(Cantidad1.getText());
            nodMine = new Nodo_productos(a,b);
            newlis.addAtEnd(nodMine);
            if (!"".equals(Producto2.getText()) && !"".equals(Cantidad2.getText())){
                this.c = Producto2.getText();
                this.d = Integer.parseInt(Cantidad2.getText());
                nodMine1 = new Nodo_productos(c,d);
                newlis.addAtEnd(nodMine1);
            }
            if (!"".equals(Producto3.getText()) && !"".equals(Cantidad3.getText())){
                this.e = Producto3.getText();
                this.f = Integer.parseInt(Cantidad3.getText());
                nodMine2 = new Nodo_productos(e,f);
                newlis.addAtEnd(nodMine2);
            }
            if (!"".equals(Producto4.getText()) && !"".equals(Cantidad4.getText())){
                this.g = Producto3.getText();
                this.h = Integer.parseInt(Cantidad4.getText());
                nodMine3 = new Nodo_productos(g,h);
                newlis.addAtEnd(nodMine3);
            }
            if ("".equals(Producto.getText())){
                throw new Exception();
            }
            
            int ex1 = mywin.listaVersx.Buscar(Ruta1.getText().toUpperCase());
            int ex2 = mywin.listaVersx.Buscar(Ruta2.getText().toUpperCase());
            if (ex1==-1||ex2==-1){
                throw new Exception();
            }
            int ex3 = mywin.listaVersx.Buscar(Producto.getText().toUpperCase());
            
            if (ex3==3){
                throw new Exception();
            }
            
            Vertex ver1 = new Vertex(Producto.getText().toUpperCase(),newlis);
            this.pe=Integer.parseInt(Peso.getText());
            this.pe1=Integer.parseInt(Peso1.getText());
            Nodoweight node = new Nodoweight(Producto.getText().toUpperCase(),Ruta1.getText().toUpperCase(),pe);
            Nodoweight node1 = new Nodoweight(Ruta2.getText().toUpperCase(),Producto.getText().toUpperCase(),pe1);
            mywin.listaVersx.addAtEnd(ver1);
            mywin.listaSimpe.addAtEnd(node);
            mywin.listaSimpe.addAtEnd(node1);
            mywin.listaSimpe.setSize(mywin.listaSimpe.getSize()+2);
            
            mywin.setVisible(true);
            this.setVisible(false);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Debe introducir un nuevo almacen con al menos un Producto y que conecte a dos rutas que pertenezcan al grafo","Error!",JOptionPane.ERROR_MESSAGE);
        }
        
        
        
        
    }//GEN-LAST:event_AceptarActionPerformed

    private void Producto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Producto2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Producto2ActionPerformed

    private void Producto2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Producto2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Producto2KeyPressed

    private void Producto2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Producto2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Producto2KeyReleased

    private void Producto2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Producto2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Producto2KeyTyped

    private void Ruta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ruta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ruta1ActionPerformed

    private void Peso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Peso1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Peso1ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(newFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new newFrame().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JButton Cancelar;
    private javax.swing.JTextField Cantidad1;
    private javax.swing.JTextField Cantidad2;
    private javax.swing.JTextField Cantidad3;
    private javax.swing.JTextField Cantidad4;
    private javax.swing.JTextField Peso;
    private javax.swing.JTextField Peso1;
    private javax.swing.JTextField Producto;
    private javax.swing.JTextField Producto1;
    private javax.swing.JTextField Producto2;
    private javax.swing.JTextField Producto3;
    private javax.swing.JTextField Producto4;
    private javax.swing.JTextField Ruta1;
    private javax.swing.JTextField Ruta2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
