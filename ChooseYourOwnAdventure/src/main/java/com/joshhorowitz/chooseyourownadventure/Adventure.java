package com.joshhorowitz.chooseyourownadventure;

/*
 File: Choose Your Own Adventure, The Escape
 Author: Joshua Horowitz
Purpose: This file initializes the DisplayAdventure form for the user
 */

import javax.swing.*;

public class Adventure {

    public static void main(String[] args) {
        DisplayAdventure a = new DisplayAdventure();
        a.setSize(500, 500);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.setVisible(true);
    }
}
