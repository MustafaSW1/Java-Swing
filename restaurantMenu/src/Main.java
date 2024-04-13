import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
das ist Beispiel für ein Restaurant.
Sie die Getränke und die Speise in checkbox an/ab-kreuzen und die gesamtrechnung wird in TextArea angezeigt
 */

public class Main {
    private static int totalSum; // die Rechnung
    public static void main(String[] args) {


        // start seite
        JFrame myFrame = new JFrame("welcome in the Restaurant"); //  frame definieren und text anzeigen
        myFrame.setSize(700,700); // die Größe festlegen
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Beenden bei schließen
        myFrame.setLayout(null);



        Font newFont = new Font("Serif", Font.BOLD, 25); //Schriftart auswählen und die Einstellungen eingeben
        JLabel welcomeViewing = new JLabel("Nice to see you in our Restaurant"); // Label definieren und text anzeigen
        welcomeViewing.setBounds(190,70,380,250); //die Größe festlegen und position einstellen
        welcomeViewing.setFont(newFont); //label Schrift einstellen
        myFrame.add(welcomeViewing); // Füge das Begrüßungslabel zum Frame hinzu


        JTextArea result = new JTextArea(); // text area um die Rechnung anzuzeigen
        result.setBounds(170,350 ,400,180); //die Größe festlegen und position einstellen

        JScrollPane scroll = new JScrollPane(result);
        scroll.setBounds(170,350 ,420,200); //die Größe festlegen und position einstellen
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS); //vertikale Bildlaufleiste
        myFrame.add(scroll); // Füge das Bildlaufleiste zum Frame hinzu


        JPanel drinksPage = new JPanel(); // Liste der getränke
        drinksPage.setBounds(0,0,700,600); //die Größe festlegen und position einstellen
        drinksPage.setBackground(Color.LIGHT_GRAY); // Farbe der Getränkeseite
        drinksPage.setLayout(null);
        drinksPage.setVisible(false); // unsichtbar
        myFrame.getContentPane().add(drinksPage); // Getränkeliste zum frame hinfügen


        /**
         Nachfolgend finden Sie die Getränke auf der Getränkeliste
         */
        // 4 kalte Getränke
        JCheckBox cocaColaCheck = new JCheckBox("Coca-Cola 8$"); // Coca-Cola für 8 $
        cocaColaCheck.setBounds(30,100,130,50); //die Größe festlegen und position einstellen
        cocaColaCheck.putClientProperty("cola",8); // 8 $ Cola
        drinksPage.add(cocaColaCheck); // cola zur Getränkeliste hinzufügen


        JCheckBox pepsiCheck = new JCheckBox("pepsi 5$"); // pepsi für 5 $
        pepsiCheck.setBounds(30,140,130,50); //die Größe festlegen und position einstellen
        drinksPage.add(pepsiCheck); //pepsi zur Getränkeliste hinzufügen


        JCheckBox spriteCheck = new JCheckBox("sprite 4$"); // sprite für 4 $
        spriteCheck.setBounds(30,180,130,50); //die Größe festlegen und position einstellen
        drinksPage.add(spriteCheck); // sprite zur Getränkeliste hinzufügen

        JCheckBox FantaCheck = new JCheckBox("Fanta 4$");  // Fanta für 4 $
        FantaCheck.setBounds(30,220,130,50); //die Größe festlegen und position einstellen
        drinksPage.add(FantaCheck); // Fanta zur Getränkeliste hinzufügen

        // ------------------------------
        // 4 heiße Getränke

        JCheckBox teaCheck = new JCheckBox("tea 3$"); // Tee für  $
        teaCheck.setBounds(180,100,130,50); //die Größe festlegen und position einstellen
        drinksPage.add(teaCheck); //Tee zur Getränkeliste hinzufügen

        JCheckBox BlackCaffeCheck = new JCheckBox("Black Caffe 3$"); // Black Caffe für 3 $
        BlackCaffeCheck.setBounds(180,140,130,50); //die Größe festlegen und position einstellen
        drinksPage.add(BlackCaffeCheck); // Black Caffe zur Getränkeliste hinzufügen

        JCheckBox latteCheck = new JCheckBox("Latte 4$"); // Latte für 4 $
        latteCheck.setBounds(180,180,130,50);  //die Größe festlegen und position einstellen
        drinksPage.add(latteCheck); // Latte zur Getränkeliste hinzufügen

        JCheckBox espressoCheck = new JCheckBox("espresso 4$"); // espresso für 4 $
        espressoCheck.setBounds(180,220,130,50);  //die Größe festlegen und position einstellen
        drinksPage.add(espressoCheck); // espresso zur Getränkeliste hinzufügen

        //----------------------------------
        // 4 säfte
        JCheckBox appleJuiceCheck = new JCheckBox("Apple Juice 5$"); // apfelsaft für 5 $
        appleJuiceCheck.setBounds(350,100,130,50); //die Größe festlegen und position einstellen
        drinksPage.add(appleJuiceCheck); // apfelsaft zur Getränkeliste hinzufügen

        JCheckBox beetJuiceCheck = new JCheckBox("Beet Juice 5$"); //Rübensaft für 5$
        beetJuiceCheck.setBounds(350,140,130,50); //die Größe festlegen und position einstellen
        drinksPage.add(beetJuiceCheck); // Rübensaft zur Getränkeliste hinzufügen

        JCheckBox blueberryJuiceCheck = new JCheckBox("Blueberry Juice 5$"); //Blaubeersaft  für 5$
        blueberryJuiceCheck.setBounds(350,180,160,50); //die Größe festlegen und position einstellen
        drinksPage.add(blueberryJuiceCheck); // Blaubeersaft zur Getränkeliste hinzufügen

        JCheckBox orangeJuiceCheck = new JCheckBox("Orange Juice 5$"); // Orangensaft für 5$
        orangeJuiceCheck.setBounds(350,220,150,50); //die Größe festlegen und position einstellen
        drinksPage.add(orangeJuiceCheck); // Orangensaft zur Getränkeliste hinzufügen


        //:::::::::::::::::::::::::::::::::::::::::::::::

        // Schlüssel und preis eingeben für jedes Getränk in der liste
        cocaColaCheck.putClientProperty("value",8);
        pepsiCheck.putClientProperty("value",5);
        spriteCheck.putClientProperty("value",4);
        FantaCheck.putClientProperty("value",4);

        teaCheck.putClientProperty("value",3);
        BlackCaffeCheck.putClientProperty("value",5);
        latteCheck.putClientProperty("value",4);
        espressoCheck.putClientProperty("value",4);

        appleJuiceCheck.putClientProperty("value",5);
        beetJuiceCheck.putClientProperty("value",5);
        blueberryJuiceCheck.putClientProperty("value",5);
        orangeJuiceCheck.putClientProperty("value",5);



        JPanel foodPage = new JPanel(); // Speiseliste
        foodPage.setBounds(0,0,700,600); //die Größe festlegen und position einstellen
        foodPage.setBackground(Color.GREEN); // Farbe der Speiseliste
        foodPage.setLayout(null);
        foodPage.setVisible(false); // unsichtbar
        myFrame.add(foodPage); // Speiseliste zum Frame hinfügen

        /**
         Nachfolgend finden Sie die Speise auf der Speiseliste
         */

        JCheckBox cheeseCheck = new JCheckBox("cheese 8$"); // käse für 8$
        cheeseCheck.setBounds(30,100,130,50); //die Größe festlegen und position einstellen
        foodPage.add(cheeseCheck);// käse zur Speiseliste hinfügen

        JCheckBox eggCheck = new JCheckBox("egg 5$"); // Ei für 8$
        eggCheck.setBounds(30,140,130,50); //die Größe festlegen und position einstellen
        foodPage.add(eggCheck); // Ei zur Speiseliste hinfügen

        JCheckBox omeletteCheck = new JCheckBox("omelette 8$"); // omelette für 8$
        omeletteCheck.setBounds(30,180,130,50); //die Größe festlegen und position einstellen
        foodPage.add(omeletteCheck); // omelette zur Speiseliste hinfügen

        JCheckBox saladCheck = new JCheckBox("salad 4$"); // Salat für 4$
        saladCheck.setBounds(30,220,130,50); //die Größe festlegen und position einstellen
        foodPage.add(saladCheck); // Salat zur Speiseliste hinfügen
        // ------------------------------

        JCheckBox fishCheck = new JCheckBox("fish 23$"); // Fisch für 23$
        fishCheck.setBounds(180,100,130,50); //die Größe festlegen und position einstellen
        foodPage.add(fishCheck); // Fisch zur Speiseliste hinfügen

        JCheckBox chickenCheck = new JCheckBox("chicken 13$"); // hähnchen für 13$
        chickenCheck.setBounds(180,140,130,50);//die Größe festlegen und position einstellen
        foodPage.add(chickenCheck);// hähnchen zur Speiseliste hinfügen

        JCheckBox seefoodCheck = new JCheckBox("See food 40$"); // See food 40$
        seefoodCheck.setBounds(180,180,130,50);//die Größe festlegen und position einstellen
        foodPage.add(seefoodCheck); //See food  zur Speiseliste hinfügen

        JCheckBox meatCheck = new JCheckBox("meat 20$"); // Fleisch für 20$
        meatCheck.setBounds(180,220,130,50);//die Größe festlegen und position einstellen
        foodPage.add(meatCheck);// Fleisch zur Speiseliste hinfügen

        //----------------------------------

        JCheckBox hamburgerCheck = new JCheckBox("hamburger 10$"); // hamburger für 10$
        hamburgerCheck.setBounds(350,100,130,50); //die Größe festlegen und position einstellen
        foodPage.add(hamburgerCheck);// hamburger zur Speiseliste hinfügen

        JCheckBox frenchFriesCheck = new JCheckBox("french fries 7$"); // pommes für 7$
        frenchFriesCheck.setBounds(350,140,130,50); //die Größe festlegen und position einstellen
        foodPage.add(frenchFriesCheck);//  pommes zur Speiseliste hinfügen

        JCheckBox meatSteakCheck = new JCheckBox("meat Steak 20$"); // Fleischsteak für 20$
        meatSteakCheck.setBounds(350,180,160,50); //die Größe festlegen und position einstellen
        foodPage.add(meatSteakCheck); //  Fleischsteak zur Speiseliste hinfügen

        JCheckBox kebabCheck = new JCheckBox("kebab 25$"); // kebab für 25$
        kebabCheck.setBounds(350,220,150,50);  //die Größe festlegen und position einstellen
        foodPage.add(kebabCheck);  //  kebab zur Speiseliste hinfügen

        // Schlüssel und preis eingeben für jede Speise in der liste
        cheeseCheck.putClientProperty("value",8);
        eggCheck.putClientProperty("value",5);
        omeletteCheck.putClientProperty("value",8);
        saladCheck.putClientProperty("value",4);
        fishCheck.putClientProperty("value",23);
        chickenCheck.putClientProperty("value",13);
        seefoodCheck.putClientProperty("value",40);
        meatCheck.putClientProperty("value",20);
        hamburgerCheck.putClientProperty("value",10);
        frenchFriesCheck.putClientProperty("value",7);
        meatSteakCheck.putClientProperty("value",20);
        kebabCheck.putClientProperty("value",25);


        //einen ActionListener für alle Checkboxes beim Ankreuzen von Getränke und Speise
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JCheckBox source = (JCheckBox)e.getSource();
                int value = (int) source.getClientProperty("value");

                if (source.isSelected()){ // beim neuen checkbox Ankreuzen
                    totalSum += value; // neues preis auf die Rechnung hinzufügen
                }else {
                    totalSum -= value; //beim Abkreuzen das preis von Rechnung Subtrahieren
                }
                result.append("total sum ist : "+totalSum + "\n"); // die Rechnung in einem TextArea anzeigen
            }
        };

        // Aktevierung von jeder checkbox listener
        // die Getränke
        cocaColaCheck.addActionListener(listener);
        pepsiCheck.addActionListener(listener);
        spriteCheck.addActionListener(listener);
        FantaCheck.addActionListener(listener);
        teaCheck.addActionListener(listener);
        BlackCaffeCheck.addActionListener(listener);
        latteCheck.addActionListener(listener);
        espressoCheck.addActionListener(listener);
        appleJuiceCheck.addActionListener(listener);
        beetJuiceCheck.addActionListener(listener);
        blueberryJuiceCheck.addActionListener(listener);
        orangeJuiceCheck.addActionListener(listener);
        //----------------------------------
        // die Speise
        cheeseCheck.addActionListener(listener);
        eggCheck.addActionListener(listener);
        omeletteCheck.addActionListener(listener);
        saladCheck.addActionListener(listener);
        fishCheck.addActionListener(listener);
        chickenCheck.addActionListener(listener);
        seefoodCheck.addActionListener(listener);
        meatCheck.addActionListener(listener);
        hamburgerCheck.addActionListener(listener);
        frenchFriesCheck.addActionListener(listener);
        meatSteakCheck.addActionListener(listener);
        kebabCheck.addActionListener(listener);


        // Getränke Schaltfläche
        JButton drinksButton = new JButton("Drinks");
        drinksButton.setBounds(45, 600, 120, 50);
        drinksButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                foodPage.setVisible(false);  // Speiseliste wird unsichtbar
                welcomeViewing.setVisible(false); // welcome text wird unsichtbar
                drinksPage.setVisible(true); // Getränkeliste wird sichtbar
            }
        });
        myFrame.add(drinksButton); // Getränke Schaltfläche zum Frame hinzufügen

        // Speise Schaltfläche
        JButton foodButton =  new JButton("Food");
        foodButton.setBounds(200, 600, 120, 50);
        foodButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drinksPage.setVisible(false); // Getränkeliste wird unsichtbar
                welcomeViewing.setVisible(false); // welcome text wird unsichtbar
                foodPage.setVisible(true); // Speiseliste wird sichtbar
            }
        });
        myFrame.add(foodButton); // Speise Schaltfläche zum Frame hinzufügen

        // zurück Schaltfläche
        JButton backButton = new JButton("Back");
        backButton.setBounds(350, 600, 120, 50);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                foodPage.setVisible(false); // Speiseliste wird unsichtbar
                welcomeViewing.setVisible(true); // welcome text wird sichtbar
                drinksPage.setVisible(false); // Getränkeliste wird unsichtbar


            }
        });

        myFrame.add(backButton); // zurück Schaltfläche zum Frame hinzufügen

        myFrame.setVisible(true); // Frame wird sichtbar um der inhalt anzuzeigen
    }
}