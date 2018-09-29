package my_cal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Stack;
import javax.swing.Action;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.lang.*;

public class calculator extends javax.swing.JFrame {

    private boolean displayzero;
    private boolean displaydec;

    private double ina;
    private double inb;
    private double out;
    private double pow1, pow2;

    private byte op;

    private double history[] = new double[3];
    DecimalFormat df3 = new DecimalFormat("#.###");
    DecimalFormat df5 = new DecimalFormat("#.#####");
    
    StringBuilder strbuild = new StringBuilder();
    
    public calculator() {
        initComponents();
        time();
        date();
    }

    void date() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("MM-dd-yyyy");
        date.setText(s.format(d));
    }

    void time() {
        new Timer(0, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
                time.setText(s.format(d));
            }
        }).start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        displayone = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        sub = new javax.swing.JButton();
        division = new javax.swing.JButton();
        multiplication = new javax.swing.JButton();
        percentage = new javax.swing.JButton();
        fact = new javax.swing.JButton();
        ce = new javax.swing.JButton();
        sec = new javax.swing.JButton();
        cos = new javax.swing.JButton();
        power = new javax.swing.JButton();
        square = new javax.swing.JButton();
        sin = new javax.swing.JButton();
        cosec = new javax.swing.JButton();
        sqrt = new javax.swing.JButton();
        pi = new javax.swing.JButton();
        equal = new javax.swing.JButton();
        memplus = new javax.swing.JButton();
        memminus = new javax.swing.JButton();
        ms = new javax.swing.JButton();
        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        cube = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        three = new javax.swing.JButton();
        four = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        dot = new javax.swing.JButton();
        backspace = new javax.swing.JButton();
        tan = new javax.swing.JButton();
        log = new javax.swing.JButton();
        plusminus = new javax.swing.JButton();
        displaymem = new javax.swing.JTextField();
        displaytwo = new javax.swing.JTextField();
        onedivide = new javax.swing.JButton();
        cbrt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayhis = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        j1 = new javax.swing.JComboBox();
        cdisone = new javax.swing.JTextField();
        j2 = new javax.swing.JComboBox();
        cdistwo = new javax.swing.JTextField();
        covert = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        j3 = new javax.swing.JComboBox();
        equal1 = new javax.swing.JButton();
        powans = new javax.swing.JButton();
        cot = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        time = new javax.swing.JMenu();
        date = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        displayone.setBackground(new java.awt.Color(199, 218, 220));
        displayone.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        displayone.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        displayone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayoneActionPerformed(evt);
            }
        });

        add.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add.setText("+");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        sub.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        sub.setText("-");
        sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subActionPerformed(evt);
            }
        });

        division.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        division.setText("/");
        division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionActionPerformed(evt);
            }
        });

        multiplication.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        multiplication.setText("*");
        multiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicationActionPerformed(evt);
            }
        });

        percentage.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        percentage.setText("%");
        percentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                percentageActionPerformed(evt);
            }
        });

        fact.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        fact.setText("n!");
        fact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factActionPerformed(evt);
            }
        });

        ce.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ce.setText("CE");
        ce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceActionPerformed(evt);
            }
        });

        sec.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        sec.setText("sec");
        sec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secActionPerformed(evt);
            }
        });

        cos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cos.setText("cos");
        cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosActionPerformed(evt);
            }
        });

        power.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        power.setText("x^y");
        power.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powerActionPerformed(evt);
            }
        });

        square.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        square.setText("x^2");
        square.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareActionPerformed(evt);
            }
        });

        sin.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        sin.setText("sin");
        sin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinActionPerformed(evt);
            }
        });

        cosec.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        cosec.setText("cosec");
        cosec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosecActionPerformed(evt);
            }
        });

        sqrt.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        sqrt.setText("sqrt");
        sqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqrtActionPerformed(evt);
            }
        });

        pi.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        pi.setText("π");
        pi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piActionPerformed(evt);
            }
        });

        equal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        equal.setText("=");
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });

        memplus.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        memplus.setText("M+");
        memplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memplusActionPerformed(evt);
            }
        });

        memminus.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        memminus.setText("M-");
        memminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memminusActionPerformed(evt);
            }
        });

        ms.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ms.setText("MS");
        ms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msActionPerformed(evt);
            }
        });

        one.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        one.setText("1");
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        two.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        two.setText("2");
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        cube.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cube.setText("x^3");
        cube.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cubeActionPerformed(evt);
            }
        });

        zero.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        zero.setText("0");
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        three.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        three.setText("3");
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        four.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        four.setText("4");
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        five.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        five.setText("5");
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });

        six.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        six.setText("6");
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        seven.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        seven.setText("7");
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });

        eight.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        eight.setText("8");
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });

        nine.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        nine.setText("9");
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });

        dot.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        dot.setText(".");
        dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotActionPerformed(evt);
            }
        });

        backspace.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        backspace.setText("<-");
        backspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backspaceActionPerformed(evt);
            }
        });

        tan.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tan.setText("tan");
        tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanActionPerformed(evt);
            }
        });

        log.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        log.setText("log");
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });

        plusminus.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        plusminus.setText("±");
        plusminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusminusActionPerformed(evt);
            }
        });

        displaymem.setBackground(new java.awt.Color(199, 218, 220));
        displaymem.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        displaymem.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        displaymem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displaymemActionPerformed(evt);
            }
        });

        displaytwo.setBackground(new java.awt.Color(199, 218, 220));
        displaytwo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        displaytwo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        displaytwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displaytwoActionPerformed(evt);
            }
        });

        onedivide.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        onedivide.setText("1/x");
        onedivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onedivideActionPerformed(evt);
            }
        });

        cbrt.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cbrt.setText("cbrt");
        cbrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbrtActionPerformed(evt);
            }
        });

        displayhis.setColumns(20);
        displayhis.setRows(5);
        jScrollPane1.setViewportView(displayhis);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("History");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Converter");

        j1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        j1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        j1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j1ActionPerformed(evt);
            }
        });

        cdisone.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        cdisone.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cdisone.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        j2.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        j2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));

        cdistwo.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        cdistwo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cdistwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdistwoActionPerformed(evt);
            }
        });

        covert.setText("Convert");
        covert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                covertActionPerformed(evt);
            }
        });

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        j3.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        j3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select a option", "Mass", "Length", "Temprature" }));
        j3.setMaximumSize(new java.awt.Dimension(134, 29));
        j3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j3ActionPerformed(evt);
            }
        });

        equal1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        equal1.setText("Clear History");
        equal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equal1ActionPerformed(evt);
            }
        });

        powans.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        powans.setText("x^y ans");
        powans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powansActionPerformed(evt);
            }
        });

        cot.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cot.setText("cot");
        cot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cotMouseClicked(evt);
            }
        });
        cot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cotActionPerformed(evt);
            }
        });

        jMenuBar1.setPreferredSize(new java.awt.Dimension(113, 30));

        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItem1.setText("Standard");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItem2.setText("Scientific");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItem3.setText("Graphs");
        jMenu1.add(jMenuItem3);
        jMenu1.add(jSeparator1);

        jMenuItem4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItem4.setText("About");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItem5.setText("Exit");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        time.setText(" Time");
        time.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuBar1.add(time);

        date.setText("Date");
        date.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuBar1.add(date);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(displaytwo, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(displayone, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(238, 238, 238))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(backspace, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(percentage, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                                .addComponent(division, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(plusminus, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(multiplication, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(equal)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(memminus)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(memplus)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(displaymem, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(equal1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(81, 81, 81)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(7, 7, 7))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(three, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                            .addComponent(dot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(six, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(nine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ce, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(12, 12, 12))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(tan, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cot, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cube, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(square))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(log, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(pi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(onedivide, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(fact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(sin)
                                                    .addComponent(cos))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(sec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(cosec, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(power, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(powans))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(sqrt)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(cbrt, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(covert, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(j1, 0, 91, Short.MAX_VALUE)
                                                    .addComponent(j2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(cdisone, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                                    .addComponent(cdistwo)))
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(6, 6, 6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(j3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(1, 1, 1)))))
                        .addContainerGap())))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {add, cos, cube, equal, fact, log, multiplication, onedivide, percentage, pi, power, sin, sqrt, square, tan});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {memminus, memplus, ms});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(displaytwo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(displayone, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(memplus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(memminus, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(displaymem, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(backspace, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nine)
                                            .addComponent(sub))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(four)
                                            .addComponent(six, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(one)
                                            .addComponent(three)
                                            .addComponent(ce, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addComponent(eight)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(five)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(two)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(zero)
                                    .addComponent(dot, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(plusminus, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(multiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(percentage)
                                    .addComponent(division))
                                .addGap(60, 60, 60)
                                .addComponent(add)
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(equal)
                                    .addComponent(equal1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(j1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cdisone, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(j2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cdistwo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(covert, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tan, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cot, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cube)
                                    .addComponent(square))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sin, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sec, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(power)
                                    .addComponent(powans, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cosec)
                                    .addComponent(sqrt)
                                    .addComponent(cbrt, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(log, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pi, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(onedivide, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fact))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {add, cos, cosec, division, equal, fact, percentage, pi, power, sqrt, square, sub});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {backspace, ce, cube, dot, eight, five, four, nine, one, sec, seven, six, three, two, zero});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {memminus, memplus, ms});

        setSize(new java.awt.Dimension(676, 814));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void percentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_percentageActionPerformed

        ina = Double.parseDouble(String.valueOf(displayone.getText()));

        displayone.setText("0");
        displaytwo.setText(String.valueOf(ina) + "%(");

    }//GEN-LAST:event_percentageActionPerformed

    private void multiplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicationActionPerformed
        displayone.setText(displayone.getText() + "*");
    }//GEN-LAST:event_multiplicationActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        displayone.setText(displayone.getText() + "+");
    }//GEN-LAST:event_addActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        displayone.setText(displayone.getText() + "2");
    }//GEN-LAST:event_twoActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        displayone.setText(displayone.getText() + "3");
    }//GEN-LAST:event_threeActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        displayone.setText(displayone.getText() + "4");
    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        displayone.setText(displayone.getText() + "5");
    }//GEN-LAST:event_fiveActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        displayone.setText(displayone.getText() + "6");
    }//GEN-LAST:event_sixActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        displayone.setText(displayone.getText() + "7");
    }//GEN-LAST:event_sevenActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed

        displayone.setText(displayone.getText() + "8");
    }//GEN-LAST:event_eightActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        displayone.setText(displayone.getText() + "9");
    }//GEN-LAST:event_nineActionPerformed

    private void dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotActionPerformed
        if (!displayone.getText().contains(".")) {
            displayone.setText(displayone.getText() + dot.getText());
        }
    }//GEN-LAST:event_dotActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        displayone.setText(displayone.getText() + "0");
    }//GEN-LAST:event_zeroActionPerformed

    private void displayoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayoneActionPerformed

    }//GEN-LAST:event_displayoneActionPerformed

    private void sinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinActionPerformed
        inb = Double.parseDouble(String.valueOf(displayone.getText()));
        double radian = Math.toRadians(inb);
        double sinval = Math.sin(radian);
        String val = df5.format(sinval);
        displayone.setText("sin(" +inb+ ")");
        
        displaytwo.setText(val);
        
        //concatagarise history display
        String str1 = displayhis.getText();
        String str2 = displayone.getText() + "\n---------------------" + "\nAnswer = " + displaytwo.getText()+"\n\n";
        displayhis.setText(str1.concat(str2));

    }//GEN-LAST:event_sinActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        displayone.setText(displayone.getText() + "1");

    }//GEN-LAST:event_oneActionPerformed

    private void cosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosActionPerformed
        inb = Double.parseDouble(String.valueOf(displayone.getText()));
        double radian = Math.toRadians(inb);
        double sinval = Math.cos(radian);
        String val = df5.format(sinval);
        displayone.setText("cos(" +inb+ ")");
        
        displaytwo.setText(val);
        
        //concatagarise history display
        String str1 = displayhis.getText();
        String str2 = displayone.getText() + "\n---------------------" + "\nAnswer = " + displaytwo.getText()+"\n\n";
        displayhis.setText(str1.concat(str2));
    }//GEN-LAST:event_cosActionPerformed

    private void tanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanActionPerformed
        inb = Double.parseDouble(String.valueOf(displayone.getText()));
        double radian = Math.toRadians(inb);
        double sinval = Math.tan(radian);
        String val = df5.format(sinval);
        displayone.setText("tan(" +inb+ ")");
        displaytwo.setText(val);
        
        //concatagarise history display
        String str1 = displayhis.getText();
        String str2 = displayone.getText() + "\n---------------------" + "\nAnswer = " + displaytwo.getText()+"\n\n";
        displayhis.setText(str1.concat(str2));
        
    }//GEN-LAST:event_tanActionPerformed

    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed
        double num = Double.parseDouble(String.valueOf(displayone.getText()));
        num = Math.log(num);
        displaytwo.setText(String.valueOf(num));
        displayone.setText("log(" + num + ")");
        
        String str1 = displayhis.getText();
        String str2 = displayone.getText() + "\n---------------------" + "\nAnswer = " + displaytwo.getText()+"\n\n";
        displayhis.setText(str1.concat(str2));
        
        
    }//GEN-LAST:event_logActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.setResizable(false);
        this.setSize(658, 557);
    }//GEN-LAST:event_formWindowActivated

    private void plusminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusminusActionPerformed
        double num = Double.parseDouble(String.valueOf(displayone.getText()));
        num = num * (-1);
        displayone.setText(String.valueOf(num));

    }//GEN-LAST:event_plusminusActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.setResizable(false);
        this.setSize(658, 557);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.setResizable(false);
        this.setSize(658, 800);

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void ceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceActionPerformed
        displayone.setText("");
        displaytwo.setText("");
    }//GEN-LAST:event_ceActionPerformed

    private void backspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backspaceActionPerformed
        String backsp = null;

        int length = displayone.getText().length();
        int number = displayone.getText().length() - 1;

        if (length > 0) {
            StringBuilder sb = new StringBuilder(displayone.getText());
            sb.deleteCharAt(number);
            backsp = sb.toString();
            displayone.setText(backsp);
        }
    }//GEN-LAST:event_backspaceActionPerformed

    private void sqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sqrtActionPerformed
        double num = Double.parseDouble(String.valueOf(displayone.getText()));
        out = Math.sqrt(num);
        
        if (num > 0) {
            displayone.setText("sqrt(" + String.valueOf(num)+")");
            displaytwo.setText(String.valueOf(out));
        }
        else {
            JOptionPane.showMessageDialog(null, "Please enter positive numbers!");
        }

        //concatagarise history display
        String str1 = displayhis.getText();
        String str2 = displayone.getText() +"^2"+ "\n---------------------" + "\nAnswer = " + displaytwo.getText()+"\n\n";
        displayhis.setText(str1.concat(str2));
    }//GEN-LAST:event_sqrtActionPerformed

    private void squareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareActionPerformed
        double num = Double.parseDouble(String.valueOf(displayone.getText()));
        num = Math.pow(num, 2);
        displaytwo.setText(String.valueOf(num));
        
        //concatagarise history display
        String str1 = displayhis.getText();
        String str2 = displayone.getText() + "\n---------------------" + "\nAnswer = " + displaytwo.getText()+"\n\n";
        displayhis.setText(str1.concat(str2));
        
    }//GEN-LAST:event_squareActionPerformed

    private void displaymemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displaymemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_displaymemActionPerformed

    private void displaytwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displaytwoActionPerformed
        int i;
        for (i = 0; i < 5; i++) {
            history[i] = Double.parseDouble(String.valueOf(displaytwo.getText()));
        }
    }//GEN-LAST:event_displaytwoActionPerformed

    private void powerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powerActionPerformed

        displaytwo.setText(String.valueOf(displayone.getText()));

        displayone.setText(null);
    }//GEN-LAST:event_powerActionPerformed

    private void cubeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cubeActionPerformed
        double num = Double.parseDouble(String.valueOf(displayone.getText()));
        num = Math.pow(num, 3);
        displaytwo.setText(String.valueOf(num));
        //concatagarise history display
        String str1 = displayhis.getText();
        String str2 = displayone.getText() +"^3" + "\n---------------------" + "\nAnswer = " + displaytwo.getText()+"\n\n";
        displayhis.setText(str1.concat(str2));
    }//GEN-LAST:event_cubeActionPerformed

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalActionPerformed
        Scanner scan = new Scanner(displayone.getText());
        /* Create stacks for operators and operands */

        Stack<Integer> op = new Stack<Integer>();

        Stack<Double> val = new Stack<Double>();
        /* Create temporary stacks for operators and operands */

        Stack<Integer> optmp = new Stack<Integer>();

        Stack<Double> valtmp = new Stack<Double>();
        /* Accept expression */

        System.out.println("Evaluation Of Arithmetic Expression Using Stacks Test\n");
        System.out.println("Enter expression\n");
        String input = scan.next();
        input = "0" + input;
        input = input.replaceAll("-", "+-");
        /* Store operands and operators in respective stacks */
        String temp = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '-') {
                temp = "-" + temp;
            }
            else if (ch != '+' && ch != '*' && ch != '/') {
                temp = temp + ch;
            }
            else {
                val.push(Double.parseDouble(temp));
                op.push((int) ch);
                temp = "";
            }
        }
        val.push(Double.parseDouble(temp));
        /* Create char array of operators as per precedence */
        /* -ve sign is already taken care of while storing */
        char operators[] = {'/', '*', '+'};
        /* Evaluation of expression */
        for (int i = 0; i < 3; i++) {
            boolean it = false;
            while (!op.isEmpty()) {
                int optr = op.pop();
                double v1 = val.pop();
                double v2 = val.pop();
                if (optr == operators[i]) {
                    /* if operator matches evaluate and store in temporary stack */
                    if (i == 0) {
                        valtmp.push(v2 / v1);
                        it = true;
                        break;
                    }
                    else if (i == 1) {
                        valtmp.push(v2 * v1);
                        it = true;
                        break;
                    }
                    else if (i == 2) {
                        valtmp.push(v2 + v1);
                        it = true;
                        break;
                    }
                }
                else {
                    valtmp.push(v1);
                    val.push(v2);
                    optmp.push(optr);
                }
            }
            /* Push back all elements from temporary stacks to main stacks */
            while (!valtmp.isEmpty()) {
                val.push(valtmp.pop());
            }
            while (!optmp.isEmpty()) {
                op.push(optmp.pop());
            }
            /* Iterate again for same opertor */
            if (it) {
                i--;
            }
        }

        double x = val.pop();
        displaytwo.setText(Double.toString(x));
        
        //concatagarise history display
        String str1 = displayhis.getText();
        String str2 = displayone.getText() + "\n---------------------" + "\nAnswer = " + displaytwo.getText()+"\n\n";
        displayhis.setText(str1.concat(str2));

    }//GEN-LAST:event_equalActionPerformed

    private void msActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msActionPerformed
        String mem = String.valueOf(displaymem.getText());

        if (!"0".equals(mem)) {
            displayone.setText(String.valueOf(displayone.getText() + displaymem.getText()));
        }
        else {
            displayone.setText(String.valueOf(displayone.getText()));
        }
    }//GEN-LAST:event_msActionPerformed

    private void memminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memminusActionPerformed

        displaymem.setText("0");
    }//GEN-LAST:event_memminusActionPerformed

    private void memplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memplusActionPerformed

        Double d = Double.parseDouble(displaytwo.getText());
        displaymem.setText(df3.format(d));

    }//GEN-LAST:event_memplusActionPerformed

    private void onedivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onedivideActionPerformed
        inb = Double.parseDouble(displayone.getText());
        ina = 1/inb;
        displaytwo.setText(String.valueOf(ina));
        
        displayone.setText("1/" + String.valueOf(inb));
        //concatagarise history display
        String str1 = displayhis.getText();
        String str2 = "1/"+displayone.getText() + "\n---------------------" + "\nAnswer = " + displaytwo.getText()+"\n\n";
        displayhis.setText(str1.concat(str2));
    }//GEN-LAST:event_onedivideActionPerformed

    private void piActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piActionPerformed
        double pi = Math.PI;
        String val = df5.format(pi);
        
        displayone.setText(displayone.getText()+ val);
    }//GEN-LAST:event_piActionPerformed

    private void cbrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbrtActionPerformed
        inb = Double.parseDouble(displayone.getText());
        out = Math.cbrt(inb);

        if (inb > 0) {
            displayone.setText("cbrt(" + String.valueOf(inb)+")");
            displaytwo.setText(String.valueOf(out));
        }
        else {
            JOptionPane.showMessageDialog(null, "Please enter positive numbers!");
        }
        //concatagarise history display
        String str1 = displayhis.getText();
        String str2 = displayone.getText() + "\n---------------------" + "\nAnswer = " + displaytwo.getText()+"\n\n";
        displayhis.setText(str1.concat(str2));

    }//GEN-LAST:event_cbrtActionPerformed

    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed
        displayone.setText(displayone.getText() + "-");

    }//GEN-LAST:event_subActionPerformed

    private void divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionActionPerformed
        displayone.setText(displayone.getText() + "/");
    }//GEN-LAST:event_divisionActionPerformed

    private void factActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factActionPerformed
        int factnum = Integer.parseInt(displayone.getText());
        int fact = 1;
        if (factnum == 1 || factnum == 0) {
            displaytwo.setText("1");
        }
        else {
            for (int i = 1; i <= factnum; i++) {
                fact = fact * i;
            }
            displaytwo.setText(Double.toString(fact));
        }
        
        String str1 = displayhis.getText();
        String str2 = displayone.getText() + "\n---------------------" + "\nAnswer = " + displaytwo.getText()+"\n\n";
        displayhis.setText(str1.concat(str2));
    }//GEN-LAST:event_factActionPerformed

    private void secActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secActionPerformed
        inb = Double.parseDouble(String.valueOf(displayone.getText()));
        double radian = Math.toRadians(inb);
        double sinval = Math.cos(radian);
        double sec = 1/sinval;
        String val = df5.format(sec);
        displayone.setText("sec(" +inb+ ")");
        
        displaytwo.setText(val);
        
        //concatagarise history display
        String str1 = displayhis.getText();
        String str2 = displayone.getText() + "\n---------------------" + "\nAnswer = " + displaytwo.getText()+"\n\n";
        displayhis.setText(str1.concat(str2));
    }//GEN-LAST:event_secActionPerformed

    private void cdistwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdistwoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cdistwoActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        cdisone.setText("");
        cdistwo.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void covertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_covertActionPerformed

        if (j3.getSelectedItem() == "Select a option" && j1.getSelectedItem() == "Select" && j2.getSelectedItem() == "Select") {

            JOptionPane.showMessageDialog(null, "Select Options Correctly");
        }
        else {
            Double num1 = Double.parseDouble(cdisone.getText());
            double n3 = 0;

            if (j1.getSelectedItem().equals("Metre")) {
                if (j2.getSelectedItem().equals("Metre")) {
                    cdistwo.setText(Double.toString(num1 * 1));
                }
                else if (j2.getSelectedItem().equals("Kilo metre")) {
                    cdistwo.setText(Double.toString(num1 * 0.001));
                }
                else if (j2.getSelectedItem().equals("Mile")) {
                    cdistwo.setText(Double.toString(num1 * 0.00062137));
                }
                else if (j2.getSelectedItem().equals("Yard")) {
                    cdistwo.setText(Double.toString(num1 * 1.09361));
                }
                else if (j2.getSelectedItem().equals("Feet")) {
                    cdistwo.setText(Double.toString(num1 * 3.28084));
                }
                else if (j2.getSelectedItem().equals("Inch")) {
                    cdistwo.setText(Double.toString(num1 * 39.3701));
                }
            }
            else if (j1.getSelectedItem().equals("Kilo metre")) {
                if (j2.getSelectedItem().equals("Metre")) {
                    cdistwo.setText(Double.toString(num1 * 0.001));
                }
                else if (j2.getSelectedItem().equals("Kilo metre")) {
                    cdistwo.setText(Double.toString(num1 * 1));
                }
                else if (j2.getSelectedItem().equals("Mile")) {
                    cdistwo.setText(Double.toString(num1 * 0.62137));
                }
                else if (j2.getSelectedItem().equals("Yard")) {
                    cdistwo.setText(Double.toString(num1 * 1093.61));
                }
                else if (j2.getSelectedItem().equals("Feet")) {
                    cdistwo.setText(Double.toString(num1 * 3280.84));
                }
                else if (j2.getSelectedItem().equals("Inch")) {
                    cdistwo.setText(Double.toString(num1 * 39370.1));
                }
            }
            else if (j1.getSelectedItem().equals("Mile")) {
                if (j2.getSelectedItem().equals("Metre")) {
                    cdistwo.setText(Double.toString(num1 * 1609.34));
                }
                else if (j2.getSelectedItem().equals("Kilo metre")) {
                    cdistwo.setText(Double.toString(num1 * 1.60934));
                }
                else if (j2.getSelectedItem().equals("Mile")) {
                    cdistwo.setText(Double.toString(num1 * 1));
                }
                else if (j2.getSelectedItem().equals("Yard")) {
                    cdistwo.setText(Double.toString(num1 * 1760));
                }
                else if (j2.getSelectedItem().equals("Feet")) {
                    cdistwo.setText(Double.toString(num1 * 5280));
                }
                else if (j2.getSelectedItem().equals("Inch")) {
                    cdistwo.setText(Double.toString(num1 * 63360));
                }
            }
            else if (j1.getSelectedItem().equals("Yard")) {
                if (j2.getSelectedItem().equals("Metre")) {
                    cdistwo.setText(Double.toString(num1 * 0.9144));
                }
                else if (j2.getSelectedItem().equals("Kilo metre")) {
                    cdistwo.setText(Double.toString(num1 * 0.0009144));
                }
                else if (j2.getSelectedItem().equals("Mile")) {
                    cdistwo.setText(Double.toString(num1 * 0.0005681));
                }
                else if (j2.getSelectedItem().equals("Yard")) {
                    cdistwo.setText(Double.toString(num1 * 1));
                }
                else if (j2.getSelectedItem().equals("Feet")) {
                    cdistwo.setText(Double.toString(num1 * 3));
                }
                else if (j2.getSelectedItem().equals("Inch")) {
                    cdistwo.setText(Double.toString(num1 * 36));
                }
            }
            else if (j1.getSelectedItem().equals("Feet")) {
                if (j2.getSelectedItem().equals("Metre")) {
                    cdistwo.setText(Double.toString(num1 * 0.3048));
                }
                else if (j2.getSelectedItem().equals("Kilo metre")) {
                    cdistwo.setText(Double.toString(num1 * 0.0003048));
                }
                else if (j2.getSelectedItem().equals("Mile")) {
                    cdistwo.setText(Double.toString(num1 * 0.0001893));
                }
                else if (j2.getSelectedItem().equals("Yard")) {
                    cdistwo.setText(Double.toString(num1 * 0.3333333));
                }
                else if (j2.getSelectedItem().equals("Feet")) {
                    cdistwo.setText(Double.toString(num1 * 1));
                }
                else if (j2.getSelectedItem().equals("Inch")) {
                    cdistwo.setText(Double.toString(num1 * 12));
                }
            }
            else if (j1.getSelectedItem().equals("Inch")) {
                if (j2.getSelectedItem().equals("Metre")) {
                    cdistwo.setText(Double.toString(num1 * 0.0254));
                }
                else if (j2.getSelectedItem().equals("Kilo metre")) {
                    cdistwo.setText(Double.toString(num1 * 0.0000254));
                }
                else if (j2.getSelectedItem().equals("Mile")) {
                    cdistwo.setText(Double.toString(num1 * 0.00062137));
                }
                else if (j2.getSelectedItem().equals("Yard")) {
                    cdistwo.setText(Double.toString(num1 * 0.0277778));
                }
                else if (j2.getSelectedItem().equals("Feet")) {
                    cdistwo.setText(Double.toString(num1 * 0.0833333));
                }
                else if (j2.getSelectedItem().equals("Inch")) {
                    cdistwo.setText(Double.toString(num1 * 1));
                }
            }
            else if (j1.getSelectedItem().equals("Gram")) {
                if (j2.getSelectedItem().equals("Gram")) {
                    cdistwo.setText(Double.toString(num1 * 1));
                }
                else if (j2.getSelectedItem().equals("Kilogram")) {
                    cdistwo.setText(Double.toString(num1 * 0.0001));
                }
                else if (j2.getSelectedItem().equals("Pound")) {
                    cdistwo.setText(Double.toString(num1 * 0.0022046));
                }
                else if (j2.getSelectedItem().equals("Ton")) {
                    cdistwo.setText(Double.toString(num1 * 0.0000001));
                }
                else if (j2.getSelectedItem().equals("Ounce")) {
                    cdistwo.setText(Double.toString(num1 * 0.035274));
                }
            }
            else if (j1.getSelectedItem().equals("Kilogram")) {
                if (j2.getSelectedItem().equals("Gram")) {
                    cdistwo.setText(Double.toString(num1 * 1000));
                }
                else if (j2.getSelectedItem().equals("Kilogram")) {
                    cdistwo.setText(Double.toString(num1 * 1));
                }
                else if (j2.getSelectedItem().equals("Pound")) {
                    cdistwo.setText(Double.toString(num1 * 2.2046));
                }
                else if (j2.getSelectedItem().equals("Ton")) {
                    cdistwo.setText(Double.toString(num1 * 0.001));
                }
                else if (j2.getSelectedItem().equals("Ounce")) {
                    cdistwo.setText(Double.toString(num1 * 3.5274));
                }
            }
            else if (j1.getSelectedItem().equals("Pound")) {
                if (j2.getSelectedItem().equals("Gram")) {
                    cdistwo.setText(Double.toString(num1 * 453.592));
                }
                else if (j2.getSelectedItem().equals("Kilogram")) {
                    cdistwo.setText(Double.toString(num1 * 0.453592));
                }
                else if (j2.getSelectedItem().equals("Pound")) {
                    cdistwo.setText(Double.toString(num1 * 1));
                }
                else if (j2.getSelectedItem().equals("Ton")) {
                    cdistwo.setText(Double.toString(num1 * 0.0004535));
                }
                else if (j2.getSelectedItem().equals("Ounce")) {
                    cdistwo.setText(Double.toString(num1 * 16));
                }
            }
            else if (j1.getSelectedItem().equals("Ton")) {
                if (j2.getSelectedItem().equals("Gram")) {
                    cdistwo.setText(Double.toString(num1 * 1000000));
                }
                else if (j2.getSelectedItem().equals("Kilogram")) {
                    cdistwo.setText(Double.toString(num1 * 1000));
                }
                else if (j2.getSelectedItem().equals("Pound")) {
                    cdistwo.setText(Double.toString(num1 * 2204.62));
                }
                else if (j2.getSelectedItem().equals("Ton")) {
                    cdistwo.setText(Double.toString(num1 * 1));
                }
                else if (j2.getSelectedItem().equals("Ounce")) {
                    cdistwo.setText(Double.toString(num1 * 35274));
                }
            }
            else if (j1.getSelectedItem().equals("Ounce")) {
                if (j2.getSelectedItem().equals("Gram")) {
                    cdistwo.setText(Double.toString(num1 * 28.3495));
                }
                else if (j2.getSelectedItem().equals("Kilogram")) {
                    cdistwo.setText(Double.toString(num1 * 0.0283495));
                }
                else if (j2.getSelectedItem().equals("Pound")) {
                    cdistwo.setText(Double.toString(num1 * 0.0625));
                }
                else if (j2.getSelectedItem().equals("Ton")) {
                    cdistwo.setText(Double.toString(num1 * 0.0000283));
                }
                else if (j2.getSelectedItem().equals("Ounce")) {
                    cdistwo.setText(Double.toString(num1 * 1));
                }
            }
            else if (j1.getSelectedItem().equals("Celsius")) {
                if (j2.getSelectedItem().equals("Celsius")) {
                    cdistwo.setText(Double.toString(num1 * 1));
                }
                else if (j2.getSelectedItem().equals("Fahrenheit")) {
                    cdistwo.setText(Double.toString((num1 * 9 / 5) + 32));
                }
                else if (j2.getSelectedItem().equals("Kelvin")) {
                    cdistwo.setText(Double.toString(num1 + 274.15));
                }
            }
            else if (j1.getSelectedItem().equals("Fahrenheit")) {
                if (j2.getSelectedItem().equals("Celsius")) {
                    cdistwo.setText(Double.toString((num1 - 32) * 5 / 9));
                }
                else if (j2.getSelectedItem().equals("Fahrenheit")) {
                    cdistwo.setText(Double.toString(num1 * 1));
                }
                else if (j2.getSelectedItem().equals("Kelvin")) {
                    cdistwo.setText(Double.toString((num1 + 459.67) * 5 / 9));
                }
            }
            else if (j1.getSelectedItem().equals("Kelvin")) {
                if (j2.getSelectedItem().equals("Celsius")) {
                    cdistwo.setText(Double.toString(num1 - 274.15));
                }
                else if (j2.getSelectedItem().equals("Fahrenheit")) {
                    cdistwo.setText(Double.toString((num1 * 9 / 5) - 459.67));
                }
                else if (j2.getSelectedItem().equals("Kelvin")) {
                    cdistwo.setText(Double.toString(num1 * 1));
                }
            }
        }
    }//GEN-LAST:event_covertActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void j3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j3ActionPerformed
        String item = null;
        String String = item;

        if (j3.getSelectedItem() == "Length") {

            j1.removeAllItems();
            j2.removeAllItems();

            item = "Metre";
            j1.addItem(item);
            item = "Kilo metre";
            j1.addItem(item);
            item = "Mile";
            j1.addItem(item);
            item = "Yard";
            j1.addItem(item);
            item = "Feet";
            j1.addItem(item);
            item = "Inch";
            j1.addItem(item);

            item = "Metre";
            j2.addItem(item);
            item = "Kilo metre";
            j2.addItem(item);
            item = "Mile";
            j2.addItem(item);
            item = "Yard";
            j2.addItem(item);
            item = "Feet";
            j2.addItem(item);
            item = "Inch";
            j2.addItem(item);
        }
        else if (j3.getSelectedItem() == "Mass") {

            j1.removeAllItems();
            j2.removeAllItems();

            item = "Gram";
            j1.addItem(item);
            item = "Kilogram";
            j1.addItem(item);
            item = "Pound";
            j1.addItem(item);
            item = "Ton";
            j1.addItem(item);
            item = "Ounce";
            j1.addItem(item);

            item = "Gram";
            j2.addItem(item);
            item = "Kilogram";
            j2.addItem(item);
            item = "Pound";
            j2.addItem(item);
            item = "Ton";
            j2.addItem(item);
            item = "Ounce";
            j2.addItem(item);
        }
        else if (j3.getSelectedItem() == "Temprature") {

            j1.removeAllItems();
            j2.removeAllItems();

            item = "Celsius";
            j2.addItem(item);
            item = "Fahrenheit";
            j2.addItem(item);
            item = "Kelvin";
            j2.addItem(item);

            item = "Celsius";
            j1.addItem(item);
            item = "Fahrenheit";
            j1.addItem(item);
            item = "Kelvin";
            j1.addItem(item);
        }
    }//GEN-LAST:event_j3ActionPerformed

    private void equal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equal1ActionPerformed
        displayhis.setText(null);
    }//GEN-LAST:event_equal1ActionPerformed

    private void j1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j1ActionPerformed

    private void powansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powansActionPerformed
        pow1 = Double.parseDouble(String.valueOf(displaytwo.getText()));
        pow2 = Double.parseDouble(String.valueOf(displayone.getText()));
        double powans = Math.pow(pow1, pow2);
       // displayhis.setText(String.valueOf(displaymem.getText() + displaytwo.getText() + "^" + displayone.getText() + "\n---------------------" + "\nAnswer = " + Double.toString(powans)));
        //concatagarise history display
        String str1 = displayhis.getText();
        String str2 = displaytwo.getText() + "^"+ displayone.getText()+ "\n---------------------" + "\nAnswer = " + powans+"\n\n";
        displayhis.setText(str1.concat(str2));
        
        displaytwo.setText(null);
        displayone.setText(Double.toString(powans));
        
        
    }//GEN-LAST:event_powansActionPerformed

    private void cotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cotActionPerformed
        inb = Double.parseDouble(String.valueOf(displayone.getText()));
        double radian = Math.toRadians(inb);
        double sinval = Math.tan(radian);
        double cot = 1/sinval;
        String val = df5.format(cot);
        displayone.setText("cot(" +inb+ ")");
        
        displaytwo.setText(val);
        
        //concatagarise history display
        String str1 = displayhis.getText();
        String str2 = displayone.getText() + "\n---------------------" + "\nAnswer = " + displaytwo.getText()+"\n\n";
        displayhis.setText(str1.concat(str2));
    }//GEN-LAST:event_cotActionPerformed

    private void cotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cotMouseClicked

    }//GEN-LAST:event_cotMouseClicked

    private void cosecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosecActionPerformed
        inb = Double.parseDouble(String.valueOf(displayone.getText()));
        double radian = Math.toRadians(inb);
        double sinval = Math.sin(radian);
        double cosec = 1/sinval;
        String val = df5.format(cosec);
        displayone.setText("cosec(" +inb+ ")");
        
        displaytwo.setText(val);
        
        //concatagarise history display
        String str1 = displayhis.getText();
        String str2 = displayone.getText() + "\n---------------------" + "\nAnswer = " + displaytwo.getText()+"\n\n";
        displayhis.setText(str1.concat(str2));
    }//GEN-LAST:event_cosecActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        JOptionPane.showMessageDialog(null, "Created by : Sachin TS Muthumala \nemail : sachintsmuthumala@gmail.com \nfacebook: https://www.facebook.com/sachin.muthumala");
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton backspace;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cbrt;
    private javax.swing.JTextField cdisone;
    private javax.swing.JTextField cdistwo;
    private javax.swing.JButton ce;
    private javax.swing.JButton cos;
    private javax.swing.JButton cosec;
    private javax.swing.JButton cot;
    private javax.swing.JButton covert;
    private javax.swing.JButton cube;
    private javax.swing.JMenu date;
    private javax.swing.JTextArea displayhis;
    private javax.swing.JTextField displaymem;
    private javax.swing.JTextField displayone;
    private javax.swing.JTextField displaytwo;
    private javax.swing.JButton division;
    private javax.swing.JButton dot;
    private javax.swing.JButton eight;
    private javax.swing.JButton equal;
    private javax.swing.JButton equal1;
    private javax.swing.JButton fact;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JComboBox j1;
    private javax.swing.JComboBox j2;
    private javax.swing.JComboBox j3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JButton log;
    private javax.swing.JButton memminus;
    private javax.swing.JButton memplus;
    private javax.swing.JButton ms;
    private javax.swing.JButton multiplication;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton onedivide;
    private javax.swing.JButton percentage;
    private javax.swing.JButton pi;
    private javax.swing.JButton plusminus;
    private javax.swing.JButton powans;
    private javax.swing.JButton power;
    private javax.swing.JButton reset;
    private javax.swing.JButton sec;
    private javax.swing.JButton seven;
    private javax.swing.JButton sin;
    private javax.swing.JButton six;
    private javax.swing.JButton sqrt;
    private javax.swing.JButton square;
    private javax.swing.JButton sub;
    private javax.swing.JButton tan;
    private javax.swing.JButton three;
    private javax.swing.JMenu time;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables

}
