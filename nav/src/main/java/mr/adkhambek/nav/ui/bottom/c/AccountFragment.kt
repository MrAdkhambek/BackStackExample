package mr.adkhambek.nav.ui.bottom.c

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import mr.adkhambek.nav.R
import mr.adkhambek.nav.databinding.AccountFragmentBinding


@AndroidEntryPoint
class AccountFragment : Fragment(R.layout.account_fragment) {

    private val vm: AccountViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = AccountFragmentBinding.bind(view)

    }
}