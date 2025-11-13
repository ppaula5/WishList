package WishList;

import static WishList.Mides.*;
import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PImage;

public class GUI {
    Colors colors;

    //Logo
    PImage logo;
    PImage logoP1;
    PImage logo2P1;

    //Botons
    public static Botons b1;

    //Selects
    public String[] selectValues1 = {"Opcio 1", "Opcio 2"};
    public static Select s1;

    //Enumerat de les pantalles de l'app
    public enum PANTALLA {LOGIN, INICIAL, SETTINGS, CREACIONCLUB, JUGADAS, PLANNING};

    //Pantalla actual
    public static PANTALLA pantallaActual;

    //Text Field
    public static Text_Field text1, text2;

    public GUI(PApplet p5){
        pantallaActual = PANTALLA.LOGIN;

        colors = new Colors(p5);

        logo = p5.loadImage("data/LOGO.JPG");
        logoP1 = p5.loadImage("data/logoP1.JPG");
        logo2P1 = p5.loadImage("data/logo2P1.JPG");

        b1 = new Botons(p5,"Login", p5.width/2-200,p5.height/2+200,400,50);
        s1 =new Select(selectValues1, p5.width/2-200,p5.height/2+200,100, 50);
        text1 = new Puntets(p5, p5.width/2-200, p5.height/2+125, 400,50);
        text2 = new Text_Field(p5, p5.width/2-200, p5.height/2+70, 400,50);
    }
    //Pantalles GUI

    public void dibujoPantallaLogIn(PApplet p5){
        p5.background (colors.getColorAt(0));
        logoLogIn(p5, logo);
        b1.display(p5);
        text1.display(p5);
        text2.display(p5);
       // p5.textSize(20);
       //p5.text("contrasenya", p5.width/2-190, p5.height/2+157);
       // p5.textSize(20);
        //p5.text("usuari", p5.width/2-190, p5.height/2+105);

    }

    public void dibujoPantallaInicial(PApplet p5){
        p5.background (colors.getColorAt(0));
        logoP1(p5, logoP1);
        logo2P1(p5, logo2P1);
        //s1.display(p5);
    }

    //Zones de la GUI
    public static void logoP1(PApplet p5, PImage logoP1){
        p5.fill(250, 250, 0);
        //p5.circle(p5.width/2,p5.height/2, 30);
        logoP1.resize(98, 0);
        p5.imageMode(PApplet.CENTER);
        p5.image(logoP1, 150, 100);
    }
    public static void logo2P1(PApplet p5, PImage logo2P1){
        p5.fill(250, 250, 0);
        //p5.circle(p5.width/2,p5.height/2, 30);
        logo2P1.resize(300, 0);
        p5.imageMode(PApplet.CENTER);
        p5.image(logo2P1, 348, 100);
    }

   public static void logoLogIn(PApplet p5, PImage logo){
      p5.fill(250, 250, 0);
      //p5.circle(p5.width/2,p5.height/2, 30);
       logo.resize(300, 0);
       p5.imageMode(PApplet.CENTER);
      p5.image(logo, p5.width/2, p5.height/2-100);
    }

    public static void zonaLogo(PApplet p5){
       p5.fill(200,50,100);
       p5.rect(marginH, marginV, logoWidth, logoHeight);
       p5.fill(0);
       p5.text("LOGO", marginH + logoWidth/2, marginV + logoHeight/2);
    }

    public static void sideBar(PApplet p5){
        // Zona Sidebar ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        p5.fill(50,200,100);
        p5.rect(marginH, 2*marginV + logoHeight, sidebarWidth, sidebarHeight);
        p5.fill(0);
        p5.text("SIDEBAR", marginH + sidebarWidth/2, marginV + logoHeight + sidebarHeight/2);
    }
}