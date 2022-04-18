package it.rrcompany.turingmachine.GUI.Input;

import it.rrcompany.turingmachine.GUI.Code.CodePanel;
import it.rrcompany.turingmachine.GUI.MainFrame;
import it.rrcompany.turingmachine.GUI.TuringComponent;

import javax.swing.*;
import java.awt.*;

public class InputField extends JTextField implements TuringComponent {

    private static InputPanel parentPanel;
    public final static float scaleWidth = (float) 0.7;
    public final static float scaleHeight = (float) 0.09;
    public final static float locHeight = (float) 0.3;

    public InputField(InputPanel parentPanel) {
        InputField.parentPanel = parentPanel;

        this.setFocusable(true);
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        parentPanel.add(this);
        this.setVisible(true);

        this.resize();

    }

    @Override
    public void resize() {
        this.setFont(new java.awt.Font("Verdana", Font.PLAIN, 14+(MainFrame.mainFrame.getHeight()-400)/100));

        this.setLocation(this.getPosX(), this.getPosY());
        this.setSize(this.getWidth(), this.getHeight());
    }

    public int getPosX() {
        return (int)(parentPanel.getWidth()*((1-scaleWidth)/2));
    }

    public int getPosY() {
        return (int)(parentPanel.getHeight()*(locHeight));
    }

    public int getWidth() {
        return (int)(parentPanel.getWidth()*scaleWidth);
    }

    public int getHeight() {
        return (int)(parentPanel.getHeight()*(scaleHeight));
    }

}

