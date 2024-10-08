package automationexercise.factory.data;


import automationexercise.dto.LoginDto;
import automationexercise.util.DataFakerGeneretor;

public class LoginData {

    // instanciar a ferramenta Faker
    DataFakerGeneretor dataFakerGeneretor = new DataFakerGeneretor();


    // Gerar dados fakes e guardar no DTO correspondente
    public LoginDto loginDadosValidos(){
        // Instanciar = conexão com LoginDto
        LoginDto loginDto = new LoginDto();
        loginDto.setUsername("Admin");
        loginDto.setSenha("admin123");

        return loginDto;
    }



    // Gerar dados fakes e guardar no DTO correspondente
    public LoginDto LoginDadoDinamicos(){
        // Instanciar = conexão com LoginDto
        LoginDto loginDto = new LoginDto();
            loginDto.setUsername(dataFakerGeneretor.usernameFaker());
            loginDto.setSenha(dataFakerGeneretor.senhaFaker());

        return loginDto;
    }





}
