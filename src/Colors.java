import processing.core.PApplet;

public class Colors{

    int[] colorsC;
    int[] colorsO;

    public Colors(PApplet p5){
        this.setColors(p5);
    }

    void setColors(PApplet p5){
        this.colorsC = new int[5];
        this.colorsC[0] = p5.color(0);
        this.colorsC[1] = p5.color(0);
        this.colorsC[2] = p5.color(0);
        this.colorsC[3] = p5.color(0);
        this.colorsC[4] = p5.color(0);

        this.colorsO = new int[5];
        this.colorsO[0] = p5.color(0);
        this.colorsO[1] = p5.color(0);
        this.colorsO[2] = p5.color(0);
        this.colorsO[3] = p5.color(0);
        this.colorsO[4] = p5.color(0);

    }

    public int[] getColorsC() {
        return colorsC;
    }

    public int[] getColorsO() {
        return colorsO;
    }

    public void setColorsC(int[] colorsC) {
        this.colorsC = colorsC;
    }

    public void setColorsO(int[] colorsO) {
        this.colorsO = colorsO;
    }

    public void displayColors(PApplet p5, float x, float y, float w){
        p5.pushStyle();

        p5.fill(0); p5.textAlign(p5.LEFT); p5.textSize(36);
        p5.text("Colors:", x, y-10);

        p5.popStyle();
    }
}