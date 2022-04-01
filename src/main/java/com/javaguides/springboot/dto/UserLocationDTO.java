package com.javaguides.springboot.dto;

import lombok.Data;

//Usaremos essa classe para transferir detalhes do User e location do servidor para o Client
@Data
public class UserLocationDTO {
    //Aqui criaremos campops que são necessários para enviar informações do servidor para o client
    private Long userId;
    private String email;
    private String place;
    private double longitude;
    private double latitude;

}
