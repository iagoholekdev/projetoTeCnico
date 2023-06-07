<h1>Video demostrativo!</h1><br><br>


[![Demonstração](https://logos-world.net/wp-content/uploads/2022/07/Java-Logo.png)](https://youtu.be/VMWUjTRUU-A)



<h4>Sistema de Procedimentos Médicos</h4><br>
Este é um sistema de procedimentos médicos desenvolvido em Java, utilizando Servlets, JSP, Maven, Jetty, PostgreSQL, Liquibase e padrões de projeto. O objetivo do sistema é permitir o cadastro e validação de procedimentos de autorização, aplicando regras com base na idade e sexo do paciente.<br><br>

 <h1>Lista de Procedimentos</h1>
    <ul>
        <li>
            <strong>Procedimento:</strong> 1234<br>
            <strong>Idade:</strong> 10<br>
            <strong>Sexo:</strong> M<br>
            <strong>Permitido:</strong> NÃO
        </li>
        <li>
            <strong>Procedimento:</strong> 4567<br>
            <strong>Idade:</strong> 20<br>
            <strong>Sexo:</strong> M<br>
            <strong>Permitido:</strong> SIM
        </li>
        <li>
            <strong>Procedimento:</strong> 6789<br>
            <strong>Idade:</strong> 10<br>
            <strong>Sexo:</strong> F<br>
            <strong>Permitido:</strong> NÃO
        </li>
        <li>
            <strong>Procedimento:</strong> 6789<br>
            <strong>Idade:</strong> 10<br>
            <strong>Sexo:</strong> M<br>
            <strong>Permitido:</strong> SIM
        </li>
        <li>
            <strong>Procedimento:</strong> 1234<br>
            <strong>Idade:</strong> 20<br>
            <strong>Sexo:</strong> M<br>
            <strong>Permitido:</strong> SIM
        </li>
        <li>
            <strong>Procedimento:</strong> 4567<br>
            <strong>Idade:</strong> 30<br>
            <strong>Sexo:</strong> F<br>
            <strong>Permitido:</strong> SIM
        </li>
    </ul>


<h2>Funcionalidades do sistema</h2><br><br>

<b>Cadastro de procedimentos de autorização;</b><br>
<b>Validação de procedimentos com base na idade e sexo do paciente;</b><br>
<b>Estilização de componentes HTML com CSS;</b><br>
<b>Construção de testes unitários.</b><br>
<br>
<b>Pré-requisitos</b><br>
Antes de compilar e executar o sistema, é necessário ter os seguintes pré-requisitos instalados:<br>

Java Development Kit (JDK) 8 ou superior<br>
Apache Maven<br>
PostgreSQL<br>
Configuração do Banco de Dados<br><br>
<b>O sistema utiliza o banco de dados PostgreSQL. Siga as instruções abaixo para configurar o banco de dados:<br></b>

Crie um banco de dados no PostgreSQL para o sistema;<br>
Edite o arquivo <b>ConnectionFactory</b> no projeto de back-end (br/com/serverside/infra/ConnectionFactory.java) e atualize as configurações de conexão com o banco de dados, como URL, nome de usuário e senha.<br><br>
Compilação e Execução<br> 
Siga as etapas abaixo para compilar e executar o sistema:

<b>Clone o repositório Git em um diretório local:</b><br>
<b>git clone git@github.com:iagoholekdev/projetoTeCnico.git</b><br><br>
<h2>Detalhe: realizar estes processos pelo intelijj ou vscode!(Conforme o vídeo)</h2><br><br>
<h2>Compilando o back-end</h2><br>
<b>Navegue até o diretório raiz do projeto:></b><br>
cd server<br>
<b>Compile o projeto utilizando o Maven:</b><br>
mvn clean install<br>
<b>Após compilado, rode o seguinte comando:</b></br>
mvn exec:java</br></br>

<b>Scripts de Versionamento com Liquibase</b><br>
O sistema utiliza o Liquibase para gerenciar as alterações no banco de dados.<br>
Os scripts de versionamento podem ser encontrados no diretório src/main/resources/db/changelog. <br>
Detalhe: se por algum acaso não rodar os comandos, vá até o db-changelog.xml, altere os ids, rode o mvn clean install e mvn compile, e novamente rode mvn exec:java!<br>
Ao executar o back-end pela primeira vez, o Liquibase irá criar as tabelas e inserir os dados iniciais com base nos scripts disponíveis.<br><br>


<h2>Compilando o front-end</h2>
<b>Navegue até o diretório raiz do projeto:</b><br>
cd front<br>
No terminal rode o seguinte comando: <br>
mvn jetty:run<br>
<b>Também tem teste unitário! É só rodar o seguinte comando:<br></b>
mvn test<br><br>
<h4>Lembrando: para que o front funcione, é necessário compilar o back-end para que a tabela seja criada no banco de dados</h4>
Acesse o sistema no navegador utilizando a seguinte URL: http://localhost:8080/procedimento.html<br><br>

<h2>Autor</h2>
<h3>Iago</h3>
