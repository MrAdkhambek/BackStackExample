package mr.adkhambek.nav.ui.bottom.b.child.b

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import mr.adkhambek.nav.R
import mr.adkhambek.nav.databinding.Search2FragmentBinding
import mr.adkhambek.nav.ui.bottom.a.child.b.HomeInner2FragmentDirections


@AndroidEntryPoint
class SearchInner2Fragment : Fragment(R.layout.search_2_fragment) {

    private val vm: SearchInner2ViewModel by viewModels()
    private val navController: NavController by lazy(LazyThreadSafetyMode.NONE) {
        findNavController()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = Search2FragmentBinding.bind(view)
        binding.navigationBtn.setOnClickListener {
            navController.navigate(SearchInner2FragmentDirections.actiontToSearchInner3Fragment())
        }
        binding.navigationBackBtn.setOnClickListener {
            navController.popBackStack()
        }
    }
}