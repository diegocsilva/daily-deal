package org.com.dailydeal.service;

import org.com.dailydeal.model.BuyOption;
import org.com.dailydeal.repository.BuyOptionRepository;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.WebApplicationException;
import java.util.List;

@RequestScoped
public class BuyOptionService {

    @Inject
    private BuyOptionRepository repository;

    public BuyOption find(BuyOption option){
        validIfExists(option);
        return repository.findById(option.getId());
    }

    public List<BuyOption> listAll() {
        return repository.listAll();
    }

    @Transactional
    public BuyOption save(BuyOption option) {
        repository.persist(option);
        return option;
    }

    @Transactional
    public BuyOption update(BuyOption option) {
        BuyOption current = repository.findById(option.getId());
        validIfExists(current);
        option = replaceValues(current,option);
        return option;
    }

    @Transactional
    public boolean delete(BuyOption option) {
        BuyOption deleting = repository.findById(option.getId());
        validIfExists(deleting);
        repository.delete(deleting);
        return true;
    }


    @Transactional
    public BuyOption sellUnit(BuyOption option) {
        BuyOption current = repository.findById(option.getId());
        validIfExists(current);
        current.sellUnit();
        return current;
    }

    public void validIfExists(BuyOption option){
        if (option == null || option.getId() == null){
            throw new WebApplicationException("Buy Option not exist!", 404);
        }
    }

    private BuyOption replaceValues(BuyOption current, BuyOption option){
        current.setDeal(option.getDeal());
        current.setEndDate(option.getEndDate());
        current.setNormalPrice(option.getNormalPrice());
        current.setPercentDiscount(option.getPercentDiscount());
        current.setQuantityCupom(option.getQuantityCupom());
        current.setSalePrice(option.getSalePrice());
        current.setStartDate(option.getStartDate());
        current.setTitle(option.getTitle());
        return current;
    }
}
