import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  //Variável do tipo string
  public nomeProduto: string = "teste_1 variáveis no angular com typescript";
  public anuncio: string = ` o ${this.nomeProduto} esta em promoção`;

  // Variável do tipo number
  public idProduto: number = 123;
  public precoProduto: number = 12.00;

  // Variável do tipo boolean
  public promocao: boolean = true; // true ou false

  constructor() { 
    //Variável de string com concatenação
    this.anuncio = `O ` + this.nomeProduto + ` esta em promoção`;

    console.log(` Nome do produto: `, this.nomeProduto);
    console.log(` Anuncio: `, this.anuncio);
    console.log(` ID: `, this.idProduto);
    console.log(` Preço: `, this.precoProduto );
    console.log(` Promoção: `, this.promocao);

  }

  ngOnInit(): void {
  }

}
