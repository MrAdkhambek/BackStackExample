package mr.adkhambek.cicerone.ui.bottom

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import dagger.hilt.android.AndroidEntryPoint
import mr.adkhambek.cicerone.R
import mr.adkhambek.cicerone.databinding.MainFragmentBinding
import mr.adkhambek.cicerone.ui.BackButtonListener


@AndroidEntryPoint
class MainFragment : Fragment(R.layout.main_fragment), BackButtonListener {

    private val vm: MainViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = MainFragmentBinding.bind(view)
        setUpNavigation(binding)
    }

    private fun setUpNavigation(binding: MainFragmentBinding) {
        selectTab(Tab.HOME)
        binding.bottomNavigationView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.homeFragment -> selectTab(Tab.HOME)
                R.id.searchFragment -> selectTab(Tab.SEARCH)
                R.id.accountFragment -> selectTab(Tab.ACCOUNT)
                else -> throw IllegalArgumentException("Unknown menu item by id = ${it.itemId}")
            }
            true
        }
    }

    private val currentTabFragment: Fragment?
        get() = childFragmentManager.fragments.firstOrNull { !it.isHidden }

    private fun selectTab(tab: Tab) {
        val currentFragment = currentTabFragment
        val newFragment = childFragmentManager.findFragmentByTag(tab.name)

        if (currentFragment != null && newFragment != null && currentFragment == newFragment) return

        childFragmentManager.beginTransaction().apply {
            if (newFragment == null) add(
                R.id.bottom_host_fragment,
                tab.create(childFragmentManager.fragmentFactory),
                tab.name
            )

            currentFragment?.let {
                setMaxLifecycle(it, Lifecycle.State.STARTED)
                hide(it)
            }

            newFragment?.let {
                setMaxLifecycle(it, Lifecycle.State.RESUMED)
                show(it)
            }
        }.commitNow()
    }

    override fun onBackPressed(): Boolean {
        val listener = currentTabFragment as? BackButtonListener?
        return listener?.onBackPressed() ?: true
    }
}

