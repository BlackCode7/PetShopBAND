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

15 - ERRO - data 20/02/2022
	org.hibernate.cfg.NotYetImplementedException: Collections having FK in secondary table
	
16 - Refazendo as classes do modo tradicional sem lombok >>> https://cursos.alura.com.br/course/spring-boot-api-rest/task/55819
     Link do tutorial para referência
     
17 - Refatorando as classes de modelos, controllers e Dto >>> fornecedores / pedidos / produtos/ vendas / vendedores
     commit >>> 6b47d34..4aa5f91
     
18 - data 24-02-2022 >>> Sem desenvolvimento

19 - Finalmente descobri o erro de conecção com o banco H2 do spring referência >>> https://www.youtube.com/watch?v=dlNu7rB7emQ
      
20 - data 26-02-2022 >>> Sem desenvolvimento

21 - data 28-02-2022 >>> Entendi como funciona o relacionamento com Jpa >>> sempre devo estar dentro da classe que vou jogar pra outra classe onde vou ligar tipo: CLASSE_A para      CLASSE_B = estando na CLASSE_A fazendo @ManyToOne, @JoinColumn(name="id_da_classe_pra_onde_vai") para CLASSE_B
     commit >>> 8fd1add..ceb3149

22 - data 01/03/2022 >>> Criado repositório do frot-end com Nebular Ngx-admin  
	tutorial de apoio:
	
	https://www.youtube.com/watch?v=Gw1554hTmu4
	
	https://akveo.github.io/ngx-admin/docs/getting-started/installation-guidelines#production-bundle
	
	https://akveo.github.io/nebular/docs/guides/create-nebular-page#create-nebular-page
	
	https://www.npmjs.com/package/eva-icons

23 - Instalação de nebular
	https://akveo.github.io/nebular/docs/guides/install-nebular#using-angular-cli

	Create a New Project
	ng new my-new-project
	
	Install Nebular
	npm install --save @nebular/theme @angular/cdk @angular/animations
	npm install --save eva-icons @nebular/eva-icons

23 - ok

24 - ng generate c auth/login
	





