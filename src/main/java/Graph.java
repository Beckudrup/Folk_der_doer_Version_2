import processing.core.PApplet;

public class Graph extends DataBroker {

PApplet p;

    Graph() {



    }

    public void display(DataBroker db, indputField country, indputField year){

        for (int i = 0; i < 114; i++) {
            int yearInt = 2015-i;
            String yearString = yearInt+"";
            if(year.inPut.equalsIgnoreCase(yearString))

            p.fill(p.random(0,255),p.random(0,255),p.random(0,255));
            p.rect(100+i*15,p.height-55,10, -db.getData(yearString,country.inPut));
            p.fill(0,0,0);
        }

    }
}
