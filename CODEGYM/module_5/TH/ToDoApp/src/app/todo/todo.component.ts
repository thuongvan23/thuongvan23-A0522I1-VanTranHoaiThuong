import { Component, OnInit } from '@angular/core';
import { Todo } from 'D:/thuongvan23-A0522I1-VanTranHoaiThuong/CODEGYM/module_5/TH/ToDoApp/src/app/model/ToDo';
import { FormControl } from '@angular/forms';

@Component({
  selector: 'app-todo',
  templateUrl: './todo.component.html',
  styleUrls: ['./todo.component.css']
})
export class TodoComponent implements OnInit {

  content = new FormControl();

  todos: Todo[] = [];

  constructor() { }

  ngOnInit(): void {
  }

}
