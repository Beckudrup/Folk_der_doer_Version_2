import processing.core.PApplet;

public class indputField {
PApplet p;
boolean isInside;
String inPut = "";
int x,y,w,h;

    indputField(int x, int y,int w,int h){
this.x=x;
this.y=y;
this.w=w;
this.h=h;
    }

    void click(float xin, float yin) {

        if (xin > x && xin < x + w && yin < y + h && yin > y) {
            isInside= true;
        }else{
            isInside=false;
        }

    }

public void display(){
    p.rect(x,y,w,h);

}
public void textInsideField(char key){
if (isInside){
    if (key==p.BACKSPACE){
        inPut= inPut.substring(0,inPut.length()-1);
    }else {
        inPut = inPut + key;
    }

}

}
}
