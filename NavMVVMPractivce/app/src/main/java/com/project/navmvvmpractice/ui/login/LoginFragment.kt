package com.project.navmvvmpractice.ui.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.project.navmvvmpractice.BaseFragment
import com.project.navmvvmpractice.R
import com.project.navmvvmpractice.data.remote.login.LoginListener
import com.project.navmvvmpractice.databinding.FragmentLoginBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginFragment : BaseFragment<FragmentLoginBinding>(R.layout.fragment_login), LoginListener {


    val viewModel: LoginViewModel by viewModels()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        viewModel.loginListener = this
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
    }

    override fun onLoginSucess() {
        findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToHomeNavigation())
    }

    override fun onLoginFailure() {

    }



    override fun initView() {

    }


}