/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.io.IOException;
import java.util.ArrayList;
import patronDecorator.ComponenteVisual;
import patronDecorator.AvatarDecorador;

/**
 *
 * @author MarceloVillca
 */
public class consola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

//        Personaje avatar = new Avatar("pedrito");
//        avatar = new AvatarCuerpo(avatar);
//        avatar.cuerpo();
//        ComponenteVisual avatarDecorado =  new DecoradorCuerpo(new patron.Avatar());
//        avatarDecorado.dibujar();
//        avatarDecorado.getDescripcion();
//        ArrayList<ComponenteVisual> lista_avatars = new ArrayList<>();
//        
//        ComponenteVisual avatar = new patron.Avatar("marce","cuerpo2");
//        avatar = new patron.AvatarOjos(avatar,"ojos1");
//        avatar.dibujar(null);
//        
//        lista_avatars.add(avatar);
/*
        
         //Creo una ventana con barras scrolleables
        ComponenteVisual ventanaDecorada = new DecoradorScrollHorizontal (new DecoradorScrollVertical(new VentanaSimple()));
        ventanaDecorada.dibujar();
        System.out.println();
        
        //Creo una ventana con bordes negros y barra horizontal scrolleable
        ComponenteVisual ventanaDecorada2 = new DecoradorBordeNegro(new DecoradorScrollHorizontal(new VentanaSimple()));
        ventanaDecorada2.dibujar();
        System.out.println();
        
        //Creo una ventana con bordes negros
        ComponenteVisual ventanaDecorada3 = new DecoradorBordeNegro(new VentanaSimple());
        ventanaDecorada3.dibujar();
        */
    }
}
