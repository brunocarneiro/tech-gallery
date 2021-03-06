package com.ciandt.techgallery.sample.persistence.dao;

import java.io.Serializable;
import java.util.List;

import com.googlecode.objectify.Key;


/**
 * GenericObjectFyDAO methods.
 * 
 * @author Felipe Goncalves de Castro
 *
 */
public interface GenericSampleDAO<T, ID extends Serializable> {

  /**
   * Method that return a list with all Entities.
   * 
   * @return list of user entity.
   */
  public List<T> findAll();

  /**
   * Method that return a Entity by its Id/Name.
   * 
   * @param id entity.
   * @return entity.
   */
  public T findById(ID id);

  /**
   * Method that adds a new entity.
   * 
   * @param entity.
   * @return key generated by datastore.
   */
  public Key<T> add(T entity);

  /**
   * Method that updates a entity.
   * 
   * @param entity.
   * @return success or failure.
   */
  public boolean update(T entity);

  /**
   * Method that deletes a entity.
   * 
   * @param entity.
   * @return success or failure.
   */
  public boolean delete(T entity);

}
