package Vista;

import Controlador.LoginController;
import Modelo.Usuario;
import javax.swing.JOptionPane;

public class NuevoUsuario extends javax.swing.JInternalFrame {

    public NuevoUsuario() {
        initComponents();
        this.setTitle("Nuevo Usuario");

        txtPassword.setVisible(true);
        txtPasswordVisible.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        CheckboxVerClave = new javax.swing.JCheckBox();
        txtPasswordVisible = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cmbRol = new javax.swing.JComboBox<>();
        txtHoraEntrada = new javax.swing.JTextField();
        txtHoraSalida = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nuevo Usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 120, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Apellido:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 100, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Usuario:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 100, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Password:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 100, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Hora Salida:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 130, -1));

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 170, -1));

        txtApellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 170, -1));

        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 170, -1));

        txtTelefono.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 170, -1));

        btnGuardar.setBackground(new java.awt.Color(0, 204, 204));
        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 90, 30));
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 170, -1));

        CheckboxVerClave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckboxVerClaveMouseClicked(evt);
            }
        });
        getContentPane().add(CheckboxVerClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, -1, -1));

        txtPasswordVisible.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtPasswordVisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 170, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Rol:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 70, 30));

        cmbRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "empleado", "admin" }));
        cmbRol.setPreferredSize(new java.awt.Dimension(64, 21));
        cmbRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRolActionPerformed(evt);
            }
        });
        getContentPane().add(cmbRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 170, -1));

        txtHoraEntrada.setText("HH:MM:SS");
        getContentPane().add(txtHoraEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 170, -1));

        txtHoraSalida.setText("HH:MM:SS");
        getContentPane().add(txtHoraSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 170, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Telefono:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 100, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Hora Entrada:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 130, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/fondo3.jpg"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty()
                || txtUsuario.getText().isEmpty() || txtPassword.getText().isEmpty()
                || txtTelefono.getText().isEmpty() || cmbRol.getSelectedItem().toString().equals("Seleccione rol:")) {

            JOptionPane.showMessageDialog(null, "Completa todos los campos");
            return;

        }

// ---------------------- VALIDACIONES NUEVAS --------------------------
// Nombre y apellido: solo letras y espacios
        if (!txtNombre.getText().matches("^[a-zA-ZÁÉÍÓÚáéíóúñÑ ]+$")) {
            JOptionPane.showMessageDialog(null, "El nombre solo debe contener letras");
            return;
        }

        if (!txtApellido.getText().matches("^[a-zA-ZÁÉÍÓÚáéíóúñÑ ]+$")) {
            JOptionPane.showMessageDialog(null, "El apellido solo debe contener letras");
            return;
        }

// Usuario: letras y números (sin caracteres especiales)
        if (!txtUsuario.getText().matches("^[a-zA-Z0-9]+$")) {
            JOptionPane.showMessageDialog(null, "El usuario solo debe contener letras y números");
            return;
        }

// Teléfono: solo números
        if (!txtTelefono.getText().matches("^[0-9]+$")) {
            JOptionPane.showMessageDialog(null, "El teléfono solo debe contener números");
            return;
        }

// Password: mínimo 6 caracteres
        if (txtPassword.getText().trim().length() < 6) {
            JOptionPane.showMessageDialog(null, "La contraseña debe tener mínimo 6 caracteres");
            return;
        }

// Hora entrada/salida: formato HH:MM (opcional)
        if (!txtHoraEntrada.getText().trim().isEmpty()
                && !txtHoraEntrada.getText().matches("^([01]\\d|2[0-3]):[0-5]\\d$")) {

            JOptionPane.showMessageDialog(null, "Hora de entrada inválida. Formato correcto: HH:MM");
            return;
        }

        if (!txtHoraSalida.getText().trim().isEmpty()
                && !txtHoraSalida.getText().matches("^([01]\\d|2[0-3]):[0-5]\\d$")) {

            JOptionPane.showMessageDialog(null, "Hora de salida inválida. Formato correcto: HH:MM");
            return;
        }

// ---------------------- FIN VALIDACIONES --------------------------
// 1. Crear el objeto Usuario
        Usuario usuario = new Usuario();
        LoginController controlUsuario = new LoginController();

        usuario.setNombre(txtNombre.getText().trim());
        usuario.setApellido(txtApellido.getText().trim());
        usuario.setUsuario(txtUsuario.getText().trim());
        usuario.setPassword(txtPassword.getText().trim());
        usuario.setTelefono(txtTelefono.getText().trim());
        usuario.setEstado(1);

// 2. Nuevos campos
        usuario.setRol(cmbRol.getSelectedItem().toString());

        usuario.setHora_entrada(txtHoraEntrada.getText().trim().isEmpty() ? null : txtHoraEntrada.getText().trim());
        usuario.setHora_salida(txtHoraSalida.getText().trim().isEmpty() ? null : txtHoraSalida.getText().trim());

// 3. Guardar
        if (controlUsuario.guardar(usuario)) {
            JOptionPane.showMessageDialog(null, "¡Usuario registrado con éxito!");
            this.limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Error al guardar usuario");
        }

        this.limpiar();

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void CheckboxVerClaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckboxVerClaveMouseClicked
        if (CheckboxVerClave.isSelected() == true) {
            String pass = "";
            char[] passIngresado = txtPassword.getPassword();
            for (int i = 0; i < passIngresado.length; i++) {
                pass += passIngresado[i];

            }
            txtPasswordVisible.setText(pass);
            txtPassword.setVisible(false);
            txtPasswordVisible.setVisible(true);
        } else {

            String passwordIngresado = txtPasswordVisible.getText().trim();
            txtPassword.setText(passwordIngresado);
            txtPassword.setVisible(true);
            txtPasswordVisible.setVisible(false);
        }

    }//GEN-LAST:event_CheckboxVerClaveMouseClicked

    private void cmbRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbRolActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckboxVerClave;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cmbRol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtHoraEntrada;
    private javax.swing.JTextField txtHoraSalida;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPasswordVisible;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    private void limpiar() {
        txtNombre.setText("");
        txtApellido.setText("");
        txtUsuario.setText("");
        txtPassword.setText("");
        txtTelefono.setText("");
        txtHoraEntrada.setText("");
        txtHoraSalida.setText("");
        cmbRol.setSelectedIndex(0);
    }

}
