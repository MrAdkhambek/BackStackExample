package mr.adkhambek.nav.ui.bottom.b

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import dagger.hilt.android.AndroidEntryPoint
import mr.adkhambek.nav.R
import mr.adkhambek.nav.databinding.SearchFragmentBinding
import mr.adkhambek.nav.ui.BackButtonListener


@AndroidEntryPoint
class SearchFragment : Fragment(R.layout.search_fragment), BackButtonListener {

    private val vm: SearchViewModel by viewModels()
    private val innerNavController: NavController by lazy {
        val navHostFragment = childFragmentManager.findFragmentById(R.id.navHostFragmentB) as NavHostFragment
        navHostFragment.navController
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = SearchFragmentBinding.bind(view)

    }

    override fun onBackPressed(): Boolean {
        return innerNavController.navigateUp().not()
    }
}