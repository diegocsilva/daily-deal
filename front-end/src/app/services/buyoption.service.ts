import { environment } from './../../environments/environment';
import { BuyOption } from './../model/buyoption';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable()
export class BuyOptionService {

  constructor(private http: HttpClient) { }

  save(buyoption: BuyOption): any {
    return this.http.post(`${environment.buyoption.save}`, buyoption);
  }

  update(buyoption: BuyOption): any {
    return this.http.put(`${environment.buyoption.update}`, buyoption);
  }

  delete(buyoption: BuyOption): any {
    return this.http.delete(`${environment.buyoption.delete}`, buyoption);
  }

  sellUnit(buyoption: BuyOption): any {
    return this.http.post(`${environment.buyoption.sellUnit}`, buyoption);
  }
}
