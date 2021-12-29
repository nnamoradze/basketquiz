package Fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.basketballquiz.R

class HomeFragment : Fragment(R.layout.home_fragment) {

    private lateinit var nameEt: EditText
    private lateinit var startBtn: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nameEt = view.findViewById(R.id.nameEditText)
        startBtn = view.findViewById(R.id.startButton)


        startBtn.setOnClickListener{

            var nameText = nameEt.text.toString()

            if (nameText.isEmpty()){
                return@setOnClickListener
            }

            var name = nameText


            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToQuestionFragment(name))


        }


    }
}