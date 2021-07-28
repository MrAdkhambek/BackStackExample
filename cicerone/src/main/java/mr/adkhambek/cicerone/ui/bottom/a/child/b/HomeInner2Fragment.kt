package mr.adkhambek.cicerone.ui.bottom.a.child.b

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import mr.adkhambek.cicerone.R
import mr.adkhambek.cicerone.databinding.Home2FragmentBinding
import mr.adkhambek.cicerone.ui.BackButtonListener


@AndroidEntryPoint
class HomeInner2Fragment : Fragment(R.layout.home_2_fragment), BackButtonListener {

    private val vm: HomeInner2ViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = Home2FragmentBinding.bind(view)
        binding.navigationBtn.setOnClickListener {
            vm.onClickForward()
        }
        binding.navigationBackBtn.setOnClickListener {
            vm.onClickBackward()
        }
    }

    override fun onBackPressed(): Boolean {
        vm.onClickBackward()
        return true
    }
}