# Central de Doações

O objetivo deste projeto é criar uma plataforma que centraliza ONGs e instituições dedicadas a causas sociais, facilitando a conexão entre doadores e as organizações que precisam de apoio. Através dessa plataforma, os usuários poderão:

* **Descobrir Causas**: Navegar por uma variedade de ONGs e instituições, com informações detalhadas sobre suas missões e projetos.
* **Fazer Doações**: Realizar doações de maneira simples e segura, contribuindo diretamente para as causas que desejam apoiar.
* **Acompanhar Impactos**: Receber atualizações sobre como suas doações estão sendo utilizadas e o impacto gerado nas comunidades.

## Antes de começar a contribuir com esse projeto, é necessário configurar algumas definições do Git

## Siga as instruções abaixo

1. **Configurar conversão de final de linha (EOL)**

   É importante definir como o Git irá tratar as diferenças de final de linha entre sistemas operacionais, para evitar conflitos desnecessários.

   ```bash
   git config --global core.autocrlf false
   ```
    - **Descrição**: Desativa a conversão automática de finais de linha (CRLF para LF e vice-versa), garantindo que os arquivos não sejam alterados ao mover entre sistemas operacionais diferentes.

   ```bash
   git config --global core.eol lf
   ```
    - **Descrição**: Define o final de linha padrão como LF (line feed), comum em sistemas Unix e Linux.

   ```bash
   git config core.eol crlf
   ```
    - **Descrição**: No contexto deste repositório, ao lidar com arquivos específicos, o final de linha pode ser configurado como CRLF (carriage return + line feed), comum em sistemas Windows.

2. **Configurar o editor padrão do Git**

   ```bash
   git config --global core.editor "'C:/Program Files/Notepad++/notepad++.exe' -multiInst -notabbar -nosession -noPlugin"
   ```
    - **Descrição**: Define o Notepad++ como editor de texto padrão do Git. As opções `-multiInst`, `-notabbar`, `-nosession` e `-noPlugin` garantem que o Notepad++ seja aberto em uma nova instância, sem abas e sem carregar sessões ou plugins, otimizando o fluxo de trabalho.


3. **Configurar as informações do usuário**

   ```bash
   git config --global user.name "Seu nome"
   ```
    - **Descrição**: Define o nome do usuário que será associado a seus commits.

   ```bash
   git config --global user.email "seu email"
   ```
    - **Descrição**: Define o endereço de email do usuário para associar aos seus commits.

### Backlog
   * [ ] Adicionar validacao para que nao sejam cadastradas causas em duplicatas
   * [ ] Criar endpoints para fazer doacoes para uma causa. ( Relacionamento muitos para um )
   * [ ] Criar endpoints adicionar voluntarios para uma causa. ( Relacionamento muitos para muitos )
   * [ ] Criar endpoints para listar todas doacoes para uma causa.
   * [ ] Criar endpoints para pesquisar causa por nome ou parte do nome.
   * [ ] Adicionar logo como imagem para uma causa
   * [ ] Fazer o download de uma imagem da causa
   * [ ] Adicionar endpoints para acessar a UI