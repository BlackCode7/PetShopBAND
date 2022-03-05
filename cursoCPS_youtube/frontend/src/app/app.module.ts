import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './template/header/header.component';
import { FooterComponent } from './template/footer/footer.component';
import { HomeComponent } from './components/home/home.component';
import { ListarProdutosComponent } from './components/produtos/listar-produtos/listar-produtos.component';
import { CadastrarProdutoComponent } from './components/produtos/cadastrar-produto/cadastrar-produto.component';
import { ListarVendasComponent } from './components/vendas/listar-vendas/listar-vendas.component';
import { ListarPedidosComponent } from './components/pedidos/listar-pedidos/listar-pedidos.component';
import { CadastrarPedidoComponent } from './components/pedidos/cadastrar-pedido/cadastrar-pedido.component';
import { CadastrarFornecedorComponent } from './components/fornecedores/cadastrar-fornecedor/cadastrar-fornecedor.component';
import { ListarFornecedoresComponent } from './components/fornecedores/listar-fornecedores/listar-fornecedores.component';
import { CadastrarClienteComponent } from './components/clientes/cadastrar-cliente/cadastrar-cliente.component';
import { ListarClientesComponent } from './components/clientes/listar-clientes/listar-clientes.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    HomeComponent,
    ListarProdutosComponent,
    CadastrarProdutoComponent,
    ListarVendasComponent,
    ListarPedidosComponent,
    CadastrarPedidoComponent,
    CadastrarFornecedorComponent,
    ListarFornecedoresComponent,
    CadastrarClienteComponent,
    ListarClientesComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
