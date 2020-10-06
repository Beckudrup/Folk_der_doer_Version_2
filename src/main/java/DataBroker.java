import processing.core.PApplet;

import java.util.ArrayList;

public class DataBroker {

    PApplet p;
    ArrayList<Data> dataListe = new ArrayList<Data>();


    void breakData() {

        String[] data = p.loadStrings("dnd.csv");
        String[] headers = data[0].split(";");
        for (int i = 0; i < data.length; i++) {
            //p.println(data[i]);
            String[] cells = data[i].split(";");
           // p.println(cells);
            for (int j = 1; j < cells.length; j++) {

                String d = cells[j];
                if(d.length() == 0 ) d = "0";
                dataListe.add(new Data(cells[1],d,headers[j]));
                p.println("Dataobjektet LAND:" + cells[1] + " døde: " + d + " årstal : " + headers[j]);
            }
        }
    }
    public int getData(String year, String land){
        int d = 0;
        for(int i = 0; i < dataListe.size(); i++){
            if( land.equalsIgnoreCase(dataListe.get(i).land) && year.equals(dataListe.get(i).year) ){
                d = Integer.parseInt(dataListe.get(i).deaths);

            }
        }
        return d;
    }
}
