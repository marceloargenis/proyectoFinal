/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronDecorator;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 *
 * @author MarceloVillca
 */
public class AvatarBoca extends AvatarDecorador {

    private BufferedImage img;

    public AvatarBoca(ComponenteVisual avatarDecorado, BufferedImage img) throws IOException {
        super(avatarDecorado);
        this.img = img;
    }
     public void dibujar(Graphics g) {
        super.dibujar(g);
        g.drawImage(img, 0, 0, null);
        System.out.println("boca");
    }
    @Override
    public void setActualizarImagen(BufferedImage img) {
        this.img = img;
    }

}
