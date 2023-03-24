import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms'

@Component({
  selector: 'app-register-component',
  templateUrl: './register-component.component.html',
  styleUrls: ['./register-component.component.css']
})
export class RegisterComponentComponent implements OnInit {

  users: FormGroup[];

  countryList: ["US", "VN"]

  contactForm = new FormGroup({
    email: new FormControl('', [Validators.required, Validators.email, Validators.maxLength(100)]),
    password: new FormControl('', [Validators.required]),
    confirmPassword: new FormControl('', [Validators.required]),
    age: new FormControl(),
    gender: new FormControl(),
    phone: new FormControl(),
    country: new FormControl()
  })

  constructor() { }

  ngOnInit(): void {
  }

  registerUser() {
    console.log(this.contactForm.value)
    this.users.push(this.contactForm);
  } 

  get email() {
    return this.contactForm.get('email');
 } 

}
