package de.lernen.springboot.services;

import java.util.List;

public interface IService<T> {
    List<T> getAll();
}
