/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafica;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JPanel;
import logica.Boca;
import logica.Cuerpo;
import logica.Ojos;

/**
 *
 * @author MarceloVillca
 */
public class PanelObjeto extends JPanel {

    ArrayList<Cuerpo> lista_cuerpos = new ArrayList<>();
    ArrayList<Ojos> lista_ojos = new ArrayList<>();
    ArrayList<Boca> lista_bocas = new ArrayList<>();

    private String itemObjeto = "";

    public PanelObjeto() {
        this.setSize(171, 280);
        this.setLocation(40, 70);
        this.setBackground(Color.CYAN);
        try {
            cargarCuerpos();
            cargarOjos();
            cargarBocas();
        } catch (Exception e) {

        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        switch (itemObjeto) {
            case "ninguno":

                break;
            case "cuerpo":
                for (Cuerpo lista_cuerpo : lista_cuerpos) {
                    lista_cuerpo.dibujadorMiniatura(g);
                }
                break;
            case "ojos":
                for (Ojos lista_ojo : lista_ojos) {
                    lista_ojo.dibujadorMiniatura(g);
                }
                break;
            case "boca":
                for (Boca lista_boca : lista_bocas) {
                    lista_boca.dibujadorMiniatura(g);
                }
                break;
        }
    }

    public void setItemObjeto(String itemObjeto) {
        this.itemObjeto = itemObjeto;
    }

    public BufferedImage SelectObjeto(int x, int y) {
        Rectangle r = new Rectangle(x + 10, y + 10, 50, 50);
        BufferedImage img = null;
        switch (itemObjeto) {
            case "ninguno":
                img = null;
                break;
            case "cuerpo":
                for (Cuerpo lista_cuerpo : lista_cuerpos) {
                    if (r.contains(lista_cuerpo.getPosX() + 50, lista_cuerpo.getPosY() + 50, 20, 20)) {
                        //System.out.println(lista_cuerpo.getNombre());
                        img = lista_cuerpo.getImg();
                    }
                }
                break;
            case "ojos":
                for (Ojos lista_ojo : lista_ojos) {
                    if (r.contains(lista_ojo.getPosX() + 50, lista_ojo.getPosY() + 50, 10, 10)) {
                        // System.out.println(lista_ojo.getNombre());
                        img = lista_ojo.getImg();
                    }
                }
                break;
            case "boca":
                for (Boca lista_boca : lista_bocas) {
                    if (r.contains(lista_boca.getPosX() + 50, lista_boca.getPosY() + 50, 10, 10)) {
                        // System.out.println(lista_boca.getNombre());
                        img = lista_boca.getImg();
                    }
                }
                break;
        }
        return img;
    }

    private void cargarCuerpos() throws IOException {
        lista_cuerpos.add(new Cuerpo(0, 0, "cuerpo2", "cuerpom2"));
        lista_cuerpos.add(new Cuerpo(60, 0, "cuerpo3", "cuerpom3"));
    }

    private void cargarOjos() throws IOException {
        lista_ojos.add(new Ojos(0, 0, "ojos1", "ojosm1"));
        lista_ojos.add(new Ojos(60, 0, "ojos2", "ojosm2"));
        lista_ojos.add(new Ojos(120, 0, "ojos3", "ojosm3"));
    }

    private void cargarBocas() throws IOException {
        lista_bocas.add(new Boca(0, 0, "boca1", "bocam1"));
        lista_bocas.add(new Boca(60, 0, "boca2", "bocam2"));
    }

    public String getItemObjeto() {
        return itemObjeto;
    }

}
