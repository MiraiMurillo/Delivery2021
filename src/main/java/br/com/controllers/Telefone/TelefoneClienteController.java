package br.com.controllers.telefone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.services.GenericService;
import br.com.model.entities.classes.telefone.TelefoneCliente;
import br.com.repository.telefone.TelefoneClienteRepository;

@RestController
@CrossOrigin(origins = "*")
public class TelefoneClienteController extends GenericService<TelefoneCliente, TelefoneClienteRepository> {
    private final String URL = "/telefoneCliente";

    @Autowired
    public TelefoneClienteController(CrudRepository<TelefoneCliente, Integer> repository) {
        super(repository);
    }

    @GetMapping(value = URL)
    @ResponseBody
    public Iterable<TelefoneCliente> findAll() {
        return super.findAll();
    }

    @PostMapping(value = URL + "/Adicionar/")
    public TelefoneCliente save(@RequestBody TelefoneCliente telefoneCliente) throws Exception {
        return super.save(telefoneCliente);
    }

    @DeleteMapping(URL + "/Remover/")
    public Object remove(@RequestBody TelefoneCliente telefoneCliente) {
        return super.remove(telefoneCliente);
    }

    @PatchMapping(URL + "/Atualizar/")
    public Object update(@RequestBody TelefoneCliente telefoneCliente) throws Exception {
        return super.save(telefoneCliente);
    }

    @GetMapping(URL + "/BuscarById/")
    public TelefoneCliente findById(@RequestBody Integer id) {
        return super.findById(id);
    }

    @GetMapping(URL + "/Buscar/")
    public TelefoneCliente find(@RequestBody TelefoneCliente telefoneCliente) {
        return super.findById(telefoneCliente.getId());
    }
}
