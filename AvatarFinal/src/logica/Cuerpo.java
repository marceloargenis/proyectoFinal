/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author MarceloVillca
 */
public class Cuerpo {    
    int posX;
    int posY;
    private String extension =".png";
    private String nombre;
    private String file = "src/imagenes/";
     private BufferedImage imgMiniatura;
    private BufferedImage img;

   public Cuerpo(int posX, int posY, String nombre,String miniatura) throws IOException {
        this.posX = posX;
        this.posY = posY;
        this.nombre = nombre;
        this.imgMiniatura =  ImageIO.read(new File(file+miniatura+extension));
        this.img =  ImageIO.read(new File(file+nombre+extension));
    }
    public void dibujador(Graphics g){
        g.drawImage(img, posX, posY, null);
    }
     public void dibujadorMiniatura(Graphics g){
        g.drawImage(imgMiniatura, posX, posY, null);
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public BufferedImage getImgMiniatura() {
        return imgMiniatura;
    }

    public void setImgMiniatura(BufferedImage imgMiniatura) {
        this.imgMiniatura = imgMiniatura;
    }

    public BufferedImage getImg() {
        return img;
    }

    public void setImg(BufferedImage img) {
        this.img = img;
    }
     

}
