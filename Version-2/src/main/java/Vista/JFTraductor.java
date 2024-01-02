package Vista;

import Logica.TraductorSanscrito;
<<<<<<< HEAD
import java.awt.Image;
import java.nio.file.Path;
import java.nio.file.Paths;
=======
import java.awt.Color;
import java.awt.Image;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
>>>>>>> origin/dev-joel
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.Icon;
import javax.swing.ImageIcon;
<<<<<<< HEAD
=======
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
>>>>>>> origin/dev-joel
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class JFTraductor extends javax.swing.JFrame {

<<<<<<< HEAD
    private Map<Integer, ImageIcon> mapaImagenes;
    private Map<Integer, String> english;
    private Map<Integer, String> spanish;
    private Map<Integer, String> sanskrit;
=======
    private final Map<Integer, ImageIcon> mapaImagenes;
    private final Map<Integer, String> english;
    private final Map<Integer, String> spanish;
    private final Map<Integer, String> sanskrit;
>>>>>>> origin/dev-joel
    TraductorSanscrito ts;

    public JFTraductor() {
        setTitle("Yoga Translate");
        initComponents();
        this.setLocationRelativeTo(null);
        AutoCompleteDecorator.decorate(cbEspanol);
        AutoCompleteDecorator.decorate(cbEnglish);
        AutoCompleteDecorator.decorate(cbSanskrit);
        // Inicializar el mapa de imágenes en el constructor
        mapaImagenes = new HashMap<>();
        english = new HashMap<>();
        spanish = new HashMap<>();
        sanskrit = new HashMap<>();

        // Cargar imágenes al inicio
        cargarImagenes();
<<<<<<< HEAD

        // Mostrar la imagen seleccionada al inicio
        mostrarImagenSeleccionada();
    }
=======
        mostrarImagenSeleccionada();
    }
    

>>>>>>> origin/dev-joel

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        tabPanel = new javax.swing.JTabbedPane();
<<<<<<< HEAD
        jpEspanol = new javax.swing.JPanel();
        cbEspanol = new javax.swing.JComboBox<>();
        lblImagen = new javax.swing.JLabel();
        lblES_EN = new javax.swing.JLabel();
        lblES_SANS = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jpEnglish = new javax.swing.JPanel();
        cbEnglish = new javax.swing.JComboBox<>();
        lblImagenEN = new javax.swing.JLabel();
        lblEN_ES = new javax.swing.JLabel();
        lblEN_SANS = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
=======
>>>>>>> origin/dev-joel
        jpSanskrit = new javax.swing.JPanel();
        lblImagenSANS = new javax.swing.JLabel();
        lblSANS_ES = new javax.swing.JLabel();
        lblSANS_EN = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        cbSanskrit = new javax.swing.JComboBox<>();
<<<<<<< HEAD
=======
        jpEspanol = new javax.swing.JPanel();
        cbEspanol = new javax.swing.JComboBox<>();
        lblImagen = new javax.swing.JLabel();
        lblES_EN = new javax.swing.JLabel();
        lblES_SANS = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jpEnglish = new javax.swing.JPanel();
        cbEnglish = new javax.swing.JComboBox<>();
        lblImagenEN = new javax.swing.JLabel();
        lblEN_ES = new javax.swing.JLabel();
        lblEN_SANS = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
>>>>>>> origin/dev-joel
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaSanscrito = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaTraducido = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Traductor");
<<<<<<< HEAD
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TRADUCTOR");

=======
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TRADUCTOR");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, java.awt.BorderLayout.CENTER);

        tabPanel.setBackground(new java.awt.Color(255, 255, 255));
        tabPanel.setOpaque(true);
>>>>>>> origin/dev-joel
        tabPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabPanelMouseClicked(evt);
            }
        });

<<<<<<< HEAD
        cbEspanol.setEditable(true);
        cbEspanol.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbEspanol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Postura de la Montaña", "Perro mirando hacia abajo", "Guerrero I", "Guerrero II", "Postura del Árbol", "Postura del Niño", "Postura de la Cobra a la mitad", "Flexión hacia adelante sentado", "Postura del Puente", "Postura del Cadáver", "Postura del Triángulo", "Postura de la Plancha", "Perro mirando hacia arriba", "Postura del Pez", "Postura de la Silla", "Postura de la Guirnalda", "Postura de la Paloma", "Saludo hacia arriba", "Postura del Triángulo Invertido", "Postura de la Cabeza a la Rodilla Invertida" }));
        cbEspanol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEspanolActionPerformed(evt);
            }
        });

        lblImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblES_EN.setText("...");

        lblES_SANS.setText("...");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Inglés:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Sánscrito: ");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jpEspanolLayout = new javax.swing.GroupLayout(jpEspanol);
        jpEspanol.setLayout(jpEspanolLayout);
        jpEspanolLayout.setHorizontalGroup(
            jpEspanolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEspanolLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jpEspanolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbEspanol, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jpEspanolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpEspanolLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel3)
                        .addGap(27, 27, 27)
                        .addComponent(lblES_SANS, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                    .addGroup(jpEspanolLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(47, 47, 47)
                        .addComponent(lblES_EN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpEspanolLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1)))
                .addGap(74, 74, 74))
        );
        jpEspanolLayout.setVerticalGroup(
            jpEspanolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEspanolLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(cbEspanol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jpEspanolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpEspanolLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpEspanolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblES_EN)
                            .addComponent(jLabel1))
                        .addGap(43, 43, 43)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(jpEspanolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblES_SANS)
                            .addComponent(jLabel3))
                        .addGap(78, 78, 78))
                    .addGroup(jpEspanolLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(18, Short.MAX_VALUE))))
        );

        tabPanel.addTab("Español", jpEspanol);

        cbEnglish.setEditable(true);
        cbEnglish.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbEnglish.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select     ", "Mountain Pose", "Downward-Facing Dog", "Warrior I", "Warrior II", "Tree Pose", "Child's Pose", "Half Cobra Pose", "Seated Forward Bend", "Bridge Pose", "Corpse Pose", "Triangle Pose", "Plank Pose", "Upward-Facing Dog", "Fish Pose", "Chair Pose", "Garland Pose", "Pigeon Pose", "Upward Salute", "Revolved Triangle Pose", "Revolved Head To Knee Pose" }));
        cbEnglish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEnglishActionPerformed(evt);
            }
        });

        lblImagenEN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblEN_ES.setText("...");

        lblEN_SANS.setText("...");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Spanish: ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Sanskrit");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jpEnglishLayout = new javax.swing.GroupLayout(jpEnglish);
        jpEnglish.setLayout(jpEnglishLayout);
        jpEnglishLayout.setHorizontalGroup(
            jpEnglishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEnglishLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jpEnglishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpEnglishLayout.createSequentialGroup()
                        .addComponent(lblImagenEN, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jpEnglishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpEnglishLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(33, 33, 33)
                                .addComponent(lblEN_SANS, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpEnglishLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(lblEN_ES, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cbEnglish, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpEnglishLayout.setVerticalGroup(
            jpEnglishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEnglishLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jpEnglishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEN_ES)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jpEnglishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblEN_SANS))
                .addGap(83, 83, 83))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpEnglishLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(cbEnglish, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblImagenEN, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        tabPanel.addTab("English", jpEnglish);

        lblImagenSANS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblSANS_ES.setText("...");

        lblSANS_EN.setText("...");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Español: ");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("English: ");

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        cbSanskrit.setEditable(true);
        cbSanskrit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbSanskrit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select     ", "Tadasana", "Adho Mukha Svanasana", "Virabhadrasana I", "Virabhadrasana II", "Vrikshasana", "Balasana", "Ardha Bhujangasana", "Paschimottanasana", "Setu Bandhasana", "Shavasana", "Trikonasana", "Kumbhakasana", "Urdhva Mukha Svanasana", "Matsyasana", "Utkatasana", "Malasana", "Eka Pada Rajakapotasana", "Urdhva Hastasana", "Parivrtta Trikonasana", "Parivrtta Janu Sirsasana" }));
=======
        jpSanskrit.setBackground(new java.awt.Color(255, 255, 255));
        jpSanskrit.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jpSanskrit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImagenSANS.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jpSanskrit.add(lblImagenSANS, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 293, 219));

        lblSANS_ES.setText("...");
        jpSanskrit.add(lblSANS_ES, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 180, -1));

        lblSANS_EN.setText("...");
        jpSanskrit.add(lblSANS_EN, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 181, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Español: ");
        jpSanskrit.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("English: ");
        jpSanskrit.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jpSanskrit.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 157, 310, 10));

        cbSanskrit.setEditable(true);
        cbSanskrit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbSanskrit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Adho Mukha Svanasana", "Ardha Bhujangasana", "Balasana", "Eka Pada Rajakapotasana", "Kumbhakasana", "Malasana", "Matsyasana", "Parivrtta Janu Sirsasana", "Parivrtta Trikonasana", "Paschimottanasana", "Setu Bandhasana", "Shavasana", "Tadasana", "Trikonasana", "Urdhva Hastasana", "Urdhva Mukha Svanasana", "Utkatasana", "Vrikshasana", "Virabhadrasana I", "Virabhadrasana II" }));
>>>>>>> origin/dev-joel
        cbSanskrit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSanskritActionPerformed(evt);
            }
        });
<<<<<<< HEAD

        javax.swing.GroupLayout jpSanskritLayout = new javax.swing.GroupLayout(jpSanskrit);
        jpSanskrit.setLayout(jpSanskritLayout);
        jpSanskritLayout.setHorizontalGroup(
            jpSanskritLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSanskritLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jpSanskritLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblImagenSANS, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSanskrit, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jpSanskritLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpSanskritLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jpSanskritLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpSanskritLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSANS_ES, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSANS_EN, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))
                    .addGroup(jpSanskritLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jpSanskritLayout.setVerticalGroup(
            jpSanskritLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSanskritLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(cbSanskrit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jpSanskritLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpSanskritLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblImagenSANS, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(jpSanskritLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jpSanskritLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSANS_ES)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(jpSanskritLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSANS_EN)
                            .addComponent(jLabel7))
                        .addGap(82, 82, 82))))
        );

        tabPanel.addTab("Sanskrit", jpSanskrit);

=======
        jpSanskrit.add(cbSanskrit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 190, -1));

        tabPanel.addTab("Sanskrit", jpSanskrit);

        jpEspanol.setBackground(new java.awt.Color(255, 255, 255));
        jpEspanol.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbEspanol.setEditable(true);
        cbEspanol.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbEspanol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Guerrero I", "Guerrero II", "Perro mirando hacia abajo", "Perro mirando hacia arriba", "Flexión hacia adelante sentado", "Postura de la Cabeza a la Rodilla Invertida", "Postura de la Cobra a la mitad", "Postura de la Guirnalda", "Postura de la Montaña", "Postura de la Paloma", "Postura de la Plancha", "Postura de la Silla", "Postura de la Triángulo", "Postura de la Triángulo Invertido", "Postura de la Montaña", "Postura de la Cobra a la mitad", "Postura de la Paloma", "Postura de la Plancha", "Postura de la Silla", "Postura del Árbol", "Postura del Cadáver", "Postura del Niño", "Postura del Pez", "Postura del Puente", "Saludo hacia arriba" }));
        cbEspanol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEspanolActionPerformed(evt);
            }
        });
        jpEspanol.add(cbEspanol, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 290, -1));

        lblImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpEspanol.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 293, 219));

        lblES_EN.setText("...");
        jpEspanol.add(lblES_EN, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 167, -1));

        lblES_SANS.setText("...");
        jpEspanol.add(lblES_SANS, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 163, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Inglés:");
        jpEspanol.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Sánscrito: ");
        jpEspanol.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 213, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jpEspanol.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 157, 310, 10));

        tabPanel.addTab("Español", jpEspanol);

        jpEnglish.setBackground(new java.awt.Color(255, 255, 255));
        jpEnglish.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbEnglish.setEditable(true);
        cbEnglish.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbEnglish.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Chair Pose", "Child's Pose", "Corpse Pose", "Downward-Facing Dog", "Fish Pose", "Garland Pose", "Half Cobra Pose", "Mountain Pose", "Pigeon Pose", "Plank Pose", "Revolved Head To Knee Pose", "Revolved Triangle Pose", "Seated Forward Bend", "Select", "Triangle Pose", "Tree Pose", "Upward Salute", "Upward-Facing Dog", "Warrior I", "Warrior II" }));
        cbEnglish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEnglishActionPerformed(evt);
            }
        });
        jpEnglish.add(cbEnglish, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 210, -1));

        lblImagenEN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpEnglish.add(lblImagenEN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 293, 219));

        lblEN_ES.setText("...");
        jpEnglish.add(lblEN_ES, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 180, -1));

        lblEN_SANS.setText("...");
        jpEnglish.add(lblEN_SANS, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 181, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Spanish: ");
        jpEnglish.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Sanskrit");
        jpEnglish.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, -1, -1));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jpEnglish.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 157, 310, 10));

        tabPanel.addTab("English", jpEnglish);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

>>>>>>> origin/dev-joel
        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Sánscrito");
<<<<<<< HEAD

        jtaSanscrito.setColumns(20);
        jtaSanscrito.setLineWrap(true);
        jtaSanscrito.setRows(5);
=======
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 70, 250, -1));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jtaSanscrito.setBackground(new java.awt.Color(242, 242, 242));
        jtaSanscrito.setColumns(20);
        jtaSanscrito.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtaSanscrito.setLineWrap(true);
        jtaSanscrito.setRows(5);
        jtaSanscrito.setAutoscrolls(false);
>>>>>>> origin/dev-joel
        jtaSanscrito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtaSanscritoKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jtaSanscrito);

<<<<<<< HEAD
        jtaTraducido.setEditable(false);
        jtaTraducido.setBackground(new java.awt.Color(255, 255, 255));
        jtaTraducido.setColumns(20);
        jtaTraducido.setLineWrap(true);
        jtaTraducido.setRows(5);
        jScrollPane2.setViewportView(jtaTraducido);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Traducción");

        jButton1.setText("Traducir");
=======
        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 110, -1, 80));

        jScrollPane2.setBackground(new java.awt.Color(242, 242, 242));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setEnabled(false);

        jtaTraducido.setColumns(20);
        jtaTraducido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtaTraducido.setLineWrap(true);
        jtaTraducido.setRows(5);
        jtaTraducido.setAutoscrolls(false);
        jtaTraducido.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtaTraducido.setEnabled(false);
        jtaTraducido.setFocusable(false);
        jtaTraducido.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        jScrollPane2.setViewportView(jtaTraducido);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, -1, 80));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Traducción");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 250, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Traducir");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
>>>>>>> origin/dev-joel
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
<<<<<<< HEAD

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jButton1)))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        tabPanel.addTab("Diccionario", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(tabPanel))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(tabPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
=======
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 130, -1, -1));

        tabPanel.addTab("Diccionario", jPanel1);

        getContentPane().add(tabPanel, java.awt.BorderLayout.PAGE_END);
>>>>>>> origin/dev-joel

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbEspanolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEspanolActionPerformed
        System.out.println("Índice seleccionado: " + cbEspanol.getSelectedIndex());
        mostrarImagenSeleccionada();
        mostrarTextoSeleccionado();
    }//GEN-LAST:event_cbEspanolActionPerformed

    private void cbEnglishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEnglishActionPerformed

        mostrarImagenSeleccionada();
        mostrarTextoSeleccionado();

    }//GEN-LAST:event_cbEnglishActionPerformed

    private void tabPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabPanelMouseClicked

        mostrarImagenSeleccionada();
    }//GEN-LAST:event_tabPanelMouseClicked

    private void cbSanskritActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSanskritActionPerformed
        mostrarImagenSeleccionada();
        mostrarTextoSeleccionado();
    }//GEN-LAST:event_cbSanskritActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ts = new TraductorSanscrito();
<<<<<<< HEAD
        String traducir = ts.traducir(jtaSanscrito.getText().toLowerCase().trim());
        jtaTraducido.setText(traducir);
=======
        String textoSanscrito = jtaSanscrito.getText().toLowerCase().trim();

        if (textoSanscrito.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo está vacío. Por favor, ingresa texto antes de traducir.", "Campo Vacío", JOptionPane.WARNING_MESSAGE);
        } else {
            String traducir = ts.traducir(textoSanscrito);

            if (traducir.isBlank()) {
                JOptionPane.showMessageDialog(this, "No se pudo traducir la palabra. No se encuentra en el diccionario.", "Error de Traducción", JOptionPane.ERROR_MESSAGE);
            } else {
                jtaTraducido.setText(traducir);
            }
        }


>>>>>>> origin/dev-joel
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtaSanscritoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtaSanscritoKeyTyped
        char c = evt.getKeyChar();

        // Definir la expresión regular
        String regex = "^[a-zA-Z ]$";
        Pattern pattern = Pattern.compile(regex);

        // Verificar si el carácter es una letra o espacio
        Matcher matcher = pattern.matcher(String.valueOf(c));

        if (!matcher.matches()) {
            evt.consume();
        }

    }//GEN-LAST:event_jtaSanscritoKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbEnglish;
    private javax.swing.JComboBox<String> cbEspanol;
    private javax.swing.JComboBox<String> cbSanskrit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
<<<<<<< HEAD
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
=======
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
>>>>>>> origin/dev-joel
    private javax.swing.JPanel jpEnglish;
    private javax.swing.JPanel jpEspanol;
    private javax.swing.JPanel jpSanskrit;
    private javax.swing.JTextArea jtaSanscrito;
    private javax.swing.JTextArea jtaTraducido;
    private javax.swing.JLabel lblEN_ES;
    private javax.swing.JLabel lblEN_SANS;
    private javax.swing.JLabel lblES_EN;
    private javax.swing.JLabel lblES_SANS;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblImagenEN;
    private javax.swing.JLabel lblImagenSANS;
    private javax.swing.JLabel lblSANS_EN;
    private javax.swing.JLabel lblSANS_ES;
    private javax.swing.JTabbedPane tabPanel;
    // End of variables declaration//GEN-END:variables

    private void cargarIdioma(int tab) {
        String[] englishWords = {
<<<<<<< HEAD
            "...",
=======
            "Select",
>>>>>>> origin/dev-joel
            "Mountain Pose",
            "Downward-Facing Dog",
            "Warrior I",
            "Warrior II",
            "Tree Pose",
            "Child's Pose",
            "Half Cobra Pose",
            "Seated Forward Bend",
            "Bridge Pose",
            "Corpse Pose",
            "Triangle Pose",
            "Plank Pose",
            "Upward-Facing Dog",
            "Fish Pose",
            "Chair Pose",
            "Garland Pose",
            "Pigeon Pose",
            "Upward Salute",
            "Revolved Triangle Pose",
            "Revolved Head To Knee Pose"

        };
        String[] spanishWords = {
<<<<<<< HEAD
            "...",
=======
            "Seleccione",
>>>>>>> origin/dev-joel
            "Postura de la Montaña",
            "Perro mirando hacia abajo",
            "Guerrero I",
            "Guerrero II",
            "Postura del Árbol",
            "Postura del Niño",
            "Postura de la Cobra a la mitad",
            "Flexión hacia adelante sentado",
            "Postura del Puente",
            "Postura del Cadáver",
            "Postura del Triángulo",
            "Postura de la Plancha",
            "Perro mirando hacia arriba",
            "Postura del Pez",
            "Postura de la Silla",
            "Postura de la Guirnalda",
            "Postura de la Paloma",
            "Saludo hacia arriba",
            "Postura del Triángulo Invertido",
            "Postura de la Cabeza a la Rodilla Invertida"
        };

        String[] sanskritWords = {
<<<<<<< HEAD
            "...",
=======
            "Select",
>>>>>>> origin/dev-joel
            "Tadasana",
            "Adho Mukha Svanasana",
            "Virabhadrasana I",
            "Virabhadrasana II",
            "Vrikshasana",
            "Balasana",
            "Ardha Bhujangasana",
            "Paschimottanasana",
            "Setu Bandhasana",
            "Shavasana",
            "Trikonasana",
            "Kumbhakasana",
            "Urdhva Mukha Svanasana",
            "Matsyasana",
            "Utkatasana",
            "Malasana",
            "Eka Pada Rajakapotasana",
            "Urdhva Hastasana",
            "Parivrtta Trikonasana",
            "Parivrtta Janu Sirsasana"
<<<<<<< HEAD

        };

        switch (tab) {
            case 0:
                System.out.println("Idioma Español escogido: " + tabPanel.getSelectedIndex());
                for (int i = 0; i < englishWords.length; i++) {
                    english.put(i, englishWords[i]);
                }
                System.out.println("Mapeo de la lista EN: " + english);
                for (int i = 0; i < sanskritWords.length; i++) {
                    sanskrit.put(i, sanskritWords[i]);
                }
                System.out.println("Mapeo de la lista SANS: " + sanskrit);
                break;
            case 1:
                System.out.println("idioma Ingles" + tabPanel.getSelectedIndex());
                for (int i = 0; i < spanishWords.length; i++) {
                    spanish.put(i, spanishWords[i]);
                }
                System.out.println("Mapeo de la lista ES: " + spanish);
                for (int i = 0; i < sanskritWords.length; i++) {
                    sanskrit.put(i, sanskritWords[i]);
                }
                System.out.println("Mapeo de la lista SANS: " + sanskrit);
                break;
            case 2:
                System.out.println("idioma Ingles" + tabPanel.getSelectedIndex());
                for (int i = 0; i < spanishWords.length; i++) {
                    spanish.put(i, spanishWords[i]);
                }
                System.out.println("Mapeo de la lista ES: " + spanish);
                for (int i = 0; i < englishWords.length; i++) {
                    english.put(i, englishWords[i]);
                }
                System.out.println("Mapeo de la lista EN: " + english);
                break;
            default:
                break;
        }

    }

=======
        };

        cargarMapaIdioma(english, englishWords);
        cargarMapaIdioma(spanish, spanishWords);
        cargarMapaIdioma(sanskrit, sanskritWords);

    }

    private void cargarMapaIdioma(Map<Integer, String> mapa, String[] palabras) {
        for (int i = 0; i < palabras.length; i++) {
            mapa.put(i, palabras[i]);
        }
        System.out.println("Mapeo de la lista: " + mapa);
    }

>>>>>>> origin/dev-joel
    private void cargarImagenes() {
        // Rutas de las imágenes en el paquete "Images"
        String[] nombresArchivos = {
            "0. Intro.gif",
            "01. PosturaMontana.gif",
            "02. PerroMirandoAbajo.gif",
            "03. Guerrero1.gif",
            "04. Guerrero2.gif",
            "05. PosturaArbol.gif",
            "06. PosturaNino.gif",
            "07. PosturaCobraMitad.gif",
            "08. FlexionHaciAdelanteSentado.gif",
            "09. PosturaPuente.gif",
            "10. PosturaCadaver.jpg",
            "11. PosturaTriangulo.gif",
            "12. PosturaPlancha.gif",
            "13. PerroMirandoArriba.gif",
            "14. PosturaPez.gif",
            "15. PosturaSilla.gif",
            "16. PosturaGuirnalda.gif",
            "17. PosturaPaloma.gif",
            "18. SaludoHaciaArriba.gif",
            "19. PosturaTrianguloInvertido.gif",
            "20. PosturaCabezaARodillaInvertida.gif"
        };

        // Obtener la ruta del paquete "Images"
<<<<<<< HEAD
        Path rutaBase = Paths.get("Version-1","src", "main", "java", "Images");
=======
        Path rutaBase = Paths.get("Version-2", "src", "main", "java", "Images");
>>>>>>> origin/dev-joel

        // Agregar las imágenes al mapa
        for (int i = 0; i < nombresArchivos.length; i++) {
            Path rutaImagen = rutaBase.resolve(nombresArchivos[i]);
            mapaImagenes.put(i, new ImageIcon(rutaImagen.toString()));
        }
<<<<<<< HEAD
    }

    private void mostrarImagenSeleccionada() {
        int indiceSeleccionadoES = cbEspanol.getSelectedIndex();
        int indiceSeleccionadoEN = cbEnglish.getSelectedIndex();
        int indiceSeleccionadoSANS = cbSanskrit.getSelectedIndex();

        ImageIcon imagenSeleccionadaES = mapaImagenes.get(indiceSeleccionadoES);
        ImageIcon imagenSeleccionadaEN = mapaImagenes.get(indiceSeleccionadoEN);
        ImageIcon imagenSeleccionadaSANS = mapaImagenes.get(indiceSeleccionadoSANS);

        System.out.println("Ruta de la imagen: " + imagenSeleccionadaES);
        System.out.println("Ruta de la imagen: " + imagenSeleccionadaEN);
        System.out.println("Ruta de la imagen: " + imagenSeleccionadaSANS);

        switch (tabPanel.getSelectedIndex()) {
            case 0 -> {
                if (imagenSeleccionadaES != null) {
                    Icon icon = new ImageIcon(imagenSeleccionadaES.getImage().getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_DEFAULT));
                    System.out.println("Tamaño del Icon: " + icon.getIconWidth() + " x " + icon.getIconHeight());
                    System.out.println("Dimensiones del JLabel: " + lblImagen.getWidth() + " x " + lblImagen.getHeight());
                    lblImagen.setIcon(icon);
                    this.repaint();
                    lblImagen.setText("");
                } else {
                    lblImagen.setIcon(null);
                    lblImagen.setText("Imagen NO Encontrada :c");
                }
            }
            case 1 -> {
                if (imagenSeleccionadaEN != null) {
                    Icon icon = new ImageIcon(imagenSeleccionadaEN.getImage().getScaledInstance(lblImagenEN.getWidth(), lblImagenEN.getHeight(), Image.SCALE_DEFAULT));
                    System.out.println("Tamaño del Icon: " + icon.getIconWidth() + " x " + icon.getIconHeight());
                    System.out.println("Dimensiones del JLabel: " + lblImagenEN.getWidth() + " x " + lblImagenEN.getHeight());
                    lblImagenEN.setIcon(icon);
                    this.repaint();
                    lblImagenEN.setText("");
                } else {
                    lblImagenEN.setText(null);
                    lblImagenEN.setText("Imagen NO Encontrada :c");
                }
            }
            case 2 -> {
                if (imagenSeleccionadaSANS != null) {
                    Icon icon = new ImageIcon(imagenSeleccionadaSANS.getImage().getScaledInstance(lblImagenSANS.getWidth(), lblImagenSANS.getHeight(), Image.SCALE_DEFAULT));
                    System.out.println("Tamaño del Icon: " + icon.getIconWidth() + " x " + icon.getIconHeight());
                    System.out.println("Dimensiones del JLabel: " + lblImagenSANS.getWidth() + " x " + lblImagenSANS.getHeight());
                    lblImagenSANS.setIcon(icon);
                    this.repaint();
                    lblImagenSANS.setText("");
                } else {
                    lblImagenSANS.setText(null);
                    lblImagenSANS.setText("Imagen NO Encontrada :c");
                }
            }
            default -> {
=======

    }

    private void mostrarImagenSeleccionada() {
        int tab = tabPanel.getSelectedIndex();
        int indiceSeleccionado = -1;
        Map<Integer, String> idioma = new HashMap<>();

        switch (tab) {
            case 1 -> {
                idioma = spanish;
                indiceSeleccionado = buscarClavePorValor(idioma, cbEspanol.getSelectedItem());
                mostrarImagen(lblImagen, indiceSeleccionado == -1 ? 0 : indiceSeleccionado);
            }
            case 2 -> {
                idioma = english;
                indiceSeleccionado = buscarClavePorValor(idioma, cbEnglish.getSelectedItem());
                mostrarImagen(lblImagenEN, indiceSeleccionado == -1 ? 0 : indiceSeleccionado);
            }
            case 0 -> {
                idioma = sanskrit;
                indiceSeleccionado = buscarClavePorValor(idioma, cbSanskrit.getSelectedItem());
                mostrarImagen(lblImagenSANS, indiceSeleccionado == -1 ? 0 : indiceSeleccionado);
>>>>>>> origin/dev-joel
            }
        }
    }

<<<<<<< HEAD
    private void mostrarTextoSeleccionado() {
        cargarIdioma(tabPanel.getSelectedIndex());

        if (tabPanel.getSelectedIndex() == 0) {
            int indiceSeleccionadoES = cbEspanol.getSelectedIndex();
            String opcionEnglish = english.get(indiceSeleccionadoES);
            String opcionSanskrit = sanskrit.get(indiceSeleccionadoES);
            lblES_EN.setText(opcionEnglish);
            lblES_SANS.setText(opcionSanskrit);
        } else if (tabPanel.getSelectedIndex() == 1) {
            int indiceSeleccionadoEN = cbEnglish.getSelectedIndex();
            String opcionEspanish = spanish.get(indiceSeleccionadoEN);
            String opcionSanskrit = sanskrit.get(indiceSeleccionadoEN);
            lblEN_ES.setText(opcionEspanish);
            lblEN_SANS.setText(opcionSanskrit);
        } else if (tabPanel.getSelectedIndex() == 2) {
            int indiceSeleccionadoSANS = cbSanskrit.getSelectedIndex();
            String opcionEnglish = english.get(indiceSeleccionadoSANS);
            String opcionEspanish = spanish.get(indiceSeleccionadoSANS);
            lblSANS_ES.setText(opcionEspanish);
            lblSANS_EN.setText(opcionEnglish);
        }

    }

=======
    private void mostrarImagen(JLabel label, int indiceSeleccionado) {
        ImageIcon imagenSeleccionada = mapaImagenes.get(indiceSeleccionado);
        System.out.println("Ruta de la imagen: " + imagenSeleccionada);

        if (imagenSeleccionada != null) {
            Icon icon = new ImageIcon(imagenSeleccionada.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
            System.out.println("Tamaño del Icon: " + icon.getIconWidth() + " x " + icon.getIconHeight());
            System.out.println("Dimensiones del JLabel: " + label.getWidth() + " x " + label.getHeight());
            label.setIcon(icon);
            label.setText("");
        } else {
            label.setIcon(null);
            label.setText("Imagen NO Encontrada :c");
        }
    }

    private void mostrarTextoSeleccionado() {
        cargarIdioma(tabPanel.getSelectedIndex());

        Object opcionSelec = getSelectedItemByIndex(tabPanel.getSelectedIndex());
        int indiceSeleccionado = buscarClavePorValor(getIdiomaMap(tabPanel.getSelectedIndex()), opcionSelec.toString());

        switch (tabPanel.getSelectedIndex()) {
            case 1 ->
                mostrarTexto(lblES_EN, lblES_SANS, english, sanskrit, opcionSelec, indiceSeleccionado);
            case 2 ->
                mostrarTexto(lblEN_ES, lblEN_SANS, spanish, sanskrit, opcionSelec, indiceSeleccionado);
            case 0 ->
                mostrarTexto(lblSANS_ES, lblSANS_EN, spanish, english, opcionSelec, indiceSeleccionado);
        }
    }

    private Object getSelectedItemByIndex(int index) {
        switch (index) {
            case 1:
                return cbEspanol.getSelectedItem();
            case 2:
                return cbEnglish.getSelectedItem();
            case 0:
                return cbSanskrit.getSelectedItem();
            default:
                return null;
        }
    }

    private Map<Integer, String> getIdiomaMap(int index) {
        switch (index) {
            case 1:
                return spanish;
            case 2:
                return english;
            case 0:
                return sanskrit;
            default:
                return Collections.emptyMap();
        }
    }

    private void mostrarTexto(JLabel labelIdioma, JLabel labelOtroIdioma, Map<Integer, String> idioma, Map<Integer, String> otroIdioma, Object opcionSelec, int indiceSeleccionado) {
        String opcionIdioma = idioma.get(indiceSeleccionado);
        String opcionOtroIdioma = otroIdioma.get(indiceSeleccionado);

        labelIdioma.setText(esSeleccion(opcionIdioma) ? "..." : opcionIdioma);
        labelOtroIdioma.setText(esSeleccion(opcionOtroIdioma) ? "..." : opcionOtroIdioma);
    }

    private boolean esSeleccion(String opcion) {
        return "Select".equals(opcion) || "Seleccione".equals(opcion);
    }

    private static int buscarClavePorValor(Map<Integer, String> mapa, Object valorBuscado) {
        for (Map.Entry<Integer, String> entry : mapa.entrySet()) {
            // System.out.println("Comparando: " + entry.getValue() + " con " + valorBuscado);
            if (entry.getValue().equals(valorBuscado)) {
                return entry.getKey();
            }
        }
        return -1;
    }
    

>>>>>>> origin/dev-joel
}
