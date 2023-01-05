package gh.mobilecontent.com.newmvvmapp.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import androidx.navigation.fragment.navArgs
import com.google.android.material.snackbar.Snackbar
import gh.mobilecontent.com.newmvvmapp.MainActivity
import gh.mobilecontent.com.newmvvmapp.R
import gh.mobilecontent.com.newmvvmapp.data.viewmodel.NewsViewModel
import gh.mobilecontent.com.newmvvmapp.databinding.FragmentInfoBinding


class InfoFragment : Fragment() {
    private lateinit var fragmentInfoBinding: FragmentInfoBinding
    private lateinit var viewModel : NewsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_info, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentInfoBinding = FragmentInfoBinding.bind(view)
        val args : InfoFragmentArgs by navArgs()
        val article = args.selectedArticle


        viewModel=(activity as MainActivity).viewModel

        fragmentInfoBinding.wvInfo.apply {
            webViewClient = WebViewClient()
            if(article.url!=null) {
                loadUrl(article.url)
            }

        }
        fragmentInfoBinding.fabSave.setOnClickListener {
            viewModel.saveArticle(article)
            Snackbar.make(view,"Saved Successfully!", Snackbar.LENGTH_LONG).show()
        }

    }


}