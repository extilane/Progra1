
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guillermo
 */
public class Grafico extends javax.swing.JFrame{
    CustomPlayer g=new CustomPlayer();
    MetaDatos datos=new MetaDatos();
    
    
    
     //   MetaDatos m=new MetaDatos('/mnt/hgfs/Ubunto/03 Obsesionario en LA Mayor.mp3');
    
    boolean sonar=false;
    boolean sonando=true;
    /**
     * Creates new form Grafico
     */
    public Grafico() {
     //MetaDatos m=new MetaDatos();
     //this.m = new MetaDatos();
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

        Texto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Lsonar = new javax.swing.JLabel();
        Album = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        anno = new javax.swing.JLabel();
        MegaRe = new javax.swing.JLabel();
        Progreso = new javax.swing.JProgressBar();

        Texto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoActionPerformed(evt);
            }
        });

        jLabel2.setText("jLabel2");

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mega Reproductor");
        setBackground(java.awt.Color.pink);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        jButton1.setText("Sonar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Pausar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        Lsonar.setFont(new java.awt.Font("Abyssinica SIL", 0, 15)); // NOI18N
        Lsonar.setText("Artista:");

        Album.setFont(new java.awt.Font("Abyssinica SIL", 0, 15)); // NOI18N
        Album.setText("Album:");

        Titulo.setFont(new java.awt.Font("Abyssinica SIL", 0, 15)); // NOI18N
        Titulo.setText("Titulo:");

        anno.setFont(new java.awt.Font("Abyssinica SIL", 0, 15)); // NOI18N
        anno.setText("Año:");

        MegaRe.setBackground(new java.awt.Color(102, 102, 255));
        MegaRe.setFont(new java.awt.Font("Abyssinica SIL", 0, 24)); // NOI18N
        MegaRe.setText("Mega Reproductor");

        Progreso.setToolTipText("");
        Progreso.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Progreso.setName(""); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jButton1)
                        .addGap(38, 38, 38)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Lsonar, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                            .addComponent(Album, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(anno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Progreso, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MegaRe))))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(MegaRe, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(Progreso, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Lsonar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Album, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Titulo)
                .addGap(8, 8, 8)
                .addComponent(anno)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
         JFileChooser seleccionar=new JFileChooser();
         FileNameExtensionFilter filtromp3=new FileNameExtensionFilter("Solo MP3","mp3");
         seleccionar.setFileFilter(filtromp3);
         String ruta;
         int seleccionado =seleccionar.showOpenDialog(null);
         try{
            File archivo = seleccionar.getSelectedFile();
            
             ruta = archivo.getAbsolutePath();
         }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Por favor seleccione un archivo de mp3");
             return ;  
         }
        g.setPath(ruta);
        if(sonando){

        datos.meta(ruta);
        sonando=false;
        sonar=true;
        g.play(-1);
        }else{
            
            JOptionPane.showMessageDialog(null, "la cancion esta sonando");
            
        }
        try{
        Lsonar.setText("Artista: "+datos.getArtista());
        }catch(Exception e){}
        try{
        Titulo.setText("Titulo: "+datos.getTitulo());
        }catch(Exception e){}
        try{
        Album.setText("Album: "+datos.getAlbum());
        }catch(Exception e){}
        try{
        anno.setText("Año: "+datos.getyear());
        }catch(Exception e){}
        new Thread(
            new Runnable(){
                @SuppressWarnings("empty-statement")
                @Override
                public void run(){
                    try{
                        int i=0;
                        double b=0;
                        while(true){
                       while(sonar){
                       Progreso.setValue(i);
                       
                       i=(int) ((100*b)/datos.getLargo());//los 252 son segundos cuando logre
                       b+=0.1;//sacar la duracion del track en minotos se miltiplica por 60
                       Thread.sleep(100);
                       if(sonar==false); 
                        break;
                       }
                        }
                        //4:12
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null, "nada");
                        
                    }
                }
            }
    ).start();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        if (sonar && sonando==false){
            //Lsonar.setText("detenido");
            sonar=false;
            jButton2.setText("Reanudar");
//            anno.setText(Boolean.toString(g.getPosition()));
            g.pause();
        }
        else{
           sonar=true;
       Lsonar.setText(datos.getArtista());
       jButton2.setText("Pausar"); 
       g.resume();
        }
            
        
        
        
        
    }//GEN-LAST:event_jButton2MouseClicked

    private void TextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoActionPerformed

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
            java.util.logging.Logger.getLogger(Grafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
         
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grafico().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Album;
    private javax.swing.JLabel Lsonar;
    private javax.swing.JLabel MegaRe;
    private javax.swing.JProgressBar Progreso;
    private javax.swing.JTextField Texto;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel anno;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
