# analisador-sintatico-semantico

Desenvolvimento de uma aplicação de análise sintática e léxica para a disciplina de Tradutores 2020.

### Ferramentas utilizadas:

- Software [ANTLR](https://www.antlr.org/)

### Como instalar (Windows):

- Download https://www.antlr.org/download/antlr-4.8-complete.jar.
- Adicionar antlr-4.8-complete.jar ao CLASSPATH:
  - _Permanentemente_: Propriedades do Sistema > Variáveis ​​de ambiente > Criar ou anexar ao final da variável CLASSPATH: `.\antlr-4.8-complete.jar`
  - _Temporariamente_: executar na linha de comando: `SET CLASSPATH=.;.\antlr-4.8-complete.jar;%CLASSPATH%`
- Você deve ter os arquivos `antlr4.bat` e `grun.bat`, como estão no projeto.

### Como executar (_sample_):

Na linha de comando executar:
- `cd sample`
- `antlr4 Sample.g4`
- `javac Sample*.java`
- `grun Sample prog -gui`

