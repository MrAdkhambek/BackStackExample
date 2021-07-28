package mr.adkhambek.nav.ui.bottom.a.child.a

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import mr.adkhambek.nav.R
import mr.adkhambek.nav.databinding.Home1FragmentBinding


@AndroidEntryPoint
class HomeInner1Fragment : Fragment(R.layout.home_1_fragment) {

    private val vm: HomeInner1ViewModel by viewModels()
    private val navController: NavController by lazy(LazyThreadSafetyMode.NONE) {
        findNavController()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = Home1FragmentBinding.bind(view)
        binding.navigationBtn.setOnClickListener {
            navController.navigate(HomeInner1FragmentDirections.actionToHomeInner2Fragment())
        }
    }
}