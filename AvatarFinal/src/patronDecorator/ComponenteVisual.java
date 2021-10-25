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
public interface ComponenteVisual {

    public void dibujar(Graphics g);

    public String getDescripcion();
    
    public void setActualizarImagen(BufferedImage img);
}
