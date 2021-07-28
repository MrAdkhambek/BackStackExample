package mr.adkhambek.nav.ui.bottom.a

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import dagger.hilt.android.AndroidEntryPoint
import mr.adkhambek.nav.R
import mr.adkhambek.nav.databinding.HomeFragmentBinding
import mr.adkhambek.nav.ui.BackButtonListener


@AndroidEntryPoint
class HomeFragment : Fragment(R.layout.home_fragment), BackButtonListener {

    private val vm: HomeViewModel by viewModels()
    private val innerNavController: NavController by lazy {
        val navHostFragment = childFragmentManager.findFragmentById(R.id.navHostFragmentA) as NavHostFragment
        navHostFragment.navController
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = HomeFragmentBinding.bind(view)
    }

    override fun onBackPressed(): Boolean {
        return innerNavController.navigateUp().not()
    }
}