import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Facility } from '../model/facility';

@Injectable({
  providedIn: 'root'
})
export class FacilityService {

  constructor(private httpClient: HttpClient) {}

  getAll(): Observable<Facility[]> {
    return this.httpClient.get<Facility[]>("http://localhost:3000/facilities")
  }

  saveFacility(facility: Facility): Observable<Facility[]> {
    return this.httpClient.post<Facility[]>("http://localhost:3000/facilities", facility);
  }

  deleteFacility(id): Observable<Facility[]>{
    return this.httpClient.delete<Facility[]>("http://localhost:3000/facilities/" + id);
  }

  findById(id): Observable<Facility>{
    return this.httpClient.get<Facility>("http://localhost:3000/facilities/" + id)
  }

  updateFacility(id: number, facility: Facility): Observable<Facility[]>{
    return this.httpClient.put<Facility[]>("http://localhost:3000/facilities/" +id, facility)
  }
}
