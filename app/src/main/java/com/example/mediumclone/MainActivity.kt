package com.example.mediumclone

import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout

class MainActivity : AppCompatActivity() {

    private lateinit var drawer_layout_main_activity: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id.toolbar_main_activity)
        drawer_layout_main_activity = findViewById(R.id.drawer_layout_main_activity)

        val actionBarDrawerToggle = ActionBarDrawerToggle(
            this,
            drawer_layout_main_activity,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )

        drawer_layout_main_activity.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()

    }

    override fun onBackPressed() {
        if (drawer_layout_main_activity.isDrawerOpen(GravityCompat.START)) {
            drawer_layout_main_activity.closeDrawer(GravityCompat.END)
        } else {
            super.onBackPressed()
        }
    }
}