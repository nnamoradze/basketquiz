package Fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.basketballquiz.R

class ResultFragment:Fragment(R.layout.result_fragment) {

    private lateinit var resultText: TextView
    private lateinit var restartBtn: Button



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)

        var name = ResultFragmentArgs.fromBundle(requireArguments()).name
        var playerscore = ResultFragmentArgs.fromBundle(requireArguments()).playerScore

        resultText = view.findViewById(R.id.resultTextView)
        restartBtn = view.findViewById(R.id.restartButton)

        resultText.text = "გილოცავ ${name} შენ დააგროვე ${playerscore}/5 ქულა"

        restartBtn.setOnClickListener {

            findNavController().navigate(ResultFragmentDirections.actionResultFragmentToHomeFragment())


        }


    }
}