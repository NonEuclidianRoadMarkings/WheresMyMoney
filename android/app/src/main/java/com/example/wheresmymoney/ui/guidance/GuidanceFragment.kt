package com.example.wheresmymoney.ui.guidance

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.ScrollView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.wheresmymoney.R
import com.example.wheresmymoney.databinding.FragmentGuidanceBinding
import com.facebook.react.ReactFragment

class GuidanceFragment : Fragment() {

    private var _binding: FragmentGuidanceBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val guidanceViewModel =
            ViewModelProvider(this).get(GuidanceViewModel::class.java)

        _binding = FragmentGuidanceBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Load the guidance cards which are currently applicable for this customer
        val cardArea: ScrollView = root.findViewById(R.id.guidance_scroll_view)

        val cardView: View = getLayoutInflater().inflate(R.layout.guidance_card_view, cardArea, false)
        val cardIcon = cardView.findViewById<ImageView>(R.id.guidance_card_icon)
        cardIcon.maxHeight = 64
        cardIcon.setImageResource(R.drawable.lump_sum_withdrawal_card)
        val cardTitleText = cardView.findViewById<TextView>(R.id.guidance_card_title_text)
        cardTitleText.text = "You may be eligible for a Lump Sum Withdrawal soon!"
        val cardBodyText = cardView.findViewById<TextView>(R.id.guidance_card_body_text)
        cardBodyText.text = "Click 'start' to find out how much you could withdraw as you enter retirement"
        val cardButton = cardView.findViewById<Button>(R.id.guidance_card_button)
        cardButton.text = "START"
        cardArea.addView(cardView)

        // Set CTA Button onClick Method
        val button = root.findViewById<Button>(R.id.guidance_card_button)
        button.setOnClickListener { // Load the React Native component
            val componentName = "LumpSumWithdrawalGuidance"
            val reactNativeFragment = ReactFragment.Builder()
                .setComponentName(componentName)
                .setLaunchOptions(Bundle().apply { putString("message", "my value") })
                .build()
            requireActivity().supportFragmentManager
                .beginTransaction()
                .add(R.id.guidance_react_native_fragment, reactNativeFragment)
                .commit()
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}