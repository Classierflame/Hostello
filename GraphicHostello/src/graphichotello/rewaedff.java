/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphichotello;


import CONTROLLER.Controllerbuttons;
import MODEL.Box;
import MODEL.Plancia;
import java.util.ArrayList;
import javax.swing.ImageIcon;
/**
 *
 * @author grassi.edoardo
 */
public class rewaedff extends javax.swing.JFrame {

    Controllerbuttons c;
    String ColorPawns;
    Plancia p;
    ArrayList<Botton> botton;
    private Box field[][];
    /**
     * Creates new form rewaedff
     * @param g
     */

    private rewaedff() {
        p = new Plancia();
        initComponents();
        ImageIcon imgicn1 = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
        jButton24.setIcon(imgicn1);
        ImageIcon imgicn2 = new ImageIcon(getClass().getResource("/Resources/nero.png"));
        jButton39.setIcon(imgicn2);
        ImageIcon imgicn3 = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
        jButton25.setIcon(imgicn3);
        ImageIcon imgicn4 = new ImageIcon(getClass().getResource("/Resources/bianco.png"));       
        jButton42.setIcon(imgicn4);
        ColorPawns ="B";
        c= new Controllerbuttons(p, ColorPawns);
        botton = new ArrayList();
        
        
    }


    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton60 = new javax.swing.JButton();
        jButton61 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jButton63 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton64 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton65 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(34, 177, 76));

        jButton44.setBackground(new java.awt.Color(71, 184, 80));
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });

        jButton45.setBackground(new java.awt.Color(71, 184, 80));
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });

        jButton46.setBackground(new java.awt.Color(71, 184, 80));
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });

        jButton47.setBackground(new java.awt.Color(71, 184, 80));
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });

        jButton48.setBackground(new java.awt.Color(71, 184, 80));
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });

        jButton49.setBackground(new java.awt.Color(71, 184, 80));
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });

        jButton50.setBackground(new java.awt.Color(71, 184, 80));
        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });

        jButton51.setBackground(new java.awt.Color(71, 184, 80));
        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton51ActionPerformed(evt);
            }
        });

        jButton52.setBackground(new java.awt.Color(71, 184, 80));
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });

        jButton53.setBackground(new java.awt.Color(71, 184, 80));
        jButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton53ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(71, 184, 80));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton54.setBackground(new java.awt.Color(71, 184, 80));
        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton54ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(71, 184, 80));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton55.setBackground(new java.awt.Color(71, 184, 80));
        jButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton55ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(71, 184, 80));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton56.setBackground(new java.awt.Color(71, 184, 80));
        jButton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton56ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(71, 184, 80));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton57.setBackground(new java.awt.Color(71, 184, 80));
        jButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton57ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(71, 184, 80));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton58.setBackground(new java.awt.Color(71, 184, 80));
        jButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton58ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(71, 184, 80));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton59.setBackground(new java.awt.Color(71, 184, 80));
        jButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton59ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(71, 184, 80));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(71, 184, 80));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(71, 184, 80));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setBackground(new java.awt.Color(71, 184, 80));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(71, 184, 80));
        jButton1.setForeground(new java.awt.Color(51, 255, 0));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(71, 184, 80));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(71, 184, 80));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(71, 184, 80));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(71, 184, 80));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(71, 184, 80));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(71, 184, 80));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(71, 184, 80));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton60.setBackground(new java.awt.Color(71, 184, 80));
        jButton60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton60ActionPerformed(evt);
            }
        });

        jButton61.setBackground(new java.awt.Color(71, 184, 80));
        jButton61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton61ActionPerformed(evt);
            }
        });

        jButton62.setBackground(new java.awt.Color(71, 184, 80));
        jButton62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton62ActionPerformed(evt);
            }
        });

        jButton63.setBackground(new java.awt.Color(71, 184, 80));
        jButton63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton63ActionPerformed(evt);
            }
        });

        jButton19.setBackground(new java.awt.Color(71, 184, 80));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton64.setBackground(new java.awt.Color(71, 184, 80));
        jButton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton64ActionPerformed(evt);
            }
        });

        jButton20.setBackground(new java.awt.Color(71, 184, 80));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton65.setBackground(new java.awt.Color(71, 184, 80));
        jButton65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton65ActionPerformed(evt);
            }
        });

        jButton21.setBackground(new java.awt.Color(71, 184, 80));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setBackground(new java.awt.Color(71, 184, 80));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setBackground(new java.awt.Color(71, 184, 80));
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setBackground(new java.awt.Color(71, 184, 80));
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setBackground(new java.awt.Color(71, 184, 80));
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setBackground(new java.awt.Color(71, 184, 80));
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton27.setBackground(new java.awt.Color(71, 184, 80));
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton28.setBackground(new java.awt.Color(71, 184, 80));
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setBackground(new java.awt.Color(71, 184, 80));
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton30.setBackground(new java.awt.Color(71, 184, 80));
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton31.setBackground(new java.awt.Color(71, 184, 80));
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton32.setBackground(new java.awt.Color(71, 184, 80));
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jButton33.setBackground(new java.awt.Color(71, 184, 80));
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jButton34.setBackground(new java.awt.Color(71, 184, 80));
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jButton35.setBackground(new java.awt.Color(71, 184, 80));
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jButton37.setBackground(new java.awt.Color(71, 184, 80));
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        jButton38.setBackground(new java.awt.Color(71, 184, 80));
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        jButton39.setBackground(new java.awt.Color(71, 184, 80));
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        jButton40.setBackground(new java.awt.Color(71, 184, 80));
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        jButton41.setBackground(new java.awt.Color(71, 184, 80));
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        jButton42.setBackground(new java.awt.Color(71, 184, 80));
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        jButton43.setBackground(new java.awt.Color(71, 184, 80));
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton65, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton63, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton64, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton62, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton65, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton62, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton63, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton64, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        c.Pulsantepremuto(0,0);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton1.setIcon(imgicn);
            botton.add(new Botton(jButton1,0,0));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton1.setIcon(imgicn);
            botton.add(new Botton(jButton1,0,0));
            refreshView();
        }    

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        c.Pulsantepremuto(2,0);
        
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton2.setIcon(imgicn);
            botton.add(new Botton(jButton2,2,0));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton2.setIcon(imgicn);
            botton.add(new Botton(jButton2,2,0));
            refreshView();
        }    
            
          System.out.println("miozio");    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        c.Pulsantepremuto(3,0);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton3.setIcon(imgicn);
            botton.add(new Botton(jButton3,3,0));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton3.setIcon(imgicn);
            botton.add(new Botton(jButton3,3,0));
            refreshView();
        }    
            
          System.out.println("miozio");    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        c.Pulsantepremuto(4,0);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton4.setIcon(imgicn);
            botton.add(new Botton(jButton4,4,0));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton4.setIcon(imgicn);
            botton.add(new Botton(jButton4,4,0));
            refreshView();
        }    
            
          System.out.println("miozio");    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        c.Pulsantepremuto(5,0);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton5.setIcon(imgicn);
            botton.add(new Botton(jButton5,5,0));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton5.setIcon(imgicn);
            botton.add(new Botton(jButton5,5,0));
            refreshView();
        }    
          System.out.println("miozio");    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        c.Pulsantepremuto(7,0);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton6.setIcon(imgicn);
            botton.add(new Botton(jButton6,7,0));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton6.setIcon(imgicn);
            botton.add(new Botton(jButton6,7,0));
            refreshView();
        }    
                
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        c.Pulsantepremuto(0,1);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton7.setIcon(imgicn);
            botton.add(new Botton(jButton7,0,1));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton7.setIcon(imgicn);
            botton.add(new Botton(jButton7,0,1));
            refreshView();
        }    
            
          System.out.println("miozio");    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        c.Pulsantepremuto(1,0);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton8.setIcon(imgicn);
            botton.add(new Botton(jButton8,1,0));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton8.setIcon(imgicn);
            botton.add(new Botton(jButton8,1,0));
            refreshView();
        }    
            
          System.out.println("miozio");    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        c.Pulsantepremuto(6,0);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton9.setIcon(imgicn);
            botton.add(new Botton(jButton9,6,0));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton9.setIcon(imgicn);
            botton.add(new Botton(jButton9,6,0));
            refreshView();
        }    

          System.out.println("miozio");    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        c.Pulsantepremuto(1,1);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton10.setIcon(imgicn);
            botton.add(new Botton(jButton10,1,1));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton10.setIcon(imgicn);
            botton.add(new Botton(jButton10,1,1));
            refreshView();
        }    
        
        
          System.out.println("miozio");    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        c.Pulsantepremuto(2,1);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton11.setIcon(imgicn);
            botton.add(new Botton(jButton11,1,1));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton11.setIcon(imgicn);
            botton.add(new Botton(jButton11,1,1));
            refreshView();
        }    
        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        c.Pulsantepremuto(3,1);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton12.setIcon(imgicn);
            botton.add(new Botton(jButton12,3,1));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton12.setIcon(imgicn);
            botton.add(new Botton(jButton12,3,1));
            refreshView();
        }    
        
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        c.Pulsantepremuto(4,1);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton13.setIcon(imgicn);
            botton.add(new Botton(jButton13,4,1));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton13.setIcon(imgicn);
            botton.add(new Botton(jButton13,4,1));
            refreshView();
        }    
        
        
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        c.Pulsantepremuto(5,1);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton14.setIcon(imgicn);
            botton.add(new Botton(jButton14,5,1));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton14.setIcon(imgicn);
            botton.add(new Botton(jButton14,5,1));
            refreshView();
        }    
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        c.Pulsantepremuto(6,1);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton15.setIcon(imgicn);
            botton.add(new Botton(jButton15,6,1));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton15.setIcon(imgicn);
            botton.add(new Botton(jButton15,6,1));
            refreshView();
        }    
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        c.Pulsantepremuto(7,1);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton16.setIcon(imgicn);
            botton.add(new Botton(jButton16,7,1));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton16.setIcon(imgicn);
            botton.add(new Botton(jButton16,7,1));
            refreshView();
        }    
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        c.Pulsantepremuto(0,3);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton17.setIcon(imgicn);
            botton.add(new Botton(jButton17,0,3));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton17.setIcon(imgicn);
            botton.add(new Botton(jButton17,0,3));
            refreshView();
        }    
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        c.Pulsantepremuto(0,2);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton18.setIcon(imgicn);
            botton.add(new Botton(jButton18,0,2));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton18.setIcon(imgicn);
            botton.add(new Botton(jButton18,0,2));
            refreshView();
        }    
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        c.Pulsantepremuto(1,2);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton19.setIcon(imgicn);
            botton.add(new Botton(jButton19,1,2));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton19.setIcon(imgicn);
            botton.add(new Botton(jButton19,1,2));
            refreshView();
        }    
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        c.Pulsantepremuto(1,3);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton20.setIcon(imgicn);
            botton.add(new Botton(jButton20,1,3));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png"));  
            jButton20.setIcon(imgicn);
            botton.add(new Botton(jButton20,1,3));
            refreshView();
        }    
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        c.Pulsantepremuto(2,3);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton21.setIcon(imgicn);
            botton.add(new Botton(jButton21,2,3));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton21.setIcon(imgicn);
            botton.add(new Botton(jButton21,2,3));
            refreshView();
        }    
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        c.Pulsantepremuto(2,2);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton22.setIcon(imgicn);
            botton.add(new Botton(jButton22,2,2));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton22.setIcon(imgicn);
            botton.add(new Botton(jButton22,2,2));
            refreshView();
        }    
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        c.Pulsantepremuto(3,2);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton23.setIcon(imgicn);
            botton.add(new Botton(jButton23,3,2));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton23.setIcon(imgicn);
            botton.add(new Botton(jButton23,3,2));
            refreshView();
        }    
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        c.Pulsantepremuto(3,3);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton24.setIcon(imgicn);
            botton.add(new Botton(jButton24,3,3));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton24.setIcon(imgicn);
            botton.add(new Botton(jButton24,3,3));
            refreshView();
        }    
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        c.Pulsantepremuto(4,3);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton25.setIcon(imgicn);
            botton.add(new Botton(jButton25,4,3));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton25.setIcon(imgicn);
            botton.add(new Botton(jButton25,4,3));
            refreshView();
        }    
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        c.Pulsantepremuto(4,2);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton26.setIcon(imgicn);
            botton.add(new Botton(jButton26,4,2));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton26.setIcon(imgicn);
            botton.add(new Botton(jButton26,4,2));
            refreshView();
        }    
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        c.Pulsantepremuto(5,2);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton27.setIcon(imgicn);
            botton.add(new Botton(jButton27,5,2));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton27.setIcon(imgicn);
            botton.add(new Botton(jButton27,5,2));
            refreshView();
        }    
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        c.Pulsantepremuto(5,3);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton28.setIcon(imgicn);
            botton.add(new Botton(jButton28,5,3));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton28.setIcon(imgicn);
            botton.add(new Botton(jButton28,5,3));
            refreshView();
        }    
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        c.Pulsantepremuto(6,3);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton29.setIcon(imgicn);
            botton.add(new Botton(jButton29,6,3));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton29.setIcon(imgicn);
            botton.add(new Botton(jButton29,6,3));
            refreshView();
        }    
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        c.Pulsantepremuto(6,2);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton30.setIcon(imgicn);
            botton.add(new Botton(jButton30,6,2));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton30.setIcon(imgicn);
            botton.add(new Botton(jButton30,6,2));
            refreshView();
        }    
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        c.Pulsantepremuto(7,2);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton31.setIcon(imgicn);
            botton.add(new Botton(jButton31,7,2));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton31.setIcon(imgicn);
            botton.add(new Botton(jButton31,7,2));
            refreshView();
        }    
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        c.Pulsantepremuto(7,3);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton32.setIcon(imgicn);
            botton.add(new Botton(jButton32,7,3));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton32.setIcon(imgicn);
            botton.add(new Botton(jButton32,7,3));
            refreshView();
        }    
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        c.Pulsantepremuto(1,5);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton33.setIcon(imgicn);
            botton.add(new Botton(jButton33,1,5));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton33.setIcon(imgicn);
            botton.add(new Botton(jButton33,1,5));
            refreshView();
        }    
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        c.Pulsantepremuto(0,4);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton34.setIcon(imgicn);
            botton.add(new Botton(jButton34,0,4));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton34.setIcon(imgicn);
            botton.add(new Botton(jButton34,0,4));
            refreshView();
        }    
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
       c.Pulsantepremuto(1,4);
       if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton35.setIcon(imgicn);
            botton.add(new Botton(jButton35,1,4));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton35.setIcon(imgicn);
            botton.add(new Botton(jButton35,1,4));
            refreshView();
        }    
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        c.Pulsantepremuto(2,4);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton37.setIcon(imgicn);
            botton.add(new Botton(jButton37,2,4));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton37.setIcon(imgicn);
            botton.add(new Botton(jButton37,2,4));
            refreshView();
        }    
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        c.Pulsantepremuto(2,5);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton38.setIcon(imgicn);
            botton.add(new Botton(jButton38,2,5));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton38.setIcon(imgicn);
            botton.add(new Botton(jButton38,2,5));
            refreshView();
        }    
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        c.Pulsantepremuto(3,4);
       if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton39.setIcon(imgicn);
            botton.add(new Botton(jButton39,3,4));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton39.setIcon(imgicn);
            botton.add(new Botton(jButton39,3,4));
            refreshView();
        }    
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        c.Pulsantepremuto(3,5);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton40.setIcon(imgicn);
            botton.add(new Botton(jButton40,3,5));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton40.setIcon(imgicn);
            botton.add(new Botton(jButton40,3,5));
            refreshView();
        }    
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        c.Pulsantepremuto(4,5);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton41.setIcon(imgicn);
            botton.add(new Botton(jButton41,4,5));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton41.setIcon(imgicn);
            botton.add(new Botton(jButton41,4,5));
            refreshView();
        }    
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        c.Pulsantepremuto(4,4);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png"));  
            jButton42.setIcon(imgicn);
            botton.add(new Botton(jButton42,4,4));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton42.setIcon(imgicn);
            botton.add(new Botton(jButton42,4,4));
            refreshView();
        }    
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        c.Pulsantepremuto(5,4);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png"));  
            jButton43.setIcon(imgicn);
            botton.add(new Botton(jButton43,5,5));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton43.setIcon(imgicn);
            botton.add(new Botton(jButton43,5,5));
            refreshView();
        }    
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        c.Pulsantepremuto(5,5);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png"));  
            jButton44.setIcon(imgicn);
            botton.add(new Botton(jButton44,5,5));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton44.setIcon(imgicn);
            botton.add(new Botton(jButton44,5,5));
            refreshView();
        }    
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        c.Pulsantepremuto(6,5);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png"));  
            jButton45.setIcon(imgicn);
            botton.add(new Botton(jButton45,6,5));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton45.setIcon(imgicn);
            botton.add(new Botton(jButton45,6,5));
            refreshView();
        }    
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        c.Pulsantepremuto(6,4);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton46.setIcon(imgicn);
            botton.add(new Botton(jButton46,6,4));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton46.setIcon(imgicn);
            botton.add(new Botton(jButton46,6,4));
            refreshView();
        }    
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
        c.Pulsantepremuto(7,4);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png"));  
            jButton47.setIcon(imgicn);
            botton.add(new Botton(jButton47,7,4));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton47.setIcon(imgicn);
            botton.add(new Botton(jButton47,7,4));
            refreshView();
        }    
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
        c.Pulsantepremuto(7,5);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png"));  
            jButton48.setIcon(imgicn);
            botton.add(new Botton(jButton48,7,5));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton48.setIcon(imgicn);
            botton.add(new Botton(jButton48,7,5));
            refreshView();
        }    
    }//GEN-LAST:event_jButton48ActionPerformed

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
        c.Pulsantepremuto(0,7);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton49.setIcon(imgicn);
            botton.add(new Botton(jButton49,0,7));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton49.setIcon(imgicn);
            botton.add(new Botton(jButton49,0,7));
            refreshView();
        }    
    }//GEN-LAST:event_jButton49ActionPerformed

    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed
        c.Pulsantepremuto(0,6);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton50.setIcon(imgicn);
            botton.add(new Botton(jButton50,0,6));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton50.setIcon(imgicn);
            botton.add(new Botton(jButton50,0,6));
            refreshView();
        }    
    }//GEN-LAST:event_jButton50ActionPerformed

    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed
        c.Pulsantepremuto(1,6);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png"));  
            jButton51.setIcon(imgicn);
            botton.add(new Botton(jButton51,1,6));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton51.setIcon(imgicn);
            botton.add(new Botton(jButton51,1,6));
            refreshView();
        }    
    }//GEN-LAST:event_jButton51ActionPerformed

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed
        c.Pulsantepremuto(1,7);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton52.setIcon(imgicn);
            botton.add(new Botton(jButton52,1,6));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton52.setIcon(imgicn);
            botton.add(new Botton(jButton52,1,6));
            refreshView();
        }    
    }//GEN-LAST:event_jButton52ActionPerformed

    private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton53ActionPerformed
        c.Pulsantepremuto(2,7);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png"));  
            jButton53.setIcon(imgicn);
            botton.add(new Botton(jButton53,2,7));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton53.setIcon(imgicn);
            botton.add(new Botton(jButton53,2,7));
            refreshView();
        }    
    }//GEN-LAST:event_jButton53ActionPerformed

    private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton54ActionPerformed
        c.Pulsantepremuto(2,6);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png"));  
            jButton54.setIcon(imgicn);
            botton.add(new Botton(jButton54,2,6));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton54.setIcon(imgicn);
            botton.add(new Botton(jButton54,2,6));
            refreshView();
        }    
    }//GEN-LAST:event_jButton54ActionPerformed

    private void jButton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton55ActionPerformed
        c.Pulsantepremuto(3,6);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png"));  
            jButton55.setIcon(imgicn);
            botton.add(new Botton(jButton55,3,6));
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton55.setIcon(imgicn);
            botton.add(new Botton(jButton55,3,6));
            refreshView();
        }    
    }//GEN-LAST:event_jButton55ActionPerformed

    private void jButton56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton56ActionPerformed
        c.Pulsantepremuto(3,7);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton56.setIcon(imgicn);
            botton.add(new Botton(jButton56,3,6));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton56.setIcon(imgicn);
            botton.add(new Botton(jButton56,3,6));
            refreshView();
        }    
    }//GEN-LAST:event_jButton56ActionPerformed

    private void jButton57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton57ActionPerformed
        c.Pulsantepremuto(4,7);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton57.setIcon(imgicn);
            botton.add(new Botton(jButton57,4,7));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton57.setIcon(imgicn);
            botton.add(new Botton(jButton57,4,7));
            refreshView();
        }    
    }//GEN-LAST:event_jButton57ActionPerformed

    private void jButton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton58ActionPerformed
        c.Pulsantepremuto(4,6);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton58.setIcon(imgicn);
            botton.add(new Botton(jButton58,4,6));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton58.setIcon(imgicn);
            botton.add(new Botton(jButton58,4,6));
            refreshView();
        }    
    }//GEN-LAST:event_jButton58ActionPerformed

    private void jButton59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton59ActionPerformed
        c.Pulsantepremuto(5,6);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton59.setIcon(imgicn);
            botton.add(new Botton(jButton59,5,6));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton59.setIcon(imgicn);
            botton.add(new Botton(jButton59,5,6));
            refreshView();
        }    
    }//GEN-LAST:event_jButton59ActionPerformed

    private void jButton60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton60ActionPerformed
        c.Pulsantepremuto(5,7);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png"));  
            jButton60.setIcon(imgicn);
            botton.add(new Botton(jButton60,5,7));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton60.setIcon(imgicn);
            botton.add(new Botton(jButton60,5,7));
            refreshView();
        }    
    }//GEN-LAST:event_jButton60ActionPerformed

    private void jButton61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton61ActionPerformed
        c.Pulsantepremuto(6,7);
       if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png"));  
            jButton61.setIcon(imgicn);
            botton.add(new Botton(jButton61,6,7));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton61.setIcon(imgicn);
            botton.add(new Botton(jButton61,6,7));
            refreshView();
        }    
    }//GEN-LAST:event_jButton61ActionPerformed

    private void jButton62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton62ActionPerformed
        c.Pulsantepremuto(6,6);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton62.setIcon(imgicn);
            botton.add(new Botton(jButton62,6,6));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton62.setIcon(imgicn);
            botton.add(new Botton(jButton62,6,6));
            refreshView();
        }    
    }//GEN-LAST:event_jButton62ActionPerformed

    private void jButton63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton63ActionPerformed
        c.Pulsantepremuto(7,6);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
            jButton63.setIcon(imgicn);
            botton.add(new Botton(jButton63,7,6));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png"));  
            jButton63.setIcon(imgicn);
            botton.add(new Botton(jButton63,7,6));
            refreshView();
        }    
    }//GEN-LAST:event_jButton63ActionPerformed

    private void jButton64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton64ActionPerformed
        c.Pulsantepremuto(7,7);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png"));  
            jButton64.setIcon(imgicn);
            botton.add(new Botton(jButton64,7,7));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton64.setIcon(imgicn);
            botton.add(new Botton(jButton64,7,7));
            refreshView();
        }    
    }//GEN-LAST:event_jButton64ActionPerformed

    private void jButton65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton65ActionPerformed
        c.Pulsantepremuto(0,5);
        if(ColorPawns.equals("B")){
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/nero.png"));  
            jButton65.setIcon(imgicn);
            botton.add(new Botton(jButton65,0,5));
            refreshView();
        }else{
            ImageIcon imgicn = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
            jButton65.setIcon(imgicn);
            botton.add(new Botton(jButton65,0,5));
            refreshView();
        }    
    }//GEN-LAST:event_jButton65ActionPerformed

    public void refreshView(){
        field = p.getField();
        for(int r=0; r<8; r=r+1){
            for(int c=0; c<8; c=c+1){
               if(field[r][c].getOccuped()){
                   if(field[r][c].getpawn().getColor().equals("B")){
                       for(int i=0; i<botton.size(); i=i+1){
                        if(botton.get(i).x==r && botton.get(i).y==c){
                            
                            ImageIcon imgicn1 = new ImageIcon(getClass().getResource("/Resources/nero.png")); 
                            botton.get(i).jb.setIcon(imgicn1);
                        }
                       }
                   }else{
                       for(int i=0; i<botton.size(); i=i+1){
                            if(botton.get(i).x==r && botton.get(i).y==c){
                                 ImageIcon imgicn1 = new ImageIcon(getClass().getResource("/Resources/bianco.png")); 
                                 botton.get(i).jb.setIcon(imgicn1);
                             }
                       }
                   }
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
            java.util.logging.Logger.getLogger(rewaedff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rewaedff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rewaedff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rewaedff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(){
                new rewaedff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton65;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
