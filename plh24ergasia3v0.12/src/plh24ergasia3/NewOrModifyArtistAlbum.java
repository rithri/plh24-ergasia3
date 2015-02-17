/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plh24ergasia3;


import java.util.Random;
import javax.swing.JOptionPane;
import pojos.*;


public class NewOrModifyArtistAlbum extends javax.swing.JFrame {

   
    /**
     * 
     * Creates new form NewOrModifyArtistAlbum
     */
    private pojos.Album album;//δημιουργια field
    private pojos.Artist artist;
    private int selectedBandRow,selectedCompanyRow,confirm,selectedRow;
    private MusicProductionCompany company;
    boolean modify;
    Artist artist1;
    Song s1;
    Album album1=new Album();
    Random generator = new Random(); 
    
    
    public NewOrModifyArtistAlbum() {
    initComponents();
    }

    public NewOrModifyArtistAlbum(Album album){
         initComponents();
         modify=false;
         songList.clear();
         albumTitle.setText(album.getTitle());
         albumType.setText(album.getType());
         releaseDate.setDate(album.getReleaseDate());
         for(Song song:album.getSongList()){
             songList.add(song);
         }
    }
    
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
        musicProductionCompanyQuery = java.beans.Beans.isDesignTime() ? null : radioDBv2PUEntityManager.createQuery("SELECT m FROM MusicProductionCompany m");
        musicProductionCompanyList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(musicProductionCompanyQuery.getResultList());
        artistQuery = java.beans.Beans.isDesignTime() ? null : radioDBv2PUEntityManager.createQuery("SELECT a FROM Artist a");
        artistList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(artistQuery.getResultList());
        albumTitle = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        albumType = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        albumNo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        releaseDate = new com.toedter.calendar.JDateChooser();
        cancel = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        artistTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        companyTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        songArray = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ΔΙΑΧΕΙΡΗΣΗ ΑΛΜΠΟΥΜ ΣΥΓΚΡΟΤΗΜΑΤΟΣ");
        setPreferredSize(new java.awt.Dimension(1200, 667));

        albumTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                albumTitleActionPerformed(evt);
            }
        });

        jButton2.setText("Διαγραφή");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        albumType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                albumTypeActionPerformed(evt);
            }
        });

        save.setText("Αποθήκευση");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        albumNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                albumNoActionPerformed(evt);
            }
        });

        jLabel10.setText("Καλλιτέχνης");

        cancel.setText("Ακύρωση");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        artistTable.setColumnSelectionAllowed(true);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, artistList, artistTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${artisticName}"));
        columnBinding.setColumnName("Καλλιτεχνικό Όνομα");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane2.setViewportView(artistTable);
        artistTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        companyTable.setColumnSelectionAllowed(true);

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, musicProductionCompanyList, companyTable);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${name}"));
        columnBinding.setColumnName("Όνομα");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${address}"));
        columnBinding.setColumnName("Διεύθυνση");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${telephone}"));
        columnBinding.setColumnName("Τηλέφωνο");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane3.setViewportView(companyTable);
        companyTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Διαχείρηση Άλμπουμ Καλλιτεχνών");

        jLabel2.setText("Τίτλος");

        jLabel3.setText("Τύπος Άλμπουμ");

        jLabel4.setText("Αριθμός Άλμπουμ");

        jLabel5.setText("Εταιρία Παραγωγής");

        jLabel7.setText("Ημερομηνία Κυκλοφορίας");

        jLabel8.setText("Λίστα Τραγουδιών:");

        songArray.setColumnSelectionAllowed(true);

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, songList, songArray);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${title}"));
        columnBinding.setColumnName("Τίτλος");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${duration}"));
        columnBinding.setColumnName("Διάρκεια");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tracknr}"));
        columnBinding.setColumnName("Νούμερο");
        columnBinding.setColumnClass(Integer.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(songArray);
        songArray.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jButton1.setText("Εισαγωγή");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Αποθήκευση");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(cancel))
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(albumTitle, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(albumType, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(albumNo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(66, 66, 66)
                                .addComponent(releaseDate, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addGap(46, 46, 46)
                                    .addComponent(jButton2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(albumTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(albumType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(albumNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancel)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1)
                                    .addComponent(jButton2)
                                    .addComponent(jButton3))
                                .addGap(99, 99, 99)
                                .addComponent(jLabel7))
                            .addComponent(releaseDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void albumTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_albumTitleActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_albumTitleActionPerformed

    private void albumTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_albumTypeActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_albumTypeActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
         // Υποχρεωτικό γέμισμα πεδίων
         if  (  albumTitle.getText().equals("")|| 
                albumType.getText().equals("") || 
                albumNo.getText().equals(""))
                {
       JOptionPane.showMessageDialog(null, "Τα πεδία είναι υποχρεωτικά!", "ERROR", JOptionPane.ERROR_MESSAGE);
       } 
         
        else {
              if (modify==true) {//τροποποίηση
                    confirm = JOptionPane.showConfirmDialog(null, "Επιθυμείτε να αποθηκεύσετε τις αλλαγές;" , "",JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                    album.setTitle(albumTitle.getText());
                    album.setType(albumType.getText());
                    album.setDiskNumber(Integer.parseInt(albumNo.getText()));// για ΙΝΤEGER Τιμές
                    album.setReleaseDate(releaseDate.getDate());
                    
              if(DBManager.modifyAlbumSongList(album,songList)){
                if(DBManager.modifyAlbum(album)){
                    JOptionPane.showMessageDialog(null, "Επιτυχής αποθήκευση " , "SUCCESSFUL", JOptionPane.INFORMATION_MESSAGE);                                           
                    dispose();
                }
            }
            else
                JOptionPane.showMessageDialog(null, "Σφάλμα επικοινωνίας με τη ΒΔ!", "ERROR", JOptionPane.ERROR_MESSAGE);

        }
                    
        selectedBandRow=artistTable.getSelectedRow();
        selectedCompanyRow=companyTable.getSelectedRow();
        artist=artistList.get(artistTable.convertRowIndexToModel(selectedBandRow));
        company=musicProductionCompanyList.get(companyTable.convertRowIndexToModel(selectedCompanyRow));
        if(!modify){//νέα εγγραφή άλμπουμ
            album1.setTitle(albumTitle.getText());
            album1.setType(albumType.getText());
            album1.setDiskNumber(Integer.parseInt(albumNo.getText()));//κανω το string int
            album1.setReleaseDate(releaseDate.getDate());
            album1.setMusicProductionCompanyname(company);
            album1.setArtistartistId(artist);
            album1.setSongList(songList);
                
           for(Song song:songList){//για κάθε τραγούδι της λιστας                 
                System.out.println(song.getTitle());    
                song.setAlbumalbumId(album1);
                }
            if(DBManager.addAlbum(album1)){//ενημερωση πίνακα
                for (Artist artist1 : artistList) { 
                    if (artist1.getAlbumList().contains(album1))
                        artist1.getAlbumList().remove(album1);
                AlbumArrayArtist.albumList.add(album1);
                JOptionPane.showMessageDialog(null, "Επιτυχής αποθήκευση νέου αλμπουμ!", "SUCCESSFUL", JOptionPane.INFORMATION_MESSAGE);
                dispose();
            }
           }  
        }
         }
    }//GEN-LAST:event_saveActionPerformed

    private void albumNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_albumNoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_albumNoActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        //this.setVisible(false); //κλεινει αυτη η φορμα
        new Kentriki().setVisible(true);
        dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int id=generator.nextInt();
        s1 = new Song(id,"τιτλος",0,0);//δημιουργει νεο κενό που το τροποποιουμε με το χέρι
        songList.add(s1);//εισαγει το "λευκο" song
        JOptionPane.showMessageDialog(null, "Παρακαλω επεξεργαστείτε το νέο τραγούδι και πατηστε το κουμπί αποθηκευση", "SUCCESSFUL", JOptionPane.INFORMATION_MESSAGE);     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int selectedSongRow=songArray.getSelectedRow();
        Song song1=songList.get(songArray.convertRowIndexToModel(selectedSongRow));
        if (DBManager.deleteSong(song1)){
            songList.remove(song1);           
        }
        else {
            JOptionPane.showMessageDialog(null, "Αποτυχία διαγραφής τραγουδιου!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(DBManager.addSong(s1)){ 
            for (Song s1 : songList) { 
                    if (s1.getPlaylistList().contains(s1))
                        s1.getPlaylistList().remove(s1);}
            JOptionPane.showMessageDialog(null, "Το νέο τραγούδι αποθηκεύτηκε με επιτυχία", "SUCCESSFUL", JOptionPane.INFORMATION_MESSAGE);     
        }
        else{
            JOptionPane.showMessageDialog(null, "Αποτυχία εισαγωγής τραγουδιου στη ΒΔ!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(NewOrModifyArtistAlbum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewOrModifyArtistAlbum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewOrModifyArtistAlbum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewOrModifyArtistAlbum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewOrModifyArtistAlbum().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField albumNo;
    private javax.swing.JTextField albumTitle;
    private javax.swing.JTextField albumType;
    private java.util.List<pojos.Artist> artistList;
    private javax.persistence.Query artistQuery;
    private javax.swing.JTable artistTable;
    private javax.swing.JButton cancel;
    private javax.swing.JTable companyTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private java.util.List<pojos.MusicProductionCompany> musicProductionCompanyList;
    private javax.persistence.Query musicProductionCompanyQuery;
    private javax.persistence.EntityManager radioDBv2PUEntityManager;
    private com.toedter.calendar.JDateChooser releaseDate;
    private javax.swing.JButton save;
    protected static javax.swing.JTable songArray;
    private java.util.List<pojos.Song> songList;
    private javax.persistence.Query songQuery;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}