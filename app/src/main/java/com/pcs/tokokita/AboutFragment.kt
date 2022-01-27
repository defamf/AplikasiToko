package com.pcs.tokokita

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.pcs.tokokita.LoginActivity.Companion.sessionManager

class AboutFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_about, container, false)
        val namaUser = sessionManager.getString("ADMIN_NAME")
        val emailUser = sessionManager.getString("ADMIN_EMAIL")

        val btnLogout = view.findViewById(R.id.btnLogout) as Button
        val textName = view.findViewById(R.id.namaUser) as TextView
        val textEmail = view.findViewById(R.id.emailUser) as TextView

        textName.text = "Nama: "+ namaUser.toString()
        textEmail.text = "Email: "+ emailUser.toString()

        btnLogout.setOnClickListener {
            sessionManager.clearSession()

            val moveIntent = Intent(activity, LoginActivity::class.java)
            startActivity(moveIntent)
            activity?.finish()
        }

        return view
    }

}