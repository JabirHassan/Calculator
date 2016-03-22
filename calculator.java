import java.util.ArrayList;

public class Calculator extends javax.swing.JFrame {

    private boolean isZero;     // used to prevent entering multiple zeros at the start
    private boolean isDecimal;      //used to prevent entering multiple decimal point
    private Boolean equal = false;  // used to disable the equal function before starting a new
                                                            // calculation 

    private double memoryVal = 0;   // value stored in memory

    private String operation = ""; // used to define the type of calculation

    private boolean selectDeg = true;   //used to select the degrees radio button as default    
    private boolean selectRad;

    private double input1;
    private double input2;
    private double output;

    public Calculator() {
        initComponents();
        txtArea1.setText("0");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        decimal = new javax.swing.JButton();
        atan = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        Mod = new javax.swing.JButton();
        substract = new javax.swing.JButton();
        multiply = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        equals = new javax.swing.JButton();
        squared = new javax.swing.JButton();
        cuped = new javax.swing.JButton();
        txtArea1 = new javax.swing.JTextField();
        sqareRoot = new javax.swing.JButton();
        cupeRoot = new javax.swing.JButton();
        memorySubstract = new javax.swing.JButton();
        cosin = new javax.swing.JButton();
        negate = new javax.swing.JButton();
        tan = new javax.swing.JButton();
        memoryClear = new javax.swing.JButton();
        one = new javax.swing.JButton();
        oneOverX = new javax.swing.JButton();
        two = new javax.swing.JButton();
        percent = new javax.swing.JButton();
        three = new javax.swing.JButton();
        pi = new javax.swing.JButton();
        four = new javax.swing.JButton();
        five = new javax.swing.JButton();
        backspace = new javax.swing.JButton();
        six = new javax.swing.JButton();
        raisedTo = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        degrees = new javax.swing.JRadioButton();
        radians = new javax.swing.JRadioButton();
        memoryRecall = new javax.swing.JButton();
        memoryAdd = new javax.swing.JButton();
        memoryStore = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        sin = new javax.swing.JButton();
        log = new javax.swing.JButton();
        exp = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        asin = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        acosin = new javax.swing.JButton();
        txtArea2 = new javax.swing.JTextField();
        threeDecimal = new javax.swing.JButton();
        twoDecimals = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 0));
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(190, 197, 247));

        decimal.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        decimal.setForeground(new java.awt.Color(0, 0, 153));
        decimal.setText(".");
        decimal.setToolTipText("");
        decimal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        decimal.setFocusable(false);
        decimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimalActionPerformed(evt);
            }
        });

        atan.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        atan.setForeground(new java.awt.Color(204, 0, 204));
        atan.setText("atan");
        atan.setToolTipText("");
        atan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        atan.setFocusable(false);
        atan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atanActionPerformed(evt);
            }
        });

        plus.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        plus.setForeground(new java.awt.Color(204, 0, 51));
        plus.setText("+");
        plus.setToolTipText("");
        plus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        plus.setFocusable(false);
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });

        Mod.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        Mod.setForeground(new java.awt.Color(204, 0, 0));
        Mod.setText("MOD");
        Mod.setToolTipText("");
        Mod.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Mod.setFocusable(false);
        Mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModActionPerformed(evt);
            }
        });

        substract.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        substract.setForeground(new java.awt.Color(204, 0, 51));
        substract.setText("-");
        substract.setToolTipText("");
        substract.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        substract.setFocusable(false);
        substract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                substractActionPerformed(evt);
            }
        });

        multiply.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        multiply.setForeground(new java.awt.Color(204, 0, 51));
        multiply.setText("*");
        multiply.setToolTipText("");
        multiply.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        multiply.setFocusable(false);
        multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyActionPerformed(evt);
            }
        });

        divide.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        divide.setForeground(new java.awt.Color(204, 0, 51));
        divide.setText("÷");
        divide.setToolTipText("");
        divide.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        divide.setFocusable(false);
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });

        equals.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        equals.setForeground(new java.awt.Color(204, 0, 51));
        equals.setText("=");
        equals.setToolTipText("");
        equals.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        equals.setFocusable(false);
        equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsActionPerformed(evt);
            }
        });

        squared.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        squared.setForeground(new java.awt.Color(204, 0, 204));
        squared.setText("x²");
        squared.setToolTipText("");
        squared.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        squared.setFocusable(false);
        squared.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squaredActionPerformed(evt);
            }
        });

        cuped.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        cuped.setForeground(new java.awt.Color(204, 0, 204));
        cuped.setText("x³");
        cuped.setToolTipText("");
        cuped.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cuped.setFocusable(false);
        cuped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cupedActionPerformed(evt);
            }
        });

        txtArea1.setEditable(false);
        txtArea1.setBackground(new java.awt.Color(235, 230, 230));
        txtArea1.setColumns(1);
        txtArea1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtArea1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArea1ActionPerformed(evt);
            }
        });

        sqareRoot.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        sqareRoot.setForeground(new java.awt.Color(204, 0, 204));
        sqareRoot.setText("²√x");
        sqareRoot.setToolTipText("");
        sqareRoot.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sqareRoot.setFocusable(false);
        sqareRoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqareRootActionPerformed(evt);
            }
        });

        cupeRoot.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        cupeRoot.setForeground(new java.awt.Color(204, 0, 204));
        cupeRoot.setText("³√x");
        cupeRoot.setToolTipText("");
        cupeRoot.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cupeRoot.setFocusable(false);
        cupeRoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cupeRootActionPerformed(evt);
            }
        });

        memorySubstract.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        memorySubstract.setForeground(new java.awt.Color(204, 0, 51));
        memorySubstract.setText("M-");
        memorySubstract.setToolTipText("");
        memorySubstract.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        memorySubstract.setFocusable(false);
        memorySubstract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memorySubstractActionPerformed(evt);
            }
        });

        cosin.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        cosin.setForeground(new java.awt.Color(204, 0, 204));
        cosin.setText("cos");
        cosin.setToolTipText("");
        cosin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cosin.setFocusable(false);
        cosin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosinActionPerformed(evt);
            }
        });

        negate.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        negate.setForeground(new java.awt.Color(0, 0, 153));
        negate.setText("±");
        negate.setToolTipText("");
        negate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        negate.setFocusable(false);
        negate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negateActionPerformed(evt);
            }
        });

        tan.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        tan.setForeground(new java.awt.Color(204, 0, 204));
        tan.setText("tan");
        tan.setToolTipText("");
        tan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tan.setFocusable(false);
        tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanActionPerformed(evt);
            }
        });

        memoryClear.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        memoryClear.setForeground(new java.awt.Color(204, 0, 51));
        memoryClear.setText("MC");
        memoryClear.setToolTipText("");
        memoryClear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        memoryClear.setFocusable(false);
        memoryClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memoryClearActionPerformed(evt);
            }
        });

        one.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        one.setForeground(new java.awt.Color(0, 0, 153));
        one.setText("1");
        one.setToolTipText("");
        one.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        one.setFocusable(false);
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        oneOverX.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        oneOverX.setForeground(new java.awt.Color(204, 0, 204));
        oneOverX.setText("1⁄x");
        oneOverX.setToolTipText("");
        oneOverX.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        oneOverX.setFocusable(false);
        oneOverX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneOverXActionPerformed(evt);
            }
        });

        two.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        two.setForeground(new java.awt.Color(0, 0, 153));
        two.setText("2");
        two.setToolTipText("");
        two.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        two.setFocusable(false);
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        percent.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        percent.setForeground(new java.awt.Color(0, 51, 204));
        percent.setText("%");
        percent.setToolTipText("");
        percent.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        percent.setFocusable(false);
        percent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                percentActionPerformed(evt);
            }
        });

        three.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        three.setForeground(new java.awt.Color(0, 0, 153));
        three.setText("3");
        three.setToolTipText("");
        three.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        three.setFocusable(false);
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        pi.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        pi.setForeground(new java.awt.Color(0, 0, 204));
        pi.setText("π");
        pi.setToolTipText("");
        pi.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pi.setFocusable(false);
        pi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piActionPerformed(evt);
            }
        });

        four.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        four.setForeground(new java.awt.Color(0, 0, 153));
        four.setText("4");
        four.setToolTipText("");
        four.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        four.setFocusable(false);
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        five.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        five.setForeground(new java.awt.Color(0, 0, 153));
        five.setText("5");
        five.setToolTipText("");
        five.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        five.setFocusable(false);
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });

        backspace.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        backspace.setForeground(new java.awt.Color(204, 0, 51));
        backspace.setText("Del");
        backspace.setToolTipText("");
        backspace.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backspace.setFocusable(false);
        backspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backspaceActionPerformed(evt);
            }
        });

        six.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        six.setForeground(new java.awt.Color(0, 0, 153));
        six.setText("6");
        six.setToolTipText("");
        six.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        six.setFocusable(false);
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        raisedTo.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        raisedTo.setForeground(new java.awt.Color(204, 0, 204));
        raisedTo.setText("xⁿ");
        raisedTo.setToolTipText("");
        raisedTo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        raisedTo.setFocusable(false);
        raisedTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raisedToActionPerformed(evt);
            }
        });

        seven.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        seven.setForeground(new java.awt.Color(0, 0, 153));
        seven.setText("7");
        seven.setToolTipText("");
        seven.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        seven.setFocusable(false);
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });

        eight.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        eight.setForeground(new java.awt.Color(0, 0, 153));
        eight.setText("8");
        eight.setToolTipText("");
        eight.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        eight.setFocusable(false);
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });

        degrees.setBackground(new java.awt.Color(190, 197, 247));
        buttonGroup1.add(degrees);
        degrees.setFont(new java.awt.Font("Arial Narrow", 0, 13)); // NOI18N
        degrees.setSelected(true);
        degrees.setText("Degrees");
        degrees.setToolTipText("");
        degrees.setFocusable(false);
        degrees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degreesActionPerformed(evt);
            }
        });

        radians.setBackground(new java.awt.Color(190, 197, 247));
        buttonGroup1.add(radians);
        radians.setFont(new java.awt.Font("Arial Narrow", 0, 13)); // NOI18N
        radians.setText("Radians");
        radians.setToolTipText("");
        radians.setFocusable(false);
        radians.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiansActionPerformed(evt);
            }
        });

        memoryRecall.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        memoryRecall.setForeground(new java.awt.Color(204, 0, 51));
        memoryRecall.setText("MR");
        memoryRecall.setToolTipText("");
        memoryRecall.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        memoryRecall.setFocusable(false);
        memoryRecall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memoryRecallActionPerformed(evt);
            }
        });

        memoryAdd.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        memoryAdd.setForeground(new java.awt.Color(204, 0, 51));
        memoryAdd.setText("M+");
        memoryAdd.setToolTipText("");
        memoryAdd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        memoryAdd.setFocusable(false);
        memoryAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memoryAddActionPerformed(evt);
            }
        });

        memoryStore.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        memoryStore.setForeground(new java.awt.Color(204, 0, 51));
        memoryStore.setText("MS");
        memoryStore.setToolTipText("");
        memoryStore.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        memoryStore.setFocusable(false);
        memoryStore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memoryStoreActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        clear.setForeground(new java.awt.Color(204, 0, 51));
        clear.setText("CE");
        clear.setToolTipText("");
        clear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clear.setFocusable(false);
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        reset.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        reset.setForeground(new java.awt.Color(204, 0, 51));
        reset.setText("C");
        reset.setToolTipText("");
        reset.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        reset.setFocusable(false);
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        sin.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        sin.setForeground(new java.awt.Color(204, 0, 204));
        sin.setText("sin");
        sin.setToolTipText("");
        sin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sin.setFocusable(false);
        sin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinActionPerformed(evt);
            }
        });

        log.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        log.setForeground(new java.awt.Color(204, 0, 204));
        log.setText("log");
        log.setToolTipText("");
        log.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        log.setFocusable(false);
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });

        exp.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        exp.setForeground(new java.awt.Color(204, 0, 204));
        exp.setText("e");
        exp.setToolTipText("");
        exp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        exp.setFocusable(false);
        exp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expActionPerformed(evt);
            }
        });

        nine.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        nine.setForeground(new java.awt.Color(0, 0, 153));
        nine.setText("9");
        nine.setToolTipText("");
        nine.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nine.setFocusable(false);
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });

        asin.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        asin.setForeground(new java.awt.Color(204, 0, 204));
        asin.setText("asin ");
        asin.setToolTipText("");
        asin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        asin.setFocusable(false);
        asin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asinActionPerformed(evt);
            }
        });

        zero.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        zero.setForeground(new java.awt.Color(0, 0, 153));
        zero.setText("0");
        zero.setToolTipText("");
        zero.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        zero.setFocusable(false);
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        acosin.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        acosin.setForeground(new java.awt.Color(204, 0, 204));
        acosin.setText("acos");
        acosin.setToolTipText("");
        acosin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        acosin.setFocusable(false);
        acosin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acosinActionPerformed(evt);
            }
        });

        txtArea2.setEditable(false);
        txtArea2.setBackground(new java.awt.Color(235, 230, 230));
        txtArea2.setColumns(1);
        txtArea2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtArea2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArea2ActionPerformed(evt);
            }
        });

        threeDecimal.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        threeDecimal.setForeground(new java.awt.Color(0, 0, 153));
        threeDecimal.setText(".000");
        threeDecimal.setToolTipText("");
        threeDecimal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        threeDecimal.setFocusable(false);
        threeDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeDecimalActionPerformed(evt);
            }
        });

        twoDecimals.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        twoDecimals.setForeground(new java.awt.Color(0, 0, 153));
        twoDecimals.setText(".00");
        twoDecimals.setToolTipText("");
        twoDecimals.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        twoDecimals.setFocusable(false);
        twoDecimals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoDecimalsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(degrees, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radians)
                        .addGap(239, 239, 239))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(twoDecimals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Mod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(seven, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(four, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(zero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(threeDecimal, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                        .addComponent(decimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(eight, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(five, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                        .addComponent(raisedTo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(two, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(three, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cupeRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(six, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nine, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(negate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(percent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(divide, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                    .addComponent(equals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(backspace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(asin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                    .addComponent(squared, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(memoryRecall, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(memoryStore, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(memorySubstract, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(memoryAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cosin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(acosin, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(tan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(exp, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(atan, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                                    .addComponent(cuped, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(log, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                                    .addComponent(oneOverX, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                                    .addComponent(sqareRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(plus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(substract, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(multiply, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(memoryClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtArea1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                                .addComponent(txtArea2, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {atan, clear, log, memoryAdd, memoryClear, memorySubstract, oneOverX});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(degrees)
                    .addComponent(radians))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backspace, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset)
                    .addComponent(clear)
                    .addComponent(memoryClear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(memoryRecall)
                    .addComponent(memoryStore)
                    .addComponent(memorySubstract)
                    .addComponent(memoryAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sin)
                    .addComponent(cosin)
                    .addComponent(tan)
                    .addComponent(exp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(asin)
                    .addComponent(acosin)
                    .addComponent(atan)
                    .addComponent(oneOverX))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(squared)
                    .addComponent(raisedTo)
                    .addComponent(cuped, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(log))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sqareRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mod)
                    .addComponent(pi)
                    .addComponent(cupeRoot))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(one)
                    .addComponent(two)
                    .addComponent(three)
                    .addComponent(plus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(four)
                    .addComponent(five)
                    .addComponent(six)
                    .addComponent(substract))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seven)
                    .addComponent(eight)
                    .addComponent(nine)
                    .addComponent(multiply))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zero)
                    .addComponent(decimal)
                    .addComponent(negate)
                    .addComponent(divide))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(twoDecimals, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(threeDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(percent)
                    .addComponent(equals))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Mod, acosin, asin, atan, backspace, clear, cosin, cupeRoot, cuped, decimal, divide, eight, equals, exp, five, four, log, memoryAdd, memoryClear, memoryRecall, memoryStore, memorySubstract, multiply, negate, nine, one, oneOverX, percent, pi, plus, raisedTo, reset, seven, sin, six, squared, substract, tan, three, two, zero});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>                        

    private void twoDecimalsActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // Round the number in display to two decimal places
        input1 = Double.valueOf(txtArea1.getText());
        input1 = Math.round(input1 * 100);
        txtArea1.setText(String.valueOf(input1 / 100));
    }  

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {                                    
        //clear secondary display if previous calculation is completed
        if (txtArea2.getText() != null && equal == false) {
            
            txtArea2.setText(null);
        }
        //add 1 to the number in display
        txtArea1.setText(txtArea1.getText() + "1");
        isZero = true;
    }                                   
                                   
    private void twoActionPerformed(java.awt.event.ActionEvent evt) {                                    
        //clear secondary display if previous calculation is completed
        if (txtArea2.getText() != null && equal == false) {
            
            txtArea2.setText(null);
        }
        //add 2 to the number in display
        txtArea1.setText(txtArea1.getText() + "2");
        isZero = true;
    }                                   

    private void threeDecimalActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // Round the number in display to three decimal places
        input1 = Double.valueOf(txtArea1.getText());
        input1 = Math.round(input1 * 1000);
        txtArea1.setText(String.valueOf(input1 / 1000));
    }                                            

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {                                     
        //clear secondary display if previous calculation is completed
        if (txtArea2.getText() != null && equal == false) {
            
            txtArea2.setText(null);
        }
        //add 4 to the number in display
        txtArea1.setText(txtArea1.getText() + "4");
        isZero = true;
    }                                    

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {                                     
        //clear secondary display if previous calculation is completed
        if (txtArea2.getText() != null && equal == false) {
            txtArea2.setText(null);
        }
        //add 5 to the number in display
        txtArea1.setText(txtArea1.getText() + "5");
        isZero = true;
    }                                    

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {                                    
        //clear secondary display if previous calculation is completed
        if (txtArea2.getText() != null && equal == false) {
            txtArea2.setText(null);
        }
        //add 6 to the number in display
        txtArea1.setText(txtArea1.getText() + "6");
        isZero = true;
    }                                   

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {                                      
        //clear secondary display if previous calculation is completed
        if (txtArea2.getText() != null && equal == false) {
            //txtArea1.setText("7");
            txtArea2.setText(null);
        }
        //add 7 to the number in display
        txtArea1.setText(txtArea1.getText() + "7");
        isZero = true;
    }                                     

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {                                      
        //clear secondary display if previous calculation is completed
        if (txtArea2.getText() != null && equal == false) {
            //txtArea1.setText("8");
            txtArea2.setText(null);
        }
        //add 8 to the number in display
        txtArea1.setText(txtArea1.getText() + "8");
        isZero = true;
    }                                     

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {                                     
        //clear secondary display if previous calculation is completed
        if (txtArea2.getText() != null && equal == false) {
            txtArea2.setText(null);
        }
        //add 9 to the number in display
        txtArea1.setText(txtArea1.getText() + "9");
        isZero = true;
    }                                    

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {                                     
        //If display is zero, don't add another zero
        if (!isZero && !isDecimal) {
            txtArea1.setText(null);
        }
        //if display is not zero
        txtArea1.setText(txtArea1.getText() + "0");

    }                                    

    private void txtArea2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void acosinActionPerformed(java.awt.event.ActionEvent evt) {                                       
        //calculate the arc cosine 
        operation = "acos";
        txtArea1.setText("0");
        txtArea2.setText(" acos( ");
        equal = true;

    }                                      


    private void asinActionPerformed(java.awt.event.ActionEvent evt) {                                     
        //Calculate the arc sine
        operation = "asin";
        txtArea1.setText("0");
        txtArea2.setText("asin ( ");
        equal = true;

    }                                    


    private void expActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // Calculate Euler's number( around 2.71828) raised to the power of number in display
        txtArea1.setText(String.valueOf(Math.exp(Double.valueOf(txtArea1.getText()))));
    }                                   

    private void logActionPerformed(java.awt.event.ActionEvent evt) {                                    
        //Calculate the base 10 logarithm of the number entered
        txtArea1.setText(String.valueOf(Math.log10(Double.valueOf(txtArea1.getText()))));
    }                                   

    private void sinActionPerformed(java.awt.event.ActionEvent evt) {                                    
        //Calculate the sine of a number
        operation = "sin";
        txtArea1.setText("0");
        txtArea2.setText("sin ( ");
        equal = true;

    }                                   

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {                                      
        //clears all the displays and resets all the variables
        txtArea1.setText("0");
        txtArea2.setText(null);
        isZero = false;
        isDecimal = false;
        input1 = 0;
        input2 = 0;
        output = 0;

    }                                     

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // clears display 1 and sets it to zero
        txtArea1.setText("0");
        isZero = false;
        isDecimal = false;

    }                                     

    private void memoryStoreActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // saves the number in display1 in memory and clears the display
        memoryVal = Double.parseDouble(String.valueOf(txtArea1.getText()));
        txtArea1.setText("0");
    }                                           

    private void memoryAddActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // adds the number in display to the number in memory
        memoryVal += Double.parseDouble(txtArea1.getText());
    }                                         

    private void memoryRecallActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // recalls the number in memory
        txtArea1.setText(String.valueOf(memoryVal));
    }                                            

    private void radiansActionPerformed(java.awt.event.ActionEvent evt) {                                        
        //calculates the radians of the number in display
        if (!selectRad && selectDeg) {
            txtArea1.setText(String.valueOf(Math.toRadians(Double.valueOf(txtArea1.getText()))));
        }
        // sets the radians radio-button to true and degrees radio-button to false
        selectRad = true;
        selectDeg = false;;
    }                                       

    private void degreesActionPerformed(java.awt.event.ActionEvent evt) {                                        
        //calculates the degrees of the number in display
        if (selectRad && !selectDeg) {
            txtArea1.setText(String.valueOf(Math.toDegrees(Double.valueOf(txtArea1.getText()))));
        }
        // sets the degrees radio-button to true and radians radio-button to false
        selectRad = false;
        selectDeg = true;
    }                                       

    private void raisedToActionPerformed(java.awt.event.ActionEvent evt) {                                         
        //calculates the number in display raised to the any power
        input1 = Double.valueOf(txtArea1.getText());
        operation = "raisedTo";
        txtArea1.setText(null);
        txtArea2.setText("(" + input1 + ")");
        equal = true;

    }                                        

    private void backspaceActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // deletes the last number entered
        String temp = txtArea1.getText();
        if (temp.length() <= 1) {
            txtArea1.setText("0");
        } else {
            temp = txtArea1.getText().substring(0, txtArea1.getText().length() - 1);
            txtArea1.setText(temp);
        }

    }                                         


    private void piActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // displays the constant number Pi in display 1 and "π"
        txtArea1.setText(String.valueOf(Math.PI));
        txtArea2.setText("π");
    }                                  

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {                                      
        //clear secondary display if previous calculation is completed
        if (txtArea2.getText() != null && equal == false) {
            //txtArea1.setText("3");
            txtArea2.setText(null);
        }
        //add 3 to the number in display
        txtArea1.setText(txtArea1.getText() + "3");
        isZero = true;
    }                                     

    private void percentActionPerformed(java.awt.event.ActionEvent evt) {                                        
        //calculates the percentage of the number in display according to the following number entered
        operation = "%";
        input1 = Double.valueOf(txtArea1.getText());
        txtArea1.setText("0");
        equal = true;
    }                                       


    private void oneOverXActionPerformed(java.awt.event.ActionEvent evt) {                                         
        //Calculates the inverse of the number in display
        txtArea1.setText(String.valueOf(1 / (Double.parseDouble((txtArea1.getText())))));
    }                                        


    private void memoryClearActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // clears the memory and sets it to 0
        memoryVal = 0;
    }                                           

    private void tanActionPerformed(java.awt.event.ActionEvent evt) {                                    
        //Calculates the tan of a number
        operation = "tan";
        txtArea1.setText("0");
        txtArea2.setText("tan ( ");
        equal = true;

    }                                   

    private void negateActionPerformed(java.awt.event.ActionEvent evt) {                                       
        //changes the number in display to negative or positive
        input1 = Double.parseDouble((String.valueOf(txtArea1.getText())));
        output = input1 * -1;

        isDecimal = true;
        output = 0;
    }                                      

    private void cosinActionPerformed(java.awt.event.ActionEvent evt) {                                      
        //calculates the cosine of a number
        operation = "cos";
        txtArea1.setText("0");
        txtArea2.setText("cos ( ");
        equal = true;

    }                                     

    private void memorySubstractActionPerformed(java.awt.event.ActionEvent evt) {                                                
        //substracts from the number in memory
        memoryVal -= Double.parseDouble(txtArea1.getText());
    }                                               

    private void cupeRootActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // calculates the cube root of a number
        double temp = Double.valueOf(txtArea1.getText());
        txtArea1.setText(String.valueOf(Math.cbrt(temp)));
        txtArea2.setText("³√" + temp);
        equal = true;
    }                                        

    private void sqareRootActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // calculates the square root of a number
        double temp = Double.valueOf(txtArea1.getText());
        txtArea1.setText(String.valueOf(Math.sqrt(temp)));
        txtArea2.setText("²√" + temp);
        equal = true;
    }                                         

    private void txtArea1ActionPerformed(java.awt.event.ActionEvent evt) {                                         

    }                                        

    private void squaredActionPerformed(java.awt.event.ActionEvent evt) {                                        
        //Squares the number in display
        int temp = Integer.valueOf(txtArea1.getText());
        txtArea1.setText(String.valueOf(temp * temp));
        txtArea2.setText("(" + temp + ")²");
        equal = true;
    }

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {                                       
        //divides the number in display by the next number entered
        operation = "/";
        input1 = Double.valueOf(txtArea1.getText());
        txtArea2.setText(input1 + " / ");
        txtArea1.setText("0");
        equal = true;
    }                                      

    private void multiplyActionPerformed(java.awt.event.ActionEvent evt) {                                         
        //multiplies the number in display by the next number entered
        operation = "*";
        input1 = Double.valueOf(txtArea1.getText());
        txtArea2.setText(input1 + " * ");
        txtArea1.setText("0");
        equal = true;
    }                                        

    private void substractActionPerformed(java.awt.event.ActionEvent evt) {                                          
        //substracts the number in display from the next number entered
        operation = "-";
        input1 = Double.valueOf(txtArea1.getText());
        txtArea2.setText(input1 + " - ");
        txtArea1.setText("0");
        equal = true;
    }                                         

    private void ModActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // calculates the remainder of dividing the number in display by the next number entered
        operation = "MOD";
        input1 = Double.valueOf(txtArea1.getText());
        txtArea1.setText("0");
        equal = true;
    }                                   

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {                                     
        //adds the number in display to the next number entered
        operation = "+";
        input1 = Double.valueOf(txtArea1.getText());
        txtArea2.setText(input1 + " + ");
        txtArea1.setText("0");
        equal = true;
    }                                    

    private void atanActionPerformed(java.awt.event.ActionEvent evt) {                                     
        //Calculates the arc tan of a number
        operation = "atan";
        txtArea1.setText("0");
        txtArea2.setText("atan ( ");
        equal = true;

    }                                    

    private void decimalActionPerformed(java.awt.event.ActionEvent evt) {                                        
        //adds a decimal point to the number in display 1
        if (!isDecimal) {
            txtArea1.setText(txtArea1.getText() + ".");
            isDecimal = true;
        }
    }                                       

    private void cupedActionPerformed(java.awt.event.ActionEvent evt) {                                      
        //Calculates the cube root of the number in display 1 
        Double temp = Double.valueOf(txtArea1.getText());
        txtArea1.setText(String.valueOf(Math.pow(3, temp)));
        txtArea2.setText("(" + temp + ")" + " p.o 3");
    }                                     
                                       

    private void equalsActionPerformed(java.awt.event.ActionEvent evt) {                                       
        //here is where mosy calculation is done according to the operation chosen
        if (equal == true) {
            input2 = Double.valueOf(txtArea1.getText());
            switch (operation) {
                //Cosine
                case "sin": {
                    double temp = Double.valueOf(txtArea1.getText());
                    double value = 0;
                    if (selectDeg) {
                        value = Math.sin(Math.toRadians(temp));
                    } else if (selectRad) {
                        value = Math.sin(temp);
                    }
                    txtArea2.setText("sin (" + temp + ")");
                    txtArea1.setText(String.valueOf(value));
                    break;
                }
               //Cosine
                case "cos": {
                    double temp = Double.valueOf(txtArea1.getText());
                    double value = 0;
                    if (selectDeg) {
                        value = Math.cos(Math.toRadians(temp));
                    } else if (selectRad) {
                        value = Math.cos((temp));
                    }
                    txtArea2.setText("cos (" + temp + ")");
                    txtArea1.setText(String.valueOf(value));
                    break;
                }
                //Tan
                case "tan": {
                    double temp = Double.valueOf(txtArea1.getText());
                    double value = 0;
                    if (selectDeg) {
                        value = Math.tan(Math.toRadians(temp));
                    } else if (selectRad) {
                        value = Math.tan((temp));
                    }
                    txtArea2.setText("tan (" + temp + ")");
                    txtArea1.setText(String.valueOf(value));
                    break;
                }
                //Arc sine
                case "asin": {
                    double temp = Double.valueOf(txtArea1.getText());
                    double value = 0;
                    if (selectDeg) {
                        value = Math.toDegrees(Math.asin((temp)));
                    } else if (selectRad) {
                        value = Math.asin((temp));
                    }
                    txtArea2.setText("asin (" + temp + ")");
                    txtArea1.setText(String.valueOf(value));
                    break;
                }
               //Arc cosine
                case "acos": {
                    double temp = Double.valueOf(txtArea1.getText());
                    double value = 0;
                    if (selectDeg) {
                        value = Math.toDegrees(Math.acos((temp)));
                    } else if (selectRad) {
                        value = Math.acos(temp);
                    }
                    txtArea2.setText("acos (" + temp + ")");
                    txtArea1.setText(String.valueOf(value));
                    break;
                }
                //Arc tan
                case "atan": {
                    double temp = Double.valueOf(txtArea1.getText());
                    double value = 0;
                    if (selectDeg) {
                        value = Math.atan((temp));
                    } else if (selectRad) {
                        value = Math.atan(temp);
                    }
                    txtArea2.setText("atan (" + temp + ")");
                    txtArea1.setText(String.valueOf(value));
                    break;
                }
               //Modulous
                case "MOD":
                    txtArea1.setText(String.valueOf(input1 % input2));
                    break;
               //Remainder
                case "%":
                    txtArea1.setText(String.valueOf((input1 / input2) * 100) + " %");
                    break;
               //Power of
                case "raisedTo": {
                    double temp = Math.pow(input1, input2);
                    txtArea1.setText(String.valueOf(temp));
                    txtArea2.setText(txtArea2.getText() + " p.o. " + (int) input2);
                    break;
                }
                //Addition
                case "+":
                    txtArea1.setText(String.valueOf(input1 + input2));
                    txtArea2.setText(txtArea2.getText() + input2);
                    break;
               //Substraction
                case "-":
                    txtArea1.setText(String.valueOf(input1 - input2));
                    txtArea2.setText(txtArea2.getText() + input2);
                    break;
                //Multiplication
                case "*":
                    txtArea1.setText(String.valueOf(input1 * input2));
                    txtArea2.setText(txtArea2.getText() + input2);
                    break;
               //Division
                case "/":
                    txtArea1.setText(String.valueOf(input1 / input2));
                    txtArea2.setText(txtArea2.getText() + input2);
                    break;
            }

        }
        //prevents pressing the equal button again
        equal = false;
    }                                      


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton Mod;
    private javax.swing.JButton acosin;
    private javax.swing.JButton asin;
    private javax.swing.JButton atan;
    private javax.swing.JButton backspace;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clear;
    private javax.swing.JButton cosin;
    private javax.swing.JButton cupeRoot;
    private javax.swing.JButton cuped;
    private javax.swing.JButton decimal;
    private javax.swing.JRadioButton degrees;
    private javax.swing.JButton divide;
    private javax.swing.JButton eight;
    private javax.swing.JButton equals;
    private javax.swing.JButton exp;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton log;
    private javax.swing.JButton memoryAdd;
    private javax.swing.JButton memoryClear;
    private javax.swing.JButton memoryRecall;
    private javax.swing.JButton memoryStore;
    private javax.swing.JButton memorySubstract;
    private javax.swing.JButton multiply;
    private javax.swing.JButton negate;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton oneOverX;
    private javax.swing.JButton percent;
    private javax.swing.JButton pi;
    private javax.swing.JButton plus;
    private javax.swing.JRadioButton radians;
    private javax.swing.JButton raisedTo;
    private javax.swing.JButton reset;
    private javax.swing.JButton seven;
    private javax.swing.JButton sin;
    private javax.swing.JButton six;
    private javax.swing.JButton sqareRoot;
    private javax.swing.JButton squared;
    private javax.swing.JButton substract;
    private javax.swing.JButton tan;
    private javax.swing.JButton three;
    private javax.swing.JButton threeDecimal;
    private javax.swing.JButton two;
    private javax.swing.JButton twoDecimals;
    private javax.swing.JTextField txtArea1;
    private javax.swing.JTextField txtArea2;
    private javax.swing.JButton zero;
    // End of variables declaration                   
}
