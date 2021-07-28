package mr.adkhambek.nav.ui.bottom.a.child.b

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import mr.adkhambek.nav.R
import mr.adkhambek.nav.databinding.Home2FragmentBinding


@AndroidEntryPoint
class HomeInner2Fragment : Fragment(R.layout.home_2_fragment) {

    private val vm: HomeInner2ViewModel by viewModels()
    private val navController: NavController by lazy(LazyThreadSafetyMode.NONE) {
        findNavController()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = Home2FragmentBinding.bind(view)
        binding.navigationBtn.setOnClickListener {
            navController.navigate(HomeInner2FragmentDirections.actionToHomeInner3Fragment())
        }
        binding.navigationBackBtn.setOnClickListener {
            navController.popBackStack()
        }
    }
}