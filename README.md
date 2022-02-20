"# PetShopBand" 

# KanBan do projeto PetShopBand
https://github.com/users/BlackCode7/projects/3

…or create a new repository on the command line
echo "# PetShopBand" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M master
git remote add origin https://github.com/BlackCode7/PetShopBand.git
git push -u origin master

…or push an existing repository from the command line
git remote add origin https://github.com/BlackCode7/PetShopBand.git
git branch -M master
git push -u origin master

# Tarefas realizadas na aplicação

1 - criação dos pacotes service / controller / repository

2 - criação das interfaces e das classes de service / repository

3 - configuração dos campos das entidade para objetos não nulos

4 - Ajuste do arquivo pom.xml ainda com erro

5 - config correta do arquivo application.properties - commit >>> a993be6498709d3e41b97ed3a30dcd3e9e1ab592

6 - criando classe PopulationBancPetShopBandInitial para popular o banco automaticamente usando o PetShopBandClienteRepository e a classe PetShopBandCliente

7 - implementando a classe controller

8 - criando um método para listar pessoas na classe PetShopBandClienteController

9 -  criação de script para o banco de dados postgresql - ESTÁ COM PROBLEMA PARA PERSISTIR OS DADOS

10 - criação de script para o banco de dados postgresql - ERRO ajustado com a normatização dos nomes das tabelas o dos campos

11 - Entendendo o relacionamento entre classes usando o lombok

12 - data 17/02/2022 >>> desmotivado para programar

13 - Erro Data 18/02/2021
      @CollectionTable
	    @JoinColumn(name="idprod")
	    private PetShopBandProduto petShopBandProdutoList;
      
      Código replicado na entidade aparentemente funcionou, mas precisa de mais investigação

14 - data 19/02/2022 >>> Sem programação
      
      

