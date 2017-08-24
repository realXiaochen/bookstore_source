import { Injectable } from '@angular/core';
import {Http, Headers} from '@angular/http';
import {Observable} from 'rxjs/Observable';

@Injectable()
export class LoginService {

  constructor(private http: Http) { }

  sendCredential(username: string, password: string) {
    let url = "https://protected-sands-45565.herokuapp.com/token";
    let encodedCredentials = btoa(username+":"+password);
    let basicHeader = "Basic "+encodedCredentials;
    let headers = new Headers ({
      'Content-Type' : 'application/x-www-form-urlencoded',
      'Authorization' : basicHeader
    });

    return this.http.get(url, {headers: headers});

  }

  checkSession() {
    let url = "https://protected-sands-45565.herokuapp.com/checkSession";
    
    let headers = new Headers ({
      'x-auth-token' : localStorage.getItem('xAuthToken')
    });

    return this.http.get(url, {headers: headers});
  }

  logout(){
    let url = "https://protected-sands-45565.herokuapp.com/user/logout";
    
    let headers = new Headers ({
      'x-auth-token' : localStorage.getItem('xAuthToken')
    });

    return this.http.post(url,'', {headers: headers});    
  }

}
