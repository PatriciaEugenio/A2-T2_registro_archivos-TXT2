/* 
bloque de las importaciones de las librerias que ayudaran a
que se ejecuten sin ningun problema nuestro proyecto
*/
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
//@author PATY
/*
metodo de la interfaz
*/
public class ProyectoVenta extends javax.swing.JFrame {
    /*
    Facilita el trabajo relacionado con las tablas que en este caso es llamado modelo
    */
DefaultTableModel modelo;

    public ProyectoVenta() {
        initComponents();
        /*
        linea de codigo para quitar al usurio la accesibilidad 
        de que pueda maximizar o minimizar la interfaz
        */
        this.setLocationRelativeTo(null);
        /*
        bloque de codigo que se encarga de 
        */
        modelo =new DefaultTableModel();
        modelo.addColumn("Nombre de la prenda");
        modelo.addColumn("Tipo de prenda");
        modelo.addColumn("Talla");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio");
        modelo.addColumn("Existencia");
        modelo.addColumn("Numero del inventario");
         
        /*
        Linea de codigo que hace referencia a la tabla el cual nos sirve para usar su contenido
        */
         this.jTable1.setModel(modelo);
        /*
        Linea de codigo que nos ayuda a centrar la interfaz
         */
        setLocationRelativeTo(null);
        /*
        Forma de declarar el modelo de datos como un DefaultTableModel y luego que hace referencia a un JTable , 
        obteniendo los datos de la tabla
        */
    modelo = (DefaultTableModel)this.jTable1.getModel();
    }
    /*
    Datos que contiene la tabla
    */
     String nom_Prenda="";
     String tipo_prenda="";
     String talla="";
     String cant="";
     String precio="";
     String existencia="";
     String num_Inventario="";
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Box1 = new javax.swing.JComboBox<>();
        N_Prenda = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        TIENDA_ROPA = new javax.swing.JLabel();
        Ti_Prenda = new javax.swing.JLabel();
        Box2 = new javax.swing.JComboBox<>();
        Box3 = new javax.swing.JComboBox<>();
        Talla = new javax.swing.JLabel();
        Pre = new javax.swing.JLabel();
        Can = new javax.swing.JLabel();
        Exis = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Tabla = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Cantidad = new javax.swing.JTextField();
        Precio = new javax.swing.JTextField();
        Existencia = new javax.swing.JTextField();
        Numero_Inventario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Box1.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        Box1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "Bra", "Vikini", "Boxer", "Camiseta", "Sudadera", "Malla", "Pantalon", "Camisa", "Saco", "Playera", "Short", "Blusa" }));
        Box1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Box1ActionPerformed(evt);
            }
        });

        N_Prenda.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        N_Prenda.setText(" Nombre de la prenda:");

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        TIENDA_ROPA.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        TIENDA_ROPA.setForeground(new java.awt.Color(255, 0, 255));
        TIENDA_ROPA.setText("SISTEMA DE TIENDA DE ROPA");
        TIENDA_ROPA.setAlignmentX(0.5F);
        TIENDA_ROPA.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        Ti_Prenda.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        Ti_Prenda.setText("Tipo de prenda:");

        Box2.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        Box2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "Interior", "Deportiva", "De vestir", "Casual" }));

        Box3.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        Box3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "Chica", "Mediana", "Grande", "XL" }));

        Talla.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        Talla.setText("Talla:");

        Pre.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        Pre.setText("Precio:");

        Can.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        Can.setText("Cantidad:");

        Exis.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        Exis.setText("Existencia:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel1.setText("Numero del Inventario:");

        jTable1.setForeground(new java.awt.Color(51, 51, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        Tabla.setViewportView(jTable1);
        jTable1.getAccessibleContext().setAccessibleParent(Box2);

        Cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Salir)
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(N_Prenda, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Talla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Box1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Box3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(164, 164, 164)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(Ti_Prenda, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(Box2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(38, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Numero_Inventario))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(Can, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Guardar)
                                .addGap(37, 37, 37))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Pre, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Exis, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Existencia, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tabla)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TIENDA_ROPA)
                .addGap(110, 110, 110))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(Salir)
                .addGap(4, 4, 4)
                .addComponent(TIENDA_ROPA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(N_Prenda)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Box1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Ti_Prenda, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Box2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Talla)
                    .addComponent(Box3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Can)
                    .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pre)
                    .addComponent(Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Exis)
                    .addComponent(Existencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(Numero_Inventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Guardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

@SuppressWarnings("empty-statement")
    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed

        try{
          //Crear objeto FileWriter que sera el que nos ayude a escribir sobre el archivo
          FileWriter archivo=new FileWriter("C:\\Users\\PATY\\Downloads\\archivos_txt\\Archivo_Salida.txt",true);
        /*
         ciclos for que nos permiten ejecutar una o varias líneas de código de forma iterativa 
          */
          for (int i=0;i<this.jTable1.getRowCount();i++){
              //Escribimos en el archivo con el metodo write 
              archivo.write(modelo.getValueAt(i, 0).toString()+"," );
              archivo.write(modelo.getValueAt(i, 1).toString()+"," );
              archivo.write(modelo.getValueAt(i, 2).toString()+"," );
              archivo.write(modelo.getValueAt(i, 3).toString()+"," );
              archivo.write(modelo.getValueAt(i, 4).toString()+"," );
              archivo.write(modelo.getValueAt(i, 5).toString()+"\n" );
          }
          /*
          Cerramos la conexion
          */
          archivo.close();
          /*
          imprime el texto especificado dentro de los paréntesis lo que sera mostrado en pantalla
          */
          System.out.println("El archivo se aguardo exitosamente");
          /*
          //Si existe un problema al escribir cae aqui
          */
      }catch (IOException x){
          /*
          imprime el texto especificado dentro de los paréntesis lo que sera mostrado en pantalla
          */
          System.out.println(x); 
                  System.out.println("Mensaje dentro del catch");
          /*
          Linea de codigo que nos ayuda a finalizar el proceso de ejecucion
          */
        }System.exit(0);
    
    }//GEN-LAST:event_SalirActionPerformed
    /*
    Metodo que se encarga de guardar los datos en la tabla
    */
    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
     /*
        Bloque de codigo que se encarga de mandar a traer los combo box y los jtextField 
        al metodo de guardar
        */
      nom_Prenda= Box1.getSelectedItem().toString();
      tipo_prenda= Box2.getSelectedItem().toString();
      talla= Box3.getSelectedItem().toString();
      cant= Cantidad.getText();
      precio= Precio.getText();
      existencia=Existencia.getText();
      num_Inventario=Numero_Inventario.getText();
   
      /*
      Declaracion del arreglo el cual contiene 7 ingresos de información
      */
     String [] info= new String[7];
     /*
     informacion que contiene el arreglo y que son mostrados en la tabla 
     */
        info[0]=nom_Prenda;
        info[1]=tipo_prenda;
        info[2]=talla;
        info[3]=cant;
        info[4]=precio;
        info[5]=existencia;
        info[6]=num_Inventario;
        /*
        Forma de obtenet un Objeto del tipo DefaultTableModel , el cual si nos permite agregar filas, 
        tomando a traves del Metodo getModel() de la tabla jTable1
        */
        modelo.addRow(info);
        /*
        Su función es asignar el ítem u opción que se ha de mostrar o seleccionar por defecto en el Combo Box
        */
        Box1.setSelectedIndex(0);
        Box2.setSelectedIndex(0);
        Box3.setSelectedIndex(0);
        /*
        se utiliza para lo que tu le pongas de argumento aparecerá en el componente de texto
        */
        Cantidad.setText("");
        Precio.setText("");
        Existencia.setText("");
        Numero_Inventario.setText("");
        
//        JOptionPane.showMessageDialog(null, "La compra es:"+"\n"+"Nombre de la prenda "+nom_Prenda+"\n"+
//                "Tipo prenda "+tipo_prenda+"\n"+"Talla "+talla+"\n"+"Cantidad "+cant+"\n"+"Precio"+precio
//                +"\n"+"Existencia"+existencia+"\n"+"Numero del inventario"+num_Inventario);
    }//GEN-LAST:event_GuardarActionPerformed

    private void CantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantidadActionPerformed

    }//GEN-LAST:event_CantidadActionPerformed

    private void Box1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Box1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Box1ActionPerformed

    public static void main(String args[]) {
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Box1;
    private javax.swing.JComboBox<String> Box2;
    private javax.swing.JComboBox<String> Box3;
    private javax.swing.JLabel Can;
    private javax.swing.JTextField Cantidad;
    private javax.swing.JLabel Exis;
    private javax.swing.JTextField Existencia;
    private javax.swing.JButton Guardar;
    private javax.swing.JLabel N_Prenda;
    private javax.swing.JTextField Numero_Inventario;
    private javax.swing.JLabel Pre;
    private javax.swing.JTextField Precio;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel TIENDA_ROPA;
    private javax.swing.JScrollPane Tabla;
    private javax.swing.JLabel Talla;
    private javax.swing.JLabel Ti_Prenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
