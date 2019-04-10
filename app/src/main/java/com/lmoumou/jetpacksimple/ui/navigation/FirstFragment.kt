package com.lmoumou.jetpacksimple.ui.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.lmoumou.jetpacksimple.R
import kotlinx.android.synthetic.main.fragment_simple_first.*

/**
 * @author:Lmoumou
 * @date:2019/4/10
 * 描述:
 **/
class FirstFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_simple_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        firstTv.setOnClickListener {
            Navigation.findNavController(getView()!!).navigate(R.id.nav_simple_first_frag_to_nav_simple_two_frag)
        }
    }
}