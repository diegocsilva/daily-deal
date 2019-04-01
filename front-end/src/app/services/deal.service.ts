import { BuyOption } from './../model/buyoption';
import { Deal } from './../model/deal';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment.prod';

@Injectable()
export class DealService {

  constructor(private http: HttpClient) { }

  save(deal: Deal): any {
    return this.http.post(`${environment.deal.save}`, deal);
  }

  update(deal: Deal): any {
    return this.http.put(`${environment.deal.update}`, deal);
  }

  delete(deal: Deal): any {
    return this.http.delete(`${environment.deal.delete}`, deal);
  }

  addOption(deal: Deal, option: BuyOption): any {
    return this.http.post(`${environment.deal.addOption}`, deal, option);
  }

  updateTotalSold(deal: Deal): any {
    return this.http.put(`${environment.deal.updateTotalSold}`, deal);
  }
}
