import processing.core.PApplet;

public class Graph extends DataBroker {

PApplet p;
int t;
int k;

    public void display(DataBroker db, indputField country, indputField year){
        if (t%3==0 && k<114) {
            k++;
        }
            for (int i = 0; i <= k; i++) {
                int yearInt = 2014 - i;
                String yearString = yearInt + "";
                p.rect(100 + i * 15, p.height - 55, 10, -db.getData(yearString, country.inPut));
                if (year.inPut.equalsIgnoreCase(yearString)){

                    p.fill(p.random(0, 255), p.random(0, 255), p.random(0, 255));
                    p.rect(100 + i * 15, p.height - 55, 10, -db.getData(yearString, country.inPut));
                    p.fill(0, 0, 0);

            }

        }
        t++;
    }
}
