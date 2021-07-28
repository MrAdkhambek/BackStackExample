package mr.adkhambek.cicerone.ui.bottom.a.child.c

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import mr.adkhambek.cicerone.R
import mr.adkhambek.cicerone.databinding.Home3FragmentBinding
import mr.adkhambek.cicerone.ui.BackButtonListener


@AndroidEntryPoint
class HomeInner3Fragment : Fragment(R.layout.home_3_fragment), BackButtonListener {

    private val vm: HomeInner3ViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = Home3FragmentBinding.bind(view)
        binding.navigationBackBtn.setOnClickListener {
            vm.onClickBackward()
        }
    }

    override fun onBackPressed(): Boolean {
        vm.onClickBackward()
        return true
    }
}