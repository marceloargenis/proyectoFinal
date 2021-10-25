/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author MarceloVillca
 */
public class Singleton {

    private static Singleton instance;
    private ArrayList<Personaje> ListaAvatar;

    private Singleton() {
        ListaAvatar = new ArrayList<>();
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void AddAvatarToList(Personaje theAvatar) {
        for (Personaje avatar : ListaAvatar){
            if (avatar.getUserName().trim().toUpperCase().equals(theAvatar.getUserName().trim().toUpperCase())) {
                JOptionPane.showMessageDialog(null, "El avatar ya existe", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
        ListaAvatar.add(theAvatar);
    }

    public ArrayList<Personaje> getListaAvatars() {
        return ListaAvatar;
    }
}
