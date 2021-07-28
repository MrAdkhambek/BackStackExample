package mr.adkhambek.cicerone.ui.bottom.a.child.a

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import mr.adkhambek.cicerone.R
import mr.adkhambek.cicerone.databinding.Home1FragmentBinding
import mr.adkhambek.cicerone.ui.BackButtonListener


@AndroidEntryPoint
class HomeInner1Fragment : Fragment(R.layout.home_1_fragment), BackButtonListener {

    private val vm: HomeInner1ViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = Home1FragmentBinding.bind(view)
        binding.navigationBtn.setOnClickListener {
            vm.onClickForward()
        }
    }

    override fun onBackPressed(): Boolean {
        return false
    }
}