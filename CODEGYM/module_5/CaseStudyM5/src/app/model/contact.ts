import { Facility } from "./facility";

export interface Contact{
    id: number;
    nameCustomer: string;
    facility: Facility;
    beginDate: string;
    endDate: string;    
}