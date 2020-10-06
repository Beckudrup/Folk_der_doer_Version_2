import processing.core.PApplet;

public class main extends PApplet {

    DataBroker db= new DataBroker();
    indputField country = new indputField(300,30,300,50);
    indputField year = new indputField(300,100,300,50);
    Graph g = new Graph();
    public static void main(String[] args ) {
        PApplet.main("main");
    }

    @Override
    public void settings() {
        super.settings();
        fullScreen();
        db.p = this;
        db.breakData();
        country.p = this;
        year.p = this;
        g.p = this;

       // println(db.getData("ALBANIA",table.getInt(1,(int)random(4,table.getColumnCount()))));
        // println(db.getData(String.valueOf(2009),"HUNGARY"));


    }

    @Override
    public void setup() {

        }

    public void draw(){
        clear();
        background(180);

        strokeWeight(5);
        line(30, height-30, width-30, height-30);
        line(30, 200, 30, height-30);
        strokeWeight(2);
        g.display(db,country,year);


        if (year.isInside==true){
            fill(255,0,0);
            triangle(620,120,650,110,650,130);
            fill(255,255,255);
        }
        if (country.isInside==true){
            fill(255,0,0);
            triangle(620,50,650,40,650,60);
            fill(255,255,255);
        }
        fill(255);
        year.display();
        country.display();
fill(0);
        textSize(32);
        text(year.inPut,320,140);
        text(country.inPut,320,70);
        fill(255,255,0);
        text("Deaths:"+db.getData(year.inPut,country.inPut)/2,1200,70);
        text("County",100,50);
        text("Year",100,150);
        fill(255);

    }
    public void mousePressed(){

        year.click(mouseX,mouseY);
        country.click(mouseX,mouseY);
    }
    public void keyTyped(){
    country.textInsideField(key);
    year.textInsideField(key);
    }
    }




