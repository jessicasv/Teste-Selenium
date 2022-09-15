#language: pt

  @cadastro
  Funcionalidade: Cadastro de usuario

    @cadastro-sucesso
    Cenario: Registrar novo usuario com sucesso
      Dado que estou na tela de login
      E acesso a tela de cadastro de usuario
      Quando preencho o formulario de cadastro
      E clico em registrar
      Entao vejo cadastro realizado com sucesso
