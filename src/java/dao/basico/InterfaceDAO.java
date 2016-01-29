/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.basico;

import java.io.Serializable;
import java.util.List;

public interface InterfaceDAO<T, Id extends Serializable> {

    T buscarPorClave(Id id);

    List<T> buscarTodos();

    Id guardar(T objeto);

    void modificar(T objeto);

    void borrar(T objeto);
}
