package mr.adkhambek.nav.ui.auth

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import mr.adkhambek.nav.R
import mr.adkhambek.nav.databinding.AuthFragmentBinding


@AndroidEntryPoint
class AuthFragment : Fragment(R.layout.auth_fragment) {

    private val vm: AuthViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = AuthFragmentBinding.bind(view)
        binding.navigationBtn.setOnClickListener {
            vm.navigateMain()
        }
    }
}