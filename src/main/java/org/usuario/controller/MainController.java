package org.usuario.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.usuario.model.Usuario;

public class MainController {
    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtPassword;

    @FXML
    private Button btnSalvar;

    @FXML
    public void onBtnSalvarAction() {
    this.Usuario = new Usuario();
    Usuario.setNome(txtNome.getText());
    Usuario.setSenha(txtPassword.getText());
        System.out.println("Nome: " + Usuario.getNome());
        System.out.println("Senha: " + Usuario.getSenha());

    }
}