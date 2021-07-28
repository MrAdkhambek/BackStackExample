package mr.adkhambek.cicerone.ui.bottom

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import mr.adkhambek.cicerone.ui.bottom.a.HomeFragment
import mr.adkhambek.cicerone.ui.bottom.b.SearchFragment
import mr.adkhambek.cicerone.ui.bottom.c.AccountFragment


enum class Tab {
    HOME {
        override fun create(factory: FragmentFactory): Fragment = HomeFragment()
    },
    SEARCH {
        override fun create(factory: FragmentFactory): Fragment = SearchFragment()
    },
    ACCOUNT {
        override fun create(factory: FragmentFactory): Fragment = AccountFragment()
    };

    abstract fun create(factory: FragmentFactory): Fragment
}