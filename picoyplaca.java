//import javax.swing.*;
//import java.awt.event.*;
import java.awt.Color;
import java.util.*;




//FECHA
import java.util.Calendar;



public class picoyplaca extends javax.swing.JFrame {
    
       
String dia_semana;// dia de la semana a consultar
int ult_dig=0;//ultimo digito del numero de placa
int z=0;

    public picoyplaca() {
        initComponents();
        this.setTitle("Predictor Pico y Placa");
        jTextField1.setText("");
        jTextField2.setText(""); 
    }
    
   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jFileChooser2 = new javax.swing.JFileChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox5 = new javax.swing.JComboBox();
        button1 = new java.awt.Button();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Número de Placa:");

        jLabel3.setText("Fecha (dd/mm/aaaa):");

        jLabel4.setText("Hora (hh:mm) :");

        jButton1.setText("CONSULTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        jComboBox2.setMaximumSize(new java.awt.Dimension(37, 20));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2040" }));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        jComboBox5.setMaximumSize(new java.awt.Dimension(37, 20));

        button1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button1.setLabel("button1");
        button1.setVisible(false);

        jTextField1.setText("jTextField1");

        jTextField2.setEditable(false);
        jTextField2.setText("jTextField2");

        jLabel1.setText(":");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Predictor de Pico y Placa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(141, 141, 141)
                            .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(128, 128, 128)
                            .addComponent(jButton1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4))
                            .addGap(16, 16, 16)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addComponent(jButton1)
                .addGap(31, 31, 31)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        consulta();
                

    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void consulta (){
        //adquision datos entrada
        int placa =Integer.valueOf(jTextField1.getText());
        String dia = jComboBox1.getSelectedItem().toString();
        String mes = jComboBox2.getSelectedItem().toString();
        String anio = jComboBox3.getSelectedItem().toString();
        int hora = jComboBox4.getSelectedIndex();
        int minutos = jComboBox5.getSelectedIndex();
        
        
        
        UltimoDigito(placa);
        DiaSemana(anio,mes,dia);
               
        System.out.println("ultimo digito "+ ult_dig);
        System.out.println("dia "+ dia_semana);
        System.out.print("hora "+ hora);
        System.out.println(":"+ minutos);
        
        predictor(hora,minutos);
      
           
        
    }

    private void UltimoDigito(int placa){
      
        int aux= placa/10;
        ult_dig= placa - (aux*10);
        
    }
    
    private void DiaSemana(String anio, String mes, String dia){
      String[] dias={"Domingo","Lunes","Martes", "Miércoles","Jueves","Viernes","Sábado"};
      Date fecha =new Date (Integer.parseInt(anio)-1900, Integer.parseInt(mes)-1, Integer.parseInt(dia));
      int num_dia=0;
      Calendar cal= Calendar.getInstance();
      cal.setTime(fecha);
      num_dia=cal.get(Calendar.DAY_OF_WEEK);
      dia_semana= dias[num_dia-1];

    }
         
    private void predictor(int hora, int minutos){
        
        
        switch(ult_dig)
        {
            case 1:
                if (dia_semana=="Lunes")
                    tiempo(hora,minutos);
                else{
                    System.out.println("Puede circular");
                    jTextField2.setText("Su vehículo puede circular libremente");
                    jTextField2.setBackground(Color.green);
                }
            break;
                
            case 2:
                if (dia_semana=="Lunes")
                    tiempo(hora,minutos);
                else{
                    System.out.println("Puede circular");
                    jTextField2.setText("Su vehículo puede circular libremente");
                    jTextField2.setBackground(Color.green);
                }
            break;
                
            case 3:
                if (dia_semana=="Martes")
                    tiempo(hora,minutos);
                else{
                    System.out.println("Puede circular");
                    jTextField2.setText("Su vehículo puede circular libremente");
                    jTextField2.setBackground(Color.green);
                }
            break;
                
            case 4:
                if (dia_semana=="Martes")
                    tiempo(hora,minutos);
                else{
                    System.out.println("Puede circular");
                    jTextField2.setText("Su vehículo puede circular libremente");
                    jTextField2.setBackground(Color.green);
                }
            break;
            
            case 5:
                if (dia_semana=="Miércoles")
                    tiempo(hora,minutos);
                else{
                    System.out.println("Puede circular");
                    jTextField2.setText("Su vehículo puede circular libremente");
                    jTextField2.setBackground(Color.green);
                }
            break;
            
            case 6:
                if (dia_semana=="Miércoles")
                    tiempo(hora,minutos);
                else{
                    System.out.println("Puede circular");
                    jTextField2.setText("Su vehículo puede circular libremente");
                    jTextField2.setBackground(Color.green);
                }
            break;  
                
            case 7:
                if (dia_semana=="Jueves")
                    tiempo(hora,minutos);
                else{
                    System.out.println("Puede circular");
                    jTextField2.setText("Su vehículo puede circular libremente");
                    jTextField2.setBackground(Color.green);
                }
            break;
                
            case 8:
                if (dia_semana=="Jueves")
                    tiempo(hora,minutos);
                else{
                    System.out.println("Puede circular");
                    jTextField2.setText("Su vehículo puede circular libremente");
                    jTextField2.setBackground(Color.green);
                }
            break;
                
                
            case 9:
                if (dia_semana=="Viernes")
                    tiempo(hora,minutos);
                else{
                    System.out.println("Puede circular");
                    jTextField2.setText("Su vehículo puede circular libremente");
                    jTextField2.setBackground(Color.green);
                }
            break;
                
                
            case 0:
                if (dia_semana=="Viernes")
                    tiempo(hora,minutos);
                else{
                    System.out.println("Puede circular");
                    jTextField2.setText("Su vehículo puede circular libremente");
                    jTextField2.setBackground(Color.green);
                }
            break;
                
        }  
    
    }
    
    private void tiempo(int hora, int minutos){
        
                   
            if (hora==7 || hora==8 || (hora==9 && minutos<=30) || hora==16 || hora==17 || hora==18 || (hora==19 && minutos<=30)){
                System.out.println("No puede circular");
                jTextField2.setText("Su vehículo NO puede circular en este momento");
                jTextField2.setBackground(Color.orange);
                
            }
            else{
                System.out.println("Puede circular");
                jTextField2.setText("Su vehículo puede circular libremente");
                jTextField2.setBackground(Color.green);
            }
        
        

    }

    public static void main(String args[]) throws Exception {
      
       /* try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(picoyplaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(picoyplaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(picoyplaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(picoyplaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        //</editor-fold>
        
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new picoyplaca().setVisible(true);
            }
        });
        
       //  AWTEvent a =java.awt.EventQueue.getCurrentEvent();
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFileChooser jFileChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
