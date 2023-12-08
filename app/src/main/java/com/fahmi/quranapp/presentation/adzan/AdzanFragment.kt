package com.fahmi.quranapp.presentation.adzan

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.fahmi.quranapp.R
import android.widget.TextView
import androidx.fragment.app.viewModels
import com.fahmi.quranapp.databinding.FragmentAdzanBinding
import java.text.SimpleDateFormat
import java.util.*

class AdzanFragment : Fragment() {
    private var _binding: FragmentAdzanBinding? = null
    private val binding get() = _binding as FragmentAdzanBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_adzan, container, false)

        // Mendapatkan tanggal saat ini
        val currentDate = Calendar.getInstance().time

        // Format tanggal ke dalam format yang diinginkan (contoh: Senin, 20 Juli 2023)
        val dateFormat = SimpleDateFormat("EEEE, d MMMM yyyy", Locale.getDefault())
        val formattedDate = dateFormat.format(currentDate)

        // Mengatur teks pada TextView
        val tvTanggal: TextView = view.findViewById(R.id.tv_tanggal) // Sesuaikan ID dengan yang digunakan pada layout
        tvTanggal.text = formattedDate

        return view

    }


}
