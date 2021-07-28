package mr.adkhambek.nav.ui.bottom.c.child

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import mr.adkhambek.nav.R
import mr.adkhambek.nav.databinding.Account1FragmentBinding


@AndroidEntryPoint
class AccountInner1Fragment : Fragment(R.layout.account_1_fragment) {

    private val vm: AccountInner1ViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = Account1FragmentBinding.bind(view)

    }
}