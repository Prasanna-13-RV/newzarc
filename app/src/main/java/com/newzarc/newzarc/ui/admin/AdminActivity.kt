package com.newzarc.newzarc.ui.admin

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationView
import com.newzarc.newzarc.AddFragment
import com.newzarc.newzarc.DashboardFragment
import com.newzarc.newzarc.R
import com.newzarc.newzarc.ui.ViewsActivity
import com.newzarc.newzarc.ui.ViewsApiActivity

class AdminActivity : AppCompatActivity() {
    private lateinit var toggle : ActionBarDrawerToggle
    private lateinit var drawerLayout: DrawerLayout

    @SuppressLint("RestrictedApi", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin)

        drawerLayout = findViewById(R.id.drawerLayout)
        val navigationView : NavigationView = findViewById(R.id.navigationView)

        replaceFragment(DashboardFragment(), "Dashboard")

        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navigationView.setNavigationItemSelectedListener {


            it.isChecked = true

            when(it.itemId) {
                R.id.dashboardFragment -> Toast.makeText(applicationContext, "Clicked Home", Toast.LENGTH_SHORT).show()
                R.id.addFragment -> replaceFragment(AddFragment(), it.title.toString())
//                R.id.viewsActivity -> replaceFragment(ViewsFragment(), it.title.toString())
                R.id.viewsActivity -> clickMe(ViewsActivity(), "View News")
                R.id.viewsApiActivity -> clickMe(ViewsApiActivity(), "View News")
                R.id.updateFragment -> clickMe(UpdateActivity(), "Update News")
            }
            true
        }
    }


    private fun replaceFragment(fragment: Fragment, title: String) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout, fragment)
        fragmentTransaction.commit()
        drawerLayout.closeDrawers()
        setTitle(title)
    }

    private fun clickMe( activity: Activity, title : String) {
        val intent = Intent(this, activity::class.java)
        startActivity(intent)
        drawerLayout.closeDrawers()
        setTitle(title)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}