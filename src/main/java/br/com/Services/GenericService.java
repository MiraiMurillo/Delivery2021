package br.com.services;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public abstract class GenericService<T, R> {

    private CrudRepository<T, Integer> repository;
    private final String NOT_NULL = "A entidade não pode ser nulla!";

    public GenericService(CrudRepository<T, Integer> repository) {
        setRepository(repository);
    }

    public Iterable<T> findAll() {
        return getRepository().findAll();
    }

    public T findById(Integer id) {
        return getRepository().findById(id).get();
    }

    public void validate(T entity) throws Exception {
        /*
         * var oi = entity.getClass().getDeclaredFields(); for (var field : oi) {
         * System.out.println("\n\n\n-- Campo --\n\n" + oi + "\n\n\n"); if
         * (field.get(entity) == null) { throw new Exception(NOT_NULL); } }
         */
    }

    public T save(T entity) throws Exception {
        validate(entity);

        return getRepository().save(entity);
    }

    public String remove(T entity) {
        try {
            validate(entity);
            getRepository().delete(entity);
            return "Remoção feita com sucesso!";
        } catch (Exception e) {
            return "Erro na remoção:\n" + e.getMessage();
        }
    }

    // Getters / Setters

    private CrudRepository<T, Integer> getRepository() {
        return repository;
    }

    private void setRepository(CrudRepository<T, Integer> repository) {
        this.repository = repository;
    }

}
