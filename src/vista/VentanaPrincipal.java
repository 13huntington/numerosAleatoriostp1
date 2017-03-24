package vista;

import controlador.ControladorVentanaPrincipal;
import javax.swing.JOptionPane;
import modelo.ModeloTablaAleatoriosGenerados;
import modelo.ModeloTablaFrecuencia;

public class VentanaPrincipal extends javax.swing.JFrame {

    private ModeloTablaAleatoriosGenerados modeloTablaAleatorios;
    private ModeloTablaFrecuencia modeloTablaFrecuencia;
    private ControladorVentanaPrincipal controlador;
    private int git_prueba;

    public VentanaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);

        modeloTablaAleatorios = new ModeloTablaAleatoriosGenerados();
        modeloTablaFrecuencia = new ModeloTablaFrecuencia();

        tblAleatorios.setModel(modeloTablaAleatorios);
        tblFrecuencia.setModel(modeloTablaFrecuencia);

        controlador = new ControladorVentanaPrincipal(modeloTablaAleatorios, modeloTablaFrecuencia);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbEstrategia = new javax.swing.JComboBox<>();
        btnGenerarNumeros = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtA = new javax.swing.JTextField();
        txtM = new javax.swing.JTextField();
        txtC = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtK = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtG = new javax.swing.JTextField();
        chkK = new javax.swing.JCheckBox();
        chkG = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        txtCantidadNumeroAGenerar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCantidadIntervalos = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtSemilla = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAleatorios = new javax.swing.JTable();
        btnGenerarNumeros1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFrecuencia = new javax.swing.JTable();
        btnMostrarGrafico = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itmSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simulacion TP 1");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Aharoni", 1, 12))); // NOI18N

        jLabel1.setText("Generador a utilizar:");

        cmbEstrategia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Java", "Congruencial lineal", "Congruencial multiplicativo" }));
        cmbEstrategia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbEstrategiaItemStateChanged(evt);
            }
        });

        btnGenerarNumeros.setText("Generar numeros");
        btnGenerarNumeros.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGenerarNumeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarNumerosActionPerformed(evt);
            }
        });

        jLabel2.setText("a:");

        jLabel3.setText("c:");

        jLabel4.setText("m:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Formula:");

        txtA.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtA.setEnabled(false);
        txtA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAKeyTyped(evt);
            }
        });

        txtM.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtM.setEnabled(false);
        txtM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAKeyTyped(evt);
            }
        });

        txtC.setEnabled(false);
        txtC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAKeyTyped(evt);
            }
        });

        jLabel6.setText("k:");

        txtK.setEnabled(false);
        txtK.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtKFocusLost(evt);
            }
        });
        txtK.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAKeyTyped(evt);
            }
        });

        jLabel7.setText("g:");

        txtG.setEnabled(false);
        txtG.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtGFocusLost(evt);
            }
        });
        txtG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAKeyTyped(evt);
            }
        });

        chkK.setEnabled(false);
        chkK.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkKStateChanged(evt);
            }
        });

        chkG.setEnabled(false);
        chkG.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkGStateChanged(evt);
            }
        });

        jLabel8.setText("Cantidad de numeros a generar:");

        txtCantidadNumeroAGenerar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAKeyTyped(evt);
            }
        });

        jLabel9.setText("Cantidad de intervalos:");

        txtCantidadIntervalos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAKeyTyped(evt);
            }
        });

        jLabel10.setText("Xo:");

        txtSemilla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmbEstrategia, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                            .addComponent(txtA, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtM)
                            .addComponent(txtSemilla))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtK, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(txtG))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkG)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(chkK)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel8)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCantidadNumeroAGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCantidadIntervalos, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnGenerarNumeros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbEstrategia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(chkK)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(txtK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(txtM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))
                            .addComponent(chkG)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtCantidadNumeroAGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtCantidadIntervalos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(btnGenerarNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSemilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Numeros generados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Aharoni", 1, 12))); // NOI18N

        tblAleatorios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "i", "Valor"
            }
        ));
        jScrollPane1.setViewportView(tblAleatorios);

        btnGenerarNumeros1.setText("Siguiente");
        btnGenerarNumeros1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGenerarNumeros1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarNumeros1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnGenerarNumeros1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGenerarNumeros1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Frecuencia", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Aharoni", 1, 12))); // NOI18N

        tblFrecuencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Intervalo", "Repeticiones"
            }
        ));
        jScrollPane2.setViewportView(tblFrecuencia);

        btnMostrarGrafico.setText("Grafico");
        btnMostrarGrafico.setToolTipText("Ver grafico");
        btnMostrarGrafico.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMostrarGrafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarGraficoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMostrarGrafico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMostrarGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Archivo");

        itmSalir.setText("Salir");
        jMenu1.add(itmSalir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarGraficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarGraficoActionPerformed
        Histo h = new Histo(this, false, ((ModeloTablaAleatoriosGenerados) tblAleatorios.getModel()).getNumeros(), tblFrecuencia.getRowCount());
        h.setVisible(true);
    }//GEN-LAST:event_btnMostrarGraficoActionPerformed
    /**
     * Este metodo lee los datos de los campos y llama al controlador de la
     * ventana para que genere los numeros de acuerdo al metodo seleccionado y
     * los muestre en las tablas.
     *
     * @param evt
     */
    private void btnGenerarNumerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarNumerosActionPerformed
        String estrategia = cmbEstrategia.getSelectedItem().toString();
        double a, c, m, semilla;
        int cantidadNumeros, cantidadIntervalos;

        if (!validarCamposOK()) {
            return;
        }

        cantidadIntervalos = Integer.parseInt(txtCantidadIntervalos.getText());
        cantidadNumeros = Integer.parseInt(txtCantidadNumeroAGenerar.getText());
        semilla = Double.parseDouble(txtSemilla.getText());

        switch (estrategia) {
            case "Java":
                controlador.generarNumerosAleatoriosJava(cantidadNumeros, cantidadIntervalos, semilla);
                break;
            case "Congruencial lineal":
                a = Double.parseDouble(txtA.getText());
                c = Double.parseDouble(txtC.getText());
                m = Double.parseDouble(txtM.getText());
                controlador.generarNumerosAleatoriosCongruencialLineal(a, c, m, cantidadNumeros, cantidadIntervalos, semilla);
                break;
            case "Congruencial multiplicativo":
                a = Double.parseDouble(txtA.getText());
                m = Double.parseDouble(txtM.getText());
                controlador.generarNumerosAleatoriosCongruencialMultiplicativo(a, m, cantidadNumeros, cantidadIntervalos, semilla);
                break;
        }
    }//GEN-LAST:event_btnGenerarNumerosActionPerformed

    /**
     * Este metodo se ejecuta cuando cambia el item seleccionado en el combobox.
     * Cada entrada del switch habilita los campos de acuerdo al metodo para
     * generar los numeros.
     */
    private void cmbEstrategiaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEstrategiaItemStateChanged
        switch (cmbEstrategia.getSelectedItem().toString()) {
            case "Congruencial lineal":
                habilitarCongruencialLineal();
                break;
            case "Congruencial multiplicativo":
                habilitarCongruencialMultiplicativo();
                break;
            case "Java":
                habilitarJava();
                break;
        }
    }//GEN-LAST:event_cmbEstrategiaItemStateChanged

    private void habilitarCongruencialLineal() {
        txtA.setEnabled(true);
        txtC.setEnabled(true);
        txtM.setEnabled(true);
        chkK.setEnabled(true);
        chkG.setEnabled(true);
        txtK.setEnabled(false);
        txtG.setEnabled(false);
        chkG.setSelected(false);
        chkK.setSelected(false);
    }

    private void habilitarCongruencialMultiplicativo() {
        txtA.setEnabled(true);
        txtC.setEnabled(false);
        txtM.setEnabled(true);
        chkK.setEnabled(true);
        chkG.setEnabled(true);
        txtK.setEnabled(false);
        txtG.setEnabled(false);
        chkG.setSelected(false);
        chkK.setSelected(false);
    }

    private void habilitarJava() {
        txtA.setEnabled(false);
        txtC.setEnabled(false);
        txtM.setEnabled(false);
        chkK.setEnabled(false);
        chkG.setEnabled(false);
        txtK.setEnabled(false);
        txtG.setEnabled(false);
        chkG.setSelected(false);
        chkK.setSelected(false);
    }
    private void chkKStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkKStateChanged
        if (chkK.isSelected()) {
            txtA.setEnabled(false);
            txtK.setEnabled(true);
        } else {
            txtA.setEnabled(true);
            txtK.setEnabled(false);
        }
    }//GEN-LAST:event_chkKStateChanged

    private void chkGStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkGStateChanged
        if (chkG.isSelected()) {
            txtM.setEnabled(false);
            txtG.setEnabled(true);
        } else {
            txtM.setEnabled(true);
            txtG.setEnabled(false);
        }
    }//GEN-LAST:event_chkGStateChanged

    private void btnGenerarNumeros1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarNumeros1ActionPerformed
        controlador.mostrarSiguiente();
    }//GEN-LAST:event_btnGenerarNumeros1ActionPerformed

    private void txtKFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtKFocusLost

        if (!txtK.getText().equals("")) {
            int k = Integer.parseInt(txtK.getText());

            txtA.setText(Integer.toString((4 * k + 1)));
        }
    }//GEN-LAST:event_txtKFocusLost

    private void txtGFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGFocusLost
        if (!txtG.getText().equals("")) {
            int g = Integer.parseInt(txtG.getText());
            int m = (int) Math.pow(2, g);
            txtM.setText(String.valueOf(m));
        }
    }//GEN-LAST:event_txtGFocusLost

    private void txtAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAKeyTyped
        char c = evt.getKeyChar();

        if (Character.isLetter(c)) {
            getToolkit().beep();

            evt.consume();

        }

    }//GEN-LAST:event_txtAKeyTyped
    private boolean validarCamposOK() {
        String errores = "";
        boolean bandera = true;
        if (cmbEstrategia.getSelectedItem().toString().equals("Java")) {

        }

        if (txtSemilla.getText().equals("")) {

            errores = "- La semilla no puede estar vacia.";
            bandera=false;
        }
        if (!bandera) {
            JOptionPane.showMessageDialog(this, errores, "ERROR DE VALIDACION", JOptionPane.ERROR_MESSAGE);
        }
        return bandera;
    }

    public static void main(String[] args) {
        VentanaPrincipal v = new VentanaPrincipal();
        v.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerarNumeros;
    private javax.swing.JButton btnGenerarNumeros1;
    private javax.swing.JButton btnMostrarGrafico;
    private javax.swing.JCheckBox chkG;
    private javax.swing.JCheckBox chkK;
    private javax.swing.JComboBox<String> cmbEstrategia;
    private javax.swing.JMenuItem itmSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblAleatorios;
    private javax.swing.JTable tblFrecuencia;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtC;
    private javax.swing.JTextField txtCantidadIntervalos;
    private javax.swing.JTextField txtCantidadNumeroAGenerar;
    private javax.swing.JTextField txtG;
    private javax.swing.JTextField txtK;
    private javax.swing.JTextField txtM;
    private javax.swing.JTextField txtSemilla;
    // End of variables declaration//GEN-END:variables

}
