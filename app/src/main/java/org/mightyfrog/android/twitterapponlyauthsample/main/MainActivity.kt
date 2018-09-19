package org.mightyfrog.android.twitterapponlyauthsample.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.mightyfrog.android.twitterapponlyauthsample.App
import org.mightyfrog.android.twitterapponlyauthsample.R
import org.mightyfrog.android.twitterapponlyauthsample.data.search.Status
import javax.inject.Inject

/**
 * https://dev.twitter.com/oauth/application-only
 *
 * @author Shigehiro Soejima
 */
class MainActivity : AppCompatActivity(), MainContract.View {

    @Inject
    lateinit var mainPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)

        DaggerMainComponent.builder()
                .appComponent((application as App).getAppComponent())
                .mainModule(MainModule(this))
                .build()
                .inject(this)

        recyclerView.apply {
            adapter = MainAdapter()
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            addItemDecoration(DividerItemDecoration(context, LinearLayoutManager.VERTICAL))
        }
    }

    override fun updateStatuses(statuses: List<Status>?) {
        statuses?.let {
            recyclerView.swapAdapter(MainAdapter(it), false)
        }
    }

    override fun error(t: Throwable) {
        Toast.makeText(this, "$t", Toast.LENGTH_SHORT).show()
    }
}
