package de.lernen.springboot.services;

import java.util.List;

public interface IService<T> {
    void create(T t);
    List<T> getAll();
}
