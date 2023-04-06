import { CustomerType } from "./customerType";

export interface Customer{
    id?: number;
    name?: string;
    dob?: string;
    phone?: string;
    customerType?: CustomerType;
}