insert into TB_Cliente(idcli,,nomecli, enderecocli, emailcli, telefonecli) values (0, 'nome', 'Endereco Cliente', 'emailCliente@email.com', '12344567');
insert into TB_Cliente(idcli,,nomecli, enderecocli, emailcli, telefonecli) values (1, 'nome2', 'Endereco2 Cliente2', 'emailCliente2@email.com', '123445672');
insert into TB_Cliente(idcli,,nomecli, enderecocli, emailcli, telefonecli) values (2, 'nome3', 'Endereco3 Cliente3', 'emailCliente3@email.com', '1234456733');

insert into TB_Fornecedor(idforn,nomeforn,telefforn,emailforn,cnpjforn,dataforn) values(0, 'Nome0 Fornecedor0', '8888-8888', 'fornecedor@fornecedor.com', 11144455566677, '2021-07-12');
insert into TB_Fornecedor(idforn,nomeforn,telefforn,emailforn,cnpjforn,dataforn) values(1, 'Nome1 Fornecedor1', '8888-8881', 'fornecedor1@fornecedor1.com', 11144455566671, '2021-11-19');
insert into TB_Fornecedor(idforn,nomeforn,telefforn,emailforn,cnpjforn,dataforn) values(2, 'Nome2 Fornecedor2', '8888-8882', 'fornecedor2@fornecedor2.com', 11144455566672, '2021-05-11');

insert into TB_Produto(idprod,nomeprod, nomefabrprod, datavalidprod, descricaoprod, valorcustoprod, valorvendaprod) values(0, 'NomeProduto0', 'NomeFabricante0', '2021-04-05', 'Descrição do produto 0', 23.0, 108.55);
insert into TB_Produto(idprod,nomeprod, nomefabrprod, datavalidprod, descricaoprod, valorcustoprod, valorvendaprod) values(1, 'NomeProduto1', 'NomeFabricante1', '2021-05-07', 'Descrição do produto 1', 25.0, 123.10);
insert into TB_Produto(idprod,nomeprod, nomefabrprod, datavalidprod, descricaoprod, valorcustoprod, valorvendaprod) values(2, 'NomeProduto2', 'NomeFabricante2', '2021-06-10', 'Descrição do produto 2', 30.0, 145.03);

insert into TB_Pedido(idped, numeroped, dataped, nomeclienteped, nomevendedorped) values(0, 5, '2021-07-12', 'Anderson0', 'VendedorAnderson0');
insert into TB_Pedido(idped, numeroped, dataped, nomeclienteped, nomevendedorped) values(1, 1, '2021-07-12', 'Anderson1', 'VendedorAnderson1');
insert into TB_Pedido(idped, numeroped, dataped, nomeclienteped, nomevendedorped) values(2, 12, '2021-07-12', 'Anderson2', 'VendedorAnderson2');

insert into TB_Venda(idvenda, datavenda) values(0, '2022-01-02');
insert into TB_Venda(idvenda, datavenda) values(1, '2022-01-03');
insert into TB_Venda(idvenda, datavenda) values(2, '2022-01-10');
