package de.peris.ddd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.awt.*;

public class DDDEngine extends JFrame {

    private static final Logger LOGGER = LoggerFactory.getLogger(DDDEngine.class);

    static JFrame frame = new DDDEngine();
    //Screen screen = new Screen();
    public DDDEngine() throws HeadlessException {
        //add(screen);
        setUndecorated(false);
        setVisible(true);
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        LOGGER.info("Hello World");
        //System.out.println("Hello world!");
    }
}