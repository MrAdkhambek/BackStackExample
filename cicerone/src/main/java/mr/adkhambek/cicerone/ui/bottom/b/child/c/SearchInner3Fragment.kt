package mr.adkhambek.cicerone.ui.bottom.b.child.c

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import mr.adkhambek.cicerone.R
import mr.adkhambek.cicerone.databinding.Search3FragmentBinding
import mr.adkhambek.cicerone.ui.BackButtonListener


@AndroidEntryPoint
class SearchInner3Fragment : Fragment(R.layout.search_3_fragment), BackButtonListener {

    private val vm: SearchInner3ViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = Search3FragmentBinding.bind(view)
        binding.navigationBackBtn.setOnClickListener {
            vm.onClickBackward()
        }
    }

    override fun onBackPressed(): Boolean {
        vm.onClickBackward()
        return true
    }
}