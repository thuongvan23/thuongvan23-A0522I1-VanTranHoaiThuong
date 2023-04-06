import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FacilityTypeService } from 'src/app/service/facility-type.service';
import { FacilityService } from 'src/app/service/facility.service';
import { ActivatedRoute, ParamMap } from '@angular/router';
import { Facility } from 'src/app/model/facility';
import { FormGroup, FormControl } from '@angular/forms';
import { FacilityType } from 'src/app/model/facilityType';

@Component({
  selector: 'app-facility-update',
  templateUrl: './facility-update.component.html',
  styleUrls: ['./facility-update.component.css']
})
export class FacilityUpdateComponent implements OnInit {

  updateForm: FormGroup;
  id: number;
  facility: Facility;
  facilityTypes: FacilityType[] = [];

  constructor(private facilityService: FacilityService,
              private facilityTypeService: FacilityTypeService,
              private activatedRoute: ActivatedRoute,
              private router: Router) {
                this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
                  this.id = +paramMap.get('id');
                  this.facilityService.findById(this.id).subscribe(next => {
                    this.facility = next;
                    this.updateForm = new FormGroup({
                      name: new FormControl(this.facility.name),
                      facilityType: new FormControl(this.facility.facilityType)
                    });
                  })
                })
              }

  ngOnInit(): void {
    this.facilityTypeService.getAll().subscribe(next => this.facilityTypes = next);
  }

  compareFn(c1: any, c2: any): boolean {
    return c1 && c2 ? c1.id === c2.id : c1 === c2;
  }

  updateFacility(){
    const facility = this.updateForm.value;
    this.facilityService.updateFacility(this.id, facility).subscribe(next => {
      alert('Success!')
      this.router.navigateByUrl("/facility/list")
    })
  }
}
