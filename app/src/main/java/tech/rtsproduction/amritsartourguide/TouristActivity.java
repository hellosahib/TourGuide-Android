package tech.rtsproduction.amritsartourguide;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class TouristActivity extends AppCompatActivity {

    Toolbar toolbar;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourist);

        toolbar = findViewById(R.id.toolbarTourist);
        listView = findViewById(R.id.listViewTourist);
        toolbar.setTitle("Tourist Attractions");
        toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        final ArrayList<LocationClass> touristAttList = new ArrayList<>();
        touristAttList.add(new LocationClass("Golden Temple", " Golden Temple Rd, Atta Mandi, Katra Ahluwalia, Amritsar", R.drawable.golden_temple, "The Golden Temple, also known as Sri Harmandir Sahib or Darbar Sahib, is a Gurdwara located in the city of Amritsar, Punjab, India. It is the holiest Gurdwara and the most important pilgrimage site of Sikhism"));
        touristAttList.add(new LocationClass("Jallianwala Bagh", "Golden Temple Rd, Amritsar", R.drawable.jalliawala, "Jallianwala Bagh (Hindi: जलियांवाला बाग़) is a public garden in Amritsar, and houses a memorial of national importance, established in 1951 by the Government of India, to commemorate the massacre of peaceful celebrators including unarmed women and children by British occupying forces, on the occasion of the Punjabi New Year (Baisakhi)on 13 April 1919 in the Jallianwala Bagh Massacre. Colonial British Raj sources identified 379 fatalities and estimated about 1100 wounded.[1] Civil Surgeon Dr. Smith indicated that there were 1,526 casualties.[2] The true figures of fatalities are unknown, but are very likely to be many times higher than the official figure of 379"));
        touristAttList.add(new LocationClass("Gobindgarh Fort", "Old Cantt Road, Vijay Chowk, Inside Lohgarh Chowk, Amritsar", R.drawable.gobindgarh, "Gobindgarh Fort is a historic fort located in the center of the city of Amritsar in the Indian state of Punjab. The Fort was earlier occupied by the army but is now open to the public from 10 February 2017.Today the fort is being developed as a unique live museum, as a repository of Punjab’s history"));
        touristAttList.add(new LocationClass("Khalsa College", "G.T. Road, Amritsar", R.drawable.khalsa, "Khalsa College was built as an educational institute during the British Raj in India when Sikh scholars thought about providing higher education to Sikhs and Punjabis within Punjab. Amritsar was chosen for its establishment and Singh Sabha Movement and Chief Khalsa Diwan approached the then Sikh Maharajas and Sikh people of Punjab to raise funds and donate land to build this unique institute. People of Amritsar, Lahore and other cities of Punjab including rich Sikh families and Maharajas donated land and raised funds to build Khalsa College, Amritsar. Its architectural design was created by Ram Singh, a famous architect who also designed one of the Places in England. Its building was completed in 1911–12. Its architectural features are mix of British, Mughal and Sikh architect"));
        touristAttList.add(new LocationClass("Durgiana Temple", "Hathi Gate, Goal Bagh, Amritsar", R.drawable.durgiana, "The Durgiana Temple(ਦੁਰਗਿਆਨਾ ਮੰਦਿਰ), also known as Lakshmi Narayan Temple, Durga Tirath and Sitla Mandir, is a premier temple situated in the city of Amritsar, Punjab, India.[1] Though a Hindu temple, its architecture is similar to the Golden Temple.[2] This temple derives its name from the Goddess Durga, the chief Goddess deified and worshipped here. Idols of Goddess Laksmi (goddess of wealth) and Vishnu (the protector of the world) are also deified here and worshipped"));
        touristAttList.add(new LocationClass("Mata Lal Devi Temple", "Model Town, Rani Ka Bagh, Amritsar", R.drawable.matatemple, "The Mata Lal Devi Temple, (also known as the Param Pujya Mata Lal Devi Mandir)  is a sacred Hindu temple that dedicated to a 20th century bespectacled female saint named Lal Devi. The temple is considered to be full of miraculous fertility-improving powers and so is very popular in this country that values children and family so highly. The temple is especially popular and important for women who wish to start a family as it is believed that women who come to pray here have children shortly after and because of this the temple attracts devotees from all over India"));
        touristAttList.add(new LocationClass("Maharaja Ranjit Singh Museum", "Ram Bagh, Lawrence Road, Amritsar", R.drawable.ranjitmuseum, "Maharaja Ranjit Singh Museum was originally the summer palace of first king of Sikh Empire, Maharaja Ranjit Singh. Later, it was converted in to museum in 1977 CE. It is a treasure house of the history, art and architecture of the Sikhs of the 18th and the 19th century AD .The museum offers insights into the life of the Sikh monarch Maharaja Ranjit Singh. The Museum displays objects connecting to Maharaja Ranjit Singh such as arms and armour, outstanding paintings and centuries old coins and manuscripts. The paintings displayed in the galleries of the museum showcase the court and camp of the king. Among all the paintings, one that depicts the city of Lahore is most famous"));
        touristAttList.add(new LocationClass("Mall Of Amritsar", "G.T Road Amritsar", R.drawable.alphaone, "The Mall Of Amritsar is the city’s definitive social and shopping destination. Mall Of Amritsar packs in a complete package of entertainment and shopping experience for its patrons. Spread across 5,35,241 square feet of retail space, the Mall Of The design is ergonomically defined by high quality standards and urbane architecture. Home to over 250 regional, national and international brands, the Mall Of Amritsar brings a novel shopping experience for all its patrons. A crowd favourite, the Mall of Amritsar is undergoing a surreal metamorphosis that not only includes churning of brands but also changing circulation for the patrons in the mall. The food court is being relocated and we now have several brands that will not only be First in city but also first in Punjab. Get ready to witness state of the art infrastructure, a larger atrium, a world class brand new food court and first in city international brands only at Punjab’s only cultural, social and shopping destination"));
        touristAttList.add(new LocationClass("Guru Nanak Dev University", "GT Road near Railway Station Amritsar", R.drawable.gndu, "uru Nanak Dev University (G.N.D.U.) was established at Amritsar, Punjab, India on 24 November 1969 to commemorate Guru Nanak Dev's birth quincentenary celebrations. Guru Nanak Dev University campus is spread over 500 acres (2 km²) near village of Kot Khalsa, nearly 8 km west of the Amritsar, next to Khalsa College, Amritsar. G.N.D.U. is both a residential and an affiliating university"));

        LocationAdapter adapter = new LocationAdapter(this, touristAttList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                LocationClass object = touristAttList.get(i);
                showAlert(object);

            }
        });


    }

    private void showAlert(LocationClass object) {
        AlertDialog.Builder alertAdd = new AlertDialog.Builder(TouristActivity.this);
        alertAdd.setTitle(object.getLocationTitle());
        LayoutInflater inflater = LayoutInflater.from(TouristActivity.this);

        final View view1 = inflater.inflate(R.layout.activity_detail, null);
        TextView t1 = view1.findViewById(R.id.subtitleTextDetail);
        t1.setText(object.getLocationSubtitle());
        TextView t2 = view1.findViewById(R.id.locationTextDetail);
        t2.setText(object.getLocationAddress());
        ImageView i1 = view1.findViewById(R.id.imageDetail);
        if (object.getLocationPhoto() != -1) {
            i1.setImageResource(object.getLocationPhoto());
        }

        alertAdd.setView(view1);
        alertAdd.setNeutralButton("Done", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        alertAdd.show();
    }
}
