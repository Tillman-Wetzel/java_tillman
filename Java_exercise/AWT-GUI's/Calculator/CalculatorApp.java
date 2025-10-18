package Calculator;

import java.awt.*;
import java.awt.event.*;

public class CalculatorApp {
    Frame calcInterface;

    Label resultLabel;
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button0, 
        buttonPlus, buttonMinus, buttonMultiply, buttonDivide, buttonCalculate;
    
    int inputOne, inputTwo;
    char calculationMethod;

    public static void main(String[] args) {
        CalculatorApp calcApp = new CalculatorApp();
        calcApp.bootCalculatorApp();
    }

    void bootCalculatorApp() {
        calcInterface = new Frame("Tillman's AWT Super Calculator App");
        
        calcInterface.setSize(800, 600);
        calcInterface.setLayout(new GridLayout(5,4));

        createAndAddButtons();

        resultLabel = new Label("This is a label.");
        
        calcInterface.add(resultLabel);

        calcInterface.setVisible(true);
    }

    void createAndAddButtons() {
        button1 = new Button("1");
        button1.addActionListener((ActionListener) this);
        calcInterface.add(button1);

        button2 = new Button("2");
        button2.addActionListener((ActionListener) this);
        calcInterface.add(button2);

        button3 = new Button("3");
        button3.addActionListener((ActionListener) this);
        calcInterface.add(button3);

        button4 = new Button("4");
        button4.addActionListener((ActionListener) this);
        calcInterface.add(button4);

        button5 = new Button("5");
        button5.addActionListener((ActionListener) this);
        calcInterface.add(button5);

        button6 = new Button("6");
        button6.addActionListener((ActionListener) this);
        calcInterface.add(button6);

        button7 = new Button("7");
        button7.addActionListener((ActionListener) this);
        calcInterface.add(button7);

        button8 = new Button("8");
        button8.addActionListener((ActionListener) this);
        calcInterface.add(button8);

        button9 = new Button("9");
        button9.addActionListener((ActionListener) this);
        calcInterface.add(button9);

        button0 = new Button("0");
        button0.addActionListener((ActionListener) this);
        calcInterface.add(button0);


        buttonPlus = new Button("+");
        buttonPlus.addActionListener((ActionListener) this);
        calcInterface.add(buttonPlus);

        buttonMinus = new Button("-");
        buttonMinus.addActionListener((ActionListener) this);
        calcInterface.add(buttonMinus);

        buttonMultiply = new Button("*");
        buttonMultiply.addActionListener((ActionListener) this);
        calcInterface.add(buttonMultiply);

        buttonDivide = new Button(":");
        buttonDivide.addActionListener((ActionListener) this);
        calcInterface.add(buttonDivide);


        buttonCalculate = new Button("=");
        buttonCalculate.addActionListener((ActionListener) this);
        calcInterface.add(buttonCalculate);
    }
}
