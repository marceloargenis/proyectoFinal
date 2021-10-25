/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronDecorator;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

/**
 *
 * @author MarceloVillca
 */
public abstract class AvatarDecorador implements ComponenteVisual {

    private ComponenteVisual avatarDecorado;

    public AvatarDecorador(ComponenteVisual avatarDecorado) {
        this.avatarDecorado = avatarDecorado;
    }
    public void dibujar(Graphics g) {
        avatarDecorado.dibujar(g);
    }
    public String getDescripcion() {
        return avatarDecorado.getDescripcion();
    }
     public void getImgasd(BufferedImage img) {
         avatarDecorado.setActualizarImagen(img);
    }
}
