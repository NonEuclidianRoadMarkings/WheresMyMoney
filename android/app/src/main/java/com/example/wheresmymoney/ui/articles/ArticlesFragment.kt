package com.example.wheresmymoney.ui.articles

import android.content.Intent
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wheresmymoney.ReactNativeActivity
import com.example.wheresmymoney.R
import com.example.wheresmymoney.databinding.FragmentArticlesBinding

class ArticlesFragment : Fragment() {

    private var _binding: FragmentArticlesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val articlesViewModel =
            ViewModelProvider(this).get(ArticlesViewModel::class.java)

        _binding = FragmentArticlesBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Load Recommended Articles
        val articles = arrayOf("TurboEncabulator", "Proin a Libero Sapien")
        val customAdapter = CustomAdapter(articles)

        val recyclerView: RecyclerView = root.findViewById(R.id.articles_recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = customAdapter

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    class CustomAdapter(private val dataSet: Array<String>) :
        RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

        /**
        * Provide a reference to the type of views that you are using
        * (custom ViewHolder)
        */
        class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val cardView: CardView
            val titleView: TextView
            val imageView: ImageView
            val descriptionView: TextView

            init {
                cardView = view.findViewById(R.id.articles_row_card)
                titleView = view.findViewById<TextView>(R.id.articles_row_title)
                imageView = view.findViewById<ImageView>(R.id.articles_row_favicon)
                descriptionView = view.findViewById<TextView>(R.id.articles_row_description)
            }
        }

        // Create new views (invoked by the layout manager)
        override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
            // Create a new view, which defines the UI of the list item
            val view = LayoutInflater.from(viewGroup.context)
                    .inflate(R.layout.articles_row_item, viewGroup, false)

            return ViewHolder(view)
        }

        // Replace the contents of a view (invoked by the layout manager)
        override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

            // Get element from your dataset at this position and replace the
            // contents of the view with that element
            viewHolder.titleView.text = dataSet[position]
            viewHolder.descriptionView.text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
            viewHolder.imageView.maxHeight = 64
            viewHolder.imageView.setImageResource(R.drawable.ic_menu_articles)
            viewHolder.cardView.setOnClickListener(object : View.OnClickListener {
                    override fun onClick(view: View?) {
                    // Display the article
                    val context: Context? = view?.getContext()
                    if(null != context) {
                        val intent = Intent(context, ReactNativeActivity::class.java)
                        intent.putExtra("componentName",dataSet[position])
                        context.startActivity(intent)
                    } else {
                        // How to handle this error?
                    }
                }
            })
        }

        // Return the size of your dataset (invoked by the layout manager)
        override fun getItemCount() = dataSet.size

    }
}