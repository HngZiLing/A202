import javax.swing.*;
import java.util.*;
import java.io.*;

public class GUI extends javax.swing.JFrame {

    Transaction transaction;
    ArrayList <Transaction> arrayList = new ArrayList <Transaction>();
    
    public GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TFconversion = new javax.swing.JTextField();
        TFconverted = new javax.swing.JTextField();
        FromCurrency = new javax.swing.JComboBox<>();
        display = new javax.swing.JButton();
        ToCurrency = new javax.swing.JComboBox<>();
        addTransaction = new javax.swing.JButton();
        saveTransaction = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TFname = new javax.swing.JTextField();
        TFphone = new javax.swing.JTextField();
        reset = new javax.swing.JButton();
        TFid = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TAaddress = new javax.swing.JTextArea();
        TFsearch = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        TFdelete = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        displayToday = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        displayAll = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TAoutput = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Currency Converter - SR Money Changer");

        jPanel2.setBackground(new java.awt.Color(230, 241, 250));

        jPanel3.setBackground(new java.awt.Color(230, 241, 250));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel3.setText("Currency Converter");

        jPanel1.setBackground(new java.awt.Color(243, 247, 252));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel4.setText("Enter value");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel5.setText("Converted Value");

        TFconversion.setSelectionColor(new java.awt.Color(153, 204, 255));
        TFconversion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFconversionActionPerformed(evt);
            }
        });

        TFconverted.setSelectionColor(new java.awt.Color(153, 204, 255));
        TFconverted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFconvertedActionPerformed(evt);
            }
        });

        FromCurrency.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        FromCurrency.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "RM", "Rupiah" }));
        FromCurrency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FromCurrencyActionPerformed(evt);
            }
        });

        display.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        display.setText("Display Transaction");
        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });

        ToCurrency.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        ToCurrency.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "RM", "Rupiah" }));
        ToCurrency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToCurrencyActionPerformed(evt);
            }
        });

        addTransaction.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        addTransaction.setText("Add Transaction");
        addTransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTransactionActionPerformed(evt);
            }
        });

        saveTransaction.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        saveTransaction.setText("Save Transaction");
        saveTransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveTransactionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(addTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(saveTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TFconverted, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(TFconversion))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ToCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FromCurrency, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFconversion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FromCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ToCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFconverted, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel6.setText("Customer");

        jPanel4.setBackground(new java.awt.Color(243, 247, 252));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel7.setText("Name");

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel8.setText("Phone");

        TFname.setSelectionColor(new java.awt.Color(153, 204, 255));
        TFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFnameActionPerformed(evt);
            }
        });

        TFphone.setSelectionColor(new java.awt.Color(153, 204, 255));

        reset.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        reset.setText("Reset Customer");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        TFid.setSelectionColor(new java.awt.Color(153, 204, 255));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel9.setText("IC / Passport");

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel10.setText("Address");

        TAaddress.setColumns(20);
        TAaddress.setRows(5);
        jScrollPane1.setViewportView(TAaddress);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TFname, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(TFphone)))
                        .addComponent(reset))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFid)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFphone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );

        TFsearch.setSelectionColor(new java.awt.Color(153, 204, 255));
        TFsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFsearchActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel12.setText("Search by Phone number");

        TFdelete.setSelectionColor(new java.awt.Color(153, 204, 255));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel11.setText("Delete the following record, entered phone number");

        search.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        displayToday.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        displayToday.setText("Display Today's Transaction");
        displayToday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayTodayActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        displayAll.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        displayAll.setText("Display All Transaction");
        displayAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayAllActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        clear.setText("Clear Report");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        TAoutput.setColumns(20);
        TAoutput.setRows(5);
        jScrollPane2.setViewportView(TAoutput);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TFsearch, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                    .addComponent(TFdelete))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(displayToday, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(displayAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 40, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(displayAll, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(displayToday, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel2.setText("Transaction");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TFconversionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFconversionActionPerformed

        try {
            String fCu = (String) FromCurrency.getSelectedItem();
            String tCu = (String) ToCurrency.getSelectedItem();
            double consValue = Double.parseDouble(TFconversion.getText());
            transaction = new Transaction(fCu, tCu, consValue);

            if(consValue < 0)
                throw new Exception();
            
            transaction.setConvertValue();
            TFconverted.setText(String.format("%.4f", transaction.getConvertedValue()));
        
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Enter valid integer ONLY!", "Message", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Value should be more than 0", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_TFconversionActionPerformed

    private void FromCurrencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FromCurrencyActionPerformed

        try {
            String fCu = (String) FromCurrency.getSelectedItem();
            String tCu = (String) ToCurrency.getSelectedItem();
            double consValue = Double.parseDouble(TFconversion.getText());
            transaction = new Transaction(fCu, tCu, consValue);
            
            if(consValue < 0)
                throw new Exception();

            transaction.setConvertValue();
            TFconverted.setText(String.format("%.4f", transaction.getConvertedValue()));            
        
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Enter valid integer ONLY!", "Message", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Value should be more than 0", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_FromCurrencyActionPerformed

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed

        try {
            // If the user does not enter all the information
            if(TFname.getText().equals("") || TFphone.getText().equals("") || TFid.getText().equals("") || TAaddress.getText().equals("") || Double.parseDouble(TFconversion.getText())==0 || Double.parseDouble(TFconverted.getText())==0)
                throw new Exception();

            // Display all the informstion entered by the user
            transaction = new Transaction(TFname.getText(), TFphone.getText(), TFid.getText(), TAaddress.getText().replace("\n", " "), (String)FromCurrency.getSelectedItem(), (String)ToCurrency.getSelectedItem(), Double.parseDouble(TFconversion.getText()), Double.parseDouble(TFconverted.getText()));
            TAoutput.setText(transaction.toString());
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter all info", "Error", JOptionPane.ERROR_MESSAGE);   
        }
    }//GEN-LAST:event_displayActionPerformed

    private void ToCurrencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToCurrencyActionPerformed

        try {
            String fCu = (String) FromCurrency.getSelectedItem();
            String tCu = (String) ToCurrency.getSelectedItem();
            double consValue = Double.parseDouble(TFconversion.getText());
            transaction = new Transaction(fCu, tCu, consValue);
            
            if(consValue < 0)
                throw new Exception();
            
            transaction.setConvertValue();
            TFconverted.setText(String.format("%.4f", transaction.getConvertedValue()));            
        
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Enter valid integer ONLY!", "Message", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Value should be more than 0", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ToCurrencyActionPerformed

    private void addTransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTransactionActionPerformed

        try {
            String name = TFname.getText();
            String phone = TFphone.getText();
            String id = TFid.getText();
            String address = TAaddress.getText();
            String fCu = (String) FromCurrency.getSelectedItem();
            String tCu = (String) ToCurrency.getSelectedItem();
            double consValue = Double.parseDouble(TFconversion.getText());
            double convertValue = Double.parseDouble(TFconverted.getText());
            
            // If the user does not enter all the information
            if (name.equals("") || phone.equals("") || id.equals("") || address.equals("") || consValue==0 || convertValue==0)
                throw new Exception();
            
            // Get the info entered by the user and add transaction to the arrayList
            transaction = new Transaction(name, phone, id, address.replace("\n", " "), fCu, tCu, consValue, convertValue);
            arrayList.add(transaction);
            JOptionPane.showMessageDialog(null, "Transaction info has been added to the ArrayList");
        
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter all info", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addTransactionActionPerformed

    private void saveTransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveTransactionActionPerformed

        try {
            // If the arrayList is empty
            if(arrayList.isEmpty())
                throw new Exception();
            
            File outFile = new File("MyTextFile.txt");
            FileWriter outFileStream = new FileWriter(outFile, true);
            PrintWriter outStream = new PrintWriter(outFileStream);
            
            // Write all transaction in the arrayList to the textFile
            outStream.println(arrayList);
            
            outFileStream.close();
            JOptionPane.showMessageDialog(null, "Transaction has been written to text file");
        
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No transaction in the arrayList", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_saveTransactionActionPerformed

    private void TFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFnameActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed

        // Clear the customer info entered by the user
        TFname.setText("");
        TFphone.setText("");
        TFid.setText("");
        TAaddress.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        
        try {
            boolean search = false;
            
            if(TFsearch.getText().equals("") || arrayList.isEmpty())
                throw new Exception();
            
            for (Transaction t : arrayList)
            {
                // If the phone number is found
                if(t.getPhone().equals(TFsearch.getText()))
                {
                    TAoutput.setText(t.toString());
                    search = true;
                }
            } 
            
            // If can't find phone number
            if(search == false)
                JOptionPane.showMessageDialog(null, "Cannot found it");
            
            TFsearch.setText("");
        
        } catch (Exception e) {
            if(TFsearch.getText().equals(""))
                JOptionPane.showMessageDialog(null, "Please enter phone number", "Error", JOptionPane.ERROR_MESSAGE);
            else if(arrayList.isEmpty())
                JOptionPane.showMessageDialog(null, "No transaction in the arrayList", "Error", JOptionPane.ERROR_MESSAGE); 
        }
    }//GEN-LAST:event_searchActionPerformed

    private void displayTodayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayTodayActionPerformed
        
        try {
            TAoutput.setText("");
            
            // If the arrayList is empty
            if (arrayList.isEmpty())
                throw new Exception();
            
            String print = "";
            for(int i = 0; i < arrayList.size(); i++)
            {
                print = print + arrayList.get(i);
            }
            TAoutput.setText(print);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No transaction added today", "Error", JOptionPane.ERROR_MESSAGE);            
        }
    }//GEN-LAST:event_displayTodayActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        
        boolean delete = false;
        
        try {
            if(TFdelete.getText().equals("") || arrayList.isEmpty())
                throw new Exception();
            
            for(int i = 0; i < arrayList.size(); i++)
            {
                transaction = arrayList.get(i);
                
                // If the phone number is found
                if(transaction.getPhone().equals(TFdelete.getText()))
                {
                    int response = JOptionPane.showConfirmDialog(null, "Confirm delete this transaction?", "Delete", JOptionPane.YES_NO_OPTION);
                    
                    // If the user selects "Yes" in the comfirm dialog, then delete
                    if(response == 0)
                        arrayList.remove(i);
                    
                    delete = true;
                }
            }
            
            // If can't find the phone number
            if(delete == false)
                JOptionPane.showMessageDialog(null, "Cannot found it"); 
            
            TFdelete.setText("");
        
        } catch (Exception e) {
            if(TFdelete.getText().equals(""))
                JOptionPane.showMessageDialog(null, "Please enter phone number", "Error", JOptionPane.ERROR_MESSAGE);
            else if(arrayList.isEmpty())
                JOptionPane.showMessageDialog(null, "No transaction in the arrayList", "Error", JOptionPane.ERROR_MESSAGE);        
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void displayAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayAllActionPerformed

        try {
            File inFile = new File("MyTextFile.txt");
            FileReader fileReader = new FileReader(inFile);
            BufferedReader bufReader = new BufferedReader(fileReader);
            
            // If the textFile is empty
            if(inFile.length()==0)
                throw new Exception();
            
            String print = "";
            while (bufReader.ready())
            {
                // Display the contents of textFile
                print += bufReader.readLine() + "\n";
                TAoutput.setText(print);
            }
        
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "File does not exist", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Text file is empty", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_displayAllActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        
        TAoutput.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void TFconvertedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFconvertedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFconvertedActionPerformed

    private void TFsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFsearchActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> FromCurrency;
    private javax.swing.JTextArea TAaddress;
    private javax.swing.JTextArea TAoutput;
    private javax.swing.JTextField TFconversion;
    private javax.swing.JTextField TFconverted;
    private javax.swing.JTextField TFdelete;
    private javax.swing.JTextField TFid;
    private javax.swing.JTextField TFname;
    private javax.swing.JTextField TFphone;
    private javax.swing.JTextField TFsearch;
    private javax.swing.JComboBox<String> ToCurrency;
    private javax.swing.JButton addTransaction;
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    private javax.swing.JButton display;
    private javax.swing.JButton displayAll;
    private javax.swing.JButton displayToday;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton reset;
    private javax.swing.JButton saveTransaction;
    private javax.swing.JButton search;
    // End of variables declaration//GEN-END:variables
}
