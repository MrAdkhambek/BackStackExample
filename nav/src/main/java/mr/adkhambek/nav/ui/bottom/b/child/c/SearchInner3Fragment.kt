package mr.adkhambek.nav.ui.bottom.b.child.c

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import mr.adkhambek.nav.R
import mr.adkhambek.nav.databinding.Search3FragmentBinding


@AndroidEntryPoint
class SearchInner3Fragment : Fragment(R.layout.search_3_fragment) {

    private val vm: SearchInner3ViewModel by viewModels()
    private val navController: NavController by lazy(LazyThreadSafetyMode.NONE) {
        findNavController()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = Search3FragmentBinding.bind(view)
        binding.navigationBackBtn.setOnClickListener {
            navController.popBackStack()
        }
    }
}