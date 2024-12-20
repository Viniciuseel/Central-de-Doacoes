package com.doacoes.central.negocio.service;

import com.doacoes.central.negocio.enums.TiposDoacao;
import com.doacoes.central.persistencia.repositorio.DoacaoRepositorio;
import com.doacoes.central.negocio.entity.Doacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoacaoServiceImpl implements DoacaoService{

    private final DoacaoRepositorio doacaoRepositorio;

    @Autowired
    public DoacaoServiceImpl(DoacaoRepositorio doacaoRepositorio) {
        this.doacaoRepositorio = doacaoRepositorio;
    }

    public Doacao criarDoacao(Doacao doacao) {
        return doacaoRepositorio.save(doacao);
    }

    public List<Doacao> listarDoacoes() {
        return doacaoRepositorio.findAll();
    }

    public Optional<Doacao> buscarPorId(Long id) {
        return doacaoRepositorio.findById(id);
    }

    public Doacao atualizarDoacao(Long id, TiposDoacao tipo, Doacao doacaoAtualizada) {
        return doacaoRepositorio.findById(id).map(doacao -> {
            doacao.setDescricao(doacaoAtualizada.getDescricao());
            doacao.setValor(doacaoAtualizada.getValor());
            doacao.setDoador(doacaoAtualizada.getDoador());
            doacao.setTipo(doacaoAtualizada.getTipo());
            return doacaoRepositorio.save(doacao);
        }).orElseThrow(() -> new RuntimeException("Doação não encontrada"));
    }

    public void excluirDoacao(Long id) {
        doacaoRepositorio.deleteById(id);
    }
}
