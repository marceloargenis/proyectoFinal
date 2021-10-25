/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Observable;
import java.util.Observer;

/**
 *
 *
 */
public class Personaje extends Observable {

    private String userName;
    private BufferedImage cuerpo;
    private BufferedImage ojos;
    private BufferedImage boca;

    public Personaje(String userName, BufferedImage cuerpo, BufferedImage ojos, BufferedImage boca) {
        this.userName = userName;
        this.cuerpo = cuerpo;
        this.ojos = ojos;
        this.boca = boca;
    }

    public void dibujador(Graphics g) {
        g.drawImage(cuerpo, 0, 0, null);
        g.drawImage(ojos, 0, 0, null);
        g.drawImage(boca, 0, 0, null);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public BufferedImage getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(BufferedImage cuerpo) {
        this.cuerpo = cuerpo;
        setChanged();
        notifyObservers();
    }

    public BufferedImage getOjos() {
        return ojos;
    }

    public void setOjos(BufferedImage ojos) {
        this.ojos = ojos;
        setChanged();
        notifyObservers();
    }

    public BufferedImage getBoca() {
        return boca;
    }

    public void setBoca(BufferedImage boca) {
        this.boca = boca;
        setChanged();
        notifyObservers();
    }

}
