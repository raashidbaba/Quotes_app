package com.example.affirmationapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

// adding annotations to avoid wrong calls.
data class Affirmation(
    @StringRes val stringResource : Int,
    @DrawableRes val ImageResourceId : Int) {
}