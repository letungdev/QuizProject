/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 * @author USER
 */
public class JTreeProcess {

    public static void setSubjectCombox(JComboBox comboBox, ArrayList<String> array) {
        for (int i = 0; i < array.size(); i++) {

            comboBox.addItem(array.get(i));

        }
    }
// new 
}
