package gr.aueb.cf.dao;

import gr.aueb.cf.model.Account;

import java.util.HashMap;
import java.util.Map;

public class AbstractDAO<T> implements IGenericDao<T>{
    private final Map<Long, T> storage = new HashMap<>();
    private Class<T> persistentClass;

    public AbstractDAO() {}

    public Class<T> getPersistentClass() {
        return persistentClass;
    }

    public void setPersistentClass(Class<Account> accountClass) {
        this.persistentClass = persistentClass;
    }


    @Override
    public T insert(Long id, T t) {
        storage.put(id, t);
        return  t;
    }

    @Override
    public T update(Long id, T t) {
        storage.replace(id, t);
        return t;
    }

    @Override
    public void delete(Long id) {
        storage.remove(id);
    }

    @Override
    public T get(Long id) {
        return storage.get(id);
    }

    @Override
    public Map<Long, T> getAll() {
        return new HashMap<>(storage);
    }
}
