package tech.rtsproduction.amritsartourguide;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    NavigationView navigationView;
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbarMain);
        navigationView = findViewById(R.id.navigationMain);
        drawerLayout = findViewById(R.id.drawerLayoutMain);

        toolbar.setTitle("Amritsar Tour Guide");
        toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_menu);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                item.setChecked(true);
                switch (item.getItemId()){
                    case R.id.hotelsMenu:{
                        startActivity(new Intent(MainActivity.this,HotelsActivity.class));
                        break;
                    }
                    case R.id.restaurantsMenu:{
                        startActivity(new Intent(MainActivity.this,RestaurantActivity.class));
                        break;
                    }
                    case R.id.touristAttMenu:{
                        startActivity(new Intent(MainActivity.this,TouristActivity.class));
                        break;
                    }
                    case R.id.transportationMenu:{
                        Toast.makeText(MainActivity.this, "Transportation Clicked", Toast.LENGTH_SHORT).show();
                        break;
                    }
                }
                drawerLayout.closeDrawers();
                return true;
            }
        });


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case android.R.id.home:{
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }
}
