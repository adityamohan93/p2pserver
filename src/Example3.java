/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.net.*;
import java.rmi.registry.LocateRegistry;
import java.util.Enumeration;
import javax.swing.table.DefaultTableModel;
import net.jxta.peergroup.*;
import net.jxta.exception.*;
 import net.jxta.id.IDFactory;
import net.jxta.protocol.*;
import net.jxta.discovery.*;
import net.jxta.document.*;
import net.jxta.credential.*;
import net.jxta.membership.*;

/*
 * Example3.java
 *
 * Created on Sep 25, 2013, 11:34:49 AM
 */
/**
 *
 * @author Shreyansh
 */
public class Example3 extends javax.swing.JFrame {
int i=0;
    /** Creates new form Example3 */
    public Example3() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jButton5.setText("jButton5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jButton6.setText("jButton5");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton5)
                                    .addComponent(jButton6)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(129, 129, 129))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 595, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(121, 121, 121))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jButton6)))
                .addContainerGap(103, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  InetAddress IP = null,iip=null;
        try {
            IP = InetAddress.getLocalHost();
        } catch (UnknownHostException ex) {
            Logger.getLogger(Example3.class.getName()).log(Level.SEVERE, null, ex);
        }
System.out.println("IP of my system is := "+IP.getHostAddress());

try{
String subnet="192.168.0";

int timeout=3000;
   for (int i=100;i<=110;i++){
       String host=subnet + "." + i;
       if (InetAddress.getByName(host).isReachable(timeout)){
           System.out.println(host + " is reachable");
          // InetAddress.getByName(host).isr;
           
           
       }
       else
           System.out.println(host+ "is not reachable");
   }
}
catch(Exception e)
{}
        
}//GEN-LAST:event_jButton1ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 
   
    jProgressBar1.setValue(80);// TODO add your handling code here:
}//GEN-LAST:event_jButton2ActionPerformed
private static boolean portAvailable;

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
// TODO add your handling code here:
    
    if(available("172.31.72.107",800))
        System.out.println("hoho");
    
   /**  int delay = 1000; // 1 s
        try {
            Socket socket = new Socket();
               
            socket.connect(new InetSocketAddress("172.31.73.89",80), delay);
            portAvailable = socket.isConnected();
            socket.close();
            System.out.println("init() giving--->  " + portAvailable);
        }
        catch (Exception e) {
            portAvailable = false;
            System.out.println("init() giving--->  " + portAvailable);
            System.out.println("Threw error---> " + e.getMessage());
        }
       
  /**
     String hostname = "172.31.74.65";

    Socket s = null;

    try 
    {
      // this is to see if host exists:
      InetAddress ipaddress = InetAddress.getByName(hostname);

//      int p =  21;            // ftp
//      int p =  22;            // ssh / sftp
//      int p =  23;            // telnet
//      int p =  25;            // smtp
        int p =  80;            // http
//      int p = 110;            // pop3
//      int p = 143;            // imap

                try
                {
                  s = new Socket(hostname, p);
                  System.out.println("A server is running on port " + p + "."+s.getPort());
                  s.close();
                }
                catch (IOException e)
                {
                  System.out.println("No server on port " + p + ".");
                }
                catch(Exception ex)
                {
                System.out.println("hoho");
                }
    }
    catch ( UnknownHostException e )
    {
      System.out.println("Could not find host: " + hostname);
    }

        if (s != null)
        {
                try
                {
                        s.close();
                }
                catch ( IOException ioEx )
                {
                }
        }
     * **/
}//GEN-LAST:event_jButton3ActionPerformed

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

    
      
//ystem.out.println("IP of my system is := "+IP.getHostAddress());
//model.addRow(new Object[]{IP.getHostAddress(),""});
      try{ 
         new Thread(new Runnable() {

                @Override
                public void run() {
                    try{
                     ServerSocket  ser = new ServerSocket(9999);
Socket   sock = ser.accept();
   
  System.out.println("done");
                    }
                    catch(Exception e){}
                }
            }).start();
        
}
catch(Exception ex){
JOptionPane.showMessageDialog(this, ex.getMessage());
}
        
    // TODO add your handling code here:
}//GEN-LAST:event_jButton4ActionPerformed

private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

    
//   DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
    
 //  DefaultListModel mode=(DefaultListModel) jList1.getModel();
 DefaultListModel model1 = new DefaultListModel();
 
   
 for(int j=0;j<20;j++)
      model1.addElement(i++);
    
    jList1.setModel(model1);
    
    
    // TODO add your handling code here:
}//GEN-LAST:event_jButton5ActionPerformed

private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked

   int a= (Integer) jList1.getSelectedValue();
 System.out.println(a);
    // TODO add your handling code here:
}//GEN-LAST:event_jList1MouseClicked
  DefaultTableModel model=new DefaultTableModel();
private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

  
    
    model.addRow(new Object[]{"hello","hey","",""});
    jTable1.setModel(model);
    // TODO add your handling code here:
}//GEN-LAST:event_jButton6ActionPerformed

private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTextField1ActionPerformed

private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed

  int a=  evt.getKeyCode();
  System.out.println(a);
    // TODO add your handling code here:
}//GEN-LAST:event_jTextField1KeyPressed

private static boolean available(String ip,int port) {
    System.out.println("--------------Testing port " + port);
    Socket s = null;
    try {
        s = new Socket(ip, port);

        // If the code makes it this far without an exception it means
        // something is using the port and has responded.
        System.out.println("--------------Port " + port + " is not available");
        return false;
    } catch (IOException e) {
        System.out.println("--------------Port " + port + " is available");
        return true;
    } finally {
        if( s != null){
            try {
                s.close();
            } catch (IOException e) {
                throw new RuntimeException("You should handle this error." , e);
            }
        }
    }
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
            java.util.logging.Logger.getLogger(Example3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Example3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Example3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Example3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Example3().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JList jList1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}