package com.example.hcc.wanapp.ui.activity

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.design.widget.NavigationView
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import com.example.hcc.wanapp.R
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar.run {
            setSupportActionBar(this)
        }
        drawer.run {
            val toggle = ActionBarDrawerToggle(this@MainActivity,this,toolbar,R.string.my_like,
                    R.string.my_about)
            addDrawerListener(toggle)
            toggle.syncState()
        }
        navigationview.run{
            setNavigationItemSelectedListener(onDrawerNavigationItemSelectedListener)
        }

        bottom_navigation.run{
            setOnNavigationItemReselectedListener (bottomNavigationSelectedListener)
        }




    }

    private val bottomNavigationSelectedListener=
        BottomNavigationView.OnNavigationItemReselectedListener { item ->
            when(item.itemId){
                R.id.navigation_home->{}
                R.id.navigation_type->{}
                R.id.mine->{}
            }
            true
        }


    private val onDrawerNavigationItemSelectedListener=
            NavigationView.OnNavigationItemSelectedListener { item ->
                when (item.itemId){
                    R.id.nav_like->{}
                    R.id.nav_about->{}
                }
              true
            }

}
