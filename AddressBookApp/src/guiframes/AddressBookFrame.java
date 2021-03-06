/*
 * Copyright (C) 2019 yousef
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package guiframes;

import addressbook.*;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yousef
 */
public class AddressBookFrame extends javax.swing.JFrame {

    private boolean personsTableActive;
    private boolean businessesTableActive;
    private boolean personsTableSorted;
    private boolean businessesTableSorted;
    AddressBook addressBook;
    /**
     * Creates new form AddressBookFrame
     */
    public AddressBookFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.personsTableActive = false;
        this.businessesTableActive = false;
        this.personsTableSorted = false;
        this.businessesTableSorted = false;
        addressBook = new AddressBook();
        if(!DB.isConnected()) {
            JOptionPane.showMessageDialog(null, "Could not connect to database!\ntry again later.");
            this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        } else {
            updateTables();
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        personsTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        businessesTable = new javax.swing.JTable();
        deleteButton = new javax.swing.JButton();
        insertButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        searchText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        sortPersons = new javax.swing.JButton();
        sortBusinesses = new javax.swing.JButton();
        deleteButton1 = new javax.swing.JButton();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Address Book");

        personsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Birth Date", "Country", "City", "Postal Code", "Telephone Numbers", "email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        personsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                personsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(personsTable);

        businessesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Title", "Genre", "Contact Person", "Website", "Country", "City", "Postal Code", "Telephone Numbers", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        businessesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                businessesTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(businessesTable);

        deleteButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        insertButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        insertButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.png"))); // NOI18N
        insertButton.setText("Insert");
        insertButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        insertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButtonActionPerformed(evt);
            }
        });

        editButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        editButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edit.png"))); // NOI18N
        editButton.setText("Edit");
        editButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search.png"))); // NOI18N
        searchBtn.setBorderPainted(false);
        searchBtn.setContentAreaFilled(false);
        searchBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        searchText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searchText.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        searchText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchTextKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Persons");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Businesses");

        sortPersons.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sort.png"))); // NOI18N
        sortPersons.setToolTipText("Sort by last name");
        sortPersons.setBorderPainted(false);
        sortPersons.setContentAreaFilled(false);
        sortPersons.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sortPersons.setName(""); // NOI18N
        sortPersons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortPersonsActionPerformed(evt);
            }
        });

        sortBusinesses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sort.png"))); // NOI18N
        sortBusinesses.setToolTipText("Sort by title");
        sortBusinesses.setBorderPainted(false);
        sortBusinesses.setContentAreaFilled(false);
        sortBusinesses.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sortBusinesses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortBusinessesActionPerformed(evt);
            }
        });

        deleteButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deleteButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/restore.png"))); // NOI18N
        deleteButton1.setText("Restore");
        deleteButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(sortBusinesses, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator4))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 873, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sortPersons, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(insertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(deleteButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jSeparator2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 873, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(insertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(deleteButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(sortPersons)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(sortBusinesses)
                        .addGap(336, 336, 336))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        DefaultTableModel model = null;
        int[] rows = null;
        ArrayList<Integer> ids = new ArrayList<>();
            if(this.personsTableActive) {
            model = (DefaultTableModel)personsTable.getModel();
            rows = this.personsTable.getSelectedRows();
        }
        else if(this.businessesTableActive) {
            model = (DefaultTableModel)businessesTable.getModel();
            rows = this.businessesTable.getSelectedRows();
        }
        try {
            for (int i = 0; i < rows.length; i++) {
                ids.add((int) model.getValueAt(rows[i]-i, 0));
                model.removeRow(rows[i]-i);
            }
            addressBook.deleteAddressesDB(ids);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Please, select an address.");
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        DefaultTableModel personsModel = (DefaultTableModel)personsTable.getModel();
        DefaultTableModel businessesModel = (DefaultTableModel)businessesTable.getModel();
        Address address = null;
        int id, row;
        String firstName, lastName, country, city, postalCode, email, title, genre, contactPerson, website;
        ArrayList<String> telephoneNos;
        java.util.Date birthDate;
        if(this.personsTableActive) {
            row = personsTable.getSelectedRow();
            id = (int) personsModel.getValueAt(row, 0);
            firstName = (String) personsModel.getValueAt(row, 1);
            lastName = (String) personsModel.getValueAt(row, 2);
            country = (String) personsModel.getValueAt(row, 4);
            birthDate = new java.util.Date((String) personsModel.getValueAt(row, 3));
            city = (String) personsModel.getValueAt(row, 5);
            postalCode = (String) personsModel.getValueAt(row, 6);
            telephoneNos = new ArrayList(Arrays.asList(((String) personsModel.getValueAt(row, 7)).split(", ")));
            email = (String) personsModel.getValueAt(row, 8);
            
            address = new Person(firstName, lastName, new Date(birthDate.getDate(), birthDate.getMonth()+1, birthDate.getYear()+1900), country, city, postalCode, telephoneNos, email);
            address.setId(id);
            
        }
        else if(this.businessesTableActive) {
            row = businessesTable.getSelectedRow();
            id = (int) businessesModel.getValueAt(row, 0);
            title = (String) businessesModel.getValueAt(row, 1);
            genre = (String) businessesModel.getValueAt(row, 2);
            contactPerson = (String) businessesModel.getValueAt(row, 3);
            website = (String) businessesModel.getValueAt(row, 4);
            country = (String) businessesModel.getValueAt(row, 5);
            city = (String) businessesModel.getValueAt(row, 6);
            postalCode = (String) businessesModel.getValueAt(row, 7);
            telephoneNos = new ArrayList(Arrays.asList(((String) businessesModel.getValueAt(row, 8)).split(", ")));
            email = (String) businessesModel.getValueAt(row, 9);
            
            address = new Business(title, genre, contactPerson, website, country, city, postalCode, telephoneNos, email);
            address.setId(id);
        }
        try {
            UpdateFrame updateFrame = new UpdateFrame(address, this);
            updateFrame.setVisible(true);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Please, select an address.");
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void insertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButtonActionPerformed
        InsertFrame insertFrame  = new InsertFrame(this);
        insertFrame.setVisible(true);
    }//GEN-LAST:event_insertButtonActionPerformed

    private void personsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_personsTableMouseClicked
        this.personsTableActive = true;
        this.businessesTableActive = false;
        businessesTable.clearSelection();
    }//GEN-LAST:event_personsTableMouseClicked

    private void businessesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_businessesTableMouseClicked
        this.personsTableActive = false;
        this.businessesTableActive = true;
        personsTable.clearSelection();
    }//GEN-LAST:event_businessesTableMouseClicked

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        String str = searchText.getText();
        ArrayList<Address> addresses = addressBook.compareByDB(str);
        showAddressesInTable(addresses);
        personsTableSorted = false;
        businessesTableSorted = false;
    }//GEN-LAST:event_searchBtnActionPerformed

    private void searchTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            searchBtn.doClick();
        }
    }//GEN-LAST:event_searchTextKeyPressed

    private void sortPersonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortPersonsActionPerformed
        DefaultTableModel personsModel = (DefaultTableModel)personsTable.getModel();
        ArrayList<Person> persons = new ArrayList<>();
        int id;
        String firstName, lastName, country, city, postalCode, email;
        ArrayList<String> telephoneNos;
        java.util.Date birthDate;
        for (int i = 0; i < personsModel.getRowCount(); i++) {
            id = (int) personsModel.getValueAt(i, 0);
            firstName = (String) personsModel.getValueAt(i, 1);
            lastName = (String) personsModel.getValueAt(i, 2);
            country = (String) personsModel.getValueAt(i, 4);
            birthDate = new java.util.Date((String) personsModel.getValueAt(i, 3));
            city = (String) personsModel.getValueAt(i, 5);
            postalCode = (String) personsModel.getValueAt(i, 6);
            telephoneNos = new ArrayList(Arrays.asList(((String) personsModel.getValueAt(i, 7)).split(", ")));
            email = (String) personsModel.getValueAt(i, 8);
            
            Person person = new Person(firstName, lastName, new Date(birthDate.getDate(), birthDate.getMonth()+1, birthDate.getYear()+1900), country, city, postalCode, telephoneNos, email);
            person.setId(id);
            persons.add(person);
        }
        if(personsTableSorted) updatePersonsTabel(addressBook.sortPersonsById(persons));
        else updatePersonsTabel(addressBook.sortPersonsByLastName(persons));
        personsTableSorted = !personsTableSorted;
    }//GEN-LAST:event_sortPersonsActionPerformed

    private void sortBusinessesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortBusinessesActionPerformed
        DefaultTableModel businessesModel = (DefaultTableModel)businessesTable.getModel();
        ArrayList<Business> businesses = new ArrayList<>();
        int id;
        String country, city, postalCode, email, title, genre, contactPerson, website;
        ArrayList<String> telephoneNos;
        for (int i = 0; i < businessesModel.getRowCount(); i++) {
            id = (int) businessesModel.getValueAt(i, 0);
            title = (String) businessesModel.getValueAt(i, 1);
            genre = (String) businessesModel.getValueAt(i, 2);
            contactPerson = (String) businessesModel.getValueAt(i, 3);
            website = (String) businessesModel.getValueAt(i, 4);
            country = (String) businessesModel.getValueAt(i, 5);
            city = (String) businessesModel.getValueAt(i, 6);
            postalCode = (String) businessesModel.getValueAt(i, 7);
            telephoneNos = new ArrayList(Arrays.asList(((String) businessesModel.getValueAt(i, 8)).split(", ")));
            email = (String) businessesModel.getValueAt(i, 9);
            
            Business business = new Business(title, genre, contactPerson, website, country, city, postalCode, telephoneNos, email);
            business.setId(id);
            businesses.add(business);
            
        }
        if(businessesTableSorted) updateBusinessesTabel(addressBook.sortBusinessesById(businesses));
        else updateBusinessesTabel(addressBook.sortBusinessesByTitle(businesses));
        businessesTableSorted = !businessesTableSorted;
    }//GEN-LAST:event_sortBusinessesActionPerformed

    private void deleteButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButton1ActionPerformed
        int input = JOptionPane.showConfirmDialog(null, "All deleted addresses will be restored, Are you sure?", "Warning!", JOptionPane.YES_NO_OPTION);
        if(input == 0) {
            addressBook.restoreDeletedAddresses();
            updateTables();
        }
    }//GEN-LAST:event_deleteButton1ActionPerformed

    public void showAddressesInTable(ArrayList<Address> addresses) {
        DefaultTableModel personsModel = (DefaultTableModel)personsTable.getModel();
        DefaultTableModel businessesModel = (DefaultTableModel)businessesTable.getModel();
        personsModel.setRowCount(0);
        businessesModel.setRowCount(0);
        for (Address address : addresses) {
            if(address instanceof Person) {
                Object[] row = new Object[9];
                row[0] = address.getId();
                row[1] = ((Person) address).getFirstName();
                row[2] = ((Person) address).getLastName();
                row[3] = ((Person) address).getBirthDate().customFormat("M dd, yyyy");
                row[4] = address.getCountry();
                row[5] = address.getCity();
                row[6] = address.getPostalCode();
                row[7] = address.getTelephoneNumbersInfo();
                row[8] = address.getEmail();
                
                personsModel.addRow(row);
            }
            else if(address instanceof Business) {
                Object[] row = new Object[10];
                row[0] = address.getId();
                row[1] = ((Business) address).getTitle();
                row[2] = ((Business) address).getGenre();
                row[3] = ((Business) address).getContactPerson();
                row[4] = ((Business) address).getWebsite();
                row[5] = address.getCountry();
                row[6] = address.getCity();
                row[7] = address.getPostalCode();
                row[8] = address.getTelephoneNumbersInfo();
                row[9] = address.getEmail();
                
                businessesModel.addRow(row);
            }
        }
    }
    
    public void updatePersonsTabel(ArrayList<Person> persons) {
        DefaultTableModel personsModel = (DefaultTableModel)personsTable.getModel();
        personsModel.setRowCount(0);
        for (Person person : persons) {
            Object[] row = new Object[9];
            row[0] = person.getId();
            row[1] = person.getFirstName();
            row[2] = person.getLastName();
            row[3] = person.getBirthDate().customFormat("M dd, yyyy");
            row[4] = person.getCountry();
            row[5] = person.getCity();
            row[6] = person.getPostalCode();
            row[7] = person.getTelephoneNumbersInfo();
            row[8] = person.getEmail();

            personsModel.addRow(row);
        }
    }
    
    public void updateBusinessesTabel(ArrayList<Business> busiesses) {
        DefaultTableModel businessesModel = (DefaultTableModel)businessesTable.getModel();
        businessesModel.setRowCount(0);
        for (Business busiess : busiesses) {
            Object[] row = new Object[10];
            row[0] = busiess.getId();
            row[1] = busiess.getTitle();
            row[2] = busiess.getGenre();
            row[3] = busiess.getContactPerson();
            row[4] = busiess.getWebsite();
            row[5] = busiess.getCountry();
            row[6] = busiess.getCity();
            row[7] = busiess.getPostalCode();
            row[8] = busiess.getTelephoneNumbersInfo();
            row[9] = busiess.getEmail();

            businessesModel.addRow(row);
        }
    }
    
    public void updateTables() {
        if(searchText.getText().equals(""))
            showAddressesInTable(addressBook.getAddressesFromDB());
        else
            searchBtn.doClick();
        if(personsTableSorted) {
            personsTableSorted = !personsTableSorted;
            sortPersons.doClick();
        }
        if(businessesTableSorted) {
            businessesTableSorted = !businessesTableSorted;
            sortBusinesses.doClick();
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
            java.util.logging.Logger.getLogger(AddressBookFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddressBookFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddressBookFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddressBookFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AddressBookFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable businessesTable;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton deleteButton1;
    private javax.swing.JButton editButton;
    private javax.swing.JButton insertButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable personsTable;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchText;
    private javax.swing.JButton sortBusinesses;
    private javax.swing.JButton sortPersons;
    // End of variables declaration//GEN-END:variables
}
