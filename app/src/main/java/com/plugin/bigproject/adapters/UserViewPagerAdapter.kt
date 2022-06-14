package com.plugin.bigproject.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.plugin.bigproject.fragments.BookinghistoryFragment
import com.plugin.bigproject.fragments.DetailuserFragment

class UserViewPagerAdapter(fragmentManager : FragmentManager, lifecycle: Lifecycle) :FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int {
        return 1
    }

    override fun createFragment(position: Int): Fragment {
        var fragment = Fragment()
        when(position){
            0 -> fragment = DetailuserFragment()
//            1 -> fragment = BookinghistoryFragment()
        }
        return fragment
    }
}