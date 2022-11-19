package com.example.affirmationapp.data

import com.example.affirmationapp.R
import com.example.affirmationapp.model.Affirmation

class DataSource {
    fun loadAffirmations(): List<Affirmation>{
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1)
        )
    }
}