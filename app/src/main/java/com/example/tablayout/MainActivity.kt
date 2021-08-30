package com.example.tablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tablayout.fragment.FavouriteFragment
import com.example.tablayout.fragment.HomeFragment
import com.example.tablayout.fragment.ProfileFragment
import com.example.tablayout.fragment.SettingsFragment
import com.example.tablayout.fragment.adapters.viewPageAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupTabs()
    }
    private fun setupTabs(){
        val adapter=viewPageAdapter(supportFragmentManager)
        adapter.addFragment(HomeFragment())
        adapter.addFragment(FavouriteFragment())
        adapter.addFragment(SettingsFragment())
        adapter.addFragment(ProfileFragment())
        viewPage.adapter = adapter
        tabs.setupWithViewPager(viewPage)
        tabs.getTabAt(0)!!.setIcon(R.drawable.ic_baseline_home_24)
        tabs.getTabAt(1)!!.setIcon(R.drawable.ic_baseline_favorite_24)
        tabs.getTabAt(2)!!.setIcon(R.drawable.ic_baseline_settings_24)
        tabs.getTabAt(3)!!.setIcon(R.drawable.ic_baseline_person_outline_24)
    }
}