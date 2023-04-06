import { Component, OnInit } from '@angular/core';
import { FacilityService } from 'src/app/service/facility.service';
import { Facility } from 'src/app/model/facility';

@Component({
  selector: 'app-facility-list',
  templateUrl: './facility-list.component.html',
  styleUrls: ['./facility-list.component.css']
})
export class FacilityListComponent implements OnInit {

  facilities: Facility[] = [];
  facility: Facility;

  constructor(private facilityService: FacilityService) { }

  ngOnInit(): void {
    this.getAll()
  }

  getAll(){
    this.facilityService.getAll().subscribe(next => this.facilities = next)
  }

  deleteFacility(id){
    this.facilityService.findById(id).subscribe(next => {
      this.facility = next;
      if (confirm('Bạn có chắc muốn xóa khách hàng '+this.facility.name+' ?')) {
        this.facilityService.deleteFacility(id).subscribe(next => {this.getAll()});
      }})
  }
}
