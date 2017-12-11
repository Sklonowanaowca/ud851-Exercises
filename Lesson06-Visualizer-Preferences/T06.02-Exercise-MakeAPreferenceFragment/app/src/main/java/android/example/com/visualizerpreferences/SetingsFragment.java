package android.example.com.visualizerpreferences;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.support.v7.preference.PreferenceFragmentCompat;

/**
 * Created by Monia on 2017-12-05.
 */
// (2) Create a class called SettingsFragment that extends PreferenceFragmentCompat
public class SetingsFragment extends PreferenceFragmentCompat{
    // (5) In SettingsFragment's onCreatePreferences method add the preference file using the
    // addPreferencesFromResource method
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.pref_visualizer);
    }
}
