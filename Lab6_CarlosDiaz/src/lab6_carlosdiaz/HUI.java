/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_carlosdiaz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Diaz
 */
public class HUI extends javax.swing.JFrame {

    /**
     * Creates new form HUI
     */
    public HUI() {
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

        jd_playlist = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        tf_nombreP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cb_canciones = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_playlist = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cb_cancionesCargadas = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jd_rolita = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        tf_nombreR = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_puntuaciofn = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        tf_anfo = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        tf_artista = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tf_album = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jMenuItem4 = new javax.swing.JMenuItem();
        com = new javax.swing.ButtonGroup();
        b_ap = new javax.swing.JButton();
        b_ar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        jLabel1.setText("Nombre");

        jLabel2.setText("Canciones");

        cb_canciones.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_cancionesItemStateChanged(evt);
            }
        });

        ta_playlist.setColumns(20);
        ta_playlist.setRows(5);
        jScrollPane2.setViewportView(ta_playlist);

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Crear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel8.setText("Canciones cargadas");

        cb_cancionesCargadas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_cancionesCargadasItemStateChanged(evt);
            }
        });

        jButton6.setText("Modificar canción");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel9.setText("Las podés modificar en el otro combo");

        jButton7.setText("Eliminar canción");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jMenu3.setText("File");

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Abrir PlayList");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Guardar PlayList");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jd_playlist.setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout jd_playlistLayout = new javax.swing.GroupLayout(jd_playlist.getContentPane());
        jd_playlist.getContentPane().setLayout(jd_playlistLayout);
        jd_playlistLayout.setHorizontalGroup(
            jd_playlistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_playlistLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jd_playlistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(64, 64, 64)
                .addGroup(jd_playlistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_nombreP)
                    .addComponent(cb_canciones, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jd_playlistLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jd_playlistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_playlistLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_playlistLayout.createSequentialGroup()
                        .addGroup(jd_playlistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_playlistLayout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addGroup(jd_playlistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jd_playlistLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jd_playlistLayout.createSequentialGroup()
                                .addGroup(jd_playlistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jd_playlistLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel9))
                                    .addGroup(jd_playlistLayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(26, 26, 26)
                                        .addComponent(cb_cancionesCargadas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(199, 199, 199)))
                        .addGap(99, 99, 99))))
        );
        jd_playlistLayout.setVerticalGroup(
            jd_playlistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_playlistLayout.createSequentialGroup()
                .addGroup(jd_playlistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jd_playlistLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jd_playlistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tf_nombreP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63))
                    .addGroup(jd_playlistLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jd_playlistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cb_canciones, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6)
                            .addComponent(jButton7))))
                .addGap(60, 60, 60)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(jd_playlistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cb_cancionesCargadas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(8, 8, 8)
                .addGroup(jd_playlistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jLabel3.setText("Nombre");

        jLabel4.setText("Puntuación");

        tf_puntuaciofn.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel5.setText("Año");

        tf_anfo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy"))));

        jLabel6.setText("Artista");

        jLabel7.setText("Album");

        jButton2.setText("Crear Rolita");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_rolitaLayout = new javax.swing.GroupLayout(jd_rolita.getContentPane());
        jd_rolita.getContentPane().setLayout(jd_rolitaLayout);
        jd_rolitaLayout.setHorizontalGroup(
            jd_rolitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_rolitaLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(jd_rolitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jd_rolitaLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(104, 104, 104)
                        .addComponent(tf_album, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_rolitaLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(104, 104, 104)
                        .addComponent(tf_artista, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_rolitaLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(104, 104, 104)
                        .addComponent(tf_anfo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_rolitaLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(104, 104, 104)
                        .addComponent(tf_nombreR, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_rolitaLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(104, 104, 104)
                        .addComponent(tf_puntuaciofn, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(181, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_rolitaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(81, 81, 81))
        );
        jd_rolitaLayout.setVerticalGroup(
            jd_rolitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_rolitaLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jd_rolitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_nombreR, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_rolitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_puntuaciofn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_rolitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(tf_anfo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_rolitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_artista, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_rolitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_album, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jButton2)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        b_ap.setText("PlayLists");
        b_ap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_apActionPerformed(evt);
            }
        });

        b_ar.setText("Crear rolita");
        b_ar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_arActionPerformed(evt);
            }
        });

        jButton5.setText("Modificar rolita");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jMenu2.setText("Plis jelp Clau");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(244, Short.MAX_VALUE)
                .addComponent(b_ap)
                .addGap(182, 182, 182)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(b_ar)
                        .addGap(11, 11, 11))
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(304, 304, 304))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(b_ap))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(b_ar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)))
                .addContainerGap(373, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // CREAR ROLA
        if(tf_nombreR.getText().isEmpty() && tf_puntuaciofn.getText().isEmpty() && tf_anfo.getText().isEmpty() && tf_artista.getText().isEmpty() && tf_album.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "No podés dejar espacios en blanco");
        } else {
            if(tf_nombreR.isEnabled()==false){      //para el modificar
                DefaultComboBoxModel dc = (DefaultComboBoxModel) cb_canciones.getModel();       //añadir cancion al combobox
                Cancion rola_modificar = (Cancion) dc.getSelectedItem();
                rola_modificar.setPuntuación(Integer.parseInt(tf_puntuaciofn.getText())); rola_modificar.setAño(Integer.parseInt(tf_anfo.getText())); 
                rola_modificar.setArtista(tf_artista.getText()); rola_modificar.setAlbum(tf_album.getText());
                cb_canciones.setModel(dc);
            } else{                                                                             //si se esta creando, hacer esto
                int puntuacion = Integer.parseInt(tf_puntuaciofn.getText()); 
                while (puntuacion<0 || puntuacion>10) {     //validación
                    puntuacion = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese una puntuación entre 0-10"));
                    //System.out.println(puntuacion);
                }
                Cancion c = new Cancion(tf_nombreR.getText(), puntuacion, Integer.parseInt(tf_anfo.getText()), tf_artista.getText(), tf_album.getText());

                tf_nombreR.setText(""); tf_puntuaciofn.setText(""); tf_anfo.setText(""); tf_artista.setText(""); tf_album.setText("");      //limpiar

                DefaultComboBoxModel dc = (DefaultComboBoxModel) cb_canciones.getModel();       //añadir cancion al combobox
                dc.addElement(c);
                cb_canciones.setModel(dc);
            }
        }
        jd_rolita.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void b_arActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_arActionPerformed
        // MOSTRAR VENTANA DE ROLITA
        jd_rolita.setModal(true);        
        jd_rolita.pack();
        jd_rolita.setLocationRelativeTo(this);        
        jd_rolita.setVisible(true);
    }//GEN-LAST:event_b_arActionPerformed

    private void b_apActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_apActionPerformed
        // MOSTRAR VENTANA DE PLAYLIST
        jd_playlist.setModal(true);        
        jd_playlist.pack();
        jd_playlist.setLocationRelativeTo(this);        
        jd_playlist.setVisible(true);
    }//GEN-LAST:event_b_apActionPerformed

    private void cb_cancionesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_cancionesItemStateChanged
        // CREAR PLAYLIST
        
        if(tf_nombreP.getText().isEmpty()==false){
            p = new PlayList(tf_nombreP.getText());
            
            if (evt.getStateChange() == 2) {
                Cancion rola_añadir = (Cancion) cb_canciones.getSelectedItem();
                p.getRolitas().add(rola_añadir);
                //System.out.println(rola_añadir);
                ta_playlist.setText(ta_playlist.getText() + rola_añadir.toString() + "\n");      //se van colocando las rolitas
            }
        } else{
            JOptionPane.showMessageDialog(this, "Rellena el nombre de la PlayList");
        }
    }//GEN-LAST:event_cb_cancionesItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // SALIR DEL CREAR PLAYLIST
        System.out.println(p);
        jd_playlist.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // ABRIR PLAYLIST
        ta_playlist.setText("-");
        File fichero = null; 
        FileReader fr = null;
        BufferedReader br = null;
        
        try {
            JFileChooser jfc = new JFileChooser("./");
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de Texto", "txt");
            FileNameExtensionFilter filtro2 = new FileNameExtensionFilter("Imagenes", "jpg","png","bmp");
            jfc.setFileFilter(filtro);
            jfc.addChoosableFileFilter(filtro2);
            int seleccion = jfc.showOpenDialog(this);
            if (seleccion==JFileChooser.APPROVE_OPTION) {
                fichero = jfc.getSelectedFile();
                fr = new FileReader(fichero);
                System.out.println("Nombre del archivo: "+jfc.toString());
                br = new BufferedReader(fr);
                String linea;
                ta_playlist.setText("");        //limpio el text_area
                
                while((linea=br.readLine())!=null){
                    System.out.println(linea);
                    String t[] = linea.split(";");      //TOKENS separados por ;
                    ta_playlist.setText(ta_playlist.getText()+linea+"\n");
                    String p = t[1];
                    int puntuacion = Integer.parseInt(p);
                    String f = t[2];
                    int ano = Integer.parseInt(f);
                    //System.out.println(t[0]+ t[1]+ t[2]+ t[3]+ t[4]); //para combrobar si sirve
                    Cancion rola_cargada = new Cancion(t[0], puntuacion, ano, t[3], t[4]);       //el 1 es la puntuacion y el 2 es el año
                    
                    DefaultComboBoxModel dc = (DefaultComboBoxModel) cb_cancionesCargadas.getModel();       //añadir cancion al combobox de cargadas
                    dc.addElement(rola_cargada);
                    cb_cancionesCargadas.setModel(dc);
                    
                    DefaultComboBoxModel cd = (DefaultComboBoxModel) cb_canciones.getModel();       //añadir cancion al combobox normal
                    cd.addElement(rola_cargada);
                    cb_canciones.setModel(cd);
                    
                }
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try {
            br.close();
            fr.close();
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // GUARDAR PLAYLIST
        JFileChooser jfc = new JFileChooser("./");
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de Texto", "txt");
        jfc.addChoosableFileFilter(filtro);
        int seleccion = jfc.showSaveDialog(this);
        FileWriter fw = null;
        BufferedWriter bw = null;
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            try {
                File fichero = null;
                if (jfc.getFileFilter().getDescription().equals("Archivos de Texto")) {
                    fichero = new File(jfc.getSelectedFile().getPath()+".txt");
                    System.out.println("Nombre del fichero: "+jfc.toString());
                    
                }else{
                    fichero = jfc.getSelectedFile();
                }
                fw = new FileWriter(fichero);
                bw = new BufferedWriter(fw);

                bw.write((String) ta_playlist.getText());   //en el textArea ya lo tenía con formato

                ta_playlist.setText("");                    //limpio el textArea
                
                bw.flush();
                JOptionPane.showMessageDialog(this, "Archivo guardado excitosamente en "+fichero.toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            try {
                bw.close();
                fw.close();
            } catch (IOException ex) {
            }   
        }
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // CREAR PLAYLISTS
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cb_cancionesCargadasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_cancionesCargadasItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_cancionesCargadasItemStateChanged

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // MOSTRAR JD DE MODIFICAR ROLA
        JOptionPane.showMessageDialog(this, "Troliado. El Modif de las canciones está en crear PlayList");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // MODIFICAR CANCIóN SELECCIONADA EN COMBO BOX
        rola_modificar = (Cancion) cb_canciones.getSelectedItem();
        nombreRolitaMantener=rola_modificar.getNombreC();
        System.out.println(nombreRolitaMantener);
        tf_nombreR.setText(nombreRolitaMantener);
        tf_nombreR.setEnabled(false);   //para q modifique el nombre
        
        jd_rolita.setModal(true);        
        jd_rolita.pack();
        jd_rolita.setLocationRelativeTo(this);        
        jd_rolita.setVisible(true);
        
        /*rola_modificar.setPuntuación(Integer.parseInt(tf_puntuaciofn.getText())); rola_modificar.setAño(Integer.parseInt(tf_anfo.getText())); 
        rola_modificar.setArtista(tf_artista.getText()); rola_modificar.setAlbum(tf_album.getText());*/
        
        tf_nombreR.setEnabled(true);
        jd_rolita.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // ELIMINAR CANCIóN EN COMBOBOx
        int input = JOptionPane.showConfirmDialog(null, "Seguro de eliminar canción?", "Eliminar",
	JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
        if(input==0){
            cb_canciones.removeItem(cb_canciones.getSelectedItem());
        }
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(HUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_ap;
    private javax.swing.JButton b_ar;
    private javax.swing.JComboBox<String> cb_canciones;
    private javax.swing.JComboBox<String> cb_cancionesCargadas;
    private javax.swing.ButtonGroup com;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JDialog jd_playlist;
    private javax.swing.JDialog jd_rolita;
    private javax.swing.JTextArea ta_playlist;
    private javax.swing.JTextField tf_album;
    private javax.swing.JFormattedTextField tf_anfo;
    private javax.swing.JTextField tf_artista;
    private javax.swing.JTextField tf_nombreP;
    private javax.swing.JTextField tf_nombreR;
    private javax.swing.JFormattedTextField tf_puntuaciofn;
    // End of variables declaration//GEN-END:variables

    PlayList p = new PlayList();
    Cancion rola_modificar = new Cancion();
    String nombreRolitaMantener;
}
