import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { ListarProdutosComponent } from './components/produtos/listar-produtos/listar-produtos.component';
import { CadastrarProdutoComponent } from './components/produtos/cadastrar-produto/cadastrar-produto.component';
import { ListarFornecedoresComponent } from './components/fornecedores/listar-fornecedores/listar-fornecedores.component';
import { CadastrarFornecedorComponent } from './components/fornecedores/cadastrar-fornecedor/cadastrar-fornecedor.component';
import { ListarPedidosComponent } from './components/pedidos/listar-pedidos/listar-pedidos.component';
import { CadastrarPedidoComponent } from './components/pedidos/cadastrar-pedido/cadastrar-pedido.component';

const routes: Routes = [
  {path:'', component: HomeComponent},
  {path:'produtos', component: ListarProdutosComponent},
  {path:'produtos/cadastrar', component: CadastrarProdutoComponent},
  {path:'fornecedores', component: ListarFornecedoresComponent},
  {path:'fornecedores/cadastrar-fornecedor', component: CadastrarFornecedorComponent},
  {path:'pedidos', component: ListarPedidosComponent},
  {path:'pedidos/cadastrar-pedido', component: CadastrarPedidoComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
