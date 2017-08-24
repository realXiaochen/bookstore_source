import { Injectable } from '@angular/core';
import {Http, Headers} from '@angular/http';

@Injectable()
export class GetBookListService {

  constructor(private http:Http) { }

  getBookList() {
  	let url = "https://protected-sands-45565.herokuapp.com/book/bookList";
    let headers = new Headers ({
      'Content-Type': 'application/json',
      'x-auth-token' : localStorage.getItem('xAuthToken')
    });

    return this.http.get(url, {headers: headers});
  }
}
