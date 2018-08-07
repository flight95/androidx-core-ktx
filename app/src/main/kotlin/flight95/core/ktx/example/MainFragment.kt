package flight95.core.ktx.example

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import flight95.core.ktx.content.getDrawableResource
import flight95.core.ktx.example.ktx.content.getAppBarLayout
import flight95.core.ktx.example.ktx.content.getCollapsingToolbarImageSwitcher
import flight95.core.ktx.example.ktx.content.setTitle

class MainFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_main, container, false)


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        setTitle(R.string.fragment_title)
        getAppBarLayout()?.apply {
            getCollapsingToolbarImageSwitcher()?.setImageDrawable(getDrawableResource(R.drawable.ic_add_circle))
        }
    }
}
