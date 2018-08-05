package tech.rtsproduction.amritsartourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TouristActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new TouristAttFragment()).commit();
    }

}
