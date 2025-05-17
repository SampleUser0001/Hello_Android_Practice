package ittimfn.android.sudoku;

import android.os.Bundle;
import android.preference.PreferenceActivity;

import ittimfn.android.sudoku.R;

public class Settings extends PreferenceActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.settings);
    }
}
