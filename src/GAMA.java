
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hp
 */
public class GAMA extends javax.swing.JFrame {

    /**
     * Creates new form GAMA
     */
    public GAMA() {
        initComponents();
       group1();
       
        jTextField2.setText("I AM WAITING OOO");
        jTextField3.setText("0");
        jTextField4.setText("0");
    }
    
    public void Close(){
    
    WindowEvent we = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(we);
    
    
    }
    
    public void group1(){
        jslide = 100;
        question_generator();
        question();
        answer();
        option();
       
        
        
     
        
       
    
    
    }
    
    public void jsliderMD(){
    jslide = jslidesub;
    
    }
    
    
     public void question_generator(){
         
    jsliderMD();
        Random rand = new Random();
       
        
        rand1=rand.nextInt(jslide)+1;
        
        rand2=rand.nextInt(jslide)+1;
    }
   
    public void answer(){
        jsliderMD();
    answerorrect  = rand1 + rand2;
    
    }
    
    public void question(){
    qquestion = rand1 +" + " +rand2;
    jTextField1.setText(qquestion);
    }
    
    public void correct(){
   
    ccorrect++; 
     jTextField3.setText(String.valueOf(ccorrect));
    jTextField2.setText("YES CORRECT");
    
    }
    public void wrong(){
    wrong++; 
     jTextField4.setText(String.valueOf(wrong));
     jTextField2.setText("HAHAHAAAA WRONG");
    }
    
    
    public void option(){
    jsliderMD();
    Random randO = new Random();
    int CorrPos = randO.nextInt(4)+1;
    
   int opTion1 = randO.nextInt(jslide)+1; 
   int opTion2 = randO.nextInt(jslide)+1; 
   int opTion3 = randO.nextInt(jslide)+1; 
   
   while((opTion1 == answerorrect)||(opTion2 == answerorrect) ||(opTion3 == answerorrect)||(opTion1 == opTion2) ||(opTion1 == opTion3) || (opTion2 == opTion3)){
     
    opTion1 = randO.nextInt(jslide)+1; 
    opTion2 = randO.nextInt(jslide)+1; 
    opTion3 = randO.nextInt(jslide)+1;
   
   }
   
   
   
   if(CorrPos ==1){
       selectedOptionInt = 1;
        btn_r1.setText(String.valueOf(answerorrect));
        btn_r2.setText(String.valueOf(opTion1));
        btn_r3.setText(String.valueOf(opTion2));
        btn_r4.setText(String.valueOf(opTion3));
   }else if(CorrPos == 2){
        selectedOptionInt = 2;
        btn_r2.setText(String.valueOf(answerorrect));
        btn_r1.setText(String.valueOf(opTion1));
        btn_r3.setText(String.valueOf(opTion2));
        btn_r4.setText(String.valueOf(opTion3));
   }else if(CorrPos == 3){
        selectedOptionInt = 3;
        btn_r3.setText(String.valueOf(answerorrect));
        btn_r2.setText(String.valueOf(opTion1));
        btn_r1.setText(String.valueOf(opTion2));
        btn_r4.setText(String.valueOf(opTion3));
   }else if(CorrPos == 4){
        selectedOptionInt = 4;
        btn_r4.setText(String.valueOf(answerorrect));
        btn_r2.setText(String.valueOf(opTion1));
        btn_r3.setText(String.valueOf(opTion2));
        btn_r1.setText(String.valueOf(opTion3));
    }
   
    
    }
    
    public void general_hand(){
    
       
         //jTextField2.setText(String.valueOf(selectedOptionInt)+" + " + String.valueOf(button) );
         //jTextField2.setText("");
        
        if(selectedOptionInt == button){
        
       correct();
    
    }else if(selectedOptionInt != button){
            wrong();
        }  
        
        
     // selectedOptionInt = 0;button = 0;  
        
       
}
    
  /*  public void selectCorect(){
    
        
        if(btnValueII == answerorrect ){
        
        correctOption++;
        jTextField2.setText("CORRECT");
         jTextField3.setText(String.valueOf(correctOption));
        
        }else{
         wrongOption++;   
         jTextField2.setText("WRONG");
          jTextField4.setText(String.valueOf(wrongOption));
        }
    
}
   */ 
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        btn_r1 = new javax.swing.JButton();
        btn_r2 = new javax.swing.JButton();
        btn_r3 = new javax.swing.JButton();
        btn_r4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusable(false);
        setLocation(new java.awt.Point(400, 70));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 3, true));
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Ink Free", 1, 90)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("jTextField1");
        jTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 102), new java.awt.Color(0, 102, 102), null, null));
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Jokerman", 1, 24)); // NOI18N
        jTextField2.setText("jTextField2");
        jTextField2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 102), new java.awt.Color(0, 102, 102), null, null));

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Jokerman", 1, 24)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(0, 204, 204));
        jTextField3.setText("jTextField3");
        jTextField3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 102), new java.awt.Color(0, 102, 102), null, null));

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Jokerman", 1, 24)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 51, 0));
        jTextField4.setText("jTextField4");
        jTextField4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 102), new java.awt.Color(0, 102, 102), null, null));

        btn_r1.setBackground(new java.awt.Color(255, 255, 255));
        btn_r1.setFont(new java.awt.Font("Ink Free", 1, 48)); // NOI18N
        btn_r1.setText("jButton1");
        btn_r1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 204), new java.awt.Color(0, 153, 153), new java.awt.Color(153, 153, 0), new java.awt.Color(0, 255, 255))));
        btn_r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_r1ActionPerformed(evt);
            }
        });

        btn_r2.setBackground(new java.awt.Color(255, 255, 255));
        btn_r2.setFont(new java.awt.Font("Ink Free", 1, 48)); // NOI18N
        btn_r2.setText("jButton2");
        btn_r2.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 204), new java.awt.Color(0, 153, 153), new java.awt.Color(153, 153, 0), new java.awt.Color(0, 255, 255))));
        btn_r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_r2ActionPerformed(evt);
            }
        });

        btn_r3.setBackground(new java.awt.Color(255, 255, 255));
        btn_r3.setFont(new java.awt.Font("Ink Free", 1, 48)); // NOI18N
        btn_r3.setText("jButton3");
        btn_r3.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 204), new java.awt.Color(0, 153, 153), new java.awt.Color(153, 153, 0), new java.awt.Color(0, 255, 255))));
        btn_r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_r3ActionPerformed(evt);
            }
        });

        btn_r4.setBackground(new java.awt.Color(255, 255, 255));
        btn_r4.setFont(new java.awt.Font("Ink Free", 1, 48)); // NOI18N
        btn_r4.setText("jButton4");
        btn_r4.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 204), new java.awt.Color(0, 153, 153), new java.awt.Color(153, 153, 0), new java.awt.Color(0, 255, 255))));
        btn_r4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_r4ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 0));
        jButton1.setFont(new java.awt.Font("Parchment", 1, 24)); // NOI18N
        jButton1.setText("CLOSE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jSlider1.setBackground(new java.awt.Color(0, 102, 102));
        jSlider1.setForeground(new java.awt.Color(0, 102, 102));
        jSlider1.setMajorTickSpacing(10);
        jSlider1.setMinimum(10);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField2)
            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_r1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_r3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField4)
                    .addComponent(btn_r4, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                    .addComponent(btn_r2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField4)
                    .addComponent(jTextField3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_r2, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                    .addComponent(btn_r1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_r3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_r4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_r2ActionPerformed
      button  = 2;
      jsliderMD();
        // selectCorect();
        general_hand();
        
         try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("error in there");
        }
        group1();
    }//GEN-LAST:event_btn_r2ActionPerformed

    private void btn_r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_r3ActionPerformed
     button  = 3;
     jsliderMD();
       // selectCorect();
        general_hand();
         try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("error in there");
        }
        group1();
    }//GEN-LAST:event_btn_r3ActionPerformed

    private void btn_r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_r1ActionPerformed
      button  = 1;
      jsliderMD();
        //selectCorect();
        general_hand();
         try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("error in there");
        }
        group1();
    }//GEN-LAST:event_btn_r1ActionPerformed

    private void btn_r4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_r4ActionPerformed
      button  = 4;
      jsliderMD();
      // selectCorect();
       general_hand();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("error in there");
        }
       group1();
    }//GEN-LAST:event_btn_r4ActionPerformed

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed
     
       
    }//GEN-LAST:event_jPanel1KeyPressed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      Close();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
      jslidesub = jSlider1.getValue(); // TODO add your handling code here:
    }//GEN-LAST:event_jSlider1StateChanged

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
            java.util.logging.Logger.getLogger(GAMA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GAMA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GAMA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GAMA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GAMA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_r1;
    private javax.swing.JButton btn_r2;
    private javax.swing.JButton btn_r3;
    private javax.swing.JButton btn_r4;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
   int rand1 = 0;
 int rand2 = 0;
 int  answerorrect =0;
 String qquestion =null;
 int ccorrect = 0;
 int wrong;
 int selectedOption = 0;
 int btnValueII;
 int correctOption = 0;
 int wrongOption = 0;
 int counter = 0;
 //int selectedOption = 0;
 int selectedOptionInt = 0;
 int button = 0;
 int pastResult = 0;
 int jslide = 0;
 int jslidesub = 0;
 //int pastResult = 0;


}
