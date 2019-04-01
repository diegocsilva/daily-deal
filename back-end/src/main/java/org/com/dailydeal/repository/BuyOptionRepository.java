package org.com.dailydeal.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import org.com.dailydeal.model.BuyOption;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class BuyOptionRepository implements PanacheRepositoryBase<BuyOption, Integer> {

}
