package com.exemplo.api.service;

import com.exemplo.api.model.Cliente;
import com.exemplo.api.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public List<Cliente> listarTodos() {
        return repository.findAll();
    }

    public Optional<Cliente> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public List<Cliente> buscarPorNome(String nome) {
        return repository.findByNomeContainingIgnoreCase(nome);
    }

    public Cliente salvar(Cliente cliente) {
        return repository.save(cliente);
    }

    public Cliente atualizar(Long id, Cliente clienteAtualizado) {
        return repository.findById(id)
                .map(cliente -> {
                    cliente.setNome(clienteAtualizado.getNome());
                    cliente.setEmail(clienteAtualizado.getEmail());
                    return repository.save(cliente);
                }).orElseThrow();
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

    public long contar() {
        return repository.count();
    }
}
