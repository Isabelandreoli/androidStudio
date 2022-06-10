package com.isabela.lembrete

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.isabela.lembrete.adapter.TarefaAdapter
import com.isabela.lembrete.databinding.FragmentListBinding
import com.isabela.lembrete.model.Tarefa

class ListFragment : Fragment() {

    private lateinit var binding: FragmentListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentListBinding.inflate(layoutInflater, container, false)

        val listTarefas = listOf(
            Tarefa(
                "Arrumar o quarto",
                "Toda manhã",
                "Isa",
                "08/06/2022",
                true,
                "Dia a dia"
            ),
            Tarefa(
                "Ir ao cinema",
                "Assistir Lightyear",
                "Isa",
                "16/06/2022",
                false,
                "Lazer"
            ),
            Tarefa(
                "Jogar Vava",
                "Sempre que tiver um tempo",
                "Isa",
                "08/06/2022",
                false,
                "Lazer"
            )
        )

        val adapter = TarefaAdapter()
        binding.recyclerTarefa.layoutManager = LinearLayoutManager(context)
        binding.recyclerTarefa.adapter = adapter
        binding.recyclerTarefa.setHasFixedSize(true)

        adapter.setList(listTarefas)

        binding.floatingAdd.setOnClickListener{
            findNavController().navigate(R.id.action_listFragment_to_formFragment)
        }

        return binding.root
    }

}