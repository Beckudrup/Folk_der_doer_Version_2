import processing.core.PApplet;

public class Graph extends DataBroker {

PApplet p;

    Graph() {



    }

    public void display(DataBroker db, indputField country, indputField year){

        for (int i = 0; i < 114; i++) {
            int yearInt = 2014-i;
            String yearString = yearInt+"";
            if(year.inPut.equalsIgnoreCase(yearString))

            p.noStroke();
            p.fill(255,0,0);
            p.rect(40+i*15,p.height-35,10, -db.getData(yearString,country.inPut));
            p.stroke(0);
        }

    }
}
