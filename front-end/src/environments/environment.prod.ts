import { Deal } from './../app/model/deal';
// COMMONS
const api = 'http://localhost:8080';
const findAll = '/listAll';
const save = '/save';
const update = '/update';
const del = '/delete';
// MODULES
const deal = '/deal';
const buyoption = '/buyoption';

export const environment = {
  production: true,
  deal: {
    save: api + deal + save,
    update: api + deal + update,
    delete: api + deal + del,
    listAll: api + deal + findAll,
    addOption: api + deal + '/addOption',
    updateTotalSold: api + deal + '/updateTotalSold'
  },
  buyoption: {
    save: api + buyoption + save,
    update: api + buyoption + update,
    delete: api + buyoption + del,
    listAll: api + buyoption + findAll,
    sellUnit: api + buyoption + '/sellUnit'
  }
};