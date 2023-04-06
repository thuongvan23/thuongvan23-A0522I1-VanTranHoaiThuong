import { Component, OnInit } from '@angular/core';
import { Todo } from 'D:/thuongvan23-A0522I1-VanTranHoaiThuong/CODEGYM/module_5/TH/ToDoApp/src/app/model/ToDo';
import { FormControl } from '@angular/forms';

let _id = 1;

@Component({
  selector: 'app-todo',
  templateUrl: './todo.component.html',
  styleUrls: ['./todo.component.css']
})
export class TodoComponent implements OnInit {

  content = new FormControl();

  todos: Todo[] = [
    {id: 1, content: "aaaaa", complete: false},
    {id: 2, content: "bbbbb", complete: true },
    {id: 3, content: "ccccc", complete: false},
    {id: 4, content: "ddddd", complete: false},
    {id: 5, content: "eeeee", complete: false},
    {id: 6, content: "fffff", complete: false},
    {id: 7, content: "ggggg", complete: false}
  ];

  toggleTodo(i: number) {
    this.todos[i].complete = !this.todos[i].complete;
  }

  change() {
    const value = this.content.value;
    if (value) {
      const todo: Todo = {
        id: _id++,
        content: value,
        complete: false
      };
      this.todos.push(todo);
      this.content.reset();
    }
  }

  constructor() { }

  ngOnInit(): void {
  }

}
