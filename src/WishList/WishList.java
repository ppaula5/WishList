package WishList;

import processing.core.PApplet;



public class WishList extends PApplet{

    Fonts appFonts;
    GUI appGUI;


    public static void main(String[] args) {
        PApplet.main("WishList.WishList");
    }

    public void settings(){
        fullScreen();
    }
    public void setup(){
        appFonts = new Fonts(this);
        appGUI = new GUI(this);
    }

    public void draw(){

        background(0);

        textFont(appFonts.getFirstTipografia());
        text("Titulo de la App", 50, 200);

        fill(50);
        textFont(appFonts.getSecondTipografia());
        text("Subtitulo de la App", 50, 250);

        fill(55,0,0);
        textFont(appFonts.getThirdTipografia());
        text("Paragrafo de la App", 50,300);

        switch(GUI.pantallaActual) {
            case LOGIN:
                appGUI.dibujoPantallaLogIn(this);
                break;

            case INICIAL:
                appGUI.dibujoPantallaInicial(this);
                break;
        }

        appFonts.displayTipografia(this, 100,400,500);

    }


    public void keyPressed(){
        if(key=='0'){
            GUI.pantallaActual = GUI.PANTALLA.LOGIN;
        }
        else if(key=='1'){
            GUI.pantallaActual = GUI.PANTALLA.INICIAL;
        }

    }

    public void mousePressed(){
        if(GUI.b1.mouseOverButton(this)){
            println("B1 has been pressed!!");
        }
        if (GUI.b2.mouseOverButton(this)){
            println("B2 has been pressed");
        }
    }

}
