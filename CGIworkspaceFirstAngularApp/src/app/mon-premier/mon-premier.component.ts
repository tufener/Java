import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-mon-premier',
  templateUrl: './mon-premier.component.html',
  styleUrls: ['./mon-premier.component.sass']
})
export class MonPremierComponent implements OnInit {
  title: string="Hasret Cadir";
  constructor() { }

  ngOnInit(): void {
  }

}
