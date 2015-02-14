/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plh24ergasia3;


import javax.swing.JOptionPane;
import static plh24ergasia3.AlbumArrayArtist.albumList;
import pojos.Album;
import pojos.Artist;
import pojos.MusicGroup;
import pojos.MusicProductionCompany;
import pojos.Playlist;
import pojos.Song;




/**
 *
 * @author Rithri
 */
public class NewOrModifyBandAlbum extends javax.swing.JFrame {
    
    private pojos.Album album;//δημιουργια field
    private MusicProductionCompany company;
    private int selectedBandRow,selectedCompanyRow,confirm;
    //private String title;
    boolean modify;
    private MusicGroup band;
    //Artist a1;
   // Song s1;
    //MusicGroup group1;
    //Album album1=new Album();
    int initial;
    
    /**
     * Creates new form ModifyBandAlbum
     */
  
     public NewOrModifyBandAlbum(){
         initComponents();
         songList.clear();
         modify=false;
       
    }
    
    
    public NewOrModifyBandAlbum(Album album){
         initComponents();
         modify=false;
         albumTitle.setText(album.getTitle());
         albumType.setText(album.getType());
         releaseDate.setDate(album.getReleaseDate());
         
    }
    
    //public NewOrModifyBandAlbum(Album album, int x) {
    //    this.album=album;
     //   initComponents();               
     //   modify = true;
     //   albumTitle.setText(album.getTitle());
     //   albumType.setText(album.getType());
    //    releaseDate.setDate(album.getReleaseDate());
    //    initial=x;
    //}
         
       
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        radioDBv2PUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("radioDBv2PU").createEntityManager();
        songQuery = java.beans.Beans.isDesignTime() ? null : radioDBv2PUEntityManager.createQuery("SELECT s FROM Song s");
        songList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(songQuery.getResultList());
        musicProductionCompanyQuery1 = java.beans.Beans.isDesignTime() ? null : radioDBv2PUEntityManager.createQuery("SELECT m FROM MusicProductionCompany m");
        musicProductionCompanyList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(musicProductionCompanyQuery1.getResultList());
        musicGroupQuery = java.beans.Beans.isDesignTime() ? null : radioDBv2PUEntityManager.createQuery("SELECT m FROM MusicGroup m");
        musicGroupList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(musicGroupQuery.getResultList());
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        songArray = new javax.swing.JTable();
        albumTitle = new javax.swing.JTextField();
        albumType = new javax.swing.JTextField();
        albumNo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        releaseDate = new com.toedter.calendar.JDateChooser();
        cancel = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        bandTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        companyTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        deleteSong = new javax.swing.JButton();
        save = new javax.swing.JButton();
        saveSongList = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ΔΙΑΧΕΙΡΗΣΗ ΑΛΜΠΟΥΜ");
        setPreferredSize(new java.awt.Dimension(1000, 800));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Διαχείρηση Άλμπουμ Συγκροτήματος");

        jLabel2.setText("Τίτλος");

        jLabel3.setText("Τύπος Άλμπουμ");

        jLabel4.setText("Αριθμός Άλμπουμ");

        jLabel5.setText("Εταιρία Παραγωγής");

        jLabel7.setText("Ημερομηνία Κυκλοφορίας");

        jLabel8.setText("Λίστα Τραγουδιών:");

        songArray.setColumnSelectionAllowed(true);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, songList, songArray);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${title}"));
        columnBinding.setColumnName("Τίτλος");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${duration}"));
        columnBinding.setColumnName("διάρκεια σε sec");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tracknr}"));
        columnBinding.setColumnName("Νούμερο");
        columnBinding.setColumnClass(Integer.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(songArray);
        songArray.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        albumTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                albumTitleActionPerformed(evt);
            }
        });

        albumType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                albumTypeActionPerformed(evt);
            }
        });

        albumNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                albumNoActionPerformed(evt);
            }
        });

        jLabel10.setText("Συγκροτήμα:");

        cancel.setText("Ακύρωση");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, musicGroupList, bandTable);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${name}"));
        columnBinding.setColumnName("Ονομα");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${formationDate}"));
        columnBinding.setColumnName("Ημ/νια δημιουργίας");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane2.setViewportView(bandTable);

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, musicProductionCompanyList, companyTable);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${name}"));
        columnBinding.setColumnName("Ονομα");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${address}"));
        columnBinding.setColumnName("Διευθυνση");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${telephone}"));
        columnBinding.setColumnName("τηλέφωνο");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane3.setViewportView(companyTable);

        jButton1.setText("Εισαγωγή");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        deleteSong.setText("Διαγραφή");
        deleteSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSongActionPerformed(evt);
            }
        });

        save.setText("Αποθήκευση");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        saveSongList.setText("Αποθήκευση λίστας");
        saveSongList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveSongListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(80, 80, 80)
                        .addComponent(albumTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(albumType, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(albumNo)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(cancel))
                        .addGap(26, 26, 26))
                    .addComponent(jLabel5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(deleteSong))
                                    .addComponent(jLabel7))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(66, 66, 66)
                                        .addComponent(releaseDate, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(saveSongList))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(441, 441, 441))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(albumTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(albumType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(albumNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(52, 52, 52)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cancel)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jButton1)
                                            .addComponent(deleteSong)
                                            .addComponent(saveSongList))
                                        .addGap(99, 99, 99)
                                        .addComponent(jLabel7))
                                    .addComponent(releaseDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    
    
    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        //this.setVisible(false); //κλεινει αυτη η φορμα
        new Kentriki().setVisible(true);
        dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void albumTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_albumTitleActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_albumTitleActionPerformed

    private void albumTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_albumTypeActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_albumTypeActionPerformed

    private void albumNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_albumNoActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_albumNoActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        selectedBandRow=bandTable.getSelectedRow();
        selectedCompanyRow=companyTable.getSelectedRow();
        band=musicGroupList.get(bandTable.convertRowIndexToModel(selectedBandRow));
        company=musicProductionCompanyList.get(companyTable.convertRowIndexToModel(selectedCompanyRow));
        if(!modify){//νέα εγγραφή άλμπουμ
            album = new Album();
            album.setTitle(albumTitle.getText());
            album.setType(albumType.getText());
            album.setDiskNumber(Integer.parseInt(albumNo.getText()));//κανω το string int
            album.setReleaseDate(releaseDate.getDate());
            album.setMusicProductionCompanyname(company);
            album.setMusicGroupmusicGroupId(band);
            album.setSongList(songList);
            
            for(Song song:songList){//για κάθε τραγούδι της λιστας                 
                System.out.println(song.getTitle());    
                song.setAlbumalbumId(album);
                }
            if(DBManager.addAlbum(album)){//ενημερωση πίνακα
                AlbumArrayBand.albumList1.set(AlbumArrayBand.jTable1.getSelectedRow(),album);
                JOptionPane.showMessageDialog(null, "Επιτυχής αποθήκευση νέου αλμπουμ!", "SUCCESSFUL", JOptionPane.INFORMATION_MESSAGE);
                dispose();
            }
        }
    }//GEN-LAST:event_saveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // δε δουλεύει
        Song song = new Song(songList.size()+1,"",0,0);
        songList.add(song);
 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void deleteSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSongActionPerformed
        // TODO add your handling code here:
        int selectedSongRow=songArray.getSelectedRow();
        Song song1=songList.get(songArray.convertRowIndexToModel(selectedSongRow));
        if (DBManager.deleteSong(song1)){
            songList.remove(song1);
            
        }
        else {
            JOptionPane.showMessageDialog(null, "Αποτυχία διαγραφής τραγουδιου!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteSongActionPerformed

    private void saveSongListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveSongListActionPerformed
        // TODO add your handling code here:
        
        for(Song song:songList){
        if(!DBManager.addSong(song)){
            JOptionPane.showMessageDialog(null, "Αποτυχία εισαγωγής τραγουδιου!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        }
        
    }//GEN-LAST:event_saveSongListActionPerformed

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
            java.util.logging.Logger.getLogger(NewOrModifyBandAlbum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewOrModifyBandAlbum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewOrModifyBandAlbum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewOrModifyBandAlbum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewOrModifyBandAlbum().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField albumNo;
    private javax.swing.JTextField albumTitle;
    private javax.swing.JTextField albumType;
    private javax.swing.JTable bandTable;
    private javax.swing.JButton cancel;
    private javax.swing.JTable companyTable;
    private javax.swing.JButton deleteSong;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private java.util.List<pojos.MusicGroup> musicGroupList;
    private javax.persistence.Query musicGroupQuery;
    private java.util.List<pojos.MusicProductionCompany> musicProductionCompanyList;
    private javax.persistence.Query musicProductionCompanyQuery1;
    private javax.persistence.EntityManager radioDBv2PUEntityManager;
    private com.toedter.calendar.JDateChooser releaseDate;
    private javax.swing.JButton save;
    private javax.swing.JButton saveSongList;
    protected static javax.swing.JTable songArray;
    private java.util.List<pojos.Song> songList;
    private javax.persistence.Query songQuery;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

 
   

}
