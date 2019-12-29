/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutrientmaster;

import java.text.DecimalFormat;


/**
 *
 * @author sayem
 */
public class SecondScreen extends javax.swing.JFrame {

    public String name;
    public double height;
    public double weight;
    public int age;
    public String gender;
    public String activity;
    public double calorie=0.0;
    public double carbohydrate=0;
    public double maxp=0;
    public double fat=0;
    public double VitA,VitC,VitD,VitE,VitK,Thiamin;
    public double Riboflavin,Niacin,VitB6,PanthothnicAcid;
    public double Biotin,Choline,Calcium,Chromium,Copper,Flouride,Iodin,Iron;
    public double Magnesium,Manganese,Molybdneum,Phosphorus,Selemium,Zinc;
    
    /**
     * Creates new form SecondScreen
     */
    public SecondScreen() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void calculateSomething()
    {
       
        double activityValue = 0;
        if(activity.equals("NotActive"))
          activityValue= 1.2;
 
       else if(activity.equals("LightlyAcitve"))
           activityValue=1.375;
       else   if(activity.equals("ModeratelyActive"))
           { activityValue= 1.55;}
           else if(activity.equals("VeryActive"))
           { activityValue= 1.725;}
           else if(activity.equals("ExtraActive"))
           {activityValue= 1.9;}
       
       if(gender=="Female") {
	     calorie= ((4.3*12*this.height)+(4.35*2.20462262*this.weight)-(4.7*this.age)+655) *activityValue;
	}
       else if(gender=="Male") {
		calorie= ( (12.7*12*this.height)+(6.23*2.20462262*this.weight )-(6.8*this.age)+66 )*activityValue;
	}
	//
        //float calorie=this.height+this.weight;
        lbl_cal.setText(new DecimalFormat("##.###").format(calorie));     
    }
    public void calculateCarbohydrate()
    {
        
        if(activity=="NotActive") {
			carbohydrate=calorie*(40.0/100.0);
		}
		else if(activity=="LightlyAcitve") {
			carbohydrate=calorie*(50.0/100.0);
		}
		else if(activity=="ModeratelyActive") {
			carbohydrate=calorie*(55.0/100.0);
		}
		else if(activity=="VeryActive") {
			carbohydrate=calorie*(65.0/100.0);
		}
		else if(activity=="ExtraActive"){
			carbohydrate=calorie*(75.0/100.0);
		}
        lbl_car.setText(new DecimalFormat("##.###"+" gram").format(carbohydrate));
    }
    public void calculateProtein(){
        
        double minp=0;
        minp=this.weight*(0.8);
        maxp=this.weight*(1.0);
        lbl_protein.setText(new DecimalFormat("##.###"+" gram").format(maxp));
        lbl_protein1.setText(new DecimalFormat("##.###"+" gram").format(minp));
    }
    public void calculateFat()
    {
        
        fat=(0.3*calorie)/9.0;
        lbl_Fat.setText(new DecimalFormat("##.###"+" gram").format(fat));
        
    }
    public void calculateVitamin(){
        if(gender=="Female"){
                         if(this.age>=1&&this.age<=3) {
		         VitA=300.0;VitC=35.0;VitD=5.0;
		         VitE=5.0;VitK=25.0;Thiamin=0.5;
		         Riboflavin=0.5;Niacin=6;VitB6=0.5;PanthothnicAcid=3.5;
		         Biotin=8;Choline=200;Calcium=500;Chromium=11;Copper=0.7;
		         Flouride=0;Iodin=90;Iron=9;
		         Magnesium=80;Manganese=2;Molybdneum=17;
		         Phosphorus=460;Selemium=25;Zinc=3;
			 }
			 else if(this.age>=4&&this.age<=8) {
		         VitA=400.0;VitC=35.0;VitD=5.0;
		         VitE=6.0;VitK=35.0;Thiamin=0.6;
		         Riboflavin=0.6;Niacin=8;VitB6=0.6;PanthothnicAcid=4.0;
		         Biotin=12;Choline=250;Calcium=700;Chromium=15;Copper=1.0;
		         Flouride=0;Iodin=90;Iron=10;
		         Magnesium=130;Manganese=2.5;Molybdneum=22;
		         Phosphorus=500;Selemium=30;Zinc=4;
			 }
			 else if(this.age>=9&&this.age<=13) {
		         VitA=600.0;VitC=40.0;VitD=5.0;
		         VitE=8.0;VitK=45.0;Thiamin=0.9;
		         Riboflavin=0.9;Niacin=12;VitB6=1.0;PanthothnicAcid=4.0;
		         Biotin=20;Choline=375;Calcium=1000;Chromium=21;Copper=1.1;
		         Flouride=2;Iodin=120;Iron=8;
		         Magnesium=240;Manganese=2.5;Molybdneum=34;
		         Phosphorus=1250;Selemium=50;Zinc=6;
			 }
			 else if(this.age>=14&&this.age<=18) {
		         VitA=700.0;VitC=40.0;VitD=5.0;
		         VitE=8.0;VitK=55.0;Thiamin=1.1;
		         Riboflavin=1.1;Niacin=14;VitB6=1.2;PanthothnicAcid=4.0;
		         Biotin=25;Choline=400;Calcium=1300;Chromium=25;Copper=1.1;
		         Flouride=3;Iodin=150;Iron=15;
		         Magnesium=360;Manganese=3.0;Molybdneum=43;
		         Phosphorus=1250;Selemium=60;Zinc=7;
			 }
			 else if(this.age>=19&&this.age<=30) {
		         VitA=700.0;VitC=45.0;VitD=5.0;
		         VitE=7.0;VitK=60.0;Thiamin=1.1;
		         Riboflavin=1.1;Niacin=14;VitB6=1.3;PanthothnicAcid=4.0;
		         Biotin=25;Choline=425;Calcium=1000;Chromium=25;Copper=1.2;
		         Flouride=3;Iodin=150;Iron=18;
		         Magnesium=310;Manganese=5.0;Molybdneum=45;
		         Phosphorus=1000;Selemium=60;Zinc=8;
			 }
			 else if(this.age>=31&&this.age<=50) {
		         VitA=700.0;VitC=45.0;VitD=5.0;
		         VitE=7.0;VitK=60.0;Thiamin=1.1;
		         Riboflavin=1.1;Niacin=14;VitB6=1.3;PanthothnicAcid=4.0;
		         Biotin=25;Choline=425;Calcium=1000;Chromium=25;Copper=1.2;
		         Flouride=3;Iodin=150;Iron=18;
		         Magnesium=320;Manganese=5.0;Molybdneum=45;
		         Phosphorus=1000;Selemium=60;Zinc=8;
			 }
			 else if(this.age>=51&&this.age<=70) {
		         VitA=700.0;VitC=45.0;VitD=10.0;
		         VitE=7.0;VitK=60.0;Thiamin=1.1;
		         Riboflavin=1.1;Niacin=14;VitB6=1.5;PanthothnicAcid=4.0;
		         Biotin=25;Choline=425;Calcium=1300;Chromium=25;Copper=1.2;
		         Flouride=3;Iodin=150;Iron=8;
		         Magnesium=320;Manganese=5.0;Molybdneum=45;
		         Phosphorus=1000;Selemium=60;Zinc=8;
			 }
			 else if(this.age>71) {
		         VitA=700.0;VitC=45.0;VitD=15.0;
		         VitE=7.0;VitK=60.0;Thiamin=1.1;
		         Riboflavin=1.3;Niacin=14;VitB6=1.5;PanthothnicAcid=4.0;
		         Biotin=25;Choline=425;Calcium=1300;Chromium=25;Copper=1.2;
		         Flouride=3;Iodin=150;Iron=8;
		         Magnesium=320;Manganese=5.0;Molybdneum=45;
		         Phosphorus=1000;Selemium=60;Zinc=8;
			 }
        }
        if(gender=="Male"){
                         if(this.age>=1&&this.age<=3) {
		         VitA=300.0;VitC=35.0;VitD=5.0;
		         VitE=5.0;VitK=25.0;Thiamin=0.5;
		         Riboflavin=0.5;Niacin=6;VitB6=0.5;PanthothnicAcid=3.5;
		         Biotin=8;Choline=200;Calcium=500;Chromium=11;Copper=0.7;
		         Flouride=0;Iodin=90;Iron=9;
		         Magnesium=80;Manganese=2;Molybdneum=17;
		         Phosphorus=460;Selemium=25;Zinc=3;
			 }
			 else if(this.age>=4&&this.age<=8) {
		         VitA=400.0;VitC=35.0;VitD=5.0;
		         VitE=6.0;VitK=35.0;Thiamin=0.6;
		         Riboflavin=0.6;Niacin=8;VitB6=0.6;PanthothnicAcid=4.0;
		         Biotin=12;Choline=250;Calcium=700;Chromium=15;Copper=1.0;
		         Flouride=0;Iodin=90;Iron=10;
		         Magnesium=130;Manganese=2.5;Molybdneum=22;
		         Phosphorus=500;Selemium=30;Zinc=4;
			 }
			 else if(this.age>=9&&this.age<=13) {
		         VitA=600.0;VitC=40.0;VitD=5.0;
		         VitE=9.0;VitK=45.0;Thiamin=0.9;
		         Riboflavin=0.9;Niacin=12;VitB6=1.0;PanthothnicAcid=5.0;
		         Biotin=20;Choline=375;Calcium=1000;Chromium=25;Copper=1.3;
		         Flouride=2;Iodin=120;Iron=8;
		         Magnesium=240;Manganese=3;Molybdneum=34;
		         Phosphorus=1250;Selemium=50;Zinc=6;
			 }
			 else if(this.age>=14&&this.age<=18) {
		         VitA=900.0;VitC=40.0;VitD=5.0;
		         VitE=10;VitK=55.0;Thiamin=1.2;
		         Riboflavin=1.3;Niacin=16;VitB6=1.3;PanthothnicAcid=6.0;
		         Biotin=30;Choline=550;Calcium=1300;Chromium=35;Copper=1.5;
		         Flouride=3;Iodin=150;Iron=11;
		         Magnesium=410;Manganese=3.5;Molybdneum=43;
		         Phosphorus=1250;Selemium=70;Zinc=13;
			 }
			 else if(this.age>=19&&this.age<=30) {
		         VitA=900.0;VitC=45.0;VitD=5.0;
		         VitE=10;VitK=70.0;Thiamin=1.2;
		         Riboflavin=1.3;Niacin=16;VitB6=1.3;PanthothnicAcid=6.0;
		         Biotin=30;Choline=550;Calcium=1000;Chromium=35;Copper=1.7;
		         Flouride=4;Iodin=150;Iron=8;
		         Magnesium=400;Manganese=5.5;Molybdneum=45;
		         Phosphorus=1000;Selemium=70;Zinc=14;
			 }
			 else if(this.age>=31&&this.age<=50) {
		         VitA=900.0;VitC=45.0;VitD=5.0;
		         VitE=10;VitK=70.0;Thiamin=1.2;
		         Riboflavin=1.3;Niacin=16;VitB6=1.3;PanthothnicAcid=6.0;
		         Biotin=30;Choline=550;Calcium=1000;Chromium=35;Copper=1.7;
		         Flouride=4;Iodin=150;Iron=8;
		         Magnesium=420;Manganese=5.5;Molybdneum=45;
		         Phosphorus=1000;Selemium=70;Zinc=14;
			 }
			 else if(this.age>=51&&this.age<=70) {
		         VitA=900.0;VitC=45.0;VitD=10.0;
		         VitE=10.0;VitK=70.0;Thiamin=1.2;
		         Riboflavin=1.3;Niacin=16;VitB6=1.7;PanthothnicAcid=6.0;
		         Biotin=30;Choline=550;Calcium=1000;Chromium=35;Copper=1.7;
		         Flouride=4;Iodin=150;Iron=8;
		         Magnesium=420;Manganese=5.5;Molybdneum=45;
		         Phosphorus=1000;Selemium=70;Zinc=14;
			 }
			 else if(this.age>71) {
		         VitA=900.0;VitC=45.0;VitD=15.0;
		         VitE=10.0;VitK=70.0;Thiamin=1.2;
		         Riboflavin=1.6;Niacin=16;VitB6=1.7;PanthothnicAcid=6.0;
		         Biotin=30;Choline=550;Calcium=1300;Chromium=35;Copper=1.7;
		         Flouride=4;Iodin=150;Iron=8;
		         Magnesium=420;Manganese=5.5;Molybdneum=45;
		         Phosphorus=1000;Selemium=70;Zinc=14;
			 }
        }
        vitaminA_lbl.setText(new DecimalFormat("##.###"+" µg/day").format(VitA));
        VitaminC_lbl.setText(new DecimalFormat("##.###"+" mg/day").format(VitC));
        VitaminD_lbl.setText(new DecimalFormat("##.###"+" mg/day").format(VitD));
        VitaminE_lbl.setText(new DecimalFormat("##.###"+" mg/day").format(VitE));
        VitaminK_lbl.setText(new DecimalFormat("##.###"+" µg/day").format(VitK));
        Thiamin_lbl.setText(new DecimalFormat("##.###"+" mg/day").format(Thiamin));
        Riboflavin_lbl.setText(new DecimalFormat("##.###"+" mg/day").format(Riboflavin));
        Niacin_lbl.setText(new DecimalFormat("##.###"+" mg/day").format(Niacin));
        VitB6_lbl.setText(new DecimalFormat("##.###"+" mg/day").format(VitB6));
        PanthothnicAcid_lbl.setText(new DecimalFormat("##.###"+" mg/day").format(PanthothnicAcid));
        Biotin_lbl.setText(new DecimalFormat("##.###"+" µg/day").format(Biotin));
        Choline_lbl.setText(new DecimalFormat("##.###"+" mg/day").format(Choline));
        Calcium_lbl.setText(new DecimalFormat("##.###"+" mg/day").format(Calcium));
        Chromium_lbl.setText(new DecimalFormat("##.###"+" µg/day").format(Chromium));
        Copper_lbl.setText(new DecimalFormat("##.###"+" mg/day").format(Copper));
        Flouride_lbl.setText(new DecimalFormat("##.###"+" mg/day").format(Flouride));
        Iodin_lbl.setText(new DecimalFormat("##.###"+" µg/day").format(Iodin));
        Iron_lbl.setText(new DecimalFormat("##.###"+" mg/day").format(Iron));
        Magnesium_lbl.setText(new DecimalFormat("##.###"+" mg/day").format(Magnesium));
        Manganese_lbl.setText(new DecimalFormat("##.###"+" mg/day").format(Manganese));
        Molybdneum_lbl.setText(new DecimalFormat("##.###"+" µg/day").format(Molybdneum));
        Phosphorus_lbl.setText(new DecimalFormat("##.###"+" mg/day").format(Phosphorus));
        Selemium_lbl.setText(new DecimalFormat("##.###"+" gram").format(Selemium));
        Zinc_lbl.setText(new DecimalFormat("##.###"+" mg/day").format(Zinc));
            
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbl_cal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_car = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_protein = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_protein1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_Fat = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        vitaminA_lbl = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        VitaminC_lbl = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        VitaminD_lbl = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        VitaminE_lbl = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        VitaminK_lbl = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Thiamin_lbl = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Riboflavin_lbl = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Niacin_lbl = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        VitB6_lbl = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        PanthothnicAcid_lbl = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Biotin_lbl = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Choline_lbl = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Calcium_lbl = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Chromium_lbl = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        Copper_lbl = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        Flouride_lbl = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        Iodin_lbl = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        Iron_lbl = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        Magnesium_lbl = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        Manganese_lbl = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        Molybdneum_lbl = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        Phosphorus_lbl = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        Selemium_lbl = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        Zinc_lbl = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Calorie:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 74, -1, -1));

        lbl_cal.setBackground(new java.awt.Color(255, 255, 255));
        lbl_cal.setText("jLabel2");
        getContentPane().add(lbl_cal, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 74, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Carbohydrate:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 103, -1, -1));

        lbl_car.setText("jLabel3");
        getContentPane().add(lbl_car, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 103, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Protein:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 137, -1, -1));

        lbl_protein.setText("jLabel4");
        getContentPane().add(lbl_protein, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 137, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Fat:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 171, -1, -1));

        lbl_protein1.setText("jLabel4");
        getContentPane().add(lbl_protein1, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 137, -1, -1));

        jLabel4.setText("-");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 137, 12, -1));

        lbl_Fat.setText("jLabel6");
        getContentPane().add(lbl_Fat, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 171, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 876, -1, 33));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("VitaminA:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 200, -1, -1));

        vitaminA_lbl.setText("jLabel8");
        getContentPane().add(vitaminA_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("VitaminC:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 229, -1, -1));

        VitaminC_lbl.setText("jLabel8");
        getContentPane().add(VitaminC_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 229, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText("VitaminD:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 258, -1, -1));

        VitaminD_lbl.setText("jLabel9");
        getContentPane().add(VitaminD_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 258, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setText("VitaminE:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 287, -1, -1));

        VitaminE_lbl.setText("jLabel10");
        getContentPane().add(VitaminE_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 287, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setText("VitaminK:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 316, -1, -1));

        VitaminK_lbl.setText("jLabel11");
        getContentPane().add(VitaminK_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 316, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel11.setText("Thiamin:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 339, -1, -1));

        Thiamin_lbl.setText("jLabel12");
        getContentPane().add(Thiamin_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 339, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel12.setText("Riboflavin:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 368, -1, -1));

        Riboflavin_lbl.setText("jLabel13");
        getContentPane().add(Riboflavin_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 368, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel13.setText("Niacin:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 397, -1, -1));

        Niacin_lbl.setText("jLabel14");
        getContentPane().add(Niacin_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 397, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel14.setText("VitaminB6:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 426, -1, -1));

        VitB6_lbl.setText("jLabel15");
        getContentPane().add(VitB6_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 426, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel15.setText("PanthothnicAcid:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 455, -1, -1));

        PanthothnicAcid_lbl.setText("jLabel16");
        getContentPane().add(PanthothnicAcid_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 455, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel16.setText("Biotin:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 484, -1, -1));

        Biotin_lbl.setText("jLabel17");
        getContentPane().add(Biotin_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 484, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel17.setText("Choline:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 513, -1, -1));

        Choline_lbl.setText("jLabel18");
        getContentPane().add(Choline_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 513, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel18.setText("Calcium:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 542, -1, -1));

        Calcium_lbl.setText("jLabel19");
        getContentPane().add(Calcium_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 542, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel19.setText("Chromium:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 571, -1, -1));

        Chromium_lbl.setText("jLabel20");
        getContentPane().add(Chromium_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 571, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel20.setText("Copper:");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 600, -1, -1));

        Copper_lbl.setText("jLabel21");
        getContentPane().add(Copper_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 600, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel21.setText("Flouride:");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 629, -1, -1));

        Flouride_lbl.setText("jLabel22");
        getContentPane().add(Flouride_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 629, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel22.setText("Iodin:");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 658, -1, -1));

        Iodin_lbl.setText("jLabel23");
        getContentPane().add(Iodin_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 658, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel23.setText("Iron:");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 687, -1, -1));

        Iron_lbl.setText("jLabel24");
        getContentPane().add(Iron_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 687, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel24.setText("Magnesium:");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 716, -1, -1));

        Magnesium_lbl.setText("jLabel25");
        getContentPane().add(Magnesium_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 716, -1, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel25.setText("Manganese:");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 745, -1, -1));

        Manganese_lbl.setText("jLabel26");
        getContentPane().add(Manganese_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 745, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel26.setText("Molybdneum:");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 774, -1, -1));

        Molybdneum_lbl.setText("jLabel27");
        getContentPane().add(Molybdneum_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 774, -1, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel27.setText("Phosphorus:");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 803, -1, -1));

        Phosphorus_lbl.setText("jLabel28");
        getContentPane().add(Phosphorus_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 803, -1, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel28.setText("Selemium:");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 832, -1, -1));

        Selemium_lbl.setText("jLabel29");
        getContentPane().add(Selemium_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 832, -1, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel29.setText("Zinc:");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 861, -1, -1));

        Zinc_lbl.setText("jLabel30");
        getContentPane().add(Zinc_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 861, -1, -1));

        jLabel30.setBackground(new java.awt.Color(64, 139, 64));
        jLabel30.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(35, 161, 42));
        jLabel30.setText("Details of your Neutrition");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 29, -1, -1));

        jLabel32.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\Downloads\\Compressed\\NutrientMaster\\of.jpg")); // NOI18N
        jLabel32.setText("jLabel32");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 1010));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        
        ThirdScreen tsl=new ThirdScreen();
        tsl.restCal=calorie;
        tsl.restCar=carbohydrate;
        tsl.restFat=fat;
        tsl.restProtein=maxp;
        ThirdScreen ts=new ThirdScreen();
        ts.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SecondScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecondScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecondScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecondScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecondScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Biotin_lbl;
    private javax.swing.JLabel Calcium_lbl;
    private javax.swing.JLabel Choline_lbl;
    private javax.swing.JLabel Chromium_lbl;
    private javax.swing.JLabel Copper_lbl;
    private javax.swing.JLabel Flouride_lbl;
    private javax.swing.JLabel Iodin_lbl;
    private javax.swing.JLabel Iron_lbl;
    private javax.swing.JLabel Magnesium_lbl;
    private javax.swing.JLabel Manganese_lbl;
    private javax.swing.JLabel Molybdneum_lbl;
    private javax.swing.JLabel Niacin_lbl;
    private javax.swing.JLabel PanthothnicAcid_lbl;
    private javax.swing.JLabel Phosphorus_lbl;
    private javax.swing.JLabel Riboflavin_lbl;
    private javax.swing.JLabel Selemium_lbl;
    private javax.swing.JLabel Thiamin_lbl;
    private javax.swing.JLabel VitB6_lbl;
    private javax.swing.JLabel VitaminC_lbl;
    private javax.swing.JLabel VitaminD_lbl;
    private javax.swing.JLabel VitaminE_lbl;
    private javax.swing.JLabel VitaminK_lbl;
    private javax.swing.JLabel Zinc_lbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbl_Fat;
    private javax.swing.JLabel lbl_cal;
    private javax.swing.JLabel lbl_car;
    private javax.swing.JLabel lbl_protein;
    private javax.swing.JLabel lbl_protein1;
    private javax.swing.JLabel vitaminA_lbl;
    // End of variables declaration//GEN-END:variables
}
