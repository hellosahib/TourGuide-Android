package tech.rtsproduction.amritsartourguide;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class RestaurantActivity extends AppCompatActivity {

    android.support.v7.widget.Toolbar toolbar;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        toolbar = findViewById(R.id.toolbarRestaraunts);
        listView = findViewById(R.id.listViewRestaraunts);

        toolbar.setTitle("Restaurants Info");
        toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);
        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        final ArrayList<LocationClass> restraList = new ArrayList<>();
        restraList.add(new LocationClass("Haveli","Amritsar-Jalandhar Highway",-1,"Haveli has opened its latest restaurant in Amritsar. It reflects the taste and fell of the authentic Punjab. Thoughtfully made and cherished with love, Haveli is becoming a must visit destination in Amritsar. One can expect true Punjabi flavours and a fun outing at Haveli"));
        restraList.add(new LocationClass("Guru Ka Langar","Golden Temple",-1,"A Free Food Service Provided in Golden Temple"));
        restraList.add(new LocationClass("Charming Chicken","3 Janpath Market Shop No | Majitha Road, Amritsar",-1,"Charming chicken offer a pleasant, comfortable dinning atmosphere and an extensive menu of fine selection. Our aim is to provide you fresh, hygienically prepared and reasonably priced food made under the strict family supervision. We offer the warmest of welcomes with relaxing surroundings for the delightful break in your travels & offers both elegant and casual dinning"));
        restraList.add(new LocationClass("Ahuja Milk Bhandar","Near Hindu College,Amritsar",-1,"It's a large shop but served food and drinks on road. So, you need to have their food and drinks standing on road itself. On other words don't expect VIP treatment or dedicated service They sell confectioneries and sweets as well. But we opted only for Kesar Lassi as it sounded cool. Lassi was nice but the thick malai was unmanageable. Loved the quality of it and quantity too. It's a real quick tummy filler. You feel heavy after having just one glass of Lassi"));
        restraList.add(new LocationClass("Kulcha Land","District Shopping Center Ranjeet Avenue Main Road Ranjit Avenue | Opposite M.K. Hotel, Amritsar",-1,"This eatery is located at Ranjit sing avenue very near to Holiday Inn. Limited menu of kulchas & lassi but enough to have the tummy filled.Kulchas here are super crisp, soft & delicious. However the accompliments with kulchas have a place for improvement.Very reasonably priced. Its a small eatery with seating capacity of around 20 people max.Overall a must visit place to try kulchas when in Amritsar"));
        restraList.add(new LocationClass("Kesar Da Dhaba","Chowk Passian | Near Town Hall, Amritsar",-1,"Vegetarian Restraunt with a special Dal Makhani which is cooked for whopping 24 hours.Must Visit for Vegans"));
        restraList.add(new LocationClass("Giani Tea Stall","Cooper Road | Company Bagh, Amritsar, Near Bhandari Bridge, Amritsar",-1,"Nice place to have a good breakfast....majorly Indian stuff. Tea was very good and so were the paneer pakodas. The butter toast comes laden with a slice of butter, with bread toasted the old way, which is yumm"));

        LocationAdapter adapter = new LocationAdapter(this,restraList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                LocationClass object = restraList.get(i);
                showAlert(object);
            }
        });


    }

    private void showAlert(LocationClass object) {
        AlertDialog.Builder alertAdd = new AlertDialog.Builder(RestaurantActivity.this);
        alertAdd.setTitle(object.getLocationTitle());
        LayoutInflater inflater = LayoutInflater.from(RestaurantActivity.this);

        final View view1 = inflater.inflate(R.layout.activity_detail,null);
        TextView t1 = view1.findViewById(R.id.subtitleTextDetail);
        t1.setText(object.getLocationSubtitle());
        TextView t2 = view1.findViewById(R.id.locationTextDetail);
        t2.setText(object.getLocationAddress());
        ImageView i1 = findViewById(R.id.imageDetail);

        alertAdd.setView(view1);
        alertAdd.setNeutralButton("Done", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        alertAdd.show();
    }
}
