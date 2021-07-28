package mr.adkhambek.nav.ui.bottom

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import dagger.hilt.android.AndroidEntryPoint
import mr.adkhambek.nav.R
import mr.adkhambek.nav.databinding.MainFragmentBinding


@AndroidEntryPoint
class MainFragment : Fragment(R.layout.main_fragment) {

    private val vm: MainViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = MainFragmentBinding.bind(view)
        setUpNavigation(binding)
    }

    private fun setUpNavigation(binding: MainFragmentBinding) {
        val navHostFragment = childFragmentManager.findFragmentById(
            R.id.bottom_host_fragment
        ) as NavHostFragment
        val navController = navHostFragment.navController
        binding.bottomNavigationView.setupWithNavController(navController)
    }
}

