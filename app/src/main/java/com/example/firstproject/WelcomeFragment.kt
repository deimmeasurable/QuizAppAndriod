package com.example.firstproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.firstproject.databinding.FragmentWelcomeBinding


class WelcomeFragment : Fragment() {
 private lateinit var welcomeFragmentBinding: FragmentWelcomeBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        welcomeFragmentBinding = FragmentWelcomeBinding.inflate(inflater, container, false)

        val startGameButton =welcomeFragmentBinding.startBtn
        startGameButton.setOnClickListener {
            val navController=findNavController()
            val action = WelcomeFragment.
            navController.navigate(R.id.action_welcomeFragment2_to_quizFragment)
        }

        return welcomeFragmentBinding.root
    }
}