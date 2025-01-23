package com.example.tiroir

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.view.MenuItem
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import com.example.tiroir.databinding.ActivityDeuxBinding
import com.example.tiroir.databinding.ActivityMainBinding
import com.example.tiroir.databinding.ActivityTroisBinding
import com.example.tiroir.databinding.NavHeaderBinding
import com.google.android.material.snackbar.Snackbar

class TroisActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTroisBinding
    private lateinit var actionBarDrawerToggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTroisBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupDrawer()
    }

    private fun setupDrawer() {
        setupDrawerApplicationBar()
        setupDrawerItemSelected()
    }

    private fun setupDrawerApplicationBar() {
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBarDrawerToggle = ActionBarDrawerToggle(this, binding.dlTiroir, R.string.ouvert, R.string.ferme)
        binding.dlTiroir.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()
    }

    private fun setupDrawerItemSelected() {
        binding.nvTiroir.setNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.act1 -> {
                    Snackbar.make(binding.root, "1", Snackbar.LENGTH_SHORT).show()
                    val monIntent = Intent(this, MainActivity::class.java)
                    startActivity(monIntent)
                }
                R.id.act2 -> {
                    Snackbar.make(binding.root, "2", Snackbar.LENGTH_SHORT).show()
                    val monIntent = Intent(this, DeuxActivity::class.java)
                    startActivity(monIntent)
                }
                R.id.act3 -> {
                    Snackbar.make(binding.root, "1", Snackbar.LENGTH_SHORT).show()
                    val monIntent = Intent(this, TroisActivity::class.java)
                    startActivity(monIntent)
                }
            }
            false
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        actionBarDrawerToggle.syncState()
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        actionBarDrawerToggle.onConfigurationChanged(newConfig)
        super.onConfigurationChanged(newConfig)
    }
}