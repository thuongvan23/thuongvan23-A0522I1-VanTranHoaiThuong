import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-caculator',
  templateUrl: './caculator.component.html',
  styleUrls: ['./caculator.component.css']
})
export class CaculatorComponent implements OnInit {
  caculator = {value: ""}

  constructor() { }

  ngOnInit(): void {
  }

  insertCaculator(value: string): void {
    this.caculator.value += value;
  }

  clearCaculator(): void {
    this.caculator.value = "";
  }
    
  excute(): void {
    this.caculator.value = eval(this.caculator.value)
  }
}
