package org.com.dailydeal.service;

import org.com.dailydeal.model.BuyOption;
import org.com.dailydeal.model.Deal;
import org.com.dailydeal.repository.DealRepository;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.WebApplicationException;
import java.util.List;

@RequestScoped
public class DealService {

    @Inject
    private DealRepository repository;

    @Inject
    private BuyOptionService buyOptionService;

    public List<Deal> listAll() {
        return repository.listAll();
    }

    @Transactional
    public Deal save(Deal deal) {
        repository.persist(deal);
        return deal;
    }

    @Transactional
    public Deal update(Deal deal) {
        Deal current = repository.findById(deal.getId());
        validIfExists(current);
        deal = replaceValues(current,deal);
        return deal;
    }

    @Transactional
    public boolean delete(Deal deal) {
        Deal deleting = repository.findById(deal.getId());
        validIfExists(deleting);
        repository.delete(deleting);
        return true;
    }

    @Transactional
    public Deal addOption(Deal deal, BuyOption option) {
        validIfExists(deal);
        option = buyOptionService.find(option);
        buyOptionService.validIfExists(option);
        deal.getBuyOptions().add(option);
        return deal;
    }

    @Transactional
    public Deal updateTotalSold(Deal deal) {
        validIfExists(deal);
        deal.updateTotalSold();
        return deal;
    }

    public void validIfExists(Deal deal){
        if (deal == null || deal.getId() == null){
            throw new WebApplicationException("Deal not exist!", 404);
        }
    }

    private Deal replaceValues(Deal current, Deal deal){
        current.setBuyOptions(deal.getBuyOptions());
        current.setCreateDate(deal.getCreateDate());
        current.setEndDate(deal.getEndDate());
        current.setPublishDate(deal.getPublishDate());
        current.setText(deal.getText());
        current.setTitle(deal.getTitle());
        current.setTotalSold(deal.getTotalSold());
        current.setType(deal.getType());
        current.setUrl(deal.getUrl());
        return current;
    }
}
