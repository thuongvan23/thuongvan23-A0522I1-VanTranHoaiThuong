import { Component, OnInit } from '@angular/core';
import { FacilityType } from 'src/app/model/facilityType';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { FacilityService } from 'src/app/service/facility.service';
import { FacilityTypeService } from 'src/app/service/facility-type.service';

@Component({
  selector: 'app-facility-create',
  templateUrl: './facility-create.component.html',
  styleUrls: ['./facility-create.component.css']
})
export class FacilityCreateComponent implements OnInit {
  
  facilityTypes: FacilityType[] = [];

  constructor(private facilityTypeService: FacilityTypeService,
              private facilityService: FacilityService,
              private router: Router) {
                this.facilityTypeService.getAll().subscribe(facility => this.facilityTypes = facility)
              }

  createForm: FormGroup = new FormGroup({
    name: new FormControl(),
    facilityType: new FormControl()
    })

  ngOnInit(): void {
  }

  submit(){
    if (this.createForm.valid){
      this.facilityService.saveFacility(this.createForm.value).subscribe(next =>
        {
          alert("Save success!!!");
          this.router.navigateByUrl('/facility/list')
        }
      )
    }
  }
}
