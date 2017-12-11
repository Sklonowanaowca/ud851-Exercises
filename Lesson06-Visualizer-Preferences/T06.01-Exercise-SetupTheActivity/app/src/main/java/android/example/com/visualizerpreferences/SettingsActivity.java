package android.example.com.visualizerpreferences;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

// (1) Create a new Empty Activity named SettingsActivity; make sure to generate the
// activity_settings.xml layout file as well and add the activity to the manifest

// (2) Add a new resource folder called menu and create visualizer_menu.xml
//  (3) In visualizer_menu.xml create a menu item with a single item. The id should be
// "action_settings", title should be saved in strings.xml, the item should never
// be shown as an action, and orderInCategory should be 100

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

    }

}
