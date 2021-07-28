package mr.adkhambek.cicerone.ui.bottom.c.child

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import mr.adkhambek.cicerone.R
import mr.adkhambek.cicerone.databinding.Account1FragmentBinding
import mr.adkhambek.cicerone.ui.BackButtonListener


@AndroidEntryPoint
class AccountInner1Fragment : Fragment(R.layout.account_1_fragment), BackButtonListener {

    private val vm: AccountInner1ViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = Account1FragmentBinding.bind(view)
    }

    override fun onBackPressed(): Boolean {
        return false
    }
}