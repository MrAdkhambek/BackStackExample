package mr.adkhambek.cicerone.ui.bottom.b.child.b

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import mr.adkhambek.cicerone.R
import mr.adkhambek.cicerone.databinding.Search2FragmentBinding
import mr.adkhambek.cicerone.ui.BackButtonListener


@AndroidEntryPoint
class SearchInner2Fragment : Fragment(R.layout.search_2_fragment), BackButtonListener {

    private val vm: SearchInner2ViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = Search2FragmentBinding.bind(view)
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