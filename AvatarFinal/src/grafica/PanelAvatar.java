/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafica;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JPanel;
import logica.Cuerpo;
import logica.Ojos;
import logica.Personaje;
import logica.Singleton;
import patronDecorator.Avatar;
import patronDecorator.AvatarBoca;
import patronDecorator.AvatarDecorador;
import patronDecorator.AvatarOjos;
import patronDecorator.ComponenteVisual;

/**
 *
 * @author MarceloVillca
 */
public class PanelAvatar extends JPanel implements Observer {

    private String nameAvatar = "pedrito";
    private String nameImg = "cuerpo2";
    private Personaje avatar;
    private Singleton singleton;
    Personaje personaje;

    public PanelAvatar(){
        this.setSize(171, 280);
        this.setLocation(250, 70);
        this.setBackground(Color.CYAN);
        singleton = Singleton.getInstance();
        avatar = new Personaje(nameImg, null, null, null);
        avatar.addObserver(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        avatar.dibujador(g);
    }

    public void addElementos(String item, BufferedImage img) {
        switch (item) {
            case "ninguno":
                break;
            case "cuerpo":
                avatar.setCuerpo(img);
            case "ojos":
                avatar.setOjos(img);
                break;
            case "boca":
                avatar.setBoca(img);
                break;
        }
    }

    public void guardarAvatar(String nombre) {
        avatar.setUserName(nombre);
        Personaje avatarTemp = new Personaje(nombre, avatar.getCuerpo(), avatar.getOjos(), avatar.getBoca());
        singleton.getInstance().AddAvatarToList(avatarTemp);
          ArrayList<Personaje> Lista = singleton.getInstance().getListaAvatars();
        for (Personaje av : Lista) {
            System.out.println(av.getUserName());
        }
        System.out.println("---------");
        
    }

    @Override
    public void update(Observable o, Object o1) {
        repaint();
    }

}
