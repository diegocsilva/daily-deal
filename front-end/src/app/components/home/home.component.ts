import { Component, OnInit } from '@angular/core';
import { DealService } from 'src/app/services/deal.service';
import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.sass']
})
export class HomeComponent implements OnInit {

  constructor(
    private dealService: DealService,
    private toastr: ToastrService
  ) { }

  ngOnInit() {
  }

}
