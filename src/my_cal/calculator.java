package my_cal;

import javafx.print.PaperSource;

public class calculator extends javax.swing.JFrame {
    
    double firstnum;
    double secondnum;
    double value;
    String operations;
    private Object math;
    
    private boolean displayzero;
    private boolean displaydec;
    
    public calculator() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        displayone = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        sub = new javax.swing.JButton();
        division = new javax.swing.JButton();
        multiplication = new javax.swing.JButton();
        percentage = new javax.swing.JButton();
        fact = new javax.swing.JButton();
        ce = new javax.swing.JButton();
        c = new javax.swing.JButton();
        cosin = new javax.swing.JButton();
        power = new javax.swing.JButton();
        square = new javax.swing.JButton();
        sin = new javax.swing.JButton();
        mod = new javax.swing.JButton();
        sqrt = new javax.swing.JButton();
        rightbrack = new javax.swing.JButton();
        leftbrack = new javax.swing.JButton();
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
        downhistoy = new javax.swing.JButton();
        uphistory = new javax.swing.JButton();
        plusminus = new javax.swing.JButton();
        display1 = new javax.swing.JTextField();
        displaytwo = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

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

        division.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        division.setText("/");

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

        ce.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ce.setText("CE");
        ce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceActionPerformed(evt);
            }
        });

        c.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        c.setText("C");

        cosin.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cosin.setText("cosin");
        cosin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosinActionPerformed(evt);
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
        square.setText("2^x");
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

        mod.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        mod.setText("Mod");

        sqrt.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        sqrt.setText("sqrt");
        sqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqrtActionPerformed(evt);
            }
        });

        rightbrack.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rightbrack.setText(")");
        rightbrack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightbrackActionPerformed(evt);
            }
        });

        leftbrack.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        leftbrack.setText("(");
        leftbrack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftbrackActionPerformed(evt);
            }
        });

        pi.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        pi.setText("π");

        equal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        equal.setText("=");
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });

        memplus.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        memplus.setText("M+");

        memminus.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        memminus.setText("M-");

        ms.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ms.setText("MS");

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
        cube.setText("3^x");
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

        downhistoy.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        downhistoy.setText("˅");
        downhistoy.setAlignmentX(0.5F);
        downhistoy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downhistoyActionPerformed(evt);
            }
        });

        uphistory.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        uphistory.setText("˄");

        plusminus.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        plusminus.setText("±");
        plusminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusminusActionPerformed(evt);
            }
        });

        display1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        display1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        display1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                display1ActionPerformed(evt);
            }
        });

        displaytwo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        displaytwo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        displaytwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displaytwoActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Standard");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText(" Scientific");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 24, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(four)
                                    .addComponent(one)
                                    .addComponent(plusminus, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(zero)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dot, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(equal))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(five)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(six, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(two)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(three)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(add)
                                            .addComponent(sub)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(seven)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eight)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nine)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(multiplication, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(leftbrack)
                                            .addComponent(sin))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(pi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(rightbrack, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(division, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(percentage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(sqrt)
                                            .addComponent(mod)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cosin)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(log, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(square))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(71, 71, 71)
                                        .addComponent(power, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cube))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(backspace, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ce, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(139, 139, 139)
                                .addComponent(downhistoy, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(uphistory, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(displayone, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(memminus)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(memplus)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(display1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(displaytwo, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)
                        .addComponent(tan, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {add, cosin, division, equal, fact, leftbrack, mod, multiplication, power, sin, sqrt, square, sub});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cube, eight, five, four, memminus, memplus, ms, nine, one, seven, six, three, two, zero});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(displayone, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(displaytwo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(display1)
                            .addComponent(memminus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(memplus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ce)
                                    .addComponent(c)
                                    .addComponent(backspace, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(uphistory, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(downhistoy, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(seven)
                                    .addComponent(eight)
                                    .addComponent(nine)
                                    .addComponent(multiplication))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(four)
                                    .addComponent(six, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(five)
                                    .addComponent(sub))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(one)
                                    .addComponent(two)
                                    .addComponent(three)
                                    .addComponent(add))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(zero)
                                    .addComponent(dot, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(equal)
                                    .addComponent(plusminus, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(power)
                                    .addComponent(cube))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cosin)
                                    .addComponent(log, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fact)
                                    .addComponent(square))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sin, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pi, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(percentage)
                                    .addComponent(sqrt))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(leftbrack)
                                    .addComponent(rightbrack)
                                    .addComponent(division)
                                    .addComponent(mod))))
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(tan, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {add, c, ce, cosin, division, equal, fact, leftbrack, mod, multiplication, percentage, pi, power, rightbrack, sqrt, square, sub});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cube, eight, five, four, nine, one, seven, six, three, two, zero});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void percentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_percentageActionPerformed

    }//GEN-LAST:event_percentageActionPerformed

    private void multiplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicationActionPerformed

    }//GEN-LAST:event_multiplicationActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed

    }//GEN-LAST:event_addActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        if(!displayzero && !displaydec){
            displayone.setText(null);
            
        }
        displayone.setText(displayone.getText() + "2");
        displayzero = true;
    }//GEN-LAST:event_twoActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        if(!displayzero && !displaydec){
            displayone.setText(null);
        }
        displayone.setText(displayone.getText() + "3");
        displayzero = true;
       
    }//GEN-LAST:event_threeActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        if(!displayzero && !displaydec){
            displayone.setText(null);
            
        }
        displayone.setText(displayone.getText() + "4");
        displayzero = true;
        

    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        if(!displayzero && !displaydec){
            displayone.setText(null);
            
        }
        displayone.setText(displayone.getText() + "5");
        displayzero = true;        
        
    
    }//GEN-LAST:event_fiveActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        if(!displayzero && !displaydec){
            displayone.setText(null);
            
        }
        displayone.setText(displayone.getText() + "6");
        displayzero = true;
        
      

    }//GEN-LAST:event_sixActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        if(!displayzero && !displaydec){
            displayone.setText(null);
            
        }
        displayone.setText(displayone.getText() + "7");
        displayzero = true;
    
        
    }//GEN-LAST:event_sevenActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
        if(!displayzero && !displaydec){
            displayone.setText(null);
            
        }
        displayone.setText(displayone.getText() + "8");
        displayzero = true;
        
    }//GEN-LAST:event_eightActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        if(!displayzero && !displaydec){
            displayone.setText(null);
            
        }
        displayone.setText(displayone.getText() + "9");
        displayzero = true;
   
    }//GEN-LAST:event_nineActionPerformed

    private void dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotActionPerformed
        if(!displayone.getText().contains("."))
        {
            displayone.setText(displayone.getText()+dot.getText());
        }
    }//GEN-LAST:event_dotActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        if(!displayzero && !displaydec){
            displayone.setText(null);
            
        }
        displayone.setText(displayone.getText() + "0");
        displayzero = true;
                
      
    }//GEN-LAST:event_zeroActionPerformed

    private void displayoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayoneActionPerformed
        this.setResizable(true);
    }//GEN-LAST:event_displayoneActionPerformed

    private void downhistoyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downhistoyActionPerformed

    }//GEN-LAST:event_downhistoyActionPerformed

    private void leftbrackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftbrackActionPerformed
        displayone.setText("(");

    }//GEN-LAST:event_leftbrackActionPerformed

    private void rightbrackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightbrackActionPerformed
        displayone.setText(")");
     
    }//GEN-LAST:event_rightbrackActionPerformed

    private void sinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinActionPerformed
        double num = Double.parseDouble(String.valueOf(displayone.getText()));
        num = Math.sin(num);
        displaytwo.setText(String.valueOf(num));        
    }//GEN-LAST:event_sinActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        if(!displayzero && !displaydec){
            displayone.setText(null);
            
        }
        displayone.setText(displayone.getText() + "1");
        displayzero = true;
        
 
    }//GEN-LAST:event_oneActionPerformed

    private void cosinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosinActionPerformed
        double num = Double.parseDouble(String.valueOf(displayone.getText()));
        num = Math.cos(num);
        displaytwo.setText(String.valueOf(num));
    }//GEN-LAST:event_cosinActionPerformed

    private void tanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanActionPerformed
        double num = Double.parseDouble(String.valueOf(displayone.getText()));
        num = Math.tan(num);
        displaytwo.setText(String.valueOf(num));
    }//GEN-LAST:event_tanActionPerformed

    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed
        double num = Double.parseDouble(String.valueOf(displayone.getText()));
        num = Math.log(num);
        displaytwo.setText(String.valueOf(num));
    }//GEN-LAST:event_logActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.setResizable(true);
        this.setSize(325, 420);
    }//GEN-LAST:event_formWindowActivated

    private void plusminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusminusActionPerformed
        double num = Double.parseDouble(String.valueOf(displayone.getText()));
        num = num*(-1);
        displaytwo.setText(String.valueOf(num));
        
    }//GEN-LAST:event_plusminusActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.setResizable(true);
        this.setSize(325, 500);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.setResizable(true);
        this.setSize(620,420);
        displaytwo.setSize(576, 55);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void ceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceActionPerformed
        displayone.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_ceActionPerformed

    private void backspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backspaceActionPerformed
        String backsp = null;
        
        if(displayone.getText().length() > 0)
        {
            StringBuilder sb = new StringBuilder(displayone.getText());
            sb.deleteCharAt(displayone.getText().length());
            backsp = sb.toString();
            displayone.setText(backsp);
        }
    }//GEN-LAST:event_backspaceActionPerformed

    private void sqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sqrtActionPerformed
        double num = Double.parseDouble(String.valueOf(displayone.getText()));
        num = Math.sqrt(num);
        displaytwo.setText(String.valueOf(num));
    }//GEN-LAST:event_sqrtActionPerformed

    private void squareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareActionPerformed
        double num = Double.parseDouble(String.valueOf(displayone.getText()));
        num = Math.pow(num, 2);
        displaytwo.setText(String.valueOf(num));
    }//GEN-LAST:event_squareActionPerformed

    private void display1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_display1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_display1ActionPerformed

    private void displaytwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displaytwoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_displaytwoActionPerformed

    private void powerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powerActionPerformed
        double num = Double.parseDouble(String.valueOf(displayone.getText()));
        num = Math.pow(num, num);
        displaytwo.setText(String.valueOf(num));
    }//GEN-LAST:event_powerActionPerformed

    private void cubeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cubeActionPerformed
        double num = Double.parseDouble(String.valueOf(displayone.getText()));
        num = Math.pow(num, 3);
        displaytwo.setText(String.valueOf(num));
    }//GEN-LAST:event_cubeActionPerformed

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalActionPerformed
        //displaytwo.setText(String.valueOf(num));
    }//GEN-LAST:event_equalActionPerformed

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
    private javax.swing.JButton c;
    private javax.swing.JButton ce;
    private javax.swing.JButton cosin;
    private javax.swing.JButton cube;
    private javax.swing.JTextField display1;
    private javax.swing.JTextField displayone;
    private javax.swing.JTextField displaytwo;
    private javax.swing.JButton division;
    private javax.swing.JButton dot;
    private javax.swing.JButton downhistoy;
    private javax.swing.JButton eight;
    private javax.swing.JButton equal;
    private javax.swing.JButton fact;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JButton leftbrack;
    private javax.swing.JButton log;
    private javax.swing.JButton memminus;
    private javax.swing.JButton memplus;
    private javax.swing.JButton mod;
    private javax.swing.JButton ms;
    private javax.swing.JButton multiplication;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton percentage;
    private javax.swing.JButton pi;
    private javax.swing.JButton plusminus;
    private javax.swing.JButton power;
    private javax.swing.JButton rightbrack;
    private javax.swing.JButton seven;
    private javax.swing.JButton sin;
    private javax.swing.JButton six;
    private javax.swing.JButton sqrt;
    private javax.swing.JButton square;
    private javax.swing.JButton sub;
    private javax.swing.JButton tan;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton uphistory;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables


}
