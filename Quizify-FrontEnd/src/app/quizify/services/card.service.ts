import { HttpClient } from '@angular/common/http';
 import { Injectable } from '@angular/core';
 import { Subject, Observable } from 'rxjs';

@Injectable()
export class CardService {
    url: any;
    response: any;
      constructor(private http: HttpClient) {
    }
   getquiz() {
    this.url = 'http://13.232.243.68:8104/rest/neo4j/game/';
    return this.http.get(this.url);
   }

}






