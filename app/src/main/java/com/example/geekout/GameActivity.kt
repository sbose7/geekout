package com.example.geekout

import android.app.Activity
import android.os.Bundle
import com.google.firebase.database.*

class GameActivity: Activity() {
    // Todo: Implement Game
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Sets the Content View to the default view: Menu
        setContentView(R.layout.game)
    }
}