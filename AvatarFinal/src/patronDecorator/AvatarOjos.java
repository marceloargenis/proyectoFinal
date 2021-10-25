/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronDecorator;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author MarceloVillca
 */
public class AvatarOjos extends AvatarDecorador {

    private BufferedImage img;
   
    public AvatarOjos(ComponenteVisual avatarDecorado, BufferedImage img) throws IOException {
        super(avatarDecorado);
        this.img = img;
    }
    public void dibujar(Graphics g) {
        super.dibujar(g);
        g.drawImage(img, 0, 0, null);
        System.out.println("ojos");
    }

    public String getDescripcion(){
        return super.getDescripcion() + ", incluye los ojos";
    }

    @Override
    public void setActualizarImagen(BufferedImage img) {
        this.img = img;
    }
}
