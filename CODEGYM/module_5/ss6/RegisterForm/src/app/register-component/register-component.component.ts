import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms'

@Component({
  selector: 'app-register-component',
  templateUrl: './register-component.component.html',
  styleUrls: ['./register-component.component.css']
})
export class RegisterComponentComponent implements OnInit {

  users: FormGroup[];

  contactForm = new FormGroup({
    email: new FormControl(),
    password: new FormControl(),
    confirmPassword: new FormControl(),
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

}
