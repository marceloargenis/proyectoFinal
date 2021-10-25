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
public class Avatar implements ComponenteVisual {

    private String username;
    private BufferedImage img;

    public Avatar(String username, BufferedImage img) throws IOException {
        this.username = username;
        this.img = img;
    }

    @Override
    public void dibujar(Graphics g) {
        g.drawImage(img, 0, 0, null);
        System.out.println("cuerpo");
    }

    @Override
    public String getDescripcion() {
        return "avatar normal sin cuerpo";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public BufferedImage getImg() {
        return img;
    }

    public void setImg(BufferedImage img) {
        this.img = img;
    }
    
    @Override
    public void setActualizarImagen(BufferedImage img) {
        this.img = img;
    }

}
