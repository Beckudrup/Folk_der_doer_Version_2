import processing.core.PApplet;

public class main extends PApplet {

    DataBroker db= new DataBroker();

    public static void main(String[] args ) { PApplet.main("main");
    }

    @Override
    public void settings() {
        super.settings();
        db.p = this;
        db.breakData();
    }

    @Override
    public void setup() {
        super.setup();


        }

    }




