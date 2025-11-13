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
        GUI.text1.keyPressed(key, keyCode);
        GUI.text2.keyPressed(key, keyCode);

    }

    public void mousePressed() {
        if (GUI.pantallaActual == GUI.PANTALLA.LOGIN) {
            if (GUI.b1.mouseOverButton(this)) {
                println("B1 has been pressed!!");
                GUI.pantallaActual = GUI.PANTALLA.INICIAL;
            }
            GUI.text1.isPressed(this);
            GUI.text2.isPressed(this);

        }else if (GUI.pantallaActual == GUI.PANTALLA.INICIAL) {
            // --- Gestión del Select ---
            if (GUI.s1.mouseOverSelect(this)) {
                if (GUI.s1.isCollapsed()) {
                    // Si está cerrado, lo abrimos
                    GUI.s1.toggle();
                } else {
                    // Si está abierto, seleccionamos el valor
                    GUI.s1.update(this);
                    GUI.s1.setCollapsed(true);
                    println("Seleccionado: " + GUI.s1.getSelectedValue());
                }
            } else {
                // Si clicas fuera, se cierra
                GUI.s1.setCollapsed(true);
            }
        }
    }
}