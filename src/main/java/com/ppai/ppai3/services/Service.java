package com.ppai.ppai3.services;

import java.util.List;

public interface Service<T, W> {
    List<T> getAll();
    T getById(W id);
}
