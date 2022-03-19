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
	https://akveo.github.io/nebular/docs/guides/install-nebular#manually

	Create a New Project
	ng new my-new-project
	
	Install Nebular

	ng add @nebular/theme

	npm install --save @nebular/theme @angular/cdk @angular/animations

	npm install --save eva-icons @nebular/eva-icons

	### Instalação de modulos do Nebular
	>>> npm i @nebular/auth

	-------------
	angular.json
	-------------
	"styles": [
		"node_modules/@nebular/theme/styles/prebuilt/default.css", // or dark.css
	],

24 - ng generate c auth/login

	 ng generate s auth/login/loginservice 

	 ng generate m auth/login

	 ng generate c auth/register

	 ng generate s auth/register/registerservice

	 ng generate m auth/register/ 
	
25 - 2. If 'app-login' is a Web Component then add 'CUSTOM_ELEMENTS_SCHEMA' to the '@NgModule.schemas' of this component to suppress 
		this message.

        <app-login></app-login>
         ~~~~~~~~~~~

  		src/app/app.component.ts:5:16
		  
        templateUrl: './app.component.html',
                     ~~~~~~~~~~~~~~~~~~~~~~
        Error occurs in the template of component AppComponent.
	
26 - Data 07/03/2022 - Repositório refeito do zero juntamente com os seus componentes, também foram refeitas todas as rotas da aplicação
	aula de referência usada - Aula_13 - Criação de componentes e elaboração do template da aplicação Angular com Bootstrap
	https://www.youtube.com/watch?v=0PvPXaFT6lY
	
	commit ---> 41e71ca..9fe1b71  
	branch de trabalho ---> work_branch
	branch que substitui a branch main ---> PetShopBrach  	 

27 - Data 09/03/2022 - Entendendo o comportamento do OneWay data bind do angular - revisão de conceitos com interpolação de variáveis
	Aula 18 - Data Binding (Interpolation e Property)
	
28 - Data 10/03/2022 - Instalação do font-awesome e criação de tabelas de todas as telas de listagem
	aula - 20
	Aula 20 - Elaboração da interface de Listar Produtos
	https://www.youtube.com/watch?v=1u4sCpM-jp8
	
	commit >>> df9fed2..b0f77f9

29 - Data 11/03/2022 - Construção das tabelas nas telas de listagem dos componentes e manipulação de Array de objetos
	Aula 21 - Arrays, Objetos, for e ngFor no Angular.
	https://www.youtube.com/watch?v=7j8q6uPZt_8&t=11s
	
	commit >>> 6bf184e3aafc215b8d6deaecf1d79cc0f5dfe429
	
30 - Data 13/03/2022
	
	aula - 23 - Data bindings - Two way e event
	
	Commit: 54deadfe157af9ce8b3d0330f8e1d42776e0c836
	Parents: 25e91b938a62901651067c5675948ed94fe7cfb7
	Author: Anderson <BlackCode7@outlook.com>
	Committer: Anderson <BlackCode7@outlook.com>
	Date: Sun Mar 13 2022 11:01:40 GMT-0300 (Horário Padrão de Brasília) 

	configuração de ngModel e ToWay DataBind

31 - Data 14/03/2022
	Commit: 92baa8f8a2d990cf0c7e6ccdf4b61ce5cb4502fe
	Parents: d65878e8632522cbb8ac3a40bb4749c61d255979
	Author: Anderson <BlackCode7@outlook.com>
	Committer: Anderson <BlackCode7@outlook.com>
	Date: Sun Mar 13 2022 15:12:24 GMT-0300 (Horário Padrão de Brasília) 

	Atualizando a branch PetShopBand
	
32 - Data 15/03/2022
	Commit: 7468a9b2641bbea08622e125f067c159324f9143
	Parents: 92baa8f8a2d990cf0c7e6ccdf4b61ce5cb4502fe
	Author: Anderson <BlackCode7@outlook.com>
	Committer: Anderson <BlackCode7@outlook.com>
	Date: Tue Mar 15 2022 22:34:34 GMT-0300 (Horário Padrão de Brasília) 

	Adicionando models e services

33 - Data 16/03/2022
	Commit: b6e26e9708b49e84f751abde7d977806763f5277
	Parents: 7468a9b2641bbea08622e125f067c159324f9143
	Author: Anderson <BlackCode7@outlook.com>
	Committer: Anderson <BlackCode7@outlook.com>
	Date: Wed Mar 16 2022 07:08:03 GMT-0300 (Horário Padrão de Brasília) 

	Adicionando o service e fazendo a conexão do service com o componente ts e exibindo na listagem de produtos
	
34 - Data 17/03/2022
	Commit: af05fe412732c2db491e9abdc89b1088fc838ab2
	Parents: 1f0e9a68452837871c3c62405180318bd9747756, f4eb98820586f88608c5394e8a40aa9d3c70f7a9
	Author: Anderson <BlackCode7@outlook.com>
	Committer: Anderson <BlackCode7@outlook.com>
	Date: Thu Mar 17 2022 06:44:01 GMT-0300 (Horário Padrão de Brasília) 

	referência: https://www.youtube.com/watch?v=s-fLJp9vJIY

	Merge branch 'main' of https://github.com/BlackCode7/petshopband-1_angular into PetShopBand
	Atualizando o repositório
	
35 - Data 19/03/2022
	Commit: b6840bcd81bc1ee5d78edccc74015ab6d6e56133
	Parents: 94302d8a50c64a1cd92d874934f42d3074314f33
	Author: Anderson <BlackCode7@outlook.com>
	Committer: Anderson <BlackCode7@outlook.com>
	Date: Sat Mar 19 2022 18:11:14 GMT-0300 (Horário Padrão de Brasília) 

	Criação de model dto de IPedido


