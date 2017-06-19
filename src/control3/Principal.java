package control3;
import javax.swing.JOptionPane;
/**
 *
 * @author Victor Arriaza
 */
public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        Limpiar();
    }
    
    private void Limpiar(){
        lbl1.setVisible(false);
        txt1.setVisible(false);
        lbl2.setVisible(false);
        txt2.setVisible(false);
        lbl3.setVisible(false);
        txt3.setVisible(false);
        lblImagen.setVisible(false);
        lblTitRes.setVisible(false);
        lblArea.setVisible(false);
        lblPerimetro.setVisible(false);
        btnCalcular.setVisible(false);
        lblTipo.setVisible(false);
        btnEqui.setVisible(false);
        btnIso.setVisible(false);
        btnEsc.setVisible(false);
        btnRec.setVisible(false);
        txt1.setText("");
        txt2.setText("");
        txt3.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        lbl2 = new javax.swing.JLabel();
        txt2 = new javax.swing.JTextField();
        lbl3 = new javax.swing.JLabel();
        txt3 = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        lblImagen = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblTitRes = new javax.swing.JLabel();
        lblArea = new javax.swing.JLabel();
        lblPerimetro = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnCirculo = new javax.swing.JButton();
        btnCuadrado = new javax.swing.JButton();
        btnRectangulo = new javax.swing.JButton();
        btnTriangulo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnEqui = new javax.swing.JButton();
        btnIso = new javax.swing.JButton();
        btnEsc = new javax.swing.JButton();
        btnRec = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl1.setText("Opcion 1");

        txt1.setActionCommand("<Not Set>");

        lbl2.setText("Opcion 2");

        lbl3.setText("Opcion 3");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        lblImagen.setText("jLabel2");

        lblTipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTipo.setText("Tipo");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl1)
                                .addGap(18, 18, 18)
                                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl2)
                                .addGap(18, 18, 18)
                                .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl3)
                                .addGap(18, 18, 18)
                                .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnCalcular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpiar)))
                .addGap(49, 49, 49)
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl1)
                            .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl2)
                            .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl3)
                            .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCalcular)
                            .addComponent(btnLimpiar))
                        .addGap(0, 14, Short.MAX_VALUE))
                    .addComponent(lblImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        lblTitRes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitRes.setText("Resultados");

        lblArea.setText("Area");

        lblPerimetro.setText("Perimetro");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitRes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblArea)
                            .addComponent(lblPerimetro))
                        .addGap(0, 94, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitRes)
                .addGap(18, 18, 18)
                .addComponent(lblArea)
                .addGap(19, 19, 19)
                .addComponent(lblPerimetro)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnCirculo.setText("Circulo");
        btnCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCirculoActionPerformed(evt);
            }
        });

        btnCuadrado.setText("Cuadrado");
        btnCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuadradoActionPerformed(evt);
            }
        });

        btnRectangulo.setText("Rectangulo");
        btnRectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRectanguloActionPerformed(evt);
            }
        });

        btnTriangulo.setText("Triangulo");
        btnTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrianguloActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Calculadora Figuras Geometricas");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnCirculo)
                .addGap(28, 28, 28)
                .addComponent(btnCuadrado)
                .addGap(18, 18, 18)
                .addComponent(btnRectangulo)
                .addGap(18, 18, 18)
                .addComponent(btnTriangulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCirculo)
                    .addComponent(btnCuadrado)
                    .addComponent(btnRectangulo)
                    .addComponent(btnTriangulo))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnEqui.setText("Equilatero");
        btnEqui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEquiActionPerformed(evt);
            }
        });

        btnIso.setText("Isosceles");
        btnIso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIsoActionPerformed(evt);
            }
        });

        btnEsc.setText("Escaleno");
        btnEsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscActionPerformed(evt);
            }
        });

        btnRec.setText("Rectangulo");
        btnRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnEqui)
                .addGap(28, 28, 28)
                .addComponent(btnIso)
                .addGap(42, 42, 42)
                .addComponent(btnEsc)
                .addGap(43, 43, 43)
                .addComponent(btnRec)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEqui)
                    .addComponent(btnIso)
                    .addComponent(btnEsc)
                    .addComponent(btnRec))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 207, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrianguloActionPerformed
        Limpiar();    
        btnEqui.setVisible(true);
        btnIso.setVisible(true);
        btnEsc.setVisible(true);
        btnRec.setVisible(true);
    }//GEN-LAST:event_btnTrianguloActionPerformed

    private void btnCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCirculoActionPerformed
        Limpiar();
        lbl1.setText("Radio");
        lbl1.setVisible(true);
        txt1.setVisible(true);
        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Circulo.png")));
        lblImagen.setVisible(true);
        btnCalcular.setVisible(true);
        lblTipo.setText("Circulo");
        lblTipo.setVisible(true);
    }//GEN-LAST:event_btnCirculoActionPerformed

    private void btnCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuadradoActionPerformed
        Limpiar();
        lbl1.setText("Lado");
        lbl1.setVisible(true);
        txt1.setVisible(true);
        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cuadrado.png")));
        lblImagen.setVisible(true);
        btnCalcular.setVisible(true);
        lblTipo.setText("Cuadrado");
        lblTipo.setVisible(true);
        
    }//GEN-LAST:event_btnCuadradoActionPerformed

    private void btnRectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRectanguloActionPerformed
        Limpiar();
        lbl1.setText("Lado A");
        lbl1.setVisible(true);
        txt1.setVisible(true);
        lbl2.setText("Lado B");
        lbl2.setVisible(true);
        txt2.setVisible(true);
        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rectangulo.png")));
        lblImagen.setVisible(true);
        btnCalcular.setVisible(true);
        lblTipo.setText("Rectangulo");
        lblTipo.setVisible(true);
    }//GEN-LAST:event_btnRectanguloActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEquiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEquiActionPerformed
        Limpiar();
        lbl1.setText("Lado A");
        lbl1.setVisible(true);
        txt1.setVisible(true);
        btnCalcular.setVisible(true);
        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/TrianguloEqui.png")));
        lblImagen.setVisible(true);
        lblTipo.setText("Triangulo Equilatero");
        lblTipo.setVisible(true); 
    }//GEN-LAST:event_btnEquiActionPerformed

    private void btnIsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIsoActionPerformed
        Limpiar();
        lbl1.setText("Lado A");
        lbl1.setVisible(true);
        txt1.setVisible(true);
        lbl2.setText("Lado B");
        lbl2.setVisible(true);
        txt2.setVisible(true);
        btnCalcular.setVisible(true);
        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/TrianguloIso.png")));
        lblImagen.setVisible(true);
        lblTipo.setText("Triangulo Isosceles");
        lblTipo.setVisible(true);
    }//GEN-LAST:event_btnIsoActionPerformed

    private static boolean Valida(String num){
	try {
            Integer.parseInt(num);
	return true;
	} catch (NumberFormatException nfe){
            return false;
	}
    }
    
    private void btnEscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscActionPerformed
        Limpiar();
        lbl1.setText("Lado A");
        lbl1.setVisible(true);
        txt1.setVisible(true);
        lbl2.setText("Lado B");
        lbl2.setVisible(true);
        txt2.setVisible(true);
        lbl3.setText("Lado C");
        lbl3.setVisible(true);
        txt3.setVisible(true);
        btnCalcular.setVisible(true);
        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/TrianguloEsc.png")));
        lblImagen.setVisible(true);
        lblTipo.setText("Triangulo Escaleno");
        lblTipo.setVisible(true);
    }//GEN-LAST:event_btnEscActionPerformed

    private void btnRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecActionPerformed
        Limpiar();
        lbl1.setText("Lado A");
        lbl1.setVisible(true);
        txt1.setVisible(true);
        lbl2.setText("Lado B");
        lbl2.setVisible(true);
        txt2.setVisible(true);
        btnCalcular.setVisible(true);
        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/TrianguloRec.png")));
        lblImagen.setVisible(true);
        lblTipo.setText("Triangulo Rectangulo");
        lblTipo.setVisible(true);
    }//GEN-LAST:event_btnRecActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        lblTitRes.setVisible(true);
        if (lblTipo.getText().equals("Circulo")){
            if (Valida(txt1.getText()) == true){ 
                Circulo circulo = new Circulo();
                int radio = Integer.valueOf(txt1.getText());
                circulo.setRadio(radio);
                circulo.CalculaArea();
                String area = String.valueOf(circulo.area);
                lblArea.setText("Area: " + area);
                lblArea.setVisible(true);
                circulo.CalculaPerimetro();
                String perimetro = String.valueOf(circulo.perimetro);
                lblPerimetro.setText("Perimetro: " + perimetro);
                lblPerimetro.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Debes Ingresar un Numero Entero");
            }
        } else if (lblTipo.getText().equals("Cuadrado")){
            if (Valida(txt1.getText()) == true){
                Cuadrado cuadrado = new Cuadrado();
                int ladoA = Integer.valueOf(txt1.getText());
                cuadrado.setLado(ladoA);
                cuadrado.CalculaArea();
                String area = String.valueOf(cuadrado.area);
                lblArea.setText("Area: " + area);
                lblArea.setVisible(true);
                cuadrado.CalculaPerimetro();
                String perimetro = String.valueOf(cuadrado.perimetro);
                lblPerimetro.setText("Perimetro: " + perimetro);
                lblPerimetro.setVisible(true);    
            } else {
                JOptionPane.showMessageDialog(null, "Debes Ingresar un Numero Entero");
            }
        } else if (lblTipo.getText().equals("Rectangulo")){
            Rectangulo rectangulo = new Rectangulo();
            if (Valida(txt1.getText()) == true){
                if (Valida(txt2.getText()) == true) {
                    int ladoA = Integer.valueOf(txt1.getText());
                    int ladoB = Integer.valueOf(txt2.getText());
                    rectangulo.setLadoA(ladoA);
                    rectangulo.setLadoB(ladoB);
                    rectangulo.CalculaArea();
                    rectangulo.CalculaPerimetro();
                    String area = String.valueOf(rectangulo.area);
                    String perimetro = String.valueOf(rectangulo.perimetro);
                    lblArea.setText("Area: " + area);
                    lblArea.setVisible(true);
                    lblPerimetro.setText("Perimetro: " + perimetro);
                    lblPerimetro.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Para el Lado B debes ingresar un Numero Entero");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Para el Lado A debes ingresar un Numero Entero");
            }
        } else if (lblTipo.getText().equals("Triangulo Equilatero")){
            if (Valida(txt1.getText()) == true ){
                Triangulo triangulo = new Triangulo();
                triangulo.setTipoTriangulo("Equilatero");
                int ladoA = Integer.valueOf(txt1.getText());
                triangulo.setLadoA(ladoA);
                triangulo.CalculaArea();
                triangulo.CalculaPerimetro();
                String area = String.valueOf(triangulo.area);
                lblArea.setText("Area: " + area);
                lblArea.setVisible(true);
                String perimetro = String.valueOf(triangulo.perimetro);
                lblPerimetro.setText("Perimetro: " + perimetro);
                lblPerimetro.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Debes Ingresar un Numero Entero");
            }
        } else if (lblTipo.getText().equals("Triangulo Isosceles")){
            if (Valida(txt1.getText()) == true){
                if (Valida(txt2.getText()) == true){
                    Triangulo triangulo = new Triangulo();
                    triangulo.setTipoTriangulo("Isosceles");
                    int ladoA = Integer.valueOf(txt1.getText());
                    int ladoB = Integer.valueOf(txt2.getText());
                    triangulo.setLadoA(ladoA);
                    triangulo.setLadoB(ladoB);
                    triangulo.CalculaArea();
                    triangulo.CalculaPerimetro();
                    String area = String.valueOf(triangulo.area);
                    lblArea.setText("Area: " + area);
                    lblArea.setVisible(true);
                    String perimetro = String.valueOf(triangulo.perimetro);
                    lblPerimetro.setText("Perimetro: " + perimetro);
                    lblPerimetro.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Para el Lado B debes ingresar un Numero Entero");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Para el Lado A debes ingresar un Numero Entero");
            }   
        } else if (lblTipo.getText().equals("Triangulo Escaleno")){
            if (Valida(txt1.getText()) == true){
                if (Valida(txt2.getText()) == true){
                    if (Valida(txt3.getText()) == true){
                        Triangulo triangulo = new Triangulo();
                        triangulo.setTipoTriangulo("Escaleno");
                        int ladoA = Integer.valueOf(txt1.getText());
                        int ladoB = Integer.valueOf(txt2.getText());
                        int ladoC = Integer.valueOf(txt3.getText());
                        triangulo.setLadoA(ladoA);
                        triangulo.setLadoB(ladoB);
                        triangulo.setLadoC(ladoC);
                        triangulo.CalculaArea();
                        triangulo.CalculaPerimetro();
                        String area = String.valueOf(triangulo.area);
                        lblArea.setText("Area: " + area);
                        lblArea.setVisible(true);
                        String perimetro = String.valueOf(triangulo.perimetro);
                        lblPerimetro.setText("Perimetro: " + perimetro);
                        lblPerimetro.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Para el Lado C debes ingresar un Numero Entero");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Para el Lado B debes ingresar un Numero Entero");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Para el Lado A debes ingresar un Numero Entero");
            }
        } else if (lblTipo.getText().equals("Triangulo Rectangulo")){
            if (Valida(txt1.getText()) == true ){
                if (Valida(txt2.getText()) == true){
                    Triangulo triangulo = new Triangulo();
                    triangulo.setTipoTriangulo("Rectangulo");
                    int ladoA = Integer.valueOf(txt1.getText());
                    int ladoB = Integer.valueOf(txt2.getText());
                    triangulo.setLadoA(ladoA);
                    triangulo.setLadoB(ladoB);
                    triangulo.CalculaArea();
                    triangulo.CalculaPerimetro();
                    String area = String.valueOf(triangulo.area);
                    lblArea.setText("Area: " + area);
                    lblArea.setVisible(true);
                    String perimetro = String.valueOf(triangulo.perimetro);
                    lblPerimetro.setText("Perimetro: " + perimetro);
                    lblPerimetro.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Para el Lado B debes ingresar un Numero Entero");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Para el Lado A debes ingresar un Numero Entero");
            }
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCirculo;
    private javax.swing.JButton btnCuadrado;
    private javax.swing.JButton btnEqui;
    private javax.swing.JButton btnEsc;
    private javax.swing.JButton btnIso;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRec;
    private javax.swing.JButton btnRectangulo;
    private javax.swing.JButton btnTriangulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblPerimetro;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTitRes;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    // End of variables declaration//GEN-END:variables
}