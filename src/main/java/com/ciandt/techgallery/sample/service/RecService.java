package com.ciandt.techgallery.sample.service;

import java.util.List;

import com.ciandt.techgallery.sample.persistence.dao.RecommendationSampleDAO;
import com.ciandt.techgallery.sample.persistence.dao.RecommendationSampleDAOImpl;
import com.ciandt.techgallery.sample.persistence.model.RecommendationSample;
import com.googlecode.objectify.Key;

/**
 * RecommendationService methods.
 * 
 * @author Felipe Goncalves de Castro
 *
 */
public class RecService {

  RecommendationSampleDAO dao = new RecommendationSampleDAOImpl();

  /**
   * Method that return the List of Recommendations.
   * 
   * @return list of Recommendations.
   */
  public List<RecommendationSample> findAll() {
    List<RecommendationSample> list = dao.findAll();

    return list;
  }

  /**
   * Method that add Recommendation into datastore.
   * 
   * @param recommendation to be persisted.
   * @return key generated by datastore.
   */
  public Key<RecommendationSample> add(RecommendationSample entity) {
    Key<RecommendationSample> key = dao.add(entity);

    return key;
  }
}
