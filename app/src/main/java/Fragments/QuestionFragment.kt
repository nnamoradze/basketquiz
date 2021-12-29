package Fragments

import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.basketballquiz.R

class QuestionFragment: Fragment(R.layout.questions_fragment) {

    private lateinit var questions: TextView
    private lateinit var answer1: CheckBox
    private lateinit var answer2: CheckBox
    private lateinit var answer3: CheckBox
    private lateinit var image: ImageView
    var playerScore = 0




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        questions = view.findViewById(R.id.questionsTextView)
        answer1 = view.findViewById(R.id.answer1CB)
        answer2 = view.findViewById(R.id.answer2CB)
        answer3 = view.findViewById(R.id.answer3CB)
        image = view.findViewById(R.id.imageView)




        answer1.setOnClickListener{
            answer1.isChecked = false

            SecondQuestion()
        }

        answer2.setOnClickListener{
            answer2.isChecked = false
            SecondQuestion()
        }

        answer3.setOnClickListener{
            answer3.isChecked = false
            SecondQuestion()
            playerScore+=1
        }

    }

    fun SecondQuestion(){

        questions.text = "რამდენი ქულა აქვს ჩაგდებული ერთ თამაშში ლეგენდარულ კალათბურთელს, კობი ბრაიანტს"
        answer1.text = "67"
        answer2.text = "81"
        answer3.text = "92"
        image.setImageResource(R.drawable.kobee)

        answer1.setOnClickListener{
            answer1.isChecked = false
            ThirdQuestion()
        }

        answer2.setOnClickListener{
            answer2.isChecked = false
            playerScore+=1
            ThirdQuestion()
        }

        answer3.setOnClickListener{
            answer3.isChecked = false
            ThirdQuestion()
        }



    }

    fun ThirdQuestion() {

        questions.text = "რომელ წელს დაამყარა golden state wariors-მა წაუგებელი სერიების რეკორდი"
        answer1.text = "2014"
        answer2.text = "2018"
        answer3.text = "2017"
        image.setImageResource(R.drawable.gsw_champion)

        answer1.setOnClickListener{
            answer1.isChecked = false
            FourthQuestion()
        }

        answer2.setOnClickListener{
            answer2.isChecked = false
            FourthQuestion()
        }

        answer3.setOnClickListener{
            answer3.isChecked = false
            playerScore+=1
            FourthQuestion()
        }

    }


    fun FourthQuestion(){

        questions.text = "რომელი ქართველეკი კალათბურთელი თამაშობს milwaukee bucks-ში"
        answer1.text = "ზაზა ფაჩულია"
        answer2.text = "გოგა ბითაზე"
        answer3.text = "სანდრო მამუკელაშვილი"
        image.setImageResource(R.drawable.georgia)

        answer1.setOnClickListener{
            answer1.isChecked = false
            FifthQuestion()
        }

        answer2.setOnClickListener{
            answer2.isChecked = false
            FifthQuestion()
        }

        answer3.setOnClickListener{
            answer3.isChecked = false
            playerScore+=1
            FifthQuestion()
        }

    }

    fun FifthQuestion(){

        var name = QuestionFragmentArgs.fromBundle(requireArguments()).name


        questions.text = "ვის აქვს NBA-ში ყველაზე მეტი სამ ქულიანი ჩაგდებული?"
        answer1.text = "Ray Allen"
        answer2.text = "Stephen Curry"
        answer3.text = "KLay Thompson"
        image.setImageResource(R.drawable.samquliani)

        answer1.setOnClickListener{
            answer1.isChecked = false
            playerScore+=1

            findNavController().navigate(QuestionFragmentDirections.actionQuestionFragmentToResultFragment(name,playerScore.toString()))
        }

        answer2.setOnClickListener{
            answer2.isChecked = false

            findNavController().navigate(QuestionFragmentDirections.actionQuestionFragmentToResultFragment(name,playerScore.toString()))
        }

        answer3.setOnClickListener{
            answer3.isChecked = false

            findNavController().navigate(QuestionFragmentDirections.actionQuestionFragmentToResultFragment(name,playerScore.toString()))
        }

    }






}