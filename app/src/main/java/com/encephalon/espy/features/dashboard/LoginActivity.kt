package com.encephalon.espy.features.dashboard

import android.content.Intent
import android.os.Bundle
import dev.encephalon.espy.MainActivity
import dev.encephalon.espy.R
import dev.encephalon.espy.base.BaseActivity
import kotlinx.android.synthetic.main.layout_login.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class LoginActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_login.onClick {
            startActivity(Intent(this@LoginActivity, MainActivity::class.java))
            finish()
        }
    }
}