package com.uniba.mv.sudokuapp.persistence

import android.content.Context

internal val Context.settingsDataStore: DataStore<GameSettings> by dataStore (
    
        )