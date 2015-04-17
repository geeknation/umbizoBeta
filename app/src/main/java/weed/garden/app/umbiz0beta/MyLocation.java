package weed.garden.app.umbiz0beta;

import android.app.Activity;
import android.location.Location;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by IMukunya on 12/23/2014.
 */
public class MyLocation extends Activity {

    public void getHumanLocation(Location location){
        double latitude=location.getLatitude();
        double longitude=location.getLongitude();

        //fetch human location using the Google geocode api
        TextView mylocation=(TextView) findViewById(R.id.myLocation);


        mylocation.setText(latitude+","+longitude);

    }


}
