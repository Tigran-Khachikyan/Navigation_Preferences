package com.calcprojects.navigation_preferences

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat

class Preference : PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.preference, rootKey)
    }
}