package org.com.dailydeal.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import org.com.dailydeal.model.Deal;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class DealRepository implements PanacheRepositoryBase<Deal, Integer> {

}
